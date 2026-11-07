/// Plain immutable entities mirroring the reconstructed schema (`docs/DATA_MODEL.md`).
/// Column names are kept in the field docs so DAO SQL stays auditable.
library;

class Project {
  final int id;
  final String code; // project_code
  final String title; // project_title
  final String? description; // project_description
  final bool isArchived; // project_is_archived
  final String? cover; // project_cover (data URI or file path)
  final int? lastUpdateDate; // project_last_update_date
  final int? lastCloudSyncDate;
  final String? lastCloudSyncDeviceName;
  final int? lastBackupDate;

  const Project({
    required this.id,
    required this.code,
    required this.title,
    this.description,
    this.isArchived = false,
    this.cover,
    this.lastUpdateDate,
    this.lastCloudSyncDate,
    this.lastCloudSyncDeviceName,
    this.lastBackupDate,
  });

  bool get hasBackup => lastBackupDate != null && lastBackupDate! > 0;

  Project copyWith({
    String? title,
    String? description,
    bool? isArchived,
    String? cover,
    bool clearCover = false,
    int? lastUpdateDate,
    int? lastBackupDate,
  }) =>
      Project(
        id: id,
        code: code,
        title: title ?? this.title,
        description: description ?? this.description,
        isArchived: isArchived ?? this.isArchived,
        cover: clearCover ? null : (cover ?? this.cover),
        lastUpdateDate: lastUpdateDate ?? this.lastUpdateDate,
        lastCloudSyncDate: lastCloudSyncDate,
        lastCloudSyncDeviceName: lastCloudSyncDeviceName,
        lastBackupDate: lastBackupDate ?? this.lastBackupDate,
      );
}

class Book {
  final int id;
  final int projectId; // book_project_id
  final String code; // book_code
  final String title; // book_title
  final String? description; // book_description
  final String? cover; // book_cover
  final int? wordCount; // book_word_count
  final int? dueDate; // book_due_date (ms epoch)
  final int? lastUpdateDate;
  final int ranking;
  final BookMetadata metadata; // book_metadata (JSON)
  final BookSettings settings; // book_settings (JSON)

  const Book({
    required this.id,
    required this.projectId,
    required this.code,
    required this.title,
    this.description,
    this.cover,
    this.wordCount,
    this.dueDate,
    this.lastUpdateDate,
    this.ranking = 1,
    this.metadata = const BookMetadata(),
    this.settings = const BookSettings(),
  });
}

/// `book_metadata` JSON payload.
class BookMetadata {
  final String? author;
  final String? genre;
  final String? language;
  final String? publisher;
  final String? isbn;
  final String? copyright;

  const BookMetadata({
    this.author,
    this.genre,
    this.language,
    this.publisher,
    this.isbn,
    this.copyright,
  });

  Map<String, dynamic> toJson() => {
        if (author != null) 'author': author,
        if (genre != null) 'genre': genre,
        if (language != null) 'language': language,
        if (publisher != null) 'publisher': publisher,
        if (isbn != null) 'isbn': isbn,
        if (copyright != null) 'copyright': copyright,
      };

  factory BookMetadata.fromJson(Map<String, dynamic>? json) {
    if (json == null) return const BookMetadata();
    String? str(String key) {
      final v = json[key];
      return v is String && v.isNotEmpty ? v : null;
    }

    return BookMetadata(
      author: str('author'),
      genre: str('genre'),
      language: str('language'),
      publisher: str('publisher'),
      isbn: str('isbn'),
      copyright: str('copyright'),
    );
  }

  BookMetadata copyWith({
    String? author,
    String? genre,
    String? language,
    String? publisher,
    String? isbn,
    String? copyright,
  }) =>
      BookMetadata(
        author: author ?? this.author,
        genre: genre ?? this.genre,
        language: language ?? this.language,
        publisher: publisher ?? this.publisher,
        isbn: isbn ?? this.isbn,
        copyright: copyright ?? this.copyright,
      );
}

/// `book_settings` JSON payload (compile/preview presentation flags).
class BookSettings {
  final bool showTableOfContents;
  final String? tableOfContentsTitle;
  final bool applyAutomaticIndentation;
  final int? wordGoal;
  final int? automaticBackupHours;

  const BookSettings({
    this.showTableOfContents = true,
    this.tableOfContentsTitle,
    this.applyAutomaticIndentation = true,
    this.wordGoal,
    this.automaticBackupHours,
  });

