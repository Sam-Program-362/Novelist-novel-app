import '../../core/utils/codes.dart';
import '../../core/utils/text_doc.dart';
import '../../models/entities.dart';
import '../db/database.dart';

/// Manuscript structure (book → sections → attached scenes).
///
/// Invariants enforced here:
/// * `section_scene` is the **only** table that puts a scene into a manuscript.
/// * Detaching or deleting a section never deletes the scene itself (the scene belongs to the
///   project's shared Write pool).
/// * Deleting a section detaches its children scenes and cascades its subsections.
class SectionsDao {
  final AppDatabase db;
  SectionsDao(this.db);

  Section _map(Map<String, Object?> row) => Section(
        id: row['section_id'] as int,
        bookId: row['section_book_id'] as int,
        parentId: row['section_parent_id'] as int?,
        code: row['section_code'] as String,
        title: row['section_title'] as String,
        synopsis: row['section_synopsis'] as String?,
        ranking: row['section_ranking'] as int,
        isExpanded: (row['section_is_expanded'] as int? ?? 1) == 1,
        isCompiled: (row['section_is_compiled'] as int? ?? 1) == 1,
      );

  List<Section> forBook(int bookId) {
    final rows = db.select(
      'SELECT * FROM section WHERE section_book_id = ? ORDER BY section_ranking ASC, section_id ASC',
      [bookId],
    );
    return rows.map(_map).toList(growable: false);
  }

  Section? byId(int id) {
    final rows = db.select('SELECT * FROM section WHERE section_id = ?', [id]);
    if (rows.isEmpty) return null;
    return _map(rows.first);
  }

  Section create({
    required int bookId,
    int? parentId,
    required String title,
    String? synopsis,
    bool isCompiled = true,
    String? code,
  }) {
    final siblings = db.select(
      'SELECT COUNT(*) AS c FROM section WHERE section_book_id = ? AND '
      '${parentId == null ? 'section_parent_id IS NULL' : 'section_parent_id = $parentId'}',
      [bookId],
    );
    final ranking = ((siblings.first['c'] as num).toInt()) + 1;
    final id = db.insert('section', {
      'section_book_id': bookId,
      'section_parent_id': parentId,
      'section_code': code ?? CodeGen.next(),
      'section_title': title,
      'section_synopsis': synopsis,
      'section_ranking': ranking,
      'section_is_expanded': parentId == null ? 1 : 1,
      'section_is_compiled': isCompiled ? 1 : 0,
    });
    return byId(id)!;
  }

  void update(
    int id, {
    String? title,
    String? synopsis,
    int? parentId,
    bool clearParent = false,
    bool? isExpanded,
    bool? isCompiled,
    int? ranking,
  }) {
    final values = <String, Object?>{};
    if (title != null) values['section_title'] = title;
    if (synopsis != null) values['section_synopsis'] = synopsis;
    if (parentId != null) values['section_parent_id'] = parentId;
    if (clearParent) values['section_parent_id'] = null;
    if (isExpanded != null) values['section_is_expanded'] = isExpanded ? 1 : 0;
    if (isCompiled != null) values['section_is_compiled'] = isCompiled ? 1 : 0;
    if (ranking != null) values['section_ranking'] = ranking;
    if (values.isEmpty) return;
    db.update('section', values, 'section_id = ?', [id]);
  }

  /// Deletes a section only: sections cascade, but attached scenes remain in the project pool.
  void delete(int id) {
    db.transaction(() => db.deleteWhere('section', 'section_id = ?', [id]));
  }

  /// Reorders sections that share the same parent.
  void reorder(List<int> orderedIds) {
    db.transaction(() {
      for (var i = 0; i < orderedIds.length; i++) {
        db.update('section', {'section_ranking': i + 1}, 'section_id = ?', [orderedIds[i]]);
      }
    });
  }

  void toggleExpanded(int id, bool expanded) {
    db.update('section', {'section_is_expanded': expanded ? 1 : 0}, 'section_id = ?', [id]);
  }

  void toggleCompiled(int id, bool compiled) {
    db.update('section', {'section_is_compiled': compiled ? 1 : 0}, 'section_id = ?', [id]);
  }

  // ----------------------------------------------------------- section scenes

  List<int> sceneIds(int sectionId) {
    final rows = db.select(
      'SELECT section_scene_scene_id FROM section_scene WHERE section_scene_section_id = ? '
      'ORDER BY section_scene_ranking ASC, section_scene_id ASC',
      [sectionId],
    );
    return rows.map((row) => row['section_scene_scene_id'] as int).toList(growable: false);
  }

