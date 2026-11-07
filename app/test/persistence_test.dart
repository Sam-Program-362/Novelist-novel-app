import 'dart:io';

import 'package:flutter_test/flutter_test.dart';
import 'package:novelist/data/dao/books_dao.dart';
import 'package:novelist/data/dao/plot_dao.dart';
import 'package:novelist/data/dao/projects_dao.dart';
import 'package:novelist/data/dao/scenes_dao.dart';
import 'package:novelist/data/dao/sections_dao.dart';
import 'package:novelist/data/db/database.dart';
import 'package:novelist/data/io/nov_file.dart';
import 'package:novelist/data/templates/template_service.dart';

/// Proves that data really reaches disk: the database is closed and reopened, and the project must
/// still be intact (the equivalent of restarting the application).
void main() {
  late Directory tempDir;

  setUp(() async {
    tempDir = await Directory.systemTemp.createTemp('novelist_test_');
  });

  tearDown(() async {
    if (tempDir.existsSync()) tempDir.deleteSync(recursive: true);
  });

  test('project content survives closing and reopening the database', () {
    final path = '${tempDir.path}/novelist.db';

    final db = AppDatabase.open(path);
    final template = TemplateService.parse(File('../docs/reference/app_assets/template_empty.json')
        .readAsStringSync());
    final projects = ProjectsDao(db);
    final plot = PlotDao(db);
    final scenes = ScenesDao(db);
    final sections = SectionsDao(db);
    final books = BooksDao(db);

    db.transaction(() {
      final project = projects.create(title: 'Persistent', description: 'survives restarts');
      final status = plot.addStatus(projectId: project.id, title: 'To do', colour: 0xFFD6E0D1);
      final category = plot.createCategory(
        projectId: project.id,
        title: 'Characters',
        colour: 0xFF81B1F4,
      );
      final item = plot.createItem(
        categoryId: category.id,
        title: 'Irene',
        statusId: status.id,
        synopsis: 'cousin',
      );
      plot.addName(item.id, 'Rena');
      final book = books.create(projectId: project.id, title: 'Book 1');
      final scene = scenes.create(
        projectId: project.id,
        title: 'Opening',
        statusId: status.id,
        text: '{"blocks":[{"type":"text","align":"left","text":"Hello world."}]}',
      );
      final section = sections.create(bookId: book.id, title: 'Chapter 1');
      sections.attachScene(section.id, scene.id);
      books.setProgress(book.id, DateTime(2026, 5, 4), 1234);
    });
    db.close();

    final reopened = AppDatabase.open(path);
    expect(ProjectsDao(reopened).list(), hasLength(1));
    final project = ProjectsDao(reopened).list().first;
    expect(project.title, 'Persistent');

    final items = PlotDao(reopened).allItems(project.id);
    expect(items, hasLength(1));
    expect(items.first.title, 'Irene');
    expect(PlotDao(reopened).names(items.first.id).first.name, 'Rena');

    final book = BooksDao(reopened).listForProject(project.id).first;
    expect(BooksDao(reopened).progressFor(book.id).first.wordCount, 1234);

    final sceneIds = SectionsDao(reopened).manuscriptSceneIds(book.id);
    expect(sceneIds, hasLength(1));
    expect(ScenesDao(reopened).byId(sceneIds.first)!.title, 'Opening');

    // Foreign keys stay enabled after a restart, so cascades still work.
    ProjectsDao(reopened).delete(project.id);
    expect(reopened.count('scene'), 0);
    expect(reopened.count('item'), 0);
    expect(reopened.count('section'), 0);
    reopened.close();
    expect(template.statuses, hasLength(1));
  });

  test('a database from a newer schema is refused, not modified', () {
    final path = '${tempDir.path}/future.db';
    final db = AppDatabase.open(path);
    db.execute('PRAGMA user_version = 99');
    db.close();

    expect(() => AppDatabase.open(path), throwsA(isA<StateError>()));
  });

  test('backup file can be written, re-read and restored', () {
    final path = '${tempDir.path}/novelist.db';
    final db = AppDatabase.open(path);
    final nov = NovFile(db);
    final project = ProjectsDao(db).create(title: 'Backup me');
    final status = PlotDao(db).addStatus(
      projectId: project.id,
      title: 'Done',
      colour: 0xFF3FA34D,
    );
    final scene = ScenesDao(db).create(
      projectId: project.id,
      title: 'Only scene',
      statusId: status.id,
      text: '{"blocks":[{"type":"text","align":"left","text":"Backed up text."}]}',
    );

    final file = File('${tempDir.path}/backup.nov');
    file.writeAsStringSync(nov.exportToString(project.id));

    final restoredId = NovFile(db).importString(file.readAsStringSync());
    final restored = ProjectsDao(db).byId(restoredId)!;
    expect(restored.title, 'Backup me');
    final restoredScenes = ScenesDao(db).list(restoredId);
    expect(restoredScenes, hasLength(1));
    expect(restoredScenes.first.title, scene.title);
    expect(restoredScenes.first.text, scene.text);
    db.close();
  });
}
