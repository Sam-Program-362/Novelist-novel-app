import 'dart:convert';
import 'dart:io';

import 'package:archive/archive.dart';
import 'package:flutter_test/flutter_test.dart';
import 'package:novelist/core/utils/text_doc.dart';
import 'package:novelist/data/dao/books_dao.dart';
import 'package:novelist/data/dao/plot_dao.dart';
import 'package:novelist/data/dao/scenes_dao.dart';
import 'package:novelist/data/dao/sections_dao.dart';
import 'package:novelist/data/db/database.dart';
import 'package:novelist/data/io/compile.dart';
import 'package:novelist/data/repositories/project_repository.dart';
import 'package:novelist/data/templates/template_service.dart';
import 'package:novelist/models/entities.dart';

String _readReference(String name) {
  final candidates = [
    File('../docs/reference/app_assets/$name'),
    File('docs/reference/app_assets/$name'),
  ];
  for (final file in candidates) {
    if (file.existsSync()) return file.readAsStringSync();
  }
  fail('$name not found in docs/reference/app_assets');
}

void main() {
  late AppDatabase db;
  late ProjectRepository repository;

  setUp(() {
    db = AppDatabase.inMemory();
    repository = ProjectRepository(db);
  });

  tearDown(() => db.close());

  group('templates', () {
    test('standard template resolves into the documented category schema', () {
      final template = TemplateService.parse(_readReference('template_standard_novel.json'));
      expect(template.categories.map((c) => c.title),
          ['Themes', 'Events', 'Characters', 'Locations', 'Props', 'Custom']);
      expect(template.statuses, hasLength(5));

      final characters = template.categories[2];
      expect(characters.groups.map((g) => g.title),
          containsAll(['General', 'Physical', 'Mental', 'Emotional', 'Spiritual', 'Relationships']));
      final general = characters.groups.first;
      expect(general.elements.map((e) => e.title), contains('Name'));
      expect(general.elements.first.isRelevant, isTrue);
    });

    test('metadata labels are sentence-cased exactly like the reference', () {
      expect(TemplateService.labelFromCode('EFFECTS'), 'Effects');
      expect(TemplateService.labelFromCode('INNER_MEANING'), 'Inner meaning');
      expect(TemplateService.labelFromCode('SYMBOLIC_VALUE'), 'Symbolic value');
      expect(TemplateService.labelFromCode('DATE'), 'Date');
    });

    test('empty template ships a single status and no categories', () {
      final template = TemplateService.parse(_readReference('template_empty.json'));
      expect(template.categories, isEmpty);
      expect(template.statuses, hasLength(1));
    });
  });

  group('project creation', () {
    test('creates project, statuses, categories, metadata and one book', () {
      final template = TemplateService.parse(_readReference('template_standard_novel.json'));
      final project = repository.createFromTemplate(
        title: 'Test universe',
        template: template,
      );

      final plot = PlotDao(db);
      final books = BooksDao(db);

      expect(plot.statuses(project.id), hasLength(5));
      expect(plot.categories(project.id), hasLength(6));
      expect(books.listForProject(project.id), hasLength(1));

      final characters = plot.categories(project.id).firstWhere((c) => c.title == 'Characters');
      final groups = plot.metadataGroups(characters.id);
      expect(groups.length, 6);
      final elements = plot.metadataElementsForCategory(characters.id);
      expect(elements.length, greaterThan(100));
    });

    test('deleting a project cascades to every dependent row', () {
      final template = TemplateService.parse(_readReference('template_standard_novel.json'));
      final project = repository.createFromTemplate(title: 'Doomed', template: template);
      final plot = PlotDao(db);
      final category = plot.categories(project.id).first;
      final status = plot.statuses(project.id).first;
      final item = plot.createItem(categoryId: category.id, title: 'A', statusId: status.id);
      plot.addName(item.id, 'Alias');
      plot.addNote(item.id, 'note');

      repository.deleteProject(project.id);

      expect(db.count('project'), 0);
      expect(db.count('book'), 0);
      expect(db.count('category'), 0);
      expect(db.count('item'), 0);
      expect(db.count('item_name'), 0);
      expect(db.count('item_note'), 0);
      expect(db.count('metadata_element'), 0);
      expect(db.count('status'), 0);
    });
  });

  group('manuscript invariants', () {
    late int projectId;
    late int bookId;
    late ScenesDao scenes;
    late SectionsDao sections;
    late PlotDao plot;
    late int statusId;

    setUp(() {
      final template = TemplateService.parse(_readReference('template_standard_novel.json'));
      final project = repository.createFromTemplate(title: 'Novel', template: template);
      projectId = project.id;
      scenes = ScenesDao(db);
      sections = SectionsDao(db);
      plot = PlotDao(db);
      bookId = BooksDao(db).listForProject(projectId).first.id;
      statusId = plot.statuses(projectId).first.id;
    });

    test('a scene that is not attached never enters the manuscript', () {
      final attached = scenes.create(
        projectId: projectId,
        title: 'Attached',
        statusId: statusId,
        text: TextDoc([const TextBlock(text: 'One two three')]).toJsonString(),
      );
      final orphan = scenes.create(
        projectId: projectId,
        title: 'Orphan',
        statusId: statusId,
        text: TextDoc([const TextBlock(text: 'Not in the book')]).toJsonString(),
      );

      final chapter = sections.create(bookId: bookId, title: 'Chapter 1');
      sections.attachScene(chapter.id, attached.id);

      final ids = sections.manuscriptSceneIds(bookId);
      expect(ids, [attached.id]);
      expect(ids, isNot(contains(orphan.id)));

      final book = BooksDao(db).byId(bookId)!;
      final entries = sections.manuscript(bookId);
      final compiled = buildCompiledBook(
        book: book,
        entries: entries,
        scenesById: {for (final s in scenes.list(projectId)) s.id: s},
        mentionValues: const {},
      );
      final text = compiled.chapters
          .expand((c) => c.scenes)
          .expand((s) => s.paragraphs)
          .map((p) => p.text)
          .join(' ');
      expect(text, contains('One two three'));
      expect(text, isNot(contains('Not in the book')));
    });

    test('detaching keeps the scene in the pool but out of the manuscript', () {
      final scene = scenes.create(projectId: projectId, title: 'S', statusId: statusId);
      final chapter = sections.create(bookId: bookId, title: 'Chapter');
      sections.attachScene(chapter.id, scene.id);
      expect(sections.manuscriptSceneIds(bookId), [scene.id]);

      sections.detachScene(chapter.id, scene.id);
      expect(sections.manuscriptSceneIds(bookId), isEmpty);
      expect(scenes.byId(scene.id), isNotNull);
    });

    test('deleting a section detaches scenes without deleting them', () {
      final scene = scenes.create(projectId: projectId, title: 'S', statusId: statusId);
      final chapter = sections.create(bookId: bookId, title: 'Chapter');
      sections.attachScene(chapter.id, scene.id);

      sections.delete(chapter.id);
      expect(db.count('section'), 0);
      expect(db.count('section_scene'), 0);
      expect(scenes.byId(scene.id), isNotNull);
    });

    test('nested sections flatten in reading order', () {
      final act = sections.create(bookId: bookId, title: 'Act I');
      final chapterA = sections.create(bookId: bookId, parentId: act.id, title: 'Chapter A');
      final chapterB = sections.create(bookId: bookId, parentId: act.id, title: 'Chapter B');
      final sceneA = scenes.create(projectId: projectId, title: 'A', statusId: statusId);
      final sceneB = scenes.create(projectId: projectId, title: 'B', statusId: statusId);
      sections.attachScene(chapterA.id, sceneA.id);
      sections.attachScene(chapterB.id, sceneB.id);

      final entries = sections.manuscript(bookId);
      expect(entries.map((e) => e.section.title), ['Act I', 'Chapter A', 'Chapter B']);
      expect(entries.map((e) => e.depth), [0, 1, 1]);
      expect(sections.manuscriptSceneIds(bookId), [sceneA.id, sceneB.id]);

      // Reordering subsections reorders the manuscript.
      sections.reorder([chapterB.id, chapterA.id]);
      expect(
        sections.manuscript(bookId).where((e) => e.depth == 1).map((e) => e.section.title),
        ['Chapter B', 'Chapter A'],
      );
    });

    test('reordering attached scenes does not corrupt references', () {
      final sceneA = scenes.create(projectId: projectId, title: 'A', statusId: statusId);
      final sceneB = scenes.create(projectId: projectId, title: 'B', statusId: statusId);
      final chapter = sections.create(bookId: bookId, title: 'Chapter');
      sections.attachScenes(chapter.id, [sceneA.id, sceneB.id]);

      sections.reorderScenes(chapter.id, [sceneB.id, sceneA.id]);
      expect(sections.sceneIds(chapter.id), [sceneB.id, sceneA.id]);
      expect(sceneA.code, isNot(sceneB.code));
    });

    test('compiled sections are excluded when flagged', () {
      final included = sections.create(bookId: bookId, title: 'Keep');
      final excluded = sections.create(bookId: bookId, title: 'Skip');
      final sceneA = scenes.create(projectId: projectId, title: 'A', statusId: statusId);
      final sceneB = scenes.create(projectId: projectId, title: 'B', statusId: statusId);
      sections.attachScene(included.id, sceneA.id);
      sections.attachScene(excluded.id, sceneB.id);
      sections.toggleCompiled(excluded.id, false);

      expect(sections.manuscriptSceneIds(bookId), [sceneA.id]);
      expect(sections.manuscriptSceneIds(bookId, onlyCompiled: false), [sceneA.id, sceneB.id]);
    });

    test('scene splitting keeps both halves and their plot attachments', () {
      final category = plot.categories(projectId).first;
      final item = plot.createItem(categoryId: category.id, title: 'Hero', statusId: statusId);
      final scene = scenes.create(
        projectId: projectId,
        title: 'Long scene',
        statusId: statusId,
        text: TextDoc([
          const TextBlock(text: 'First paragraph.'),
          const TextBlock(text: 'Second paragraph.'),
          const TextBlock(text: 'Third paragraph.'),
        ]).toJsonString(),
      );
      scenes.attachItem(scene.id, item.id);

      final created = scenes.split(scene.id, 2);
      final first = scenes.byId(scene.id)!;
      final second = scenes.byId(created.id)!;

      expect(TextDoc.fromJsonString(first.text).blocks, hasLength(2));
      expect(TextDoc.fromJsonString(second.text).blocks, hasLength(1));
      expect(scenes.attachedItemIds(second.id), contains(item.id));
    });
  });

  group('compile and export', () {
    late int projectId;
    late int bookId;
    late Book book;
    late ScenesDao scenes;
    late SectionsDao sections;
    late PlotDao plot;

    setUp(() {
      final template = TemplateService.parse(_readReference('template_standard_novel.json'));
      final project = repository.createFromTemplate(title: 'Compiled Novel', template: template);
      projectId = project.id;
      scenes = ScenesDao(db);
      sections = SectionsDao(db);
      plot = PlotDao(db);
      final books = BooksDao(db);
      bookId = books.listForProject(projectId).first.id;
      books.update(
        bookId,
        metadata: const BookMetadata(author: 'Ada Lovelace', language: 'en'),
      );
      book = books.byId(bookId)!;

      final statusId = plot.statuses(projectId).first.id;
      final category = plot.categories(projectId).firstWhere((c) => c.title == 'Characters');
      final hero = plot.createItem(categoryId: category.id, title: 'Tom', statusId: statusId);
      final sceneOne = scenes.create(
        projectId: projectId,
        title: 'Beginning',
        statusId: statusId,
        text: TextDoc([
          TextBlock(
            text: '\uFFFC walked to the harbour.',
            embeds: [TextEmbed(position: 0, code: hero.code, value: 'Tom')],
          ),
          const TextBlock(align: 'center', text: 'A centred line.'),
        ]).toJsonString(),
      );
      final sceneTwo = scenes.create(
        projectId: projectId,
        title: 'Unattached',
        statusId: statusId,
        text: TextDoc([const TextBlock(text: 'This scene is not in the book.')]).toJsonString(),
      );
      expect(sceneTwo.id, isPositive);

      final chapter = sections.create(bookId: bookId, title: 'Chapter One');
      sections.attachScene(chapter.id, sceneOne.id);
      book = books.byId(bookId)!;
    });

    CompiledBook build(CompileFormat format, {CompileOptions? options}) {
      final effective = options ?? CompileOptions(format: format);
      return buildCompiledBook(
        book: book,
        entries: sections.manuscript(bookId),
        scenesById: {for (final s in scenes.list(projectId)) s.id: s},
        mentionValues: plot.mentionLabels(projectId),
        options: effective,
      );
    }

    test('html export contains only attached scenes and resolves mentions', () {
      final compiled = build(CompileFormat.html);
      final document = Compiler.compile(compiled, const CompileOptions(format: CompileFormat.html));
      final html = utf8.decode(document.bytes);
      expect(html, contains('Book 1'));
      expect(html, contains('Chapter One'));
      expect(html, contains('Tom walked to the harbour.'));
      expect(html, contains('A centred line.'));
      expect(html, isNot(contains('This scene is not in the book.')));
      expect(html, contains('class="align-center"'));
      expect(document.fileName, endsWith('.html'));
    });

    test('epub export is a valid zip with the required OEBPS entries', () {
      final compiled = build(CompileFormat.epub);
      final document = Compiler.compile(compiled, const CompileOptions(format: CompileFormat.epub));
      expect(document.fileName, endsWith('.epub'));

      final archive = ZipDecoder().decodeBytes(document.bytes);
      final names = archive.files.map((f) => f.name).toList();
      expect(names, contains('mimetype'));
      expect(names, contains('META-INF/container.xml'));
      expect(names, contains('OEBPS/content.opf'));
      expect(names, contains('OEBPS/nav.xhtml'));
      expect(names, contains('OEBPS/toc.ncx'));
      expect(names, contains('OEBPS/chapter1.xhtml'));

      final mimetype = archive.files.firstWhere((f) => f.name == 'mimetype');
      expect(utf8.decode(mimetype.content as List<int>), 'application/epub+zip');
      expect(mimetype.compress, isFalse);
    });

    test('odt export is a valid zip with content.xml', () {
      final compiled = build(CompileFormat.odt);
      final document = Compiler.compile(compiled, const CompileOptions(format: CompileFormat.odt));
      expect(document.fileName, endsWith('.odt'));

      final archive = ZipDecoder().decodeBytes(document.bytes);
      final names = archive.files.map((f) => f.name).toList();
      expect(names, containsAll(['mimetype', 'META-INF/manifest.xml', 'content.xml', 'styles.xml']));

      final content = archive.files.firstWhere((f) => f.name == 'content.xml');
      final xml = utf8.decode(content.content as List<int>);
      expect(xml, contains('Chapter One'));
      expect(xml, contains('Tom walked to the harbour.'));
    });

    test('toggling include switches changes the compiled output', () {
      const options = CompileOptions(
        format: CompileFormat.html,
        includeScenes: false,
        showTableOfContents: false,
      );
      final withoutScenes = Compiler.compile(build(CompileFormat.html, options: options), options);
      final html = utf8.decode(withoutScenes.bytes);
      expect(html, contains('Chapter One'));
      expect(html, isNot(contains('Tom walked to the harbour.')));
      expect(html, isNot(contains('Contents')));

      // Turning sections off removes the chapter headings as well.
      const noSections = CompileOptions(format: CompileFormat.html, includeSections: false);
      final empty = Compiler.compile(build(CompileFormat.html, options: noSections), noSections);
      expect(utf8.decode(empty.bytes), isNot(contains('Chapter One')));
    });
  });
}
