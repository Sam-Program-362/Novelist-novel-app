# Data Model

Status: **evidence-based reconstruction** from the shipped Android application.
Primary sources (see `docs/reference/`):

| Source | What it proves |
|---|---|
| `docs/reference/original_sql_ddl.txt` (extracted from `lib/arm64-v8a/libapp.so`) | The original SQLite schema **and its entire migration history** (160 statements) |
| `docs/reference/app_assets/sample.nov` | Serialized project file format (`version: 4`) |
| `docs/reference/app_assets/template_standard_novel.json`, `template_empty.json` | Template / starter-content format |
| `docs/reference/original_l10n_keys.txt` | Column & entity names actually shipped at runtime (598 keys) |
| `NativeAssetsManifest.json` | `package:sqlite3` + `sqlite3_connection_pool` → Drift over `sqlite3`, not `sqflite` |

The original stores *both*: a SQLite database (working state, per-device) **and** a `.nov` JSON document
(backup / cloud sync / share format). They are two serializations of the same conceptual model at
different points in time, and they are **not identical** (see §4).

---

## 1. Entity–relationship overview (current schema)

```
project  (1) ──< book (manuscript) ──< section (tree) ──< section_scene >── scene
   │                 └──< book_progress           (per-day word counts)
   ├──< category ──< metadata_group ──< metadata_element ──< item_metadata >── item
   │        └──< item ──< item_name / item_note / item_picture / item_history
   │              ├──< item_relationship (item ↔ item)
   │              └──< item_tag >── tag
   │        └──< tag
   ├──< status        (project-level, referenced by item + scene)
   ├──< subplot       (project-level, referenced by scene_subplot)
   └──< scene ──< scene_item / scene_subplot / scene_note / scene_picture / scene_history
          └──< section_scene  (a scene can appear in many books/sections)
```

Key structural facts (these drive the whole application):

1. **`project` is the top-level container** ("universe"), one row per Library entry.
2. **`book` belongs to a project** — a project can hold multiple books (series / sequels), all sharing the
   same Plot and the same scene pool. `book_project_id` FK.
3. **`category` / `status` / `subplot` / `scene` belong to the *project*, not to a book.**
   `scene_project_id` — scenes are drafted once in the shared Write pool.
4. **`section` belongs to a *book*** (`section_book_id`) and forms a tree via `section_parent_id`
   (Acts → Parts → Chapters). `section_is_expanded`, `section_is_compiled` are persisted UI/export state.
5. **`section_scene` is the only path from a scene into a manuscript.** A scene existing in the project
   does *not* put it in any book. This relationship is explicitly called out in the bundled
   `quickstart_en.html`: “Only scenes attached to a book's Organize section are included in its final manuscript.”
6. **Items belong to a category** (Characters, Locations, Events, Themes, …) and categories own
   metadata groups → elements (`is_relevant` = “show on item card”).
7. `revision` / `*_revision_id` are the **legacy** model (a project was a chain of immutable revisions).
   They still exist in the migration history and in `.nov` v4 files, but the live schema was renamed to
   `project`. Both naming families appear in the runtime string table; only `project`-rooted DDL is
   reachable from the newest migration step.

---

## 2. Authoritative DDL (newest reachable definition per table)

Reconstructed from the final `CREATE TABLE` / `ALTER TABLE` steps in `original_sql_ddl.txt`.
Column-for-column identical names are preserved because `.nov` import/export and any future
compatibility work depend on them.

