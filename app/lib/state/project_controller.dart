import 'package:flutter/foundation.dart';

import '../core/utils/text_doc.dart';
import '../data/dao/books_dao.dart';
import '../data/dao/plot_dao.dart';
import '../data/dao/projects_dao.dart';
import '../data/dao/scenes_dao.dart';
import '../data/dao/sections_dao.dart';
import '../data/db/database.dart';
import '../data/io/compile.dart';
import '../models/entities.dart';

/// State of one open project workspace.
///
/// The controller owns the *loaded snapshot* of the project (books, statuses, categories, scenes …)
/// and reloads it after any mutation, which keeps the UI consistent with the database even when a
/// transaction touched many rows.
class ProjectController extends ChangeNotifier {
  final AppDatabase db;
  final int projectId;

  late final ProjectsDao projectsDao = ProjectsDao(db);
  late final BooksDao booksDao = BooksDao(db);
  late final PlotDao plotDao = PlotDao(db);
  late final ScenesDao scenesDao = ScenesDao(db);
  late final SectionsDao sectionsDao = SectionsDao(db);

  Project? project;
  List<Book> books = const [];
  List<Status> statuses = const [];
  List<Category> categories = const [];
  List<Scene> scenes = const [];
  List<Subplot> subplots = const [];
  int? selectedBookId;

  ProjectController(this.db, this.projectId) {
    reload();
  }

  // -------------------------------------------------------------- snapshot

  void reload() {
    project = projectsDao.byId(projectId);
    books = booksDao.listForProject(projectId);
    statuses = plotDao.statuses(projectId);
    categories = plotDao.categories(projectId);
    scenes = scenesDao.list(projectId);
    subplots = plotDao.subplots(projectId);
    if (books.isNotEmpty) {
      final exists = books.any((b) => b.id == selectedBookId);
      if (!exists) selectedBookId = books.first.id;
    } else {
      selectedBookId = null;
    }
    notifyListeners();
  }

  Book? get selectedBook {
    if (selectedBookId == null) return null;
    for (final book in books) {
      if (book.id == selectedBookId) return book;
    }
    return books.isEmpty ? null : books.first;
  }

  void selectBook(int bookId) {
    selectedBookId = bookId;
    notifyListeners();
  }

  Status? statusById(int id) {
    for (final status in statuses) {
      if (status.id == id) return status;
    }
    return statuses.isEmpty ? null : statuses.first;
  }

  Status get defaultStatus => statuses.isEmpty
      ? Status(
          id: 0,
          projectId: projectId,
          code: '1',
          title: 'To do',
          colour: 0xFFD6E0D1,
          ranking: 1,
        )
      : statuses.first;

  Category? categoryById(int id) {
    for (final category in categories) {
      if (category.id == id) return category;
    }
    return null;
  }

  Scene? sceneById(int id) {
    for (final scene in scenes) {
      if (scene.id == id) return scene;
    }
    return null;
  }

  /// All mentionable labels (item titles and aliases) mapped to item codes.
  Map<String, String> get mentionLookup => plotDao.mentionLookup(projectId);

  Map<int, Scene> get scenesById => {for (final scene in scenes) scene.id: scene};

  int get projectWordCount => scenesDao.projectWordCount(projectId);

  int get bookWordCount {
    final book = selectedBook;
    if (book == null) return 0;
    return sectionsDao.wordCountForBook(book.id);
  }

  // --------------------------------------------------------------- project

  void updateProject({String? title, String? description}) {
    projectsDao.update(projectId, title: title, description: description);
    reload();
  }

  void setProjectCover(String? cover) {
    projectsDao.setCover(projectId, cover);
    reload();
  }

  // ----------------------------------------------------------------- books

  Book createBook({required String title, String? description}) {
    final book = booksDao.create(projectId: projectId, title: title, description: description);
    selectedBookId = book.id;
    reload();
    return book;
  }

  void updateBook(
    int bookId, {
    String? title,
    String? description,
    String? cover,
    bool clearCover = false,
    BookMetadata? metadata,
    BookSettings? settings,
    int? dueDate,
    bool clearDueDate = false,
  }) {
    booksDao.update(
      bookId,
      title: title,
      description: description,
      cover: cover,
      clearCover: clearCover,
      metadata: metadata,
      settings: settings,
      dueDate: dueDate,
      clearDueDate: clearDueDate,
    );
    reload();
  }

  void deleteBook(int bookId) {
    booksDao.delete(bookId);
    if (selectedBookId == bookId) selectedBookId = null;
    reload();
  }

  // ---------------------------------------------------------------- statuses

