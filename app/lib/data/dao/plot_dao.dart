import '../../core/utils/codes.dart';
import '../../models/entities.dart';
import '../db/database.dart';

/// Plot module data access: categories, metadata schema, items and every item-level relation.
class PlotDao {
  final AppDatabase db;
  PlotDao(this.db);

  // ------------------------------------------------------------- categories

  Category _category(Map<String, Object?> row) => Category(
        id: row['category_id'] as int,
        projectId: row['category_project_id'] as int,
        code: row['category_code'] as String,
        title: row['category_title'] as String,
        colour: row['category_color'] as int,
        ranking: row['category_ranking'] as int,
      );

  List<Category> categories(int projectId) {
    final rows = db.select(
      'SELECT * FROM category WHERE category_project_id = ? ORDER BY category_ranking ASC, category_id ASC',
      [projectId],
    );
    return rows.map(_category).toList(growable: false);
  }

  Category? categoryById(int id) {
    final rows = db.select('SELECT * FROM category WHERE category_id = ?', [id]);
    if (rows.isEmpty) return null;
    return _category(rows.first);
  }

  Category createCategory({
    required int projectId,
    required String title,
    required int colour,
    String? code,
    int? ranking,
  }) {
    final nextRanking = ranking ?? db.count('category', 'category_project_id = ?', [projectId]) + 1;
    final id = db.insert('category', {
      'category_project_id': projectId,
      'category_code': code ?? CodeGen.next(),
      'category_title': title,
      'category_color': colour,
      'category_ranking': nextRanking,
    });
    return categoryById(id)!;
  }

  void updateCategory(int id, {String? title, int? colour}) {
    final values = <String, Object?>{};
    if (title != null) values['category_title'] = title;
    if (colour != null) values['category_color'] = colour;
    if (values.isEmpty) return;
    db.update('category', values, 'category_id = ?', [id]);
  }

  void deleteCategory(int id) {
    db.transaction(() => db.deleteWhere('category', 'category_id = ?', [id]));
  }

  void reorderCategories(List<int> orderedIds) {
    db.transaction(() {
      for (var i = 0; i < orderedIds.length; i++) {
        db.update('category', {'category_ranking': i + 1}, 'category_id = ?', [orderedIds[i]]);
      }
    });
  }

  // ----------------------------------------------------------- metadata

  List<MetadataGroup> metadataGroups(int categoryId) {
    final rows = db.select(
      'SELECT * FROM metadata_group WHERE metadata_group_category_id = ? '
      'ORDER BY metadata_group_ranking ASC, metadata_group_id ASC',
      [categoryId],
    );
    return rows
        .map((row) => MetadataGroup(
              id: row['metadata_group_id'] as int,
              categoryId: row['metadata_group_category_id'] as int,
              code: row['metadata_group_code'] as String,
              title: row['metadata_group_title'] as String,
              ranking: row['metadata_group_ranking'] as int,
            ))
        .toList(growable: false);
  }

  MetadataGroup addMetadataGroup({
    required int categoryId,
    required String title,
    String? code,
  }) {
    final ranking =
        db.count('metadata_group', 'metadata_group_category_id = ?', [categoryId]) + 1;
    final id = db.insert('metadata_group', {
      'metadata_group_category_id': categoryId,
      'metadata_group_code': code ?? CodeGen.next(),
      'metadata_group_title': title,
      'metadata_group_ranking': ranking,
    });
    return MetadataGroup(
      id: id,
      categoryId: categoryId,
      code: code ?? '',
      title: title,
      ranking: ranking,
    );
  }

  void updateMetadataGroup(int id, {String? title}) {
    if (title == null) return;
    db.update('metadata_group', {'metadata_group_title': title}, 'metadata_group_id = ?', [id]);
  }

  void deleteMetadataGroup(int id) {
    db.transaction(() => db.deleteWhere('metadata_group', 'metadata_group_id = ?', [id]));
  }

  void reorderMetadataGroups(List<int> orderedIds) {
    db.transaction(() {
      for (var i = 0; i < orderedIds.length; i++) {
        db.update('metadata_group', {'metadata_group_ranking': i + 1}, 'metadata_group_id = ?',
            [orderedIds[i]]);
      }
    });
  }