```sql
CREATE TABLE project(
  project_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
  project_code TEXT NOT NULL,
  project_title TEXT NOT NULL,
  project_description TEXT,
  project_is_archived INTEGER NOT NULL,
  project_cover TEXT,                       -- base64 / data URI string, not BLOB
  project_last_update_date INTEGER,
  project_last_cloud_sync_date INTEGER,
  project_last_cloud_sync_device_name TEXT,
  project_last_backup_date INTEGER
);

CREATE TABLE book(
  book_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
  book_project_id INTEGER NOT NULL,
  book_code TEXT NOT NULL,
  book_title TEXT NOT NULL,
  book_description TEXT,
  book_cover TEXT,
  book_word_count INTEGER,
  book_due_date INTEGER,                    -- Schedule: deadline
  book_last_update_date INTEGER,
  book_ranking INTEGER,
  book_metadata TEXT,                       -- JSON: author, genre, language, isbn, publisher, copyright
  book_settings TEXT,                       -- JSON: show_table_of_contents, toc_title, auto indentation…
  FOREIGN KEY(book_project_id) REFERENCES project(project_id) ON DELETE CASCADE
);

CREATE TABLE book_progress(
  book_progress_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
  book_progress_book_id INTEGER NOT NULL,
  book_progress_year INTEGER NOT NULL,
  book_progress_month INTEGER NOT NULL,
  book_progress_day INTEGER NOT NULL,
  book_progress_word_count INTEGER NOT NULL,
  FOREIGN KEY(book_progress_book_id) REFERENCES book(book_id) ON DELETE CASCADE
);

CREATE TABLE project_template(
  project_template_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
  project_template_name TEXT NOT NULL,
  project_template_body TEXT,               -- JSON body, same shape as .nov content
  project_template_date INTEGER NOT NULL,
  project_template_is_system INTEGER NOT NULL,
  project_template_is_default INTEGER NOT NULL
);

CREATE TABLE book_template(                  -- "custom template based on an existing project"
  book_template_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
  book_template_name TEXT NOT NULL,
  book_template_body TEXT,
  book_template_date INTEGER NOT NULL,
  book_template_is_system INTEGER NOT NULL,
  book_template_is_default INTEGER NOT NULL
);

CREATE TABLE category(
  category_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
  category_project_id INTEGER NOT NULL,
  category_code TEXT NOT NULL,              -- 8-hex-char public code
  category_title TEXT NOT NULL,
  category_color INTEGER NOT NULL,
  category_ranking INTEGER NOT NULL,
  FOREIGN KEY(category_project_id) REFERENCES project(project_id) ON DELETE CASCADE
);

CREATE TABLE metadata_group(
  metadata_group_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
  metadata_group_category_id INTEGER NOT NULL,
  metadata_group_code TEXT NOT NULL,
  metadata_group_title TEXT NOT NULL,
  metadata_group_ranking INTEGER NOT NULL,
  FOREIGN KEY(metadata_group_category_id) REFERENCES category(category_id) ON DELETE CASCADE
);

CREATE TABLE metadata_element(
  metadata_element_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
  metadata_element_metadata_group_id INTEGER NOT NULL,
  metadata_element_code TEXT NOT NULL,
  metadata_element_title TEXT NOT NULL,
  metadata_element_ranking INTEGER NOT NULL,
  metadata_element_is_relevant INTEGER NOT NULL,   -- "show_on_item_card"
  FOREIGN KEY(metadata_element_metadata_group_id) REFERENCES metadata_group(metadata_group_id) ON DELETE CASCADE
);

CREATE TABLE item(
  item_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
  item_category_id INTEGER NOT NULL,
  item_code TEXT NOT NULL,
  item_title TEXT NOT NULL,
  item_synopsis TEXT,
  item_text TEXT,                           -- rich-text block document (same format as scene_text)
  item_note TEXT,                           -- added by ALTER TABLE (later release)
  item_metadata TEXT,                       -- added by ALTER TABLE
  item_picture TEXT,                        -- added by ALTER TABLE (TEXT, supersedes BLOB era)
  item_ranking INTEGER NOT NULL,
  item_status_id INTEGER NOT NULL,
  FOREIGN KEY(item_category_id) REFERENCES category(category_id) ON DELETE CASCADE,
  FOREIGN KEY(item_status_id) REFERENCES status(status_id) ON DELETE CASCADE
);

CREATE TABLE item_metadata(
  item_metadata_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
  item_metadata_item_id INTEGER NOT NULL,
  item_metadata_metadata_element_id INTEGER NOT NULL,
  item_metadata_value TEXT NOT NULL,
  FOREIGN KEY(item_metadata_item_id) REFERENCES item(item_id) ON DELETE CASCADE,
  FOREIGN KEY(item_metadata_metadata_element_id) REFERENCES metadata_element(metadata_element_id) ON DELETE CASCADE
);

CREATE TABLE item_name(                      -- aka aliases: first name / nickname / "also known as"
  item_name_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
  item_name_item_id INTEGER NOT NULL,
  item_name_code TEXT NOT NULL,
  item_name_name TEXT NOT NULL,
  item_name_ranking INTEGER NOT NULL,
  FOREIGN KEY(item_name_item_id) REFERENCES item(item_id) ON DELETE CASCADE
);

CREATE TABLE item_note(
  item_note_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
  item_note_item_id INTEGER NOT NULL,
  item_note_text TEXT NOT NULL,
  item_note_ranking INTEGER NOT NULL,
  FOREIGN KEY(item_note_item_id) REFERENCES item(item_id) ON DELETE CASCADE
);

CREATE TABLE item_picture(
  item_picture_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
  item_picture_item_id INTEGER NOT NULL,
  item_picture_name TEXT NOT NULL,
  item_picture_ranking INTEGER NOT NULL,
  FOREIGN KEY(item_picture_item_id) REFERENCES item(item_id) ON DELETE CASCADE
);

CREATE TABLE item_relationship(
  item_relationship_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
  item_relationship_item_id INTEGER NOT NULL,
  item_relationship_other_item_id INTEGER NOT NULL,
  item_relationship_description TEXT NOT NULL,
  item_relationship_ranking INTEGER NOT NULL,
  item_relationship_is_relevant INTEGER NOT NULL,
  FOREIGN KEY(item_relationship_item_id) REFERENCES item(item_id) ON DELETE CASCADE,
  FOREIGN KEY(item_relationship_other_item_id) REFERENCES item(item_id) ON DELETE CASCADE
);

CREATE TABLE item_history(                   -- "restore this version" for item rich text
  item_history_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
  item_history_item_id INTEGER NOT NULL,
  item_history_item_text TEXT,
  item_history_date INTEGER NOT NULL,
  FOREIGN KEY(item_history_item_id) REFERENCES item(item_id) ON DELETE CASCADE
);

CREATE TABLE tag(
  tag_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
  tag_category_id INTEGER NOT NULL,
  tag_code TEXT NOT NULL,
  tag_title TEXT NOT NULL,
  tag_color INTEGER NOT NULL DEFAULT -12303292,
  FOREIGN KEY(tag_category_id) REFERENCES category(category_id) ON DELETE CASCADE
);

CREATE TABLE item_tag(
  item_tag_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
  item_tag_item_id INTEGER NOT NULL,
  item_tag_tag_id INTEGER NOT NULL,
  FOREIGN KEY(item_tag_item_id) REFERENCES item(item_id) ON DELETE CASCADE,
  FOREIGN KEY(item_tag_tag_id) REFERENCES tag(tag_id) ON DELETE CASCADE
);

CREATE TABLE status(
  status_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
  status_project_id INTEGER NOT NULL,
  status_code TEXT NOT NULL,
  status_title TEXT NOT NULL,
  status_color INTEGER NOT NULL,
  status_ranking INTEGER NOT NULL,
  FOREIGN KEY(status_project_id) REFERENCES project(project_id) ON DELETE CASCADE
);

CREATE TABLE subplot(
  subplot_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
  subplot_project_id INTEGER NOT NULL,
  subplot_code TEXT NOT NULL,
  subplot_title TEXT NOT NULL,
  subplot_color INTEGER NOT NULL,
  subplot_ranking INTEGER NOT NULL,
  FOREIGN KEY(subplot_project_id) REFERENCES project(project_id) ON DELETE CASCADE
);

CREATE TABLE scene(
  scene_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
  scene_project_id INTEGER NOT NULL,
  scene_code TEXT NOT NULL,
  scene_title TEXT NOT NULL,
  scene_synopsis TEXT,
  scene_text TEXT,                          -- rich-text block document
  scene_note TEXT,
  scene_ranking INTEGER NOT NULL,
  scene_status_id INTEGER NOT NULL,
  FOREIGN KEY(scene_project_id) REFERENCES project(project_id) ON DELETE CASCADE,
  FOREIGN KEY(scene_status_id) REFERENCES status(status_id) ON DELETE CASCADE
);

CREATE TABLE scene_item(
  scene_item_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
  scene_item_scene_id INTEGER NOT NULL,
  scene_item_item_id INTEGER NOT NULL,
  FOREIGN KEY(scene_item_scene_id) REFERENCES scene(scene_id) ON DELETE CASCADE,
  FOREIGN KEY(scene_item_item_id) REFERENCES item(item_id) ON DELETE CASCADE
);

CREATE TABLE scene_subplot(
  scene_subplot_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
  scene_subplot_scene_id INTEGER NOT NULL,
  scene_subplot_subplot_id INTEGER NOT NULL,
  scene_subplot_synopsis TEXT NOT NULL,     -- per-scene synopsis for this subplot thread
  FOREIGN KEY(scene_subplot_scene_id) REFERENCES scene(scene_id) ON DELETE CASCADE,
  FOREIGN KEY(scene_subplot_subplot_id) REFERENCES subplot(subplot_id) ON DELETE CASCADE
);

CREATE TABLE scene_note(
  scene_note_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
  scene_note_scene_id INTEGER NOT NULL,
  scene_note_text TEXT NOT NULL,
  scene_note_ranking INTEGER NOT NULL,
  FOREIGN KEY(scene_note_scene_id) REFERENCES scene(scene_id) ON DELETE CASCADE
);

CREATE TABLE scene_picture(
  scene_picture_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
  scene_picture_scene_id INTEGER NOT NULL,
  scene_picture_name TEXT NOT NULL,
  scene_picture_ranking INTEGER NOT NULL,
  FOREIGN KEY(scene_picture_scene_id) REFERENCES scene(scene_id) ON DELETE CASCADE
);

CREATE TABLE scene_history(
  scene_history_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
  scene_history_scene_id INTEGER NOT NULL,
  scene_history_scene_text TEXT,
  scene_history_date INTEGER NOT NULL,
  FOREIGN KEY(scene_history_scene_id) REFERENCES scene(scene_id) ON DELETE CASCADE
);

CREATE TABLE section(
  section_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
  section_book_id INTEGER NOT NULL,
  section_parent_id INTEGER,                -- NULL = top level (act / part)
  section_code TEXT NOT NULL,
  section_title TEXT NOT NULL,
  section_synopsis TEXT,
  section_ranking INTEGER NOT NULL,
  section_is_expanded INTEGER NOT NULL,
  section_is_compiled INTEGER NOT NULL,     -- inclusion flag for compile/export
  FOREIGN KEY(section_book_id) REFERENCES book(book_id) ON DELETE CASCADE,
  FOREIGN KEY(section_parent_id) REFERENCES section(section_id) ON DELETE CASCADE
);

CREATE TABLE section_scene(
  section_scene_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
  section_scene_section_id INTEGER NOT NULL,
  section_scene_scene_id INTEGER NOT NULL,
  section_scene_ranking INTEGER NOT NULL,
  FOREIGN KEY(section_scene_section_id) REFERENCES section(section_id) ON DELETE CASCADE,
  FOREIGN KEY(section_scene_scene_id) REFERENCES scene(scene_id) ON DELETE CASCADE
);

-- Legacy (kept for .nov v4 import only)
CREATE TABLE revision(
  revision_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
  revision_book_id INTEGER NOT NULL,
  revision_number INTEGER NOT NULL,
  revision_date INTEGER NOT NULL
);
```

