import 'dart:convert';

import '../../core/utils/codes.dart';
import '../../core/utils/text_doc.dart';
import '../../models/entities.dart';
import '../db/database.dart';

/// Write module data access. Scenes are project-scoped (shared by every book of the project);
/// nothing here writes manuscript structure — that is exclusively `SectionsDao`.
class ScenesDao {
  final AppDatabase db;
  ScenesDao(this.db);

  Scene _map(Map<String, Object?> row) => Scene(
        id: row['scene_id'] as int,
        projectId: row['scene_project_id'] as int,
        code: row['scene_code'] as String,
        title: row['scene_title'] as String,
        synopsis: row['scene_synopsis'] as String?,
        text: row['scene_text'] as String?,
        note: row['scene_note'] as String?,
        ranking: row['scene_ranking'] as int,
        statusId: row['scene_status_id'] as int,
      );

  List<Scene> list(int projectId) {
    final rows = db.select(
      'SELECT * FROM scene WHERE scene_project_id = ? ORDER BY scene_ranking ASC, scene_id ASC',
      [projectId],
    );
    return rows.map(_map).toList(growable: false);
  }

  Scene? byId(int id) {
    final rows = db.select('SELECT * FROM scene WHERE scene_id = ?', [id]);
    if (rows.isEmpty) return null;
    return _map(rows.first);
  }

  Scene? byCode(int projectId, String code) {
    final rows = db.select(
      'SELECT * FROM scene WHERE scene_project_id = ? AND scene_code = ?',
      [projectId, code],
    );
    if (rows.isEmpty) return null;
    return _map(rows.first);
  }

  Scene create({
    required int projectId,
    required String title,
    required int statusId,
    String? synopsis,
    String? text,
    int? ranking,
    String? code,
  }) {
    final next = ranking ?? db.count('scene', 'scene_project_id = ?', [projectId]) + 1;
    final id = db.insert('scene', {
      'scene_project_id': projectId,
      'scene_code': code ?? CodeGen.next(),
      'scene_title': title,
      'scene_synopsis': synopsis,
      'scene_text': text,
      'scene_note': null,
      'scene_ranking': next,
      'scene_status_id': statusId,
    });
    return byId(id)!;
  }

  void update(
    int id, {
    String? title,
    String? synopsis,
    String? text,
    String? note,
    int? statusId,
    int? ranking,
  }) {
    final values = <String, Object?>{};
    if (title != null) values['scene_title'] = title;
    if (synopsis != null) values['scene_synopsis'] = synopsis;
    if (text != null) values['scene_text'] = text;
    if (note != null) values['scene_note'] = note;
    if (statusId != null) values['scene_status_id'] = statusId;
    if (ranking != null) values['scene_ranking'] = ranking;
    if (values.isEmpty) return;
    db.update('scene', values, 'scene_id = ?', [id]);
  }

  void delete(int id) {
    db.transaction(() => db.deleteWhere('scene', 'scene_id = ?', [id]));
  }

  void reorder(List<int> orderedIds) {
    db.transaction(() {
      for (var i = 0; i < orderedIds.length; i++) {
        db.update('scene', {'scene_ranking': i + 1}, 'scene_id = ?', [orderedIds[i]]);
      }
    });
  }