  List<MetadataElement> metadataElements(int groupId) {
    final rows = db.select(
      'SELECT * FROM metadata_element WHERE metadata_element_metadata_group_id = ? '
      'ORDER BY metadata_element_ranking ASC, metadata_element_id ASC',
      [groupId],
    );
    return rows
        .map((row) => MetadataElement(
              id: row['metadata_element_id'] as int,
              groupId: row['metadata_element_metadata_group_id'] as int,
              code: row['metadata_element_code'] as String,
              title: row['metadata_element_title'] as String,
              ranking: row['metadata_element_ranking'] as int,
              isRelevant: (row['metadata_element_is_relevant'] as int? ?? 0) == 1,
            ))
        .toList(growable: false);
  }

  List<MetadataElement> metadataElementsForCategory(int categoryId) {
    final rows = db.select(
      'SELECT e.* FROM metadata_element e '
      'JOIN metadata_group g ON g.metadata_group_id = e.metadata_element_metadata_group_id '
      'WHERE g.metadata_group_category_id = ? '
      'ORDER BY g.metadata_group_ranking ASC, e.metadata_element_ranking ASC',
      [categoryId],
    );
    return rows
        .map((row) => MetadataElement(
              id: row['metadata_element_id'] as int,
              groupId: row['metadata_element_metadata_group_id'] as int,
              code: row['metadata_element_code'] as String,
              title: row['metadata_element_title'] as String,
              ranking: row['metadata_element_ranking'] as int,
              isRelevant: (row['metadata_element_is_relevant'] as int? ?? 0) == 1,
            ))
        .toList(growable: false);
  }

  MetadataElement addMetadataElement({
    required int groupId,
    required String title,
    bool isRelevant = false,
    String? code,
  }) {
    final ranking =
        db.count('metadata_element', 'metadata_element_metadata_group_id = ?', [groupId]) + 1;
    final id = db.insert('metadata_element', {
      'metadata_element_metadata_group_id': groupId,
      'metadata_element_code': code ?? CodeGen.next(),
      'metadata_element_title': title,
      'metadata_element_ranking': ranking,
      'metadata_element_is_relevant': isRelevant ? 1 : 0,
    });
    return MetadataElement(
      id: id,
      groupId: groupId,
      code: '',
      title: title,
      ranking: ranking,
      isRelevant: isRelevant,
    );
  }

  void updateMetadataElement(int id, {String? title, bool? isRelevant}) {
    final values = <String, Object?>{};
    if (title != null) values['metadata_element_title'] = title;
    if (isRelevant != null) values['metadata_element_is_relevant'] = isRelevant ? 1 : 0;
    if (values.isEmpty) return;
    db.update('metadata_element', values, 'metadata_element_id = ?', [id]);
  }

  void deleteMetadataElement(int id) {
    db.transaction(() => db.deleteWhere('metadata_element', 'metadata_element_id = ?', [id]));
  }

  void reorderMetadataElements(List<int> orderedIds) {
    db.transaction(() {
      for (var i = 0; i < orderedIds.length; i++) {
        db.update('metadata_element', {'metadata_element_ranking': i + 1},
            'metadata_element_id = ?', [orderedIds[i]]);
      }
    });
  }

  // ---------------------------------------------------------------- items

  PlotItem _item(Map<String, Object?> row) => PlotItem(
        id: row['item_id'] as int,
        categoryId: row['item_category_id'] as int,
        code: row['item_code'] as String,
        title: row['item_title'] as String,
        synopsis: row['item_synopsis'] as String?,
        text: row['item_text'] as String?,
        ranking: row['item_ranking'] as int,
        statusId: row['item_status_id'] as int,
      );

  List<PlotItem> items(int categoryId) {
    final rows = db.select(
      'SELECT * FROM item WHERE item_category_id = ? ORDER BY item_ranking ASC, item_id ASC',
      [categoryId],
    );
    return rows.map(_item).toList(growable: false);
  }

