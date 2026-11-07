import '../../core/utils/codes.dart';
import '../../models/entities.dart';
import '../db/database.dart';

enum ProjectSortField { title, lastUpdate, lastBackup }

class ProjectsDao {
  final AppDatabase db;
  ProjectsDao(this.db);

  Project _map(Map<String, Object?> row) => Project(
        id: row['project_id'] as int,
        code: row['project_code'] as String,
        title: row['project_title'] as String,
        description: row['project_description'] as String?,
        isArchived: (row['project_is_archived'] as int? ?? 0) == 1,
        cover: row['project_cover'] as String?,
        lastUpdateDate: row['project_last_update_date'] as int?,
        lastCloudSyncDate: row['project_last_cloud_sync_date'] as int?,
        lastCloudSyncDeviceName: row['project_last_cloud_sync_device_name'] as String?,
        lastBackupDate: row['project_last_backup_date'] as int?,
      );

  List<Project> list({
    ProjectSortField field = ProjectSortField.lastUpdate,
    bool ascending = false,
    bool includeArchived = false,
  }) {
    final column = switch (field) {
      ProjectSortField.title => 'project_title',
      ProjectSortField.lastUpdate => 'project_last_update_date',
      ProjectSortField.lastBackup => 'project_last_backup_date',
    };
    final direction = ascending ? 'ASC' : 'DESC';
    final where = includeArchived ? '1 = 1' : 'project_is_archived = 0';
    final rows = db.select(
      'SELECT * FROM project WHERE $where ORDER BY $column $direction, project_title ASC',
    );
    return rows.map(_map).toList(growable: false);
  }

  Project? byId(int id) {
    final rows = db.select('SELECT * FROM project WHERE project_id = ?', [id]);
    if (rows.isEmpty) return null;
    return _map(rows.first);
  }

  Project create({
    required String title,
    String? description,
    String? cover,
  }) {
    final now = DateTime.now().millisecondsSinceEpoch;
    final id = db.insert('project', {
      'project_code': CodeGen.next(),
      'project_title': title,
      'project_description': description,
      'project_is_archived': 0,
      'project_cover': cover,
      'project_last_update_date': now,
      'project_last_cloud_sync_date': null,
      'project_last_cloud_sync_device_name': null,
      'project_last_backup_date': 0,
    });
    return byId(id)!;
  }

  void update(int id, {String? title, String? description}) {
    final values = <String, Object?>{'project_last_update_date': DateTime.now().millisecondsSinceEpoch};
    if (title != null) values['project_title'] = title;
    if (description != null) values['project_description'] = description;
    db.update('project', values, 'project_id = ?', [id]);
  }

  void setCover(int id, String? cover) {
    db.update(
      'project',
      {'project_cover': cover, 'project_last_update_date': DateTime.now().millisecondsSinceEpoch},
      'project_id = ?',
      [id],
    );
  }

  void setArchived(int id, bool archived) {
    db.update('project', {'project_is_archived': archived ? 1 : 0}, 'project_id = ?', [id]);
  }

  void touch(int id) {
    db.update(
      'project',
      {'project_last_update_date': DateTime.now().millisecondsSinceEpoch},
      'project_id = ?',
      [id],
    );
  }

  void markBackedUp(int id, [int? timestamp]) {
    db.update(
      'project',
      {'project_last_backup_date': timestamp ?? DateTime.now().millisecondsSinceEpoch},
      'project_id = ?',
      [id],
    );
  }

  void markCloudSynced(int id, {String? deviceName, int? timestamp}) {
    db.update(
      'project',
      {
        'project_last_cloud_sync_date': timestamp ?? DateTime.now().millisecondsSinceEpoch,
        if (deviceName != null) 'project_last_cloud_sync_device_name': deviceName,
      },
      'project_id = ?',
      [id],
    );
  }

  /// Deletes the project and, by cascade, its books, categories, items, scenes, sections and
  /// every dependent row. Runs in a transaction so a failure cannot leave a half-deleted universe.
  void delete(int id) {
    db.transaction(() {
      db.deleteWhere('project', 'project_id = ?', [id]);
    });
  }
}