Indexes are reproduced verbatim (`idx_scene_project_id`, `idx_section_parent_id`, `idx_item_metadata_*`, …) — see
`docs/reference/original_sql_ddl.txt`.

### Codes, identifiers, colours

* Every user-visible entity carries a short **public `code`** (8 lowercase hex chars, e.g. `fbfae51b`).
  `sample.nov` shows these codes as the cross-reference mechanism *inside the file format*
  (`scene_items[].code`, `section_scenes[].code`, `item_metadatas[].metadata_element`), so codes must be
  stable and unique per project. Seed/sample data instead uses semantic codes (`GENERAL`, `EFFECTS`, status `1`).
* `status` seeds are `1`, `2`, … in templates but random-hex in user data ⇒ codes are opaque strings, never ints.
* **Colour encoding is inconsistent in original data**: `template_standard_novel.json` stores signed 32-bit
  ARGB (`-8305804`), `sample.nov` stores unsigned (`4288423856`). Any reader must accept both and normalise
  to `Color(0xFF……)`. We store `INTEGER` and normalise on read.

---

## 3. Rich-text document format (`scene_text`, `item_text`)

A JSON string, one object with a `blocks` array (`sample.nov`):

```json
{"blocks":[
  {"type":"text","align":"left",
   "text":"\uFFFC \uFFFC hated sand. ... into the tiny seaside station of \uFFFC, he let out ...",
   "embeds":[
      {"type":"mention","position":0,"code":"2950d705","value":"Tommaso"},
      {"type":"mention","position":2,"code":"e90908a3","value":"Rinaldi"},
      {"type":"mention","position":182,"code":"6730f0d1","value":"Santa Marea"}
   ]}
]}
```