  List<PlotItem> allItems(int projectId) {
    final rows = db.select(
      'SELECT i.* FROM item i JOIN category c ON c.category_id = i.item_category_id '
      'WHERE c.category_project_id = ? ORDER BY c.category_ranking ASC, i.item_ranking ASC',
      [projectId],
    );
    return rows.map(_item).toList(growable: false);
  }

  PlotItem? itemById(int id) {
    final rows = db.select('SELECT * FROM item WHERE item_id = ?', [id]);
    if (rows.isEmpty) return null;
    return _item(rows.first);
  }

  PlotItem? itemByCode(int projectId, String code) {
    final rows = db.select(
      'SELECT i.* FROM item i JOIN category c ON c.category_id = i.item_category_id '
      'WHERE c.category_project_id = ? AND i.item_code = ?',
      [projectId, code],
    );
    if (rows.isEmpty) return null;
    return _item(rows.first);
  }

  PlotItem createItem({
    required int categoryId,
    required String title,
    required int statusId,
    String? synopsis,
    String? text,
    int? ranking,
    String? code,
  }) {
    final nextRanking =
        ranking ?? db.count('item', 'item_category_id = ?', [categoryId]) + 1;
    final id = db.insert('item', {
      'item_category_id': categoryId,
      'item_code': code ?? CodeGen.next(),
      'item_title': title,
      'item_synopsis': synopsis,
      'item_text': text,
      'item_note': null,
      'item_metadata': null,
      'item_picture': null,
      'item_ranking': nextRanking,
      'item_status_id': statusId,
    });
    return itemById(id)!;
  }

  void updateItem(
    int id, {
    String? title,
    String? synopsis,
    String? text,
    int? statusId,
    int? ranking,
  }) {
    final values = <String, Object?>{};
    if (title != null) values['item_title'] = title;
    if (synopsis != null) values['item_synopsis'] = synopsis;
    if (text != null) values['item_text'] = text;
    if (statusId != null) values['item_status_id'] = statusId;
    if (ranking != null) values['item_ranking'] = ranking;
    if (values.isEmpty) return;
    db.update('item', values, 'item_id = ?', [id]);
  }

  void deleteItem(int id) {
    db.transaction(() => db.deleteWhere('item', 'item_id = ?', [id]));
  }

  void reorderItems(List<int> orderedIds) {
    db.transaction(() {
      for (var i = 0; i < orderedIds.length; i++) {
        db.update('item', {'item_ranking': i + 1}, 'item_id = ?', [orderedIds[i]]);
      }
    });
  }

  /// Merges [sourceId] into [targetId]: metadata/names/notes/pictures/relations/tags that the
  /// target does not already have are moved, then the source item is deleted (quickstart: “long
  /// press the status circle to delete or merge items”).
  void mergeItems({required int sourceId, required int targetId}) {
    if (sourceId == targetId) return;
    db.transaction(() {
      final source = itemById(sourceId);
      final target = itemById(targetId);
      if (source == null || target == null) return;

      db.execute(
        'INSERT OR IGNORE INTO item_metadata(item_metadata_item_id, item_metadata_metadata_element_id, item_metadata_value) '
        'SELECT ?, item_metadata_metadata_element_id, item_metadata_value FROM item_metadata WHERE item_metadata_item_id = ?',
        [targetId, sourceId],
      );
      db.execute(
        'INSERT INTO item_name(item_name_item_id, item_name_code, item_name_name, item_name_ranking) '
        'SELECT ?, item_name_code, item_name_name, item_name_ranking FROM item_name WHERE item_name_item_id = ?',
        [targetId, sourceId],
      );
      db.execute(
        'INSERT INTO item_note(item_note_item_id, item_note_text, item_note_ranking) '
        'SELECT ?, item_note_text, item_note_ranking FROM item_note WHERE item_note_item_id = ?',
        [targetId, sourceId],
      );
      db.execute(
        'INSERT INTO item_picture(item_picture_item_id, item_picture_name, item_picture_ranking) '
        'SELECT ?, item_picture_name, item_picture_ranking FROM item_picture WHERE item_picture_item_id = ?',
        [targetId, sourceId],
      );
      db.execute(
        'INSERT OR IGNORE INTO item_tag(item_tag_item_id, item_tag_tag_id) '
        'SELECT ?, item_tag_tag_id FROM item_tag WHERE item_tag_item_id = ?',
        [targetId, sourceId],
      );
      // Scene attachments must survive the merge so manuscripts keep their references.
      db.execute(
        'INSERT INTO scene_item(scene_item_scene_id, scene_item_item_id) '
        'SELECT scene_item_scene_id, ? FROM scene_item WHERE scene_item_item_id = ? '
        'AND scene_item_scene_id NOT IN (SELECT scene_item_scene_id FROM scene_item WHERE scene_item_item_id = ?)',
        [targetId, sourceId, targetId],
      );
      db.deleteWhere('item', 'item_id = ?', [sourceId]);
    });
  }

