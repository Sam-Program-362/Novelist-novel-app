import 'package:flutter/foundation.dart';

import '../data/dao/projects_dao.dart';
import '../data/db/database.dart';
import '../data/io/nov_file.dart';
import '../data/repositories/project_repository.dart';
import '../data/templates/template_service.dart';
import '../models/entities.dart';

/// Library state: the bookshelf of projects, its sorting/view preferences and project lifecycle.
class LibraryController extends ChangeNotifier {
  final AppDatabase db;
  late final ProjectRepository repository = ProjectRepository(db);
  late final NovFile novFile = NovFile(db);

  LibraryController(this.db);

  ProjectSortField _sortField = ProjectSortField.lastUpdate;
  bool _ascending = false;
  bool _gridView = true;
  bool _busy = false;
  String? _error;

  ProjectSortField get sortField => _sortField;
  bool get ascending => _ascending;
  bool get gridView => _gridView;
  bool get busy => _busy;
  String? get error => _error;

  List<Project> get projects =>
      repository.projects.list(field: _sortField, ascending: _ascending);

  void setSort(ProjectSortField field, {bool? ascending}) {
    _sortField = field;
    if (ascending != null) _ascending = ascending;
    notifyListeners();
  }

  void toggleSortDirection() {
    _ascending = !_ascending;
    notifyListeners();
  }

  void setGridView(bool value) {
    _gridView = value;
    notifyListeners();
  }

  Future<Project> createProject({
    required String title,
    String? description,
    bool empty = false,
  }) async {
    _setBusy(true);
    try {
      final template = empty ? await TemplateService.loadEmpty() : await TemplateService.loadStandard();
      final project = repository.createFromTemplate(
        title: title,
        description: description,
        template: template,
      );
      notifyListeners();
      return project;
    } finally {
      _setBusy(false);
    }
  }

  void deleteProject(int id) {
    repository.deleteProject(id);
    notifyListeners();
  }

  Project duplicateProject(int id) {
    final copy = repository.duplicate(id);
    notifyListeners();
    return copy;
  }

  void updateProject(int id, {String? title, String? description}) {
    repository.projects.update(id, title: title, description: description);
    notifyListeners();
  }

  void setCover(int id, String? cover) {
    repository.projects.setCover(id, cover);
    notifyListeners();
  }

  String exportProject(int id) {
    final body = novFile.exportToString(id);
    repository.projects.markBackedUp(id);
    notifyListeners();
    return body;
  }

  int importProject(String content) {
    final projectId = novFile.importString(content);
    notifyListeners();
    return projectId;
  }

  void _setBusy(bool value) {
    _busy = value;
    if (!value) _error = null;
    notifyListeners();
  }

  void setError(String message) {
    _error = message;
    notifyListeners();
  }
}
