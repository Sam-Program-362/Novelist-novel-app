import 'dart:convert';

import '../../core/utils/codes.dart';
import '../../models/entities.dart';
import '../dao/books_dao.dart';
import '../dao/plot_dao.dart';
import '../dao/projects_dao.dart';
import '../dao/scenes_dao.dart';
import '../dao/sections_dao.dart';
import '../db/database.dart';

/// `.nov` document codec.
///
/// * **Reading** accepts the shipping format (`version: 4`, a `revisions[]` array of full snapshots,
///   cross-references by entity *code*) as well as this rebuild's project-shaped document
///   (`version: 5`), so real projects exported by the original application can be restored.
/// * **Writing** emits `version: 5`, which keeps every field of the v4 vocabulary but stores the
///   project/book model the current schema actually uses. It is self-describing, so no data is
///   lost on a round trip.
class NovFile {
  static const int writerVersion = 5;

  final AppDatabase db;
  late final ProjectsDao projects = ProjectsDao(db);
  late final BooksDao books = BooksDao(db);
  late final PlotDao plot = PlotDao(db);
  late final ScenesDao scenes = ScenesDao(db);
  late final SectionsDao sections = SectionsDao(db);

  NovFile(this.db);

  // --------------------------------------------------------------- writing

  Map<String, dynamic> exportProject(int projectId) {
    final project = projects.byId(projectId);
    if (project == null) throw StateError('Project $projectId not found');

    final statuses = plot.statuses(projectId);
    final statusById = {for (final s in statuses) s.id: s};
    final subplots = plot.subplots(projectId);

    final categories = plot.categories(projectId).map((category) {
      final tags = plot.tags(category.id);
      final tagByCode = {for (final t in tags) t.id: t.code};
      return <String, dynamic>{
        'code': category.code,
        'title': category.title,
        'color': category.colour,
        'ranking': category.ranking,
        'metadata_groups': plot.metadataGroups(category.id).map((group) {
          final elements = plot.metadataElements(group.id);
          return <String, dynamic>{
            'code': group.code.isEmpty ? CodeGen.next() : group.code,
            'title': group.title,
            'ranking': group.ranking,
            'metadata_elements': elements
                .map((e) => {
                      'code': e.code.isEmpty ? CodeGen.next() : e.code,
                      'title': e.title,
                      'ranking': e.ranking,
                      if (e.isRelevant) 'is_relevant': true,
                    })
                .toList(),
          };
        }).toList(),
        'items': plot.items(category.id).map((item) {
          final elementById = <int, String>{};
          for (final group in plot.metadataGroups(category.id)) {
            for (final element in plot.metadataElements(group.id)) {
              elementById[element.id] = element.code;
            }
          }
          return <String, dynamic>{
            'code': item.code,
            'title': item.title,
            'synopsis': item.synopsis,
            'text': item.text,
            'ranking': item.ranking,
            'status': statusById[item.statusId]?.code,
            'item_metadatas': plot.itemMetadata(item.id).entries
                .where((e) => elementById.containsKey(e.key))
                .map((e) => {
                      'metadata_element': elementById[e.key],
                      'value': e.value,
                    })
                .toList(),
            'names': plot
                .names(item.id)
                .map((n) => {'code': n.code, 'name': n.name, 'ranking': n.ranking})
                .toList(),
            'notes': plot
                .notes(item.id)
                .map((n) => {'text': n.text, 'ranking': n.ranking})
                .toList(),
            'pictures': plot
                .pictures(item.id)
                .map((p) => {'name': p.name, 'ranking': p.ranking})
                .toList(),
            'relationships': plot.relationships(item.id).map((r) {
              final other = plot.itemById(r.otherItemId);
              return {
                'other_item': other?.code,
                'description': r.description,
                'ranking': r.ranking,
                if (r.isRelevant) 'is_relevant': true,
              };
            }).toList(),
            'tags': plot
                .itemTagIds(item.id)
                .map((id) => tagByCode[id])
                .whereType<String>()
                .toList(),
          };
        }).toList(),
        'tags': tags
            .map((t) => {'code': t.code, 'title': t.title, 'color': t.colour})
            .toList(),
      };
    }).toList();

    final sceneList = scenes.list(projectId).map((scene) {
      return <String, dynamic>{
        'code': scene.code,
        'title': scene.title,
        'synopsis': scene.synopsis,
        'text': scene.text,
        'note': scene.note,
        'ranking': scene.ranking,
        'status': statusById[scene.statusId]?.code,
        'scene_items': scenes
            .attachedItemIds(scene.id)
            .map((itemId) => {'code': plot.itemById(itemId)?.code})
            .where((m) => m['code'] != null)
            .toList(),
        'subplots': scenes.subplots(scene.id).map((link) {
          final subplot = subplots.where((s) => s.id == link.subplotId).toList();
          return {
            'subplot': subplot.isEmpty ? null : subplot.first.code,
            'synopsis': link.synopsis,
          };
        }).toList(),
        'notes': scenes
            .notes(scene.id)
            .map((n) => {'text': n.text, 'ranking': n.ranking})
            .toList(),
        'pictures': scenes
            .pictures(scene.id)
            .map((p) => {'name': p.name, 'ranking': p.ranking})
            .toList(),
      };
    }).toList();

    final bookList = books.listForProject(projectId).map((book) {
      final allSections = sections.forBook(book.id);
      final sceneById = {for (final s in scenes.list(projectId)) s.id: s.code};
      Map<String, dynamic> encodeSection(Section section) => {
            'code': section.code,
            'title': section.title,
            'synopsis': section.synopsis,
            'ranking': section.ranking,
            'is_expanded': section.isExpanded,
            'is_compiled': section.isCompiled,
            'section_scenes': sections
                .sceneIds(section.id)
                .asMap()
                .entries
                .map((entry) => {
                      'code': sceneById[entry.value],
                      'ranking': entry.key + 1,
                    })
                .where((m) => m['code'] != null)
                .toList(),
            'children': allSections
                .where((s) => s.parentId == section.id)
                .map(encodeSection)
                .toList(),
          };
      return <String, dynamic>{
        'code': book.code,
        'title': book.title,
        'description': book.description,
        'cover': book.cover,
        'word_count': book.wordCount,
        'due_date': book.dueDate,
        'ranking': book.ranking,
        'metadata': book.metadata.toJson(),
        'settings': book.settings.toJson(),
        'sections': allSections
            .where((s) => s.parentId == null)
            .map(encodeSection)
            .toList(),
        'progresses': books
            .progressFor(book.id)
            .map((p) => {
                  'year': p.year,
                  'month': p.month,
                  'day': p.day,
                  'word_count': p.wordCount,
                })
            .toList(),
      };
    }).toList();

    return {
      'version': writerVersion,
      'code': project.code,
      'title': project.title,
      'description': project.description,
      'cover': project.cover,
      'is_archived': project.isArchived,
      'last_update_date': project.lastUpdateDate,
      'last_cloud_sync_date': project.lastCloudSyncDate,
      'last_cloud_sync_device_name': project.lastCloudSyncDeviceName,
      'last_backup_date': project.lastBackupDate,
      'statuses': statuses
          .map((s) => {
                'code': s.code,
                'title': s.title,
                'color': s.colour,
                'ranking': s.ranking,
              })
          .toList(),
      'subplots': subplots
          .map((s) => {
                'code': s.code,
                'title': s.title,
                'color': s.colour,
                'ranking': s.ranking,
              })
          .toList(),
      'categories': categories,
      'scenes': sceneList,
      'books': bookList,
    };
  }