  Map<String, dynamic> toJson() => {
        'show_table_of_contents': showTableOfContents,
        if (tableOfContentsTitle != null) 'table_of_contents_title': tableOfContentsTitle,
        'apply_automatic_indentation': applyAutomaticIndentation,
        if (wordGoal != null) 'word_goal': wordGoal,
        if (automaticBackupHours != null) 'automatic_backup_hours': automaticBackupHours,
      };

  factory BookSettings.fromJson(Map<String, dynamic>? json) {
    if (json == null) return const BookSettings();
    return BookSettings(
      showTableOfContents: json['show_table_of_contents'] != false,
      tableOfContentsTitle: json['table_of_contents_title'] as String?,
      applyAutomaticIndentation: json['apply_automatic_indentation'] != false,
      wordGoal: (json['word_goal'] as num?)?.toInt(),
      automaticBackupHours: (json['automatic_backup_hours'] as num?)?.toInt(),
    );
  }

  BookSettings copyWith({
    bool? showTableOfContents,
    String? tableOfContentsTitle,
    bool? applyAutomaticIndentation,
    int? wordGoal,
    bool clearWordGoal = false,
  }) =>
      BookSettings(
        showTableOfContents: showTableOfContents ?? this.showTableOfContents,
        tableOfContentsTitle: tableOfContentsTitle ?? this.tableOfContentsTitle,
        applyAutomaticIndentation: applyAutomaticIndentation ?? this.applyAutomaticIndentation,
        wordGoal: clearWordGoal ? null : (wordGoal ?? this.wordGoal),
        automaticBackupHours: automaticBackupHours,
      );
}

class Category {
  final int id;
  final int projectId; // category_project_id
  final String code;
  final String title;
  final int colour; // ARGB integer
  final int ranking;

  const Category({
    required this.id,
    required this.projectId,
    required this.code,
    required this.title,
    required this.colour,
    required this.ranking,
  });

  Category copyWith({String? title, int? colour, int? ranking}) => Category(
        id: id,
        projectId: projectId,
        code: code,
        title: title ?? this.title,
        colour: colour ?? this.colour,
        ranking: ranking ?? this.ranking,
      );
}

class MetadataGroup {
  final int id;
  final int categoryId;
  final String code;
  final String title;
  final int ranking;

  const MetadataGroup({
    required this.id,
    required this.categoryId,
    required this.code,
    required this.title,
    required this.ranking,
  });
}

class MetadataElement {
  final int id;
  final int groupId;
  final String code;
  final String title;
  final int ranking;
  final bool isRelevant; // show_on_item_card

  const MetadataElement({
    required this.id,
    required this.groupId,
    required this.code,
    required this.title,
    required this.ranking,
    this.isRelevant = false,
  });

  MetadataElement copyWith({String? title, bool? isRelevant, int? ranking}) => MetadataElement(
        id: id,
        groupId: groupId,
        code: code,
        title: title ?? this.title,
        ranking: ranking ?? this.ranking,
        isRelevant: isRelevant ?? this.isRelevant,
      );
}

class PlotItem {
  final int id;
  final int categoryId;
  final String code;
  final String title;
  final String? synopsis;
  final String? text; // rich text document (JSON string)
  final int ranking;
  final int statusId;

  const PlotItem({
    required this.id,
    required this.categoryId,
    required this.code,
    required this.title,
    this.synopsis,
    this.text,
    required this.ranking,
    required this.statusId,
  });

  PlotItem copyWith({String? title, String? synopsis, String? text, int? statusId, int? ranking}) =>
      PlotItem(
        id: id,
        categoryId: categoryId,
        code: code,
        title: title ?? this.title,
        synopsis: synopsis ?? this.synopsis,
        text: text ?? this.text,
        ranking: ranking ?? this.ranking,
        statusId: statusId ?? this.statusId,
      );
}

class ItemName {
  final int id;
  final int itemId;
  final String code;
  final String name;
  final int ranking;

  const ItemName({
    required this.id,
    required this.itemId,
    required this.code,
    required this.name,
    required this.ranking,
  });
}

class ItemNote {
  final int id;
  final int itemId;
  final String text;
  final int ranking;

  const ItemNote({
    required this.id,
    required this.itemId,
    required this.text,
    required this.ranking,
  });
}

