import 'dart:convert';
import 'dart:io';

import 'package:flutter_test/flutter_test.dart';
import 'package:novelist/data/db/database.dart';
import 'package:novelist/data/io/nov_file.dart';
import 'package:novelist/models/entities.dart';
import 'package:novelist/data/dao/books_dao.dart';
import 'package:novelist/data/dao/plot_dao.dart';
import 'package:novelist/data/dao/scenes_dao.dart';
import 'package:novelist/data/dao/sections_dao.dart';

/// Imports the real `.nov` project that ships inside the reference APK, proving that the reader
/// understands the reference's `version: 4` document (revisions array, code-based cross references).
void main() {
  late AppDatabase db;
  late NovFile nov;

  setUp(() {
    db = AppDatabase.inMemory();
    nov = NovFile(db);
  });

  tearDown(() => db.close());

  String sampleContent() {
    final candidates = [
      File('../docs/reference/app_assets/sample.nov'),
      File('docs/reference/app_assets/sample.nov'),
    ];
    for (final file in candidates) {
      if (file.existsSync()) return file.readAsStringSync();
    }
    fail('sample.nov not found – reference assets are required for this test');
  }

  test('imports the reference sample project', () {
    final projectId = nov.importString(sampleContent());

    final projects = db.select('SELECT * FROM project WHERE project_id = ?', [projectId]);
    expect(projects, hasLength(1));
    expect(projects.first['project_title'], 'The Lighthouse Code');

    final plot = PlotDao(db);
    final scenes = ScenesDao(db);
    final sections = SectionsDao(db);
    final books = BooksDao(db);

    final categories = plot.categories(projectId);
    expect(categories.map((c) => c.title),
        containsAll(['Themes', 'Events', 'Characters', 'Locations', 'Props']));

    final items = plot.allItems(projectId);
    expect(items.length, greaterThanOrEqualTo(20));

    final allScenes = scenes.list(projectId);
    expect(allScenes, hasLength(15));

    // Item codes survive so cross references stay intact.
    expect(items.map((i) => i.code), contains('7ef69440'));
    expect(items.firstWhere((i) => i.code == '7ef69440').title, contains('Tommaso'));

    // Mentions point at alias codes (`item_name`), which is why they are part of the label map.
    final labels = plot.mentionLabels(projectId);
    expect(labels['85676f52'], 'Tom');
    expect(labels['2950d705'], 'Tommaso');
    expect(plot.mentionLookup(projectId)['Tom'], '85676f52');

    // Mention embeds are preserved verbatim inside the scene text.
    final firstScene = allScenes.firstWhere((s) => s.code == 'fbfae51b');
    expect(firstScene.text, contains('\uFFFC'));
    expect(firstScene.text, contains('2950d705'));
    expect(firstScene.text, contains('85676f52'));

    // Section structure: 5 chapters, three scenes each, no orphans.
    final projectBooks = books.listForProject(projectId);
    expect(projectBooks, hasLength(1));
    final book = projectBooks.first;
    final bookSections = sections.forBook(book.id);
    expect(bookSections, hasLength(5));
    for (final section in bookSections) {
      expect(sections.sceneIds(section.id), hasLength(3));
    }

    // Every attached scene exists and the manuscript order matches rankings.
    final manuscript = sections.manuscript(book.id);
    expect(manuscript, hasLength(5));
    expect(manuscript.first.section.title, 'Chapter 1: Arrival in Santa Marea');

    // Statuses/subplots are imported with their codes.
    expect(plot.statuses(projectId).map((s) => s.title), containsAll(['To do', 'Draft', 'Done']));
    expect(plot.subplots(projectId), hasLength(3));
  });

  test('export → import round trip keeps the whole project', () {
    final originalId = nov.importString(sampleContent());
    final exported = nov.exportToString(originalId);

    final decoded = jsonDecode(exported) as Map<String, dynamic>;
    expect(decoded['version'], NovFile.writerVersion);
    expect(decoded['books'], hasLength(1));

    final copyId = nov.importString(exported);
    final plot = PlotDao(db);
    final scenes = ScenesDao(db);
    final sections = SectionsDao(db);
    final books = BooksDao(db);

    expect(books.listForProject(copyId), hasLength(1));
    expect(scenes.list(copyId), hasLength(scenes.list(originalId).length));
    expect(plot.allItems(copyId).length, plot.allItems(originalId).length);

    final copyBook = books.listForProject(copyId).first;
    final originalBook = books.listForProject(originalId).first;
    expect(sections.manuscriptSceneIds(copyBook.id).length,
        sections.manuscriptSceneIds(originalBook.id).length);

    // Scene text (and therefore mentions) survive byte-for-byte.
    final copyScene = scenes.list(copyId).firstWhere((s) => s.title == 'A Boring Summer... or So He Thought');
    final originalScene =
        scenes.list(originalId).firstWhere((s) => s.title == 'A Boring Summer... or So He Thought');
    expect(copyScene.text, originalScene.text);
  });

  test('rejects invalid documents without touching the database', () {
    expect(() => nov.importString('not json'), throwsA(isA<NovFormatException>()));
    expect(
      () => nov.importString(jsonEncode({'version': 4, 'revisions': []})),
      throwsA(isA<NovFormatException>()),
    );
    expect(db.count('project'), 0);
  });

  test('rejects a document from a newer app version', () {
    final future = jsonEncode({
      'version': 99,
      'title': 'From the future',
      'categories': [],
      'scenes': [],
    });
    expect(() => nov.parse(future), throwsA(isA<NovFormatException>()));
  });

  test('book settings and metadata survive the round trip', () {
    final projectId = nov.importString(sampleContent());
    final books = BooksDao(db);
    final book = books.listForProject(projectId).first;
    books.update(
      book.id,
      metadata: const BookMetadata(
        author: 'Sam',
        genre: 'Mystery',
        language: 'en',
        publisher: 'Self',
        isbn: '123',
        copyright: '2026',
      ),
      settings: const BookSettings(showTableOfContents: false, tableOfContentsTitle: 'Index'),
    );

    final copyId = nov.importString(nov.exportToString(projectId));
    final copied = books.listForProject(copyId).first;
    expect(copied.metadata.author, 'Sam');
    expect(copied.metadata.genre, 'Mystery');
    expect(copied.settings.showTableOfContents, isFalse);
    expect(copied.settings.tableOfContentsTitle, 'Index');
  });
}
