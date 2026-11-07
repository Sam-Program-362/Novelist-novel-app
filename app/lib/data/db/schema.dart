/// SQLite DDL for schema version 1.
///
/// Column names, foreign keys and cascade behaviour are transcribed from the shipping
/// application's own statements (extracted from `libapp.so`, archived in
/// `docs/reference/original_sql_ddl.txt`). Keeping the names identical means a future
/// importer/exporter can share meaning with the original and the schema stays auditable against
/// the reference.
library;

const List<String> schemaV1 = [
  '''
  CREATE TABLE project(
    project_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
    project_code TEXT NOT NULL,
    project_title TEXT NOT NULL,
    project_description TEXT,
    project_is_archived INTEGER NOT NULL,
    project_cover TEXT,
    project_last_update_date INTEGER,
    project_last_cloud_sync_date INTEGER,
    project_last_cloud_sync_device_name TEXT,
    project_last_backup_date INTEGER
  )
  ''',
  '''
  CREATE TABLE book(
    book_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
    book_project_id INTEGER NOT NULL,
    book_code TEXT NOT NULL,
    book_title TEXT NOT NULL,
    book_description TEXT,
    book_cover TEXT,
    book_word_count INTEGER,
    book_due_date INTEGER,
    book_last_update_date INTEGER,
    book_ranking INTEGER,
    book_metadata TEXT,
    book_settings TEXT,
    FOREIGN KEY(book_project_id) REFERENCES project(project_id) ON DELETE CASCADE
  )
  ''',
  '''
  CREATE TABLE book_progress(
    book_progress_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
    book_progress_book_id INTEGER NOT NULL,
    book_progress_year INTEGER NOT NULL,
    book_progress_month INTEGER NOT NULL,
    book_progress_day INTEGER NOT NULL,
    book_progress_word_count INTEGER NOT NULL,
    FOREIGN KEY(book_progress_book_id) REFERENCES book(book_id) ON DELETE CASCADE
  )
  ''',
  '''
  CREATE TABLE project_template(
    project_template_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
    project_template_name TEXT NOT NULL,
    project_template_body TEXT,
    project_template_date INTEGER NOT NULL,
    project_template_is_system INTEGER NOT NULL,
    project_template_is_default INTEGER NOT NULL
  )
  ''',
  '''
  CREATE TABLE book_template(
    book_template_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
    book_template_name TEXT NOT NULL,
    book_template_body TEXT,
    book_template_date INTEGER NOT NULL,
    book_template_is_system INTEGER NOT NULL,
    book_template_is_default INTEGER NOT NULL
  )
  ''',
  '''
  CREATE TABLE category(
    category_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
    category_project_id INTEGER NOT NULL,
    category_code TEXT NOT NULL,
    category_title TEXT NOT NULL,
    category_color INTEGER NOT NULL,
    category_ranking INTEGER NOT NULL,
    FOREIGN KEY(category_project_id) REFERENCES project(project_id) ON DELETE CASCADE
  )
  ''',
  '''
  CREATE TABLE metadata_group(
    metadata_group_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
    metadata_group_category_id INTEGER NOT NULL,
    metadata_group_code TEXT NOT NULL,
    metadata_group_title TEXT NOT NULL,
    metadata_group_ranking INTEGER NOT NULL,
    FOREIGN KEY(metadata_group_category_id) REFERENCES category(category_id) ON DELETE CASCADE
  )
  ''',
  '''
  CREATE TABLE metadata_element(
    metadata_element_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
    metadata_element_metadata_group_id INTEGER NOT NULL,
    metadata_element_code TEXT NOT NULL,
    metadata_element_title TEXT NOT NULL,
    metadata_element_ranking INTEGER NOT NULL,
    metadata_element_is_relevant INTEGER NOT NULL,
    FOREIGN KEY(metadata_element_metadata_group_id) REFERENCES metadata_group(metadata_group_id) ON DELETE CASCADE
  )
  ''',
  '''
  CREATE TABLE item(
    item_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
    item_category_id INTEGER NOT NULL,
    item_code TEXT NOT NULL,
    item_title TEXT NOT NULL,
    item_synopsis TEXT,
    item_text TEXT,
    item_note TEXT,
    item_metadata TEXT,
    item_picture TEXT,
    item_ranking INTEGER NOT NULL,
    item_status_id INTEGER NOT NULL,
    FOREIGN KEY(item_category_id) REFERENCES category(category_id) ON DELETE CASCADE,
    FOREIGN KEY(item_status_id) REFERENCES status(status_id) ON DELETE CASCADE
  )
  ''',
  '''
  CREATE TABLE item_metadata(
    item_metadata_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
    item_metadata_item_id INTEGER NOT NULL,
    item_metadata_metadata_element_id INTEGER NOT NULL,
    item_metadata_value TEXT NOT NULL,
    FOREIGN KEY(item_metadata_item_id) REFERENCES item(item_id) ON DELETE CASCADE,
    FOREIGN KEY(item_metadata_metadata_element_id) REFERENCES metadata_element(metadata_element_id) ON DELETE CASCADE
  )
  ''',
  '''
  CREATE TABLE item_name(
    item_name_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
    item_name_item_id INTEGER NOT NULL,
    item_name_code TEXT NOT NULL,
    item_name_name TEXT NOT NULL,
    item_name_ranking INTEGER NOT NULL,
    FOREIGN KEY(item_name_item_id) REFERENCES item(item_id) ON DELETE CASCADE
  )
  ''',
  '''
  CREATE TABLE item_note(
    item_note_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
    item_note_item_id INTEGER NOT NULL,
    item_note_text TEXT NOT NULL,
    item_note_ranking INTEGER NOT NULL,
    FOREIGN KEY(item_note_item_id) REFERENCES item(item_id) ON DELETE CASCADE
  )
  ''',
  '''
  CREATE TABLE item_picture(
    item_picture_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
    item_picture_item_id INTEGER NOT NULL,
    item_picture_name TEXT NOT NULL,
    item_picture_ranking INTEGER NOT NULL,
    FOREIGN KEY(item_picture_item_id) REFERENCES item(item_id) ON DELETE CASCADE
  )
  ''',
  '''
  CREATE TABLE item_relationship(
    item_relationship_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
    item_relationship_item_id INTEGER NOT NULL,
    item_relationship_other_item_id INTEGER NOT NULL,
    item_relationship_description TEXT NOT NULL,
    item_relationship_ranking INTEGER NOT NULL,
    item_relationship_is_relevant INTEGER NOT NULL,
    FOREIGN KEY(item_relationship_item_id) REFERENCES item(item_id) ON DELETE CASCADE,
    FOREIGN KEY(item_relationship_other_item_id) REFERENCES item(item_id) ON DELETE CASCADE
  )
  ''',
  '''
  CREATE TABLE item_history(
    item_history_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
    item_history_item_id INTEGER NOT NULL,
    item_history_item_text TEXT,
    item_history_date INTEGER NOT NULL,
    FOREIGN KEY(item_history_item_id) REFERENCES item(item_id) ON DELETE CASCADE
  )
  ''',
  '''
  CREATE TABLE tag(
    tag_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
    tag_category_id INTEGER NOT NULL,
    tag_code TEXT NOT NULL,
    tag_title TEXT NOT NULL,
    tag_color INTEGER NOT NULL DEFAULT -12303292,
    FOREIGN KEY(tag_category_id) REFERENCES category(category_id) ON DELETE CASCADE
  )
  ''',
  '''
  CREATE TABLE item_tag(
    item_tag_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
    item_tag_item_id INTEGER NOT NULL,
    item_tag_tag_id INTEGER NOT NULL,
    FOREIGN KEY(item_tag_item_id) REFERENCES item(item_id) ON DELETE CASCADE,
    FOREIGN KEY(item_tag_tag_id) REFERENCES tag(tag_id) ON DELETE CASCADE
  )
  ''',
  '''
  CREATE TABLE status(
    status_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
    status_project_id INTEGER NOT NULL,
    status_code TEXT NOT NULL,
    status_title TEXT NOT NULL,
    status_color INTEGER NOT NULL,
    status_ranking INTEGER NOT NULL,
    FOREIGN KEY(status_project_id) REFERENCES project(project_id) ON DELETE CASCADE
  )
  ''',
  '''
  CREATE TABLE subplot(
    subplot_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
    subplot_project_id INTEGER NOT NULL,
    subplot_code TEXT NOT NULL,
    subplot_title TEXT NOT NULL,
    subplot_color INTEGER NOT NULL,
    subplot_ranking INTEGER NOT NULL,
    FOREIGN KEY(subplot_project_id) REFERENCES project(project_id) ON DELETE CASCADE
  )
  ''',
  '''
  CREATE TABLE scene(
    scene_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
    scene_project_id INTEGER NOT NULL,
    scene_code TEXT NOT NULL,
    scene_title TEXT NOT NULL,
    scene_synopsis TEXT,
    scene_text TEXT,
    scene_note TEXT,
    scene_ranking INTEGER NOT NULL,
    scene_status_id INTEGER NOT NULL,
    FOREIGN KEY(scene_project_id) REFERENCES project(project_id) ON DELETE CASCADE,
    FOREIGN KEY(scene_status_id) REFERENCES status(status_id) ON DELETE CASCADE
  )
  ''',
  '''
  CREATE TABLE scene_item(
    scene_item_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
    scene_item_scene_id INTEGER NOT NULL,
    scene_item_item_id INTEGER NOT NULL,
    FOREIGN KEY(scene_item_scene_id) REFERENCES scene(scene_id) ON DELETE CASCADE,
    FOREIGN KEY(scene_item_item_id) REFERENCES item(item_id) ON DELETE CASCADE
  )
  ''',
  '''
  CREATE TABLE scene_subplot(
    scene_subplot_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
    scene_subplot_scene_id INTEGER NOT NULL,
    scene_subplot_subplot_id INTEGER NOT NULL,
    scene_subplot_synopsis TEXT NOT NULL,
    FOREIGN KEY(scene_subplot_scene_id) REFERENCES scene(scene_id) ON DELETE CASCADE,
    FOREIGN KEY(scene_subplot_subplot_id) REFERENCES subplot(subplot_id) ON DELETE CASCADE
  )
  ''',
  '''
  CREATE TABLE scene_note(
    scene_note_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
    scene_note_scene_id INTEGER NOT NULL,
    scene_note_text TEXT NOT NULL,
    scene_note_ranking INTEGER NOT NULL,
    FOREIGN KEY(scene_note_scene_id) REFERENCES scene(scene_id) ON DELETE CASCADE
  )
  ''',
  '''
  CREATE TABLE scene_picture(
    scene_picture_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
    scene_picture_scene_id INTEGER NOT NULL,
    scene_picture_name TEXT NOT NULL,
    scene_picture_ranking INTEGER NOT NULL,
    FOREIGN KEY(scene_picture_scene_id) REFERENCES scene(scene_id) ON DELETE CASCADE
  )
  ''',
  '''
  CREATE TABLE scene_history(
    scene_history_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
    scene_history_scene_id INTEGER NOT NULL,
    scene_history_scene_text TEXT,
    scene_history_date INTEGER NOT NULL,
    FOREIGN KEY(scene_history_scene_id) REFERENCES scene(scene_id) ON DELETE CASCADE
  )
  ''',
  '''
  CREATE TABLE section(
    section_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
    section_book_id INTEGER NOT NULL,
    section_parent_id INTEGER,
    section_code TEXT NOT NULL,
    section_title TEXT NOT NULL,
    section_synopsis TEXT,
    section_ranking INTEGER NOT NULL,
    section_is_expanded INTEGER NOT NULL,
    section_is_compiled INTEGER NOT NULL,
    FOREIGN KEY(section_book_id) REFERENCES book(book_id) ON DELETE CASCADE,
    FOREIGN KEY(section_parent_id) REFERENCES section(section_id) ON DELETE CASCADE
  )
  ''',
  '''
  CREATE TABLE section_scene(
    section_scene_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
    section_scene_section_id INTEGER NOT NULL,
    section_scene_scene_id INTEGER NOT NULL,
    section_scene_ranking INTEGER NOT NULL,
    FOREIGN KEY(section_scene_section_id) REFERENCES section(section_id) ON DELETE CASCADE,
    FOREIGN KEY(section_scene_scene_id) REFERENCES scene(scene_id) ON DELETE CASCADE
  )
  ''',
  // Legacy revision table: only used when importing `.nov` version 4 documents.
  '''
  CREATE TABLE revision(
    revision_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
    revision_book_id INTEGER NOT NULL,
    revision_number INTEGER NOT NULL,
    revision_date INTEGER NOT NULL
  )
  ''',
  'CREATE INDEX idx_book_project_id ON book(book_project_id)',
  'CREATE INDEX idx_book_progress_book_id ON book_progress(book_progress_book_id)',
  'CREATE INDEX idx_category_project_id ON category(category_project_id)',
  'CREATE INDEX idx_metadata_group_category_id ON metadata_group(metadata_group_category_id)',
  'CREATE INDEX idx_metadata_element_metadata_group_id ON metadata_element(metadata_element_metadata_group_id)',
  'CREATE INDEX idx_item_category_id ON item(item_category_id)',
  'CREATE INDEX idx_item_status_id ON item(item_status_id)',
  'CREATE INDEX idx_item_metadata_item_id ON item_metadata(item_metadata_item_id)',
  'CREATE INDEX idx_item_metadata_metadata_element_id ON item_metadata(item_metadata_metadata_element_id)',
  'CREATE INDEX idx_item_name_item_id ON item_name(item_name_item_id)',
  'CREATE INDEX idx_item_note_item_id ON item_note(item_note_item_id)',
  'CREATE INDEX idx_item_picture_item_id ON item_picture(item_picture_item_id)',
  'CREATE INDEX idx_item_relationship_item_id ON item_relationship(item_relationship_item_id)',
  'CREATE INDEX idx_item_relationship_other_item_id ON item_relationship(item_relationship_other_item_id)',
  'CREATE INDEX idx_item_history_item_id ON item_history(item_history_item_id)',
  'CREATE INDEX idx_item_tag_item_id ON item_tag(item_tag_item_id)',
  'CREATE INDEX idx_item_tag_tag_id ON item_tag(item_tag_tag_id)',
  'CREATE INDEX idx_tag_category_id ON tag(tag_category_id)',
  'CREATE INDEX idx_status_project_id ON status(status_project_id)',
  'CREATE INDEX idx_subplot_project_id ON subplot(subplot_project_id)',
  'CREATE INDEX idx_scene_project_id ON scene(scene_project_id)',
  'CREATE INDEX idx_scene_status_id ON scene(scene_status_id)',
  'CREATE INDEX idx_scene_item_scene_id ON scene_item(scene_item_scene_id)',
  'CREATE INDEX idx_scene_item_item_id ON scene_item(scene_item_item_id)',
  'CREATE INDEX idx_scene_subplot_scene_id ON scene_subplot(scene_subplot_scene_id)',
  'CREATE INDEX idx_scene_subplot_subplot_id ON scene_subplot(scene_subplot_subplot_id)',
  'CREATE INDEX idx_scene_note_scene_id ON scene_note(scene_note_scene_id)',
  'CREATE INDEX idx_scene_picture_scene_id ON scene_picture(scene_picture_scene_id)',
  'CREATE INDEX idx_scene_history_scene_id ON scene_history(scene_history_scene_id)',
  'CREATE INDEX idx_section_book_id ON section(section_book_id)',
  'CREATE INDEX idx_section_parent_id ON section(section_parent_id)',
  'CREATE INDEX idx_section_scene_section_id ON section_scene(section_scene_section_id)',
  'CREATE INDEX idx_section_scene_scene_id ON section_scene(section_scene_scene_id)',
];