  /// Attaches an existing project scene to a section. Re-attaching an already attached scene is a
  /// no-op so the UI cannot create duplicates.
  void attachScene(int sectionId, int sceneId) {
    final existing = db.select(
      'SELECT section_scene_id FROM section_scene WHERE section_scene_section_id = ? '
      'AND section_scene_scene_id = ?',
      [sectionId, sceneId],
    );
    if (existing.isNotEmpty) return;
    final count = db.count('section_scene', 'section_scene_section_id = ?', [sectionId]);
    db.insert('section_scene', {
      'section_scene_section_id': sectionId,
      'section_scene_scene_id': sceneId,
      'section_scene_ranking': count + 1,
    });
  }

  void attachScenes(int sectionId, Iterable<int> sceneIds) {
    db.transaction(() {
      final existing = sceneIdsOf([sectionId]).toSet();
      for (final sceneId in sceneIds) {
        if (existing.contains(sceneId)) continue;
        attachScene(sectionId, sceneId);
      }
    });
  }

  /// Removes the scene from the section/manuscript. The scene row itself is untouched.
  void detachScene(int sectionId, int sceneId) {
    db.transaction(() {
      db.deleteWhere(
        'section_scene',
        'section_scene_section_id = ? AND section_scene_scene_id = ?',
        [sectionId, sceneId],
      );
      _normaliseRankings(sectionId);
    });
  }

  void reorderScenes(int sectionId, List<int> orderedSceneIds) {
    db.transaction(() {
      for (var i = 0; i < orderedSceneIds.length; i++) {
        db.update(
          'section_scene',
          {'section_scene_ranking': i + 1},
          'section_scene_section_id = ? AND section_scene_scene_id = ?',
          [sectionId, orderedSceneIds[i]],
        );
      }
    });
  }

  void _normaliseRankings(int sectionId) {
    final ids = sceneIds(sectionId);
    for (var i = 0; i < ids.length; i++) {
      db.update(
        'section_scene',
        {'section_scene_ranking': i + 1},
        'section_scene_section_id = ? AND section_scene_scene_id = ?',
        [sectionId, ids[i]],
      );
    }
  }

  /// All scene ids attached to any of the given sections, de-duplicated (used for word counts).
  Set<int> sceneIdsOf(Iterable<int> sectionIds) {
    final result = <int>{};
    for (final id in sectionIds) {
      result.addAll(sceneIds(id));
    }
    return result;
  }

  // ------------------------------------------------------------- manuscript

  /// Flattens a book's tree into reading order: each section followed by its subsections, with the
  /// scenes attached to each section. Used by preview, compile and word counts so all three agree.
  List<ManuscriptEntry> manuscript(int bookId, {bool onlyCompiled = false}) {
    final sections = forBook(bookId);
    final byParent = <int?, List<Section>>{};
    for (final section in sections) {
      byParent.putIfAbsent(section.parentId, () => []).add(section);
    }
    for (final list in byParent.values) {
      list.sort((a, b) => a.ranking.compareTo(b.ranking));
    }

    final entries = <ManuscriptEntry>[];
    void walk(int? parentId, int depth) {
      for (final section in byParent[parentId] ?? const <Section>[]) {
        if (onlyCompiled && !section.isCompiled) continue;
        final scenes = sceneIds(section.id);
        entries.add(ManuscriptEntry(
          section: section,
          depth: depth,
          sceneIds: scenes,
        ));
        walk(section.id, depth + 1);
      }
    }

    walk(null, 0);
    return entries;
  }

  /// Scene ids of the whole book, in reading order, de-duplicated.
  List<int> manuscriptSceneIds(int bookId, {bool onlyCompiled = true}) {
    final seen = <int>{};
    final ordered = <int>[];
    for (final entry in manuscript(bookId, onlyCompiled: onlyCompiled)) {
      for (final id in entry.sceneIds) {
        if (seen.add(id)) ordered.add(id);
      }
    }
    return ordered;
  }

  int wordCountForBook(int bookId, {bool onlyCompiled = true}) {
    var total = 0;
    final seen = <int>{};
    for (final entry in manuscript(bookId, onlyCompiled: onlyCompiled)) {
      for (final sceneId in entry.sceneIds) {
        if (!seen.add(sceneId)) continue;
        final rows = db.select('SELECT scene_text FROM scene WHERE scene_id = ?', [sceneId]);
        if (rows.isEmpty) continue;
        total += TextDoc.fromJsonString(rows.first['scene_text'] as String?).wordCount;
      }
    }
    return total;
  }
}

class ManuscriptEntry {
  final Section section;
  final int depth;
  final List<int> sceneIds;

  const ManuscriptEntry({
    required this.section,
    required this.depth,
    required this.sceneIds,
  });
}
