import 'dart:convert';

import '../../core/utils/codes.dart';
import '../../models/entities.dart';
import '../db/database.dart';

class BooksDao {
  final AppDatabase db;
  BooksDao(this.db);

  Book _map(Map<String, Object?> row) {
    Map<String, dynamic>? decode(String? raw) {
      if (raw == null || raw.isEmpty) return null;
      try {
        final value = jsonDecode(raw);
        return value is Map ? Map<String, dynamic>.from(value) : null;
      } catch (_) {
        return null;
      }
    }

    return Book(
      id: row['book_id'] as int,
      projectId: row['book_project_id'] as int,
      code: row['book_code'] as String,
      title: row['book_title'] as String,
      description: row['book_description'] as String?,
      cover: row['book_cover'] as String?,
      wordCount: row['book_word_count'] as int?,
      dueDate: row['book_due_date'] as int?,
      lastUpdateDate: row['book_last_update_date'] as int?,
      ranking: row['book_ranking'] as int? ?? 1,
      metadata: BookMetadata.fromJson(decode(row['book_metadata'] as String?)),
      settings: BookSettings.fromJson(decode(row['book_settings'] as String?)),
    );
  }

  List<Book> listForProject(int projectId) {
    final rows = db.select(
      'SELECT * FROM book WHERE book_project_id = ? ORDER BY book_ranking ASC, book_id ASC',
      [projectId],
    );
    return rows.map(_map).toList(growable: false);
  }

  Book? byId(int id) {
    final rows = db.select('SELECT * FROM book WHERE book_id = ?', [id]);
    if (rows.isEmpty) return null;
    return _map(rows.first);
  }

  Book create({
    required int projectId,
    required String title,
    String? description,
    String? cover,
    BookMetadata metadata = const BookMetadata(),
    BookSettings settings = const BookSettings(),
  }) {
    final ranking = db.count('book', 'book_project_id = ?', [projectId]) + 1;
    final id = db.insert('book', {
      'book_project_id': projectId,
      'book_code': CodeGen.next(),
      'book_title': title,
      'book_description': description,
      'book_cover': cover,
      'book_word_count': 0,
      'book_due_date': null,
      'book_last_update_date': DateTime.now().millisecondsSinceEpoch,
      'book_ranking': ranking,
      'book_metadata': jsonEncode(metadata.toJson()),
      'book_settings': jsonEncode(settings.toJson()),
    });
    return byId(id)!;
  }

  void update(
    int id, {
    String? title,
    String? description,
    String? cover,
    bool clearCover = false,
    BookMetadata? metadata,
    BookSettings? settings,
    int? dueDate,
    bool clearDueDate = false,
  }) {
    final values = <String, Object?>{
      'book_last_update_date': DateTime.now().millisecondsSinceEpoch,
    };
    if (title != null) values['book_title'] = title;
    if (description != null) values['book_description'] = description;
    if (cover != null) values['book_cover'] = cover;
    if (clearCover) values['book_cover'] = null;
    if (metadata != null) values['book_metadata'] = jsonEncode(metadata.toJson());
    if (settings != null) values['book_settings'] = jsonEncode(settings.toJson());
    if (dueDate != null) values['book_due_date'] = dueDate;
    if (clearDueDate) values['book_due_date'] = null;
    db.update('book', values, 'book_id = ?', [id]);
  }

  void delete(int id) {
    db.transaction(() {
      db.deleteWhere('book', 'book_id = ?', [id]);
    });
  }

  void setWordCount(int id, int words) {
    db.update('book', {'book_word_count': words}, 'book_id = ?', [id]);
  }

  void reorder(List<int> orderedIds) {
    db.transaction(() {
      for (var i = 0; i < orderedIds.length; i++) {
        db.update('book', {'book_ranking': i + 1}, 'book_id = ?', [orderedIds[i]]);
      }
    });
  }

  // ---------------------------------------------------------------- progress

  List<BookProgress> progressFor(int bookId) {
    final rows = db.select(
      'SELECT * FROM book_progress WHERE book_progress_book_id = ? '
      'ORDER BY book_progress_year ASC, book_progress_month ASC, book_progress_day ASC',
      [bookId],
    );
    return rows
        .map((row) => BookProgress(
              id: row['book_progress_id'] as int,
              bookId: row['book_progress_book_id'] as int,
              year: row['book_progress_year'] as int,
              month: row['book_progress_month'] as int,
              day: row['book_progress_day'] as int,
              wordCount: row['book_progress_word_count'] as int,
            ))
        .toList(growable: false);
  }

  /// Upserts the word count for one calendar day (the reference stores one row per day per book).
  void setProgress(int bookId, DateTime date, int wordCount) {
    final existing = db.select(
      'SELECT book_progress_id FROM book_progress WHERE book_progress_book_id = ? '
      'AND book_progress_year = ? AND book_progress_month = ? AND book_progress_day = ?',
      [bookId, date.year, date.month, date.day],
    );
    if (existing.isEmpty) {
      db.insert('book_progress', {
        'book_progress_book_id': bookId,
        'book_progress_year': date.year,
        'book_progress_month': date.month,
        'book_progress_day': date.day,
        'book_progress_word_count': wordCount,
      });
    } else {
      db.update(
        'book_progress',
        {'book_progress_word_count': wordCount},
        'book_progress_id = ?',
        [existing.first['book_progress_id']],
      );
    }
  }

  int? progressForDate(int bookId, DateTime date) {
    final rows = db.select(
      'SELECT book_progress_word_count FROM book_progress WHERE book_progress_book_id = ? '
      'AND book_progress_year = ? AND book_progress_month = ? AND book_progress_day = ?',
      [bookId, date.year, date.month, date.day],
    );
    if (rows.isEmpty) return null;
    return rows.first['book_progress_word_count'] as int?;
  }
}