Observed rules:

* One block = one paragraph. `type` is `text`; `align` ∈ `left|center|right|justify` (matches the
  `align_left/center/right/justify` l10n keys). Blocks without `embeds` omit the key entirely.
* A mention is embedded as a single U+FFFC OBJECT REPLACEMENT CHARACTER in `text`; `position` is the
  **index of that character within the block's `text`**, and `code` references `item.code` while `value`
  is the rendered display name (an `item_name` alias may be used instead of `item_title` — e.g.
  `Tommaso`/`Tom` both point at different codes).
* `item_history` / `scene_history` store previous serialized documents; UI exposes
  `restore_from_history` / `restore_this_version`.
* Only `type: "text"` blocks appear in the sample. `scene_picture` / `item_picture` tables indicate images
  are a separate concern (attachments), not inline blocks — images are *not* embedded in block JSON in any
  evidence available. **Uncertain**: whether inline image blocks exist in newer documents.

Formatting beyond alignment (bold/italic) has **no representation in the observed format**. The bundled
sample contains no inline styling and there is no `spans` key. Therefore: the original's rich text appears
to be *paragraph-level* (alignment + editor-level typography settings such as font, size, indentation,
line height, hyphenation), not character-level. We reproduce paragraph-level formatting and document
character-level styling as **not present in evidence** rather than inventing a schema.