  // ----------------------------------------------------------- item names

  List<ItemName> names(int itemId) {
    final rows = db.select(
      'SELECT * FROM item_name WHERE item_name_item_id = ? ORDER BY item_name_ranking ASC, item_name_id ASC',
      [itemId],
    );
    return rows
        .map((row) => ItemName(
              id: row['item_name_id'] as int,
              itemId: row['item_name_item_id'] as int,
              code: row['item_name_code'] as String,
              name: row['item_name_name'] as String,
              ranking: row['item_name_ranking'] as int,
            ))
        .toList(growable: false);
  }

  void addName(int itemId, String name, {String? code}) {
    final ranking = db.count('item_name', 'item_name_item_id = ?', [itemId]) + 1;
    db.insert('item_name', {
      'item_name_item_id': itemId,
      'item_name_code': code ?? CodeGen.next(),
      'item_name_name': name,
      'item_name_ranking': ranking,
    });
  }

  void updateName(int id, String name) {
    db.update('item_name', {'item_name_name': name}, 'item_name_id = ?', [id]);
  }

  void deleteName(int id) => db.deleteWhere('item_name', 'item_name_id = ?', [id]);

  /// Every mentionable code of the project mapped to its display label.
  ///
  /// An embed stores the code of the *thing it points at*: either the item code (full title) or the
  /// code of one of its aliases (`item_name`), which is why both are collected here.
  Map<String, String> mentionLabels(int projectId) {
    final result = <String, String>{};
    for (final item in allItems(projectId)) {
      result[item.code] = item.title;
    }
    final rows = db.select(
      'SELECT n.item_name_name AS name, n.item_name_code AS code FROM item_name n '
      'JOIN item i ON i.item_id = n.item_name_item_id '
      'JOIN category c ON c.category_id = i.item_category_id WHERE c.category_project_id = ?',
      [projectId],
    );
    for (final row in rows) {
      result[row['code'] as String] = row['name'] as String;
    }
    return result;
  }

  /// Label -> mentionable code, for converting editor `@Label` tokens back into embeds.
  ///
  /// Aliases win when a label is ambiguous, matching the reference: typing `@Tom` should link to the
  /// alias "Tom" (the name actually written), not to whichever item happens to be called Tom.
  Map<String, String> mentionLookup(int projectId) {
    final lookup = <String, String>{};
    for (final item in allItems(projectId)) {
      lookup.putIfAbsent(item.title, () => item.code);
    }
    final rows = db.select(
      'SELECT n.item_name_name AS name, n.item_name_code AS code FROM item_name n '
      'JOIN item i ON i.item_id = n.item_name_item_id '
      'JOIN category c ON c.category_id = i.item_category_id WHERE c.category_project_id = ?',
      [projectId],
    );
    for (final row in rows) {
      lookup[row['name'] as String] = row['code'] as String;
    }
    return lookup;
  }

  // ----------------------------------------------------------- item notes

  List<ItemNote> notes(int itemId) {
    final rows = db.select(
      'SELECT * FROM item_note WHERE item_note_item_id = ? ORDER BY item_note_ranking ASC',
      [itemId],
    );
    return rows
        .map((row) => ItemNote(
              id: row['item_note_id'] as int,
              itemId: row['item_note_item_id'] as int,
              text: row['item_note_text'] as String,
              ranking: row['item_note_ranking'] as int,
            ))
        .toList(growable: false);
  }

