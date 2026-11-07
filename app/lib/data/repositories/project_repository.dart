import 'dart:convert';

import '../../core/utils/codes.dart';
import '../../models/entities.dart';
import '../dao/books_dao.dart';
import '../dao/plot_dao.dart';
import '../dao/projects_dao.dart';
import '../dao/scenes_dao.dart';
import '../dao/sections_dao.dart';
import '../db/database.dart';
import '../templates/template_service.dart';

/// Create / delete / duplicate whole universes.
///
/// Everything that creates more than one row runs inside a single transaction so an interrupted
/// project creation cannot leave a half-built universe behind.
class ProjectRepository {
  final AppDatabase db;
  final ProjectsDao projects;
  final BooksDao books;
  final PlotDao plot;
  final ScenesDao scenes;
  final SectionsDao sections;

  ProjectRepository(this.db)
      : projects = ProjectsDao(db),
        books = BooksDao(db),
        plot = PlotDao(db),
        scenes = ScenesDao(db),
        sections = SectionsDao(db);

  /// Creates a project from a parsed template: statuses, categories, metadata schema and one
  /// default book, reproducing the reference's "Novel standard" / "Empty" starting points.
  Project createFromTemplate({
    required String title,
    required TemplateData template,
    String? description,
    String bookTitle = 'Book 1',
  }) {
    return db.transaction(() {
      final project = projects.create(title: title, description: description);

      final statusIds = <String, int>{};
      for (final status in template.statuses) {
        final created = plot.addStatus(
          projectId: project.id,
          title: status.title,
          colour: status.colour,
          code: status.code,
        );
        statusIds[status.code] = created.id;
      }
      // Every template defines at least one status, but a degenerate file must still leave the
      // project usable, so one is created when the list is empty.
      if (statusIds.isEmpty) {
        plot.addStatus(projectId: project.id, title: 'To do', colour: 0xFFD6E0D1);
      }

      for (final category in template.categories) {
        final createdCategory = plot.createCategory(
          projectId: project.id,
          title: category.title,
          colour: category.colour,
        );
        for (final group in category.groups) {
          final createdGroup = plot.addMetadataGroup(
            categoryId: createdCategory.id,
            title: group.title,
          );
          for (final element in group.elements) {
            plot.addMetadataElement(
              groupId: createdGroup.id,
              title: element.title,
              isRelevant: element.isRelevant,
            );
          }
        }
      }

      books.create(projectId: project.id, title: bookTitle);
      projects.touch(project.id);
      return project;
    });
  }

  Project createBlank({required String title, String? description}) {
    return createFromTemplate(
      title: title,
      description: description,
      template: const TemplateData(
        statuses: [
          TemplateStatus(code: '1', title: 'To do', colour: 0xFFD6E0D1, ranking: 1),
        ],
        categories: [],
      ),
    );
  }

  Project? open(int projectId) => projects.byId(projectId);

  void deleteProject(int projectId) => projects.delete(projectId);