  void addStatus(String title, int colour) {
    plotDao.addStatus(projectId: projectId, title: title, colour: colour);
    reload();
  }

  void updateStatus(int id, {String? title, int? colour}) {
    plotDao.updateStatus(id, title: title, colour: colour);
    reload();
  }

  void deleteStatus(int id) {
    if (statuses.length <= 1) return;
    final fallback = statuses.firstWhere((s) => s.id != id, orElse: () => statuses.first);
    plotDao.deleteStatus(id, fallbackStatusId: fallback.id);
    reload();
  }

  void reorderStatuses(List<int> ids) {
    plotDao.reorderStatuses(ids);
    reload();
  }

  // --------------------------------------------------------------- subplots

  void addSubplot(String title, int colour) {
    plotDao.addSubplot(projectId: projectId, title: title, colour: colour);
    reload();
  }

  void updateSubplot(int id, {String? title, int? colour}) {
    plotDao.updateSubplot(id, title: title, colour: colour);
    reload();
  }

  void deleteSubplot(int id) {
    plotDao.deleteSubplot(id);
    reload();
  }

  // -------------------------------------------------------------- categories

  Category addCategory(String title, int colour) {
    final category = plotDao.createCategory(projectId: projectId, title: title, colour: colour);
    reload();
    return category;
  }

  void updateCategory(int id, {String? title, int? colour}) {
    plotDao.updateCategory(id, title: title, colour: colour);
    reload();
  }

  void deleteCategory(int id) {
    plotDao.deleteCategory(id);
    reload();
  }

  void reorderCategories(List<int> ids) {
    plotDao.reorderCategories(ids);
    reload();
  }

  // ------------------------------------------------------------------ items

  List<PlotItem> items(int categoryId) => plotDao.items(categoryId);

  List<PlotItem> get allItems => plotDao.allItems(projectId);

  PlotItem createItem({
    required int categoryId,
    required String title,
    String? synopsis,
    int? statusId,
  }) {
    final item = plotDao.createItem(
      categoryId: categoryId,
      title: title,
      statusId: statusId ?? defaultStatus.id,
      synopsis: synopsis,
    );
    reload();
    return item;
  }

  void updateItem(
    int id, {
    String? title,
    String? synopsis,
    String? text,
    int? statusId,
  }) {
    plotDao.updateItem(id, title: title, synopsis: synopsis, text: text, statusId: statusId);
    reload();
  }

  void deleteItem(int id) {
    plotDao.deleteItem(id);
    reload();
  }

  void mergeItems(int sourceId, int targetId) {
    plotDao.mergeItems(sourceId: sourceId, targetId: targetId);
    reload();
  }

  void reorderItems(List<int> ids) {
    plotDao.reorderItems(ids);
    reload();
  }

  // ----------------------------------------------------------------- scenes

  Scene createScene({required String title, String? synopsis, int? statusId}) {
    final scene = scenesDao.create(
      projectId: projectId,
      title: title,
      statusId: statusId ?? defaultStatus.id,
      synopsis: synopsis,
    );
    reload();
    return scene;
  }

  void updateScene(
    int id, {
    String? title,
    String? synopsis,
    String? text,
    String? note,
    int? statusId,
  }) {
    scenesDao.update(
      id,
      title: title,
      synopsis: synopsis,
      text: text,
      note: note,
      statusId: statusId,
    );
    reload();
  }

  void deleteScene(int id) {
    scenesDao.delete(id);
    reload();
  }

  void reorderScenes(List<int> ids) {
    scenesDao.reorder(ids);
    reload();
  }

  Scene splitScene(int sceneId, int blockIndex) {
    final scene = scenesDao.split(sceneId, blockIndex);
    reload();
    return scene;
  }

  // ----------------------------------------------------------------- export

  CompiledBook compiledBook(Book book, CompileOptions options) {
    final entries = sectionsDao.manuscript(book.id, onlyCompiled: true);
    return buildCompiledBook(
      book: book,
      entries: entries,
      scenesById: scenesById,
      mentionValues: plotDao.mentionLabels(projectId),
      options: options,
    );
  }

  int wordCountForBook(Book book) => sectionsDao.wordCountForBook(book.id);

  /// Recomputes and persists the stored word count of a book (called after compiling or after large
  /// edits so the bookshelf stays accurate).
  void refreshBookWordCount(int bookId) {
    final words = sectionsDao.wordCountForBook(bookId);
    booksDao.setWordCount(bookId, words);
    reload();
  }

  String plainTextForScene(Scene scene) => TextDoc.fromJsonString(scene.text).plainText;
}