  void addNote(int itemId, String text) {
    final ranking = db.count('item_note', 'item_note_item_id = ?', [itemId]) + 1;
    db.insert('item_note', {
      'item_note_item_id': itemId,
      'item_note_text': text,
      'item_note_ranking': ranking,
    });
  }

  void updateNote(int id, String text) =>
      db.update('item_note', {'item_note_text': text}, 'item_note_id = ?', [id]);

  void deleteNote(int id) => db.deleteWhere('item_note', 'item_note_id = ?', [id]);

  // -------------------------------------------------------- item pictures

  List<ItemPicture> pictures(int itemId) {
    final rows = db.select(
      'SELECT * FROM item_picture WHERE item_picture_item_id = ? ORDER BY item_picture_ranking ASC',
      [itemId],
    );
    return rows
        .map((row) => ItemPicture(
              id: row['item_picture_id'] as int,
              itemId: row['item_picture_item_id'] as int,
              name: row['item_picture_name'] as String,
              ranking: row['item_picture_ranking'] as int,
            ))
        .toList(growable: false);
  }

  void addPicture(int itemId, String name) {
    final ranking = db.count('item_picture', 'item_picture_item_id = ?', [itemId]) + 1;
    db.insert('item_picture', {
      'item_picture_item_id': itemId,
      'item_picture_name': name,
      'item_picture_ranking': ranking,
    });
  }

  void deletePicture(int id) => db.deleteWhere('item_picture', 'item_picture_id = ?', [id]);

  // ------------------------------------------------------ item relations

  List<ItemRelationship> relationships(int itemId) {
    final rows = db.select(
      'SELECT * FROM item_relationship WHERE item_relationship_item_id = ? '
      'ORDER BY item_relationship_ranking ASC',
      [itemId],
    );
    return rows
        .map((row) => ItemRelationship(
              id: row['item_relationship_id'] as int,
              itemId: row['item_relationship_item_id'] as int,
              otherItemId: row['item_relationship_other_item_id'] as int,
              description: row['item_relationship_description'] as String,
              ranking: row['item_relationship_ranking'] as int,
              isRelevant: (row['item_relationship_is_relevant'] as int? ?? 0) == 1,
            ))
        .toList(growable: false);
  }

  void addRelationship({
    required int itemId,
    required int otherItemId,
    required String description,
    bool isRelevant = false,
  }) {
    final ranking = db.count('item_relationship', 'item_relationship_item_id = ?', [itemId]) + 1;
    db.insert('item_relationship', {
      'item_relationship_item_id': itemId,
      'item_relationship_other_item_id': otherItemId,
      'item_relationship_description': description,
      'item_relationship_ranking': ranking,
      'item_relationship_is_relevant': isRelevant ? 1 : 0,
    });
  }

  void updateRelationship(int id, {String? description, bool? isRelevant}) {
    final values = <String, Object?>{};
    if (description != null) values['item_relationship_description'] = description;
    if (isRelevant != null) values['item_relationship_is_relevant'] = isRelevant ? 1 : 0;
    if (values.isEmpty) return;
    db.update('item_relationship', values, 'item_relationship_id = ?', [id]);
  }

  void deleteRelationship(int id) =>
      db.deleteWhere('item_relationship', 'item_relationship_id = ?', [id]);

  // ---------------------------------------------------------- item tags

  List<Tag> tags(int categoryId) {
    final rows = db.select(
      'SELECT * FROM tag WHERE tag_category_id = ? ORDER BY tag_id ASC',
      [categoryId],
    );
    return rows
        .map((row) => Tag(
              id: row['tag_id'] as int,
              categoryId: row['tag_category_id'] as int,
              code: row['tag_code'] as String,
              title: row['tag_title'] as String,
              colour: row['tag_color'] as int,
            ))
        .toList(growable: false);
  }

  Tag addTag({
    required int categoryId,
    required String title,
    required int colour,
    String? code,
  }) {
    final id = db.insert('tag', {
      'tag_category_id': categoryId,
      'tag_code': code ?? CodeGen.next(),
      'tag_title': title,
      'tag_color': colour,
    });
    return Tag(id: id, categoryId: categoryId, code: code ?? '', title: title, colour: colour);
  }

