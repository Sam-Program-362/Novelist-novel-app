import 'dart:io';

import 'package:sqlite3/sqlite3.dart';

import 'schema.dart';

/// Thin, explicit wrapper over `package:sqlite3`.
///
/// Deliberate choices:
/// * `PRAGMA foreign_keys = ON` so the schema's `ON DELETE CASCADE` rules actually apply
///   (SQLite leaves them off by default, which would silently orphan rows).
/// * WAL journaling for crash safety while the editor writes.
/// * Append-only migrations guarded by `PRAGMA user_version`; a database from a *newer* schema is
///   refused rather than modified, so an older build can never destroy a newer project.
class AppDatabase {
  final Database raw;
  final String path;

  AppDatabase._(this.raw, this.path);

  static const int schemaVersion = 1;

  static AppDatabase open(String path) {
    final db = sqlite3.open(path);
    final instance = AppDatabase._(db, path);
    instance._configure();
    instance._migrate();
    return instance;
  }

  static AppDatabase inMemory() {
    final db = sqlite3.openInMemory();
    final instance = AppDatabase._(db, ':memory:');
    instance._configure();
    instance._migrate();
    return instance;
  }

  void _configure() {
    raw.execute('PRAGMA foreign_keys = ON');
    raw.execute('PRAGMA journal_mode = WAL');
    raw.execute('PRAGMA synchronous = NORMAL');
  }

  int get userVersion {
    final result = raw.select('PRAGMA user_version');
    if (result.isEmpty) return 0;
    return (result.first.values.first as num?)?.toInt() ?? 0;
  }

  void _migrate() {
    final current = userVersion;
    if (current > schemaVersion) {
      throw StateError(
        'Database schema v$current is newer than this build (v$schemaVersion). '
        'Refusing to modify project data.',
      );
    }
    if (current == schemaVersion) return;

    if (current == 0) {
      raw.execute('BEGIN');
      try {
        for (final statement in schemaV1) {
          raw.execute(statement);
        }
        raw.execute('PRAGMA user_version = $schemaVersion');
        raw.execute('COMMIT');
      } catch (_) {
        raw.execute('ROLLBACK');
        rethrow;
      }
      return;
    }

    // Future migrations: append `if (current < N) { ... }` blocks here, each inside its own
    // transaction, and bump `schemaVersion`. Never drop user data.
    raw.execute('PRAGMA user_version = $schemaVersion');
  }

  ResultSet select(String sql, [List<Object?> params = const []]) =>
      raw.select(sql, params);

  void execute(String sql, [List<Object?> params = const []]) =>
      raw.execute(sql, params);

  int insert(String table, Map<String, Object?> values) {
    final columns = values.keys.toList(growable: false);
    final placeholders = List.filled(columns.length, '?').join(', ');
    raw.execute(
      'INSERT INTO $table (${columns.join(', ')}) VALUES ($placeholders)',
      values.values.toList(growable: false),
    );
    return raw.lastInsertRowId;
  }

  void update(String table, Map<String, Object?> values, String where,
      [List<Object?> params = const []]) {
    final assignments = values.keys.map((k) => '$k = ?').join(', ');
    raw.execute(
      'UPDATE $table SET $assignments WHERE $where',
      [...values.values, ...params],
    );
  }

  void deleteWhere(String table, String where, [List<Object?> params = const []]) {
    raw.execute('DELETE FROM $table WHERE $where', params);
  }

  int count(String table, [String where = '1 = 1', List<Object?> params = const []]) {
    final result = raw.select('SELECT COUNT(*) AS c FROM $table WHERE $where', params);
    return (result.first['c'] as num).toInt();
  }

  int _transactionDepth = 0;

  /// Runs [action] inside a transaction, rolling back on any error.
  ///
  /// Nested calls are allowed: SQLite has no nested `BEGIN`, so an inner call simply joins the
  /// outer transaction while the outermost one is the only place that commits or rolls back.
  /// Repositories such as [ProjectRepository] depend on this, because they wrap several DAO calls
  /// that are themselves transactional.
  T transaction<T>(T Function() action) {
    if (_transactionDepth > 0) {
      _transactionDepth++;
      try {
        return action();
      } finally {
        _transactionDepth--;
      }
    }
    raw.execute('BEGIN');
    _transactionDepth = 1;
    try {
      final result = action();
      raw.execute('COMMIT');
      return result;
    } catch (_) {
      raw.execute('ROLLBACK');
      rethrow;
    } finally {
      _transactionDepth = 0;
    }
  }

  bool get isClosed => false;

  void close() {
    raw.dispose();
  }

  /// Convenience used by the integration tests to prove that data really reaches disk.
  static AppDatabase openFile(File file) => open(file.path);
}