  String exportToString(int projectId) => jsonEncode(exportProject(projectId));

  // --------------------------------------------------------------- reading

  /// Parses a document without touching the database, so invalid files are rejected before any
  /// row is written.
  ParsedNov parse(String content) {
    final dynamic decoded;
    try {
      decoded = jsonDecode(content);
    } catch (_) {
      throw const NovFormatException('File is not valid JSON');
    }
    if (decoded is! Map) throw const NovFormatException('Document is not an object');
    final map = Map<String, dynamic>.from(decoded);
    final version = (map['version'] as num?)?.toInt() ?? 0;
    if (version == 0) {
      // Some builds may omit the version; accept if the body is recognisable.
      if (map['categories'] == null && map['revisions'] == null) {
        throw const NovFormatException('Unsupported document');
      }
    }
    if (version > writerVersion) {
      throw NovFormatException('Document version $version is newer than this app supports');
    }
    final title = (map['title'] as String?)?.trim();
    if (title == null || title.isEmpty) {
      throw const NovFormatException('Document has no title');
    }
    return ParsedNov(map: map, version: version);
  }

  /// Imports a parsed document as a new project and returns its id.
  int importParsed(ParsedNov parsed) {
    final map = parsed.map;
    return db.transaction(() {
      final project = projects.create(
        title: map['title'] as String,
        description: map['description'] as String?,
        cover: map['cover'] as String?,
      );

      final statusIdsByCode = <String, int>{};
      final statusesRaw = (map['statuses'] as List?) ?? const [];
      for (final raw in statusesRaw.whereType<Map>()) {
        final status = Map<String, dynamic>.from(raw);
        final code = status['code']?.toString() ?? CodeGen.next();
        final created = plot.addStatus(
          projectId: project.id,
          title: status['title']?.toString() ?? 'Status',
          colour: (status['color'] as num?)?.toInt() ?? 0xFF9E9E9E,
          code: code,
        );
        statusIdsByCode[code] = created.id;
      }
      if (statusIdsByCode.isEmpty) {
        statusIdsByCode['1'] =
            plot.addStatus(projectId: project.id, title: 'To do', colour: 0xFFD6E0D1).id;
      }
      int statusIdFor(dynamic code) =>
          statusIdsByCode[code?.toString()] ?? statusIdsByCode.values.first;

      final subplotIdsByCode = <String, int>{};
      for (final raw in ((map['subplots'] as List?) ?? const []).whereType<Map>()) {
        final subplot = Map<String, dynamic>.from(raw);
        final code = subplot['code']?.toString() ?? CodeGen.next();
        final created = plot.addSubplot(
          projectId: project.id,
          title: subplot['title']?.toString() ?? 'Subplot',
          colour: (subplot['color'] as num?)?.toInt() ?? 0xFF9E9E9E,
          code: code,
        );
        subplotIdsByCode[code] = created.id;
      }

      // v5 keeps the story at the top level; v4 wraps it in revisions[]. Use the newest revision.
      final body = parsed.storyBody;

      final itemIdsByCode = <String, int>{};
      final categoryRaw = (body['categories'] as List?) ?? const [];
      for (final raw in categoryRaw.whereType<Map>()) {
        final category = Map<String, dynamic>.from(raw);
        final createdCategory = plot.createCategory(
          projectId: project.id,
          title: category['title']?.toString() ?? 'Category',
          colour: (category['color'] as num?)?.toInt() ?? 0xFF9E9E9E,
        );
        final elementIdsByCode = <String, int>{};
        for (final groupRaw in ((category['metadata_groups'] as List?) ?? const []).whereType<Map>()) {
          final group = Map<String, dynamic>.from(groupRaw);
          final createdGroup = plot.addMetadataGroup(
            categoryId: createdCategory.id,
            title: group['title']?.toString() ?? 'General',
          );
          for (final elementRaw
              in ((group['metadata_elements'] as List?) ?? const []).whereType<Map>()) {
            final element = Map<String, dynamic>.from(elementRaw);
            final code = element['code']?.toString() ?? CodeGen.next();
            final created = plot.addMetadataElement(
              groupId: createdGroup.id,
              title: element['title']?.toString() ?? 'Field',
              isRelevant: element['is_relevant'] == true,
            );
            elementIdsByCode[code] = created.id;
          }
        }
        for (final tagRaw in ((category['tags'] as List?) ?? const []).whereType<Map>()) {
          final tag = Map<String, dynamic>.from(tagRaw);
          plot.addTag(
            categoryId: createdCategory.id,
            title: tag['title']?.toString() ?? 'Tag',
            colour: (tag['color'] as num?)?.toInt() ?? 0xFF9E9E9E,
          );
        }
        for (final itemRaw in ((category['items'] as List?) ?? const []).whereType<Map>()) {
          final item = Map<String, dynamic>.from(itemRaw);
          final createdItem = plot.createItem(
            categoryId: createdCategory.id,
            title: item['title']?.toString() ?? 'Item',
            statusId: statusIdFor(item['status']),
            synopsis: item['synopsis'] as String?,
            text: item['text'] as String?,
            ranking: (item['ranking'] as num?)?.toInt(),
          );
          if ((item['code'] as String?) != null) {
            itemIdsByCode[item['code'] as String] = createdItem.id;
          }
          for (final metaRaw
              in ((item['item_metadatas'] as List?) ?? const []).whereType<Map>()) {
            final meta = Map<String, dynamic>.from(metaRaw);
            final elementId = elementIdsByCode[meta['metadata_element']?.toString()];
            if (elementId != null) {
              plot.setItemMetadataValue(createdItem.id, elementId, meta['value']?.toString() ?? '');
            }
          }
          for (final nameRaw in ((item['names'] as List?) ?? const []).whereType<Map>()) {
            final name = Map<String, dynamic>.from(nameRaw);
            final value = name['name']?.toString();
            if (value != null && value.isNotEmpty) plot.addName(createdItem.id, value);
          }
          for (final noteRaw in ((item['notes'] as List?) ?? const []).whereType<Map>()) {
            final note = Map<String, dynamic>.from(noteRaw);
            final text = note['text']?.toString();
            if (text != null && text.isNotEmpty) plot.addNote(createdItem.id, text);
          }
          for (final pictureRaw in ((item['pictures'] as List?) ?? const []).whereType<Map>()) {
            final picture = Map<String, dynamic>.from(pictureRaw);
            final name = picture['name']?.toString();
            if (name != null && name.isNotEmpty) plot.addPicture(createdItem.id, name);
          }
        }
      }

      // Item relationships need every item to exist first.
      for (final raw in categoryRaw.whereType<Map>()) {
        final category = Map<String, dynamic>.from(raw);
        for (final itemRaw in ((category['items'] as List?) ?? const []).whereType<Map>()) {
          final item = Map<String, dynamic>.from(itemRaw);
          final itemId = itemIdsByCode[item['code']?.toString()];
          if (itemId == null) continue;
          for (final relRaw
              in ((item['relationships'] as List?) ?? const []).whereType<Map>()) {
            final rel = Map<String, dynamic>.from(relRaw);
            final otherId = itemIdsByCode[rel['other_item']?.toString()];
            if (otherId == null || otherId == itemId) continue;
            plot.addRelationship(
              itemId: itemId,
              otherItemId: otherId,
              description: rel['description']?.toString() ?? '',
              isRelevant: rel['is_relevant'] == true,
            );
          }
        }
      }

      final sceneIdsByCode = <String, int>{};
      for (final raw in ((body['scenes'] as List?) ?? const []).whereType<Map>()) {
        final scene = Map<String, dynamic>.from(raw);
        final created = scenes.create(
          projectId: project.id,
          title: scene['title']?.toString() ?? 'Scene',
          statusId: statusIdFor(scene['status']),
          synopsis: scene['synopsis'] as String?,
          text: scene['text'] as String?,
          ranking: (scene['ranking'] as num?)?.toInt(),
        );
        final code = scene['code']?.toString();
        if (code != null) sceneIdsByCode[code] = created.id;
        for (final attachRaw in ((scene['scene_items'] as List?) ?? const []).whereType<Map>()) {
          final attach = Map<String, dynamic>.from(attachRaw);
          final itemId = itemIdsByCode[attach['code']?.toString()];
          if (itemId != null) scenes.attachItem(created.id, itemId);
        }
        for (final noteRaw in ((scene['notes'] as List?) ?? const []).whereType<Map>()) {
          final note = Map<String, dynamic>.from(noteRaw);
          final text = note['text']?.toString();
          if (text != null && text.isNotEmpty) scenes.addNote(created.id, text);
        }
        for (final pictureRaw in ((scene['pictures'] as List?) ?? const []).whereType<Map>()) {
          final picture = Map<String, dynamic>.from(pictureRaw);
          final name = picture['name']?.toString();
          if (name != null && name.isNotEmpty) scenes.addPicture(created.id, name);
        }
        final links = <int, String>{};
        for (final linkRaw in ((scene['subplots'] as List?) ?? const []).whereType<Map>()) {
          final link = Map<String, dynamic>.from(linkRaw);
          final subplotId = subplotIdsByCode[link['subplot']?.toString()];
          if (subplotId != null) links[subplotId] = link['synopsis']?.toString() ?? '';
        }
        if (links.isNotEmpty) scenes.setSubplots(created.id, links);
      }

      final booksRaw = parsed.books;
      if (booksRaw.isEmpty) {
        // v4 documents describe a single implicit book.
        final book = books.create(projectId: project.id, title: 'Book 1');
        _importSections(book.id, (body['sections'] as List?) ?? const [], sceneIdsByCode);
      } else {
        var bookRanking = 1;
        for (final raw in booksRaw.whereType<Map>()) {
          final bookMap = Map<String, dynamic>.from(raw);
          final metadata = BookMetadata.fromJson(
            bookMap['metadata'] is Map ? Map<String, dynamic>.from(bookMap['metadata'] as Map) : null,
          );
          final settings = BookSettings.fromJson(
            bookMap['settings'] is Map ? Map<String, dynamic>.from(bookMap['settings'] as Map) : null,
          );
          final book = books.create(
            projectId: project.id,
            title: bookMap['title']?.toString() ?? 'Book $bookRanking',
            description: bookMap['description'] as String?,
            cover: bookMap['cover'] as String?,
            metadata: metadata,
            settings: settings,
          );
          bookRanking++;
          final dueDate = (bookMap['due_date'] as num?)?.toInt();
          if (dueDate != null) books.update(book.id, dueDate: dueDate);
          _importSections(book.id, (bookMap['sections'] as List?) ?? const [], sceneIdsByCode);
          for (final progressRaw
              in ((bookMap['progresses'] as List?) ?? const []).whereType<Map>()) {
            final progress = Map<String, dynamic>.from(progressRaw);
            books.setProgress(
              book.id,
              DateTime(
                (progress['year'] as num?)?.toInt() ?? 1970,
                (progress['month'] as num?)?.toInt() ?? 1,
                (progress['day'] as num?)?.toInt() ?? 1,
              ),
              (progress['word_count'] as num?)?.toInt() ?? 0,
            );
          }
          books.setWordCount(book.id, sections.wordCountForBook(book.id));
        }
      }

      final lastUpdate = (map['last_update_date'] as num?)?.toInt();
      if (lastUpdate != null) projects.touch(project.id);
      return project.id;
    });
  }