  void updateTag(int id, {String? title, int? colour}) {
    final values = <String, Object?>{};
    if (title != null) values['tag_title'] = title;
    if (colour != null) values['tag_color'] = colour;
    if (values.isEmpty) return;
    db.update('tag', values, 'tag_id = ?', [id]);
  }

  void deleteTag(int id) => db.deleteWhere('tag', 'tag_id = ?', [id]);

  List<int> itemTagIds(int itemId) {
    final rows = db.select('SELECT item_tag_tag_id FROM item_tag WHERE item_tag_item_id = ?', [itemId]);
    return rows.map((row) => row['item_tag_tag_id'] as int).toList(growable: false);
  }

  void setItemTags(int itemId, Set<int> tagIds) {
    db.transaction(() {
      db.deleteWhere('item_tag', 'item_tag_item_id = ?', [itemId]);
      for (final tagId in tagIds) {
        db.insert('item_tag', {'item_tag_item_id': itemId, 'item_tag_tag_id': tagId});
      }
    });
  }

  // ---------------------------------------------------------- item values

  Map<int, String> itemMetadata(int itemId) {
    final rows = db.select(
      'SELECT item_metadata_metadata_element_id AS e, item_metadata_value AS v FROM item_metadata '
      'WHERE item_metadata_item_id = ?',
      [itemId],
    );
    return {for (final row in rows) row['e'] as int: row['v'] as String};
  }

  void setItemMetadataValue(int itemId, int elementId, String value) {
    final existing = db.select(
      'SELECT item_metadata_id FROM item_metadata WHERE item_metadata_item_id = ? '
      'AND item_metadata_metadata_element_id = ?',
      [itemId, elementId],
    );
    if (value.trim().isEmpty) {
      db.deleteWhere('item_metadata',
          'item_metadata_item_id = ? AND item_metadata_metadata_element_id = ?', [itemId, elementId]);
      return;
    }
    if (existing.isEmpty) {
      db.insert('item_metadata', {
        'item_metadata_item_id': itemId,
        'item_metadata_metadata_element_id': elementId,
        'item_metadata_value': value,
      });
    } else {
      db.update('item_metadata', {'item_metadata_value': value}, 'item_metadata_id = ?',
          [existing.first['item_metadata_id']]);
    }
  }

  // -------------------------------------------------------------- history

  /// Stores the previous rich-text revision of an item (bounded, newest first when read).
  void pushHistory(int itemId, String? text, {int keep = 20}) {
    if (text == null || text.isEmpty) return;
    db.insert('item_history', {
      'item_history_item_id': itemId,
      'item_history_item_text': text,
      'item_history_date': DateTime.now().millisecondsSinceEpoch,
    });
    final rows = db.select(
      'SELECT item_history_id FROM item_history WHERE item_history_item_id = ? '
      'ORDER BY item_history_date DESC',
      [itemId],
    );
    for (var i = keep; i < rows.length; i++) {
      db.deleteWhere('item_history', 'item_history_id = ?', [rows[i]['item_history_id']]);
    }
  }

  List<HistoryEntry> history(int itemId) {
    final rows = db.select(
      'SELECT * FROM item_history WHERE item_history_item_id = ? ORDER BY item_history_date DESC',
      [itemId],
    );
    return rows
        .map((row) => HistoryEntry(
              id: row['item_history_id'] as int,
              text: row['item_history_item_text'] as String?,
              date: row['item_history_date'] as int,
            ))
        .toList(growable: false);
  }

  // -------------------------------------------------- statuses / subplots

  List<Status> statuses(int projectId) {
    final rows = db.select(
      'SELECT * FROM status WHERE status_project_id = ? ORDER BY status_ranking ASC, status_id ASC',
      [projectId],
    );
    return rows
        .map((row) => Status(
              id: row['status_id'] as int,
              projectId: row['status_project_id'] as int,
              code: row['status_code'] as String,
              title: row['status_title'] as String,
              colour: row['status_color'] as int,
              ranking: row['status_ranking'] as int,
            ))
        .toList(growable: false);
  }