class ItemPicture {
  final int id;
  final int itemId;
  final String name;
  final int ranking;

  const ItemPicture({
    required this.id,
    required this.itemId,
    required this.name,
    required this.ranking,
  });
}

class ItemRelationship {
  final int id;
  final int itemId;
  final int otherItemId;
  final String description;
  final int ranking;
  final bool isRelevant;

  const ItemRelationship({
    required this.id,
    required this.itemId,
    required this.otherItemId,
    required this.description,
    required this.ranking,
    this.isRelevant = false,
  });
}

class Tag {
  final int id;
  final int categoryId;
  final String code;
  final String title;
  final int colour;

  const Tag({
    required this.id,
    required this.categoryId,
    required this.code,
    required this.title,
    required this.colour,
  });
}

class Status {
  final int id;
  final int projectId;
  final String code;
  final String title;
  final int colour;
  final int ranking;

  const Status({
    required this.id,
    required this.projectId,
    required this.code,
    required this.title,
    required this.colour,
    required this.ranking,
  });
}

class Subplot {
  final int id;
  final int projectId;
  final String code;
  final String title;
  final int colour;
  final int ranking;

  const Subplot({
    required this.id,
    required this.projectId,
    required this.code,
    required this.title,
    required this.colour,
    required this.ranking,
  });
}

class Scene {
  final int id;
  final int projectId; // scene_project_id
  final String code;
  final String title;
  final String? synopsis;
  final String? text;
  final String? note;
  final int ranking;
  final int statusId;

  const Scene({
    required this.id,
    required this.projectId,
    required this.code,
    required this.title,
    this.synopsis,
    this.text,
    this.note,
    required this.ranking,
    required this.statusId,
  });

  Scene copyWith({
    String? title,
    String? synopsis,
    String? text,
    String? note,
    int? statusId,
    int? ranking,
  }) =>
      Scene(
        id: id,
        projectId: projectId,
        code: code,
        title: title ?? this.title,
        synopsis: synopsis ?? this.synopsis,
        text: text ?? this.text,
        note: note ?? this.note,
        ranking: ranking ?? this.ranking,
        statusId: statusId ?? this.statusId,
      );
}

class Section {
  final int id;
  final int bookId; // section_book_id
  final int? parentId; // section_parent_id
  final String code;
  final String title;
  final String? synopsis;
  final int ranking;
  final bool isExpanded;
  final bool isCompiled;

  const Section({
    required this.id,
    required this.bookId,
    this.parentId,
    required this.code,
    required this.title,
    this.synopsis,
    required this.ranking,
    this.isExpanded = true,
    this.isCompiled = true,
  });

  Section copyWith({
    int? parentId,
    bool clearParent = false,
    String? title,
    String? synopsis,
    int? ranking,
    bool? isExpanded,
    bool? isCompiled,
  }) =>
      Section(
        id: id,
        bookId: bookId,
        parentId: clearParent ? null : (parentId ?? this.parentId),
        code: code,
        title: title ?? this.title,
        synopsis: synopsis ?? this.synopsis,
        ranking: ranking ?? this.ranking,
        isExpanded: isExpanded ?? this.isExpanded,
        isCompiled: isCompiled ?? this.isCompiled,
      );
}

/// A scene attached to a section (row of `section_scene`).
class SectionScene {
  final int sectionId;
  final int sceneId;
  final int ranking;

  const SectionScene({
    required this.sectionId,
    required this.sceneId,
    required this.ranking,
  });
}

class BookProgress {
  final int id;
  final int bookId;
  final int year;
  final int month;
  final int day;
  final int wordCount;

  const BookProgress({
    required this.id,
    required this.bookId,
    required this.year,
    required this.month,
    required this.day,
    required this.wordCount,
  });

  DateTime get date => DateTime(year, month, day);

  String get key =>
      '${year.toString().padLeft(4, '0')}-${month.toString().padLeft(2, '0')}-${day.toString().padLeft(2, '0')}';
}

class SceneSubplot {
  final int id;
  final int sceneId;
  final int subplotId;
  final String synopsis;

  const SceneSubplot({
    required this.id,
    required this.sceneId,
    required this.subplotId,
    required this.synopsis,
  });
}

class HistoryEntry {
  final int id;
  final String? text;
  final int date;

  const HistoryEntry({required this.id, this.text, required this.date});
}
