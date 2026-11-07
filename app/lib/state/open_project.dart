import 'package:flutter/foundation.dart';

import '../data/db/database.dart';
import 'project_controller.dart';

/// Holds the controller of the currently open project above the navigator, so every pushed route
/// (scene editor, item detail, preview, export …) can reach the same project state.
///
/// Providing the controller inside the project route would make it invisible to sibling routes,
/// which is a common source of "provider not found" bugs in list → detail flows.
class OpenProject extends ChangeNotifier {
  final AppDatabase db;
  ProjectController? _controller;

  OpenProject(this.db);

  ProjectController? get controller => _controller;

  ProjectController open(int projectId) {
    if (_controller?.projectId == projectId) return _controller!;
    _controller?.dispose();
    _controller = ProjectController(db, projectId);
    notifyListeners();
    return _controller!;
  }

  void close() {
    _controller?.dispose();
    _controller = null;
    notifyListeners();
  }
}