  Status? statusByCode(int projectId, String code) {
    final rows = db.select(
      'SELECT * FROM status WHERE status_project_id = ? AND status_code = ?',
      [projectId, code],
    );
    if (rows.isEmpty) return null;
    final row = rows.first;
    return Status(
      id: row['status_id'] as int,
      projectId: row['status_project_id'] as int,
      code: row['status_code'] as String,
      title: row['status_title'] as String,
      colour: row['status_color'] as int,
      ranking: row['status_ranking'] as int,
    );
  }

  Status addStatus({
    required int projectId,
    required String title,
    required int colour,
    String? code,
  }) {
    final ranking = db.count('status', 'status_project_id = ?', [projectId]) + 1;
    final id = db.insert('status', {
      'status_project_id': projectId,
      'status_code': code ?? CodeGen.next(),
      'status_title': title,
      'status_color': colour,
      'status_ranking': ranking,
    });
    return Status(
      id: id,
      projectId: projectId,
      code: code ?? '',
      title: title,
      colour: colour,
      ranking: ranking,
    );
  }

  void updateStatus(int id, {String? title, int? colour}) {
    final values = <String, Object?>{};
    if (title != null) values['status_title'] = title;
    if (colour != null) values['status_color'] = colour;
    if (values.isEmpty) return;
    db.update('status', values, 'status_id = ?', [id]);
  }

  /// Deletes a status and moves any item/scene that referenced it to [fallbackStatusId].
  void deleteStatus(int id, {required int fallbackStatusId}) {
    if (id == fallbackStatusId) return;
    db.transaction(() {
      db.update('item', {'item_status_id': fallbackStatusId}, 'item_status_id = ?', [id]);
      db.update('scene', {'scene_status_id': fallbackStatusId}, 'scene_status_id = ?', [id]);
      db.deleteWhere('status', 'status_id = ?', [id]);
    });
  }

  void reorderStatuses(List<int> orderedIds) {
    db.transaction(() {
      for (var i = 0; i < orderedIds.length; i++) {
        db.update('status', {'status_ranking': i + 1}, 'status_id = ?', [orderedIds[i]]);
      }
    });
  }

  List<Subplot> subplots(int projectId) {
    final rows = db.select(
      'SELECT * FROM subplot WHERE subplot_project_id = ? ORDER BY subplot_ranking ASC, subplot_id ASC',
      [projectId],
    );
    return rows
        .map((row) => Subplot(
              id: row['subplot_id'] as int,
              projectId: row['subplot_project_id'] as int,
              code: row['subplot_code'] as String,
              title: row['subplot_title'] as String,
              colour: row['subplot_color'] as int,
              ranking: row['subplot_ranking'] as int,
            ))
        .toList(growable: false);
  }

  Subplot addSubplot({
    required int projectId,
    required String title,
    required int colour,
    String? code,
  }) {
    final ranking = db.count('subplot', 'subplot_project_id = ?', [projectId]) + 1;
    final id = db.insert('subplot', {
      'subplot_project_id': projectId,
      'subplot_code': code ?? CodeGen.next(),
      'subplot_title': title,
      'subplot_color': colour,
      'subplot_ranking': ranking,
    });
    return Subplot(
      id: id,
      projectId: projectId,
      code: code ?? '',
      title: title,
      colour: colour,
      ranking: ranking,
    );
  }

  void updateSubplot(int id, {String? title, int? colour}) {
    final values = <String, Object?>{};
    if (title != null) values['subplot_title'] = title;
    if (colour != null) values['subplot_color'] = colour;
    if (values.isEmpty) return;
    db.update('subplot', values, 'subplot_id = ?', [id]);
  }

  void deleteSubplot(int id) => db.deleteWhere('subplot', 'subplot_id = ?', [id]);

  void reorderSubplots(List<int> orderedIds) {
    db.transaction(() {
      for (var i = 0; i < orderedIds.length; i++) {
        db.update('subplot', {'subplot_ranking': i + 1}, 'subplot_id = ?', [orderedIds[i]]);
      }
    });
  }
}