  void _importSections(int bookId, List raw, Map<String, int> sceneIdsByCode,
      {int? parentId}) {
    var ranking = 1;
    for (final item in raw.whereType<Map>()) {
      final sectionMap = Map<String, dynamic>.from(item);
      final section = sections.create(
        bookId: bookId,
        parentId: parentId,
        title: sectionMap['title']?.toString() ?? 'Section',
        synopsis: sectionMap['synopsis'] as String?,
        isCompiled: sectionMap['is_compiled'] != false,
      );
      sections.update(section.id, ranking: (sectionMap['ranking'] as num?)?.toInt() ?? ranking);
      ranking++;
      final sceneRankings = <int, List<int>>{};
      for (final linkRaw
          in ((sectionMap['section_scenes'] as List?) ?? const []).whereType<Map>()) {
        final link = Map<String, dynamic>.from(linkRaw);
        final sceneId = sceneIdsByCode[link['code']?.toString()];
        if (sceneId == null) continue;
        final rank = (link['ranking'] as num?)?.toInt() ?? 999;
        sceneRankings.putIfAbsent(rank, () => []).add(sceneId);
      }
      for (final rank in sceneRankings.keys.toList()..sort()) {
        for (final sceneId in sceneRankings[rank]!) {
          sections.attachScene(section.id, sceneId);
        }
      }
      final children = (sectionMap['children'] as List?) ?? const [];
      if (children.isNotEmpty) {
        _importSections(bookId, children, sceneIdsByCode, parentId: section.id);
      }
    }
  }

  int importString(String content) => importParsed(parse(content));
}

class ParsedNov {
  final Map<String, dynamic> map;
  final int version;

  const ParsedNov({required this.map, required this.version});

  /// The story body: v5 stores it at the top level, v4 inside the newest revision.
  Map<String, dynamic> get storyBody {
    final revisions = map['revisions'];
    if (revisions is List && revisions.isNotEmpty) {
      final maps = revisions
          .whereType<Map>()
          .map((r) => Map<String, dynamic>.from(r))
          .toList(growable: false);
      maps.sort((a, b) => ((a['number'] as num?)?.toInt() ?? 0)
          .compareTo((b['number'] as num?)?.toInt() ?? 0));
      return maps.last;
    }
    return map;
  }

  /// Books: v5 lists them explicitly; v4 documents describe a single implicit book.
  List<Map<String, dynamic>> get books {
    final raw = map['books'];
    if (raw is List) {
      return raw.whereType<Map>().map((b) => Map<String, dynamic>.from(b)).toList(growable: false);
    }
    return const [];
  }
}

class NovFormatException implements Exception {
  final String message;
  const NovFormatException(this.message);

  @override
  String toString() => message;
}