  /// Duplicates a project including every book, section, scene, item and relation.
  /// New codes are generated for all duplicated entities so the copy is independent.
  Project duplicate(int projectId) {
    return db.transaction(() {
      final source = projects.byId(projectId);
      if (source == null) throw StateError('Project $projectId not found');
      final copy = projects.create(
        title: '${source.title} (copy)',
        description: source.description,
        cover: source.cover,
      );

      final statusMap = <int, int>{};
      for (final status in plot.statuses(projectId)) {
        statusMap[status.id] = plot
            .addStatus(projectId: copy.id, title: status.title, colour: status.colour)
            .id;
      }
      final fallback = statusMap.values.isEmpty
          ? plot.addStatus(projectId: copy.id, title: 'To do', colour: 0xFFD6E0D1).id
          : statusMap.values.first;

      final itemMap = <int, int>{};
      for (final category in plot.categories(projectId)) {
        final newCategory = plot.createCategory(
          projectId: copy.id,
          title: category.title,
          colour: category.colour,
        );
        // Tags are per category, so they are recreated here and the ids remapped below.
        final tagMap = <int, int>{};
        for (final tag in plot.tags(category.id)) {
          tagMap[tag.id] =
              plot.addTag(categoryId: newCategory.id, title: tag.title, colour: tag.colour).id;
        }
        final elementMap = <int, int>{};
        for (final group in plot.metadataGroups(category.id)) {
          final newGroup = plot.addMetadataGroup(categoryId: newCategory.id, title: group.title);
          for (final element in plot.metadataElements(group.id)) {
            final created = plot.addMetadataElement(
              groupId: newGroup.id,
              title: element.title,
              isRelevant: element.isRelevant,
            );
            elementMap[element.id] = created.id;
          }
        }
        final values = <int, Map<int, String>>{};
        for (final item in plot.items(category.id)) {
          values[item.id] = plot.itemMetadata(item.id);
        }
        for (final item in plot.items(category.id)) {
          final newItem = plot.createItem(
            categoryId: newCategory.id,
            title: item.title,
            statusId: statusMap[item.statusId] ?? fallback,
            synopsis: item.synopsis,
            text: item.text,
          );
          itemMap[item.id] = newItem.id;
          values[item.id]?.forEach((elementId, value) {
            final mapped = elementMap[elementId];
            if (mapped != null) plot.setItemMetadataValue(newItem.id, mapped, value);
          });
          for (final name in plot.names(item.id)) {
            // Alias codes are reused so scene mentions keep pointing at the copied alias.
            plot.addName(newItem.id, name.name, code: name.code);
          }
          for (final note in plot.notes(item.id)) {
            plot.addNote(newItem.id, note.text);
          }
          for (final picture in plot.pictures(item.id)) {
            plot.addPicture(newItem.id, picture.name);
          }
          final tagIds = plot
              .itemTagIds(item.id)
              .map((tagId) => tagMap[tagId])
              .whereType<int>()
              .toSet();
          if (tagIds.isNotEmpty) plot.setItemTags(newItem.id, tagIds);
        }
      }

      final sceneMap = <int, int>{};
      for (final scene in scenes.list(projectId)) {
        final created = scenes.create(
          projectId: copy.id,
          title: scene.title,
          statusId: statusMap[scene.statusId] ?? fallback,
          synopsis: scene.synopsis,
          text: scene.text,
        );
        sceneMap[scene.id] = created.id;
        for (final itemId in scenes.attachedItemIds(scene.id)) {
          final mapped = itemMap[itemId];
          if (mapped != null) scenes.attachItem(created.id, mapped);
        }
      }

      for (final book in books.listForProject(projectId)) {
        final newBook = books.create(
          projectId: copy.id,
          title: book.title,
          description: book.description,
          cover: book.cover,
          metadata: book.metadata,
          settings: book.settings,
        );
        final sectionMap = <int, int>{};
        for (final section in sections.forBook(book.id)) {
          final created = sections.create(
            bookId: newBook.id,
            title: section.title,
            synopsis: section.synopsis,
            isCompiled: section.isCompiled,
          );
          sectionMap[section.id] = created.id;
        }
        // Re-apply parent links in a second pass now that all ids exist.
        for (final section in sections.forBook(book.id)) {
          if (section.parentId == null) continue;
          final createdId = sectionMap[section.id];
          final parentId = sectionMap[section.parentId!];
          if (createdId != null && parentId != null) {
            sections.update(createdId, parentId: parentId);
          }
        }
        for (final section in sections.forBook(book.id)) {
          final createdId = sectionMap[section.id];
          if (createdId == null) continue;
          for (final sceneId in sections.sceneIds(section.id)) {
            final mapped = sceneMap[sceneId];
            if (mapped != null) sections.attachScene(createdId, mapped);
          }
        }
        for (final progress in books.progressFor(book.id)) {
          books.setProgress(newBook.id, progress.date, progress.wordCount);
        }
      }

      projects.touch(copy.id);
      return copy;
    });
  }

  /// Persists a project template ("custom template based on an existing project").
  int saveAsTemplate(int projectId, String name) {
    final body = jsonEncode({
      'source_project': projectId,
      'categories': plot
          .categories(projectId)
          .map((c) => {
                'title': c.title,
                'colour': c.colour,
                'groups': plot
                    .metadataGroups(c.id)
                    .map((g) => {
                          'title': g.title,
                          'elements': plot
                              .metadataElements(g.id)
                              .map((e) => {'title': e.title, 'is_relevant': e.isRelevant})
                              .toList(),
                        })
                    .toList(),
              })
          .toList(),
      'statuses': plot
          .statuses(projectId)
          .map((s) => {'title': s.title, 'colour': s.colour})
          .toList(),
    });
    return db.insert('project_template', {
      'project_template_name': name,
      'project_template_body': body,
      'project_template_date': DateTime.now().millisecondsSinceEpoch,
      'project_template_is_system': 0,
      'project_template_is_default': 0,
    });
  }

  List<Map<String, Object?>> templates() {
    final rows = db.select('SELECT * FROM project_template ORDER BY project_template_date DESC');
    return rows.map((row) => Map<String, Object?>.from(row)).toList(growable: false);
  }

  String newCode() => CodeGen.next();
}