---

## 4. `.nov` file format (v4, as shipped) and mapping to the live schema

```jsonc
{
  "version": 4,
  "code": "66261d80",
  "title": "…", "description": "…",
  "show_table_of_contents": true,
  "apply_automatic_indentation": true,
  "last_update_date": 1752421695400,          // ms epoch
  "last_cloud_sync_date": 1752304204740,
  "last_backup_date": 1752421713303,
  "cover": "data:image/…;base64,…",           // TEXT, not BLOB
  "revisions": [{
     "number": 1, "date": 1752240196259,
     "book_progresses": [{"year":2025,"month":7,"day":11,"word_count":2946}],
     "categories": [{"code","title","color","ranking",
                     "metadata_groups":[{"code","title","ranking",
                        "metadata_elements":[{"code","title","is_relevant","ranking"}]}],
                     "items":[…] }],
     "statuses":  [{"code","title","color","ranking"}],
     "subplots":  [{"code","title","color","ranking"}],
     "scenes":    [{"code","title","synopsis","text":"<json string>","ranking",
                    "status":"<status code>","scene_items":[{"code"}]}],
     "sections":  [{"code","title","synopsis","ranking",
                    "section_scenes":[{"code","ranking"}]}]
  }]
}
```

Observations / mapping decisions:

* v4 is the **snapshot** era: one `revisions[]` entry = one full copy of the story. The live schema dropped
  revisions in favour of a project-rooted model. Import takes the **highest `number`** revision and maps it
  onto `project` + one default `book` + `category`/`item`/`scene`/`section` rows. Everything else in the file
  maps 1:1 to a column of the same concept minus the `*_revision_id` prefix.
* Cross-references in v4 are by **code**, not by numeric id (`status`, `scene_items[].code`,
  `section_scenes[].code`, `item_metadatas[].metadata_element`), which is why codes exist.
* `book_metadata` / `book_settings` in the live schema are `TEXT` JSON blobs that absorb the flat v4 keys
  (`show_table_of_contents`, `apply_automatic_indentation`, `author`, `genre`, …).
* Mention positions are stored inside `text`; on import we keep the string verbatim.

**Export**: we re-emit a v4-compatible document (single revision) so files remain openable by the original app.
Flagged as **unverified**: whether the shipping 2026 build still writes `version: 4` or a newer project-shaped
version. Our exporter is version-tagged and the reader accepts 4, 5, or project-shaped bodies.

---

## 5. Persistence strategy

* SQLite via `package:sqlite3` (`sqlite3_flutter_libs`) — same engine/API family as the original
  (`libsqlite3.so` is bundled in the reference APK). Hand-written DAO layer, **no code generation**, so the
  build has no `build_runner` step.
* `PRAGMA foreign_keys = ON`, WAL journal, and explicit transactions for every multi-table mutation
  (create project, delete category cascade, attach scene, reorder, import, restore).
* Schema versioning mirrors the original's numbered migrations; `MIGRATIONS` is append-only, and the app
  refuses to open a database from a newer version rather than destroying it.
* Editing writes are debounced but *journaled*: scene text is committed on editor debounce (≈1 s) and on
  lifecycle pause, and prior text is appended to `scene_history` (bounded, as original does).
* Project cover / item pictures are stored as TEXT data URIs and also copied into app storage so exports and
  backups are self-contained.

## 6. Backup / restore structures

* **Local backup** = `.nov` document written through the Android file picker / share sheet, plus an internal
  rolling copy in app documents (`backups/`). `project_last_backup_date` underpins the Library safety
  indicator (green = backed up, red = needs backup, from the bundled quickstart guide).
* **Revision history** for scene/item text lives in `scene_history` / `item_history`.
* **Cloud**: the original supports Google Drive + Apple iCloud and an `icloud_storage_plus` subscription.
  We implement the *data path* (upload/download of the same `.nov` payload through a pluggable
  `CloudProvider`) and ship **local + manual file backup only**; no cloud provider is claimed as working
  until credentials/consent exist. Documented as a deliberate, explicit gap — not a fake feature.