  /// Splits [sceneId] after the paragraph at [blockIndex]. The original scene keeps the first
  /// part, a new scene receives the remainder (quickstart: “split scenes into two”).
  /// Returns the new scene.
  Scene split(int sceneId, int blockIndex) {
    return db.transaction(() {
      final scene = byId(sceneId);
      if (scene == null) throw StateError('Scene $sceneId not found');
      final doc = TextDoc.fromJsonString(scene.text);
      if (doc.blocks.length < 2) {
        throw StateError('Scene has too little content to split');
      }
      final index = blockIndex.clamp(1, doc.blocks.length - 1);
      final firstBlocks = doc.blocks.sublist(0, index);
      final secondBlocks = doc.blocks.sublist(index);
      update(sceneId, text: TextDoc(firstBlocks).toJsonString());

      final newScene = create(
        projectId: scene.projectId,
        title: '${scene.title} (2)',
        statusId: scene.statusId,
        synopsis: scene.synopsis,
        text: TextDoc(secondBlocks).toJsonString(),
        ranking: scene.ranking + 1,
      );
      // Shift the ranking of the following scenes so the new scene sits directly after.
      final siblings = list(scene.projectId)
          .where((s) => s.id != newScene.id && s.ranking > scene.ranking)
          .toList(growable: false);
      for (final sibling in siblings) {
        db.update('scene', {'scene_ranking': sibling.ranking + 1}, 'scene_id = ?', [sibling.id]);
      }
      // Copy plot-item attachments so the second half keeps its references.
      for (final itemId in attachedItemIds(sceneId)) {
        attachItem(newScene.id, itemId);
      }
      return newScene;
    });
  }

  // -------------------------------------------------------- plot attachments

  List<int> attachedItemIds(int sceneId) {
    final rows = db.select('SELECT scene_item_item_id FROM scene_item WHERE scene_item_scene_id = ?', [sceneId]);
    return rows.map((row) => row['scene_item_item_id'] as int).toList(growable: false);
  }

  List<PlotItem> attachedItems(int sceneId) {
    final rows = db.select(
      'SELECT i.* FROM item i JOIN scene_item si ON si.scene_item_item_id = i.item_id '
      'WHERE si.scene_item_scene_id = ? ORDER BY i.item_ranking ASC',
      [sceneId],
    );
    return rows
        .map((row) => PlotItem(
              id: row['item_id'] as int,
              categoryId: row['item_category_id'] as int,
              code: row['item_code'] as String,
              title: row['item_title'] as String,
              synopsis: row['item_synopsis'] as String?,
              text: row['item_text'] as String?,
              ranking: row['item_ranking'] as int,
              statusId: row['item_status_id'] as int,
            ))
        .toList(growable: false);
  }

  void attachItem(int sceneId, int itemId) {
    final existing = db.select(
      'SELECT scene_item_id FROM scene_item WHERE scene_item_scene_id = ? AND scene_item_item_id = ?',
      [sceneId, itemId],
    );
    if (existing.isNotEmpty) return;
    db.insert('scene_item', {'scene_item_scene_id': sceneId, 'scene_item_item_id': itemId});
  }

  void detachItem(int sceneId, int itemId) {
    db.deleteWhere(
      'scene_item',
      'scene_item_scene_id = ? AND scene_item_item_id = ?',
      [sceneId, itemId],
    );
  }

  // ------------------------------------------------------------- scene notes

  List<ItemNote> notes(int sceneId) {
    final rows = db.select(
      'SELECT * FROM scene_note WHERE scene_note_scene_id = ? ORDER BY scene_note_ranking ASC',
      [sceneId],
    );
    return rows
        .map((row) => ItemNote(
              id: row['scene_note_id'] as int,
              itemId: row['scene_note_scene_id'] as int,
              text: row['scene_note_text'] as String,
              ranking: row['scene_note_ranking'] as int,
            ))
        .toList(growable: false);
  }

  void addNote(int sceneId, String text) {
    final ranking = db.count('scene_note', 'scene_note_scene_id = ?', [sceneId]) + 1;
    db.insert('scene_note', {
      'scene_note_scene_id': sceneId,
      'scene_note_text': text,
      'scene_note_ranking': ranking,
    });
  }

  void deleteNote(int id) => db.deleteWhere('scene_note', 'scene_note_id = ?', [id]);

  // ---------------------------------------------------------- scene pictures

  List<ItemPicture> pictures(int sceneId) {
    final rows = db.select(
      'SELECT * FROM scene_picture WHERE scene_picture_scene_id = ? ORDER BY scene_picture_ranking ASC',
      [sceneId],
    );
    return rows
        .map((row) => ItemPicture(
              id: row['scene_picture_id'] as int,
              itemId: row['scene_picture_scene_id'] as int,
              name: row['scene_picture_name'] as String,
              ranking: row['scene_picture_ranking'] as int,
            ))
        .toList(growable: false);
  }

  void addPicture(int sceneId, String name) {
    final ranking = db.count('scene_picture', 'scene_picture_scene_id = ?', [sceneId]) + 1;
    db.insert('scene_picture', {
      'scene_picture_scene_id': sceneId,
      'scene_picture_name': name,
      'scene_picture_ranking': ranking,
    });
  }

  void deletePicture(int id) => db.deleteWhere('scene_picture', 'scene_picture_id = ?', [id]);

  // ----------------------------------------------------------- scene subplots

  List<SceneSubplot> subplots(int sceneId) {
    final rows = db.select(
      'SELECT * FROM scene_subplot WHERE scene_subplot_scene_id = ? ORDER BY scene_subplot_id ASC',
      [sceneId],
    );
    return rows
        .map((row) => SceneSubplot(
              id: row['scene_subplot_id'] as int,
              sceneId: row['scene_subplot_scene_id'] as int,
              subplotId: row['scene_subplot_subplot_id'] as int,
              synopsis: row['scene_subplot_synopsis'] as String,
            ))
        .toList(growable: false);
  }

  void setSubplots(int sceneId, Map<int, String> subplotSynopses) {
    db.transaction(() {
      db.deleteWhere('scene_subplot', 'scene_subplot_scene_id = ?', [sceneId]);
      subplotSynopses.forEach((subplotId, synopsis) {
        db.insert('scene_subplot', {
          'scene_subplot_scene_id': sceneId,
          'scene_subplot_subplot_id': subplotId,
          'scene_subplot_synopsis': synopsis,
        });
      });
    });
  }

  // -------------------------------------------------------------- history

  void pushHistory(int sceneId, String? text, {int keep = 20}) {
    if (text == null || text.isEmpty) return;
    db.insert('scene_history', {
      'scene_history_scene_id': sceneId,
      'scene_history_scene_text': text,
      'scene_history_date': DateTime.now().millisecondsSinceEpoch,
    });
    final rows = db.select(
      'SELECT scene_history_id FROM scene_history WHERE scene_history_scene_id = ? '
      'ORDER BY scene_history_date DESC',
      [sceneId],
    );
    for (var i = keep; i < rows.length; i++) {
      db.deleteWhere('scene_history', 'scene_history_id = ?', [rows[i]['scene_history_id']]);
    }
  }

  List<HistoryEntry> history(int sceneId) {
    final rows = db.select(
      'SELECT * FROM scene_history WHERE scene_history_scene_id = ? ORDER BY scene_history_date DESC',
      [sceneId],
    );
    return rows
        .map((row) => HistoryEntry(
              id: row['scene_history_id'] as int,
              text: row['scene_history_scene_text'] as String?,
              date: row['scene_history_date'] as int,
            ))
        .toList(growable: false);
  }

  // ------------------------------------------------------------ word counts

  int wordCount(int sceneId) {
    final scene = byId(sceneId);
    if (scene == null) return 0;
    return TextDoc.fromJsonString(scene.text).wordCount;
  }

  /// Total words of every scene in the project (each scene counted once, regardless of how many
  /// books it is attached to).
  int projectWordCount(int projectId) {
    var total = 0;
    for (final scene in list(projectId)) {
      total += TextDoc.fromJsonString(scene.text).wordCount;
    }
    return total;
  }

  /// Words of the scenes attached to a book — the number shown for that book and used by export.
  int wordCountForSections(Iterable<int> sceneIds) {
    var total = 0;
    for (final id in sceneIds.toSet()) {
      total += wordCount(id);
    }
    return total;
  }

  // ------------------------------------------------------ import helpers

  /// Serializes every scene of the project as the reference `.nov` scene array.
  String? rawText(int sceneId) => byId(sceneId)?.text;

  static String encodeSceneText(List<Map<String, dynamic>> blocks) =>
      jsonEncode({'blocks': blocks});
}
