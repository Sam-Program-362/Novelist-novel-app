# Feature Parity Checklist

Statuses: `NOT_INSPECTED` · `INSPECTED` · `PLANNED` · `IN_PROGRESS` · `IMPLEMENTED` · `TESTED` · `VERIFIED` · `BLOCKED`

Status vocabulary discipline:

* `IMPLEMENTED` — code exists and the flow is reachable in the app.
* `TESTED` — covered by an automated or performed manual test in this repository.
* `VERIFIED` — behaviour has been compared against the reference (original Android app / web app).
  Because the reference cannot be *run* in this environment, nothing may be marked `VERIFIED` without
  owner-supplied screenshots/recordings or an interactive session. Where the *data* behaviour was verified
  against real reference artefacts (`.nov`, templates, schema), the row says “verified vs artefacts”.

Evidence column: `QS` = bundled quickstart guide, `L10N` = runtime l10n key table, `DDL` = extracted SQL
schema, `NOV` = sample.nov, `TPL` = template JSON, `FAQ` = in-app FAQ, `MAN` = AndroidManifest, `STR` = strings.

---

## A. Library / project management

| # | Feature | Status | Evidence |
|---|---|---|---|
| A1 | Bookshelf listing of projects, grid/list toggle | IN_PROGRESS | QS, L10N (`bookshelf_is_grid`) |
| A2 | Sorting (field + direction) | PLANNED | L10N (`bookshelf_sort_field`, `bookshelf_sort_is_ascending`) |
| A3 | Create project (+) with template chooser | IN_PROGRESS | QS, L10N (`add_project`, `select_project`) |
| A4 | Standard novel template (6 categories, statuses, metadata) | IN_PROGRESS | TPL, L10N (`template_standard_novel_*`) |
| A5 | Empty template | IN_PROGRESS | TPL (`template_empty.json`) |
| A6 | Custom template from existing project | PLANNED | QS, DDL (`project_template`) |
| A7 | Edit project (title/description) | IN_PROGRESS | QS, L10N (`edit_project`) |
| A8 | Set / clear project cover (gallery, camera, Pexels) | IN_PROGRESS (gallery) / PLANNED (camera, Pexels) | QS, L10N (`set_cover`, `clear_cover`, `from_camera`, `from_gallery`, `from_online_library`) |
| A9 | Delete project (+ confirmation “cannot be undone”) | IN_PROGRESS | L10N (`are_you_sure_you_want_to_delete_the_entire_project`, `i_accept_the_operation_cant_be_undone`) |
| A10 | Backup safety indicator (green safe / red needs backup) | IN_PROGRESS | QS |
| A11 | Archive project | PLANNED | DDL (`project_is_archived`) |
| A12 | Duplicate project | NOT_INSPECTED | — |
| A13 | Reorder projects | PLANNED | L10N (`reorder_books`) |
| A14 | Empty state (“no books to display”) | IN_PROGRESS | L10N (`no_books_to_display`) |
| A15 | Restore previous position / last opened project | PLANNED | L10N (`restore_previous_position`) |

## B. Project workspace shell

| # | Feature | Status | Evidence |
|---|---|---|---|
| B1 | Drawer navigation between workspace modules | IN_PROGRESS | L10N (`drawer_open`, `end_drawer_open`) |
| B2 | Easy mode vs Normal mode | PLANNED | L10N (`mode_easy`, `set_mode`, `easy_mode_incompatibility`) |
| B3 | Project switcher from workspace | PLANNED | L10N (`select_project`) |
| B4 | Adaptive two-pane layout on wide screens | PLANNED | inference from web vs mobile |

## C. Plot

| # | Feature | Status | Evidence |
|---|---|---|---|
| C1 | Category list with colours + reorder | IN_PROGRESS | QS, DDL, L10N (`reorder_categories`) |
| C2 | Add/edit/delete category | IN_PROGRESS | QS (`edit_category`, `add_category`) |
| C3 | Metadata groups per category (add/edit/reorder/delete) | IN_PROGRESS | DDL, L10N (`add_metadata_group`, `reorder_metadata_groups`) |
| C4 | Metadata elements per group (+ `is_relevant` = show on item card) | IN_PROGRESS | DDL, L10N (`show_on_item_card`) |
| C5 | Item list per category, status dot, reorder by long-press | IN_PROGRESS | QS, L10N (`reorder_items`) |
| C6 | Add/edit/delete item (title required, synopsis) | IN_PROGRESS | QS, L10N |
| C7 | Long-press status circle → delete / merge items | PLANNED | QS |
| C8 | Item detail: rich text description | IN_PROGRESS | QS, DDL (`item_text`), NOV |
| C9 | Item names/aliases (add/edit/reorder/delete) | IN_PROGRESS | DDL (`item_name`), NOV (`Tommaso`/`Tom`) |
| C10 | Item metadata values (per element) | IN_PROGRESS | DDL (`item_metadata`), NOV |
| C11 | Item notes | IN_PROGRESS | DDL (`item_note`) |
| C12 | Item pictures (add/edit/reorder/delete) | IN_PROGRESS | DDL (`item_picture`) |
| C13 | Item relationships (other item + description + relevance) | IN_PROGRESS | DDL (`item_relationship`) |
| C14 | Item tags with colour | IN_PROGRESS | DDL (`tag`, `item_tag`, `tag_color`) |
| C15 | Item history + restore version | PLANNED | DDL (`item_history`), L10N (`restore_this_version`) |
| C16 | Statuses CRUD (title, colour, order) | IN_PROGRESS | DDL, L10N (`add_status`, `edit_status`, `reorder_statuses`) |
| C17 | Subplots CRUD (title, colour, order) | IN_PROGRESS | DDL, L10N (`add_subplot`, `reorder_subplots`) |
| C18 | Empty states per list | IN_PROGRESS | L10N (`no_categories_to_display`, `no_items_to_display`, …) |
| C19 | Copy/paste item | PLANNED | L10N (`paste_item`, `copy_into_clipboard`) |
| C20 | Search/filter items | NOT_INSPECTED | — |

## D. Write (scenes)

| # | Feature | Status | Evidence |
|---|---|---|---|
| D1 | Scene pool list with status + reorder | IN_PROGRESS | QS, DDL, L10N (`reorder_scenes`) |
| D2 | Add/edit/delete scene (title required) | IN_PROGRESS | QS, L10N |
| D3 | Rich text editor (paragraph blocks) | IN_PROGRESS | NOV, DDL |
| D4 | Text alignment per paragraph (left/center/right/justify) | IN_PROGRESS | NOV (`align`), L10N (`align_*`) |
| D5 | @-mention of Plot items (U+FFFC embeds) | IN_PROGRESS | NOV, QS |
| D6 | Attach Plot items to a scene | IN_PROGRESS | DDL (`scene_item`), QS |
| D7 | Scene synopsis | IN_PROGRESS | DDL, QS |
| D8 | Scene status | IN_PROGRESS | DDL |
| D9 | Split scene into two | IN_PROGRESS | QS |
| D10 | Scene notes | IN_PROGRESS | DDL (`scene_note`) |
| D11 | Scene pictures | IN_PROGRESS | DDL (`scene_picture`) |
| D12 | Scene subplot links with per-scene synopsis | IN_PROGRESS | DDL (`scene_subplot`) |
| D13 | Scene history + restore | PLANNED | DDL (`scene_history`) |
| D14 | Reference panel (plot info while writing) | PLANNED | L10N (`reference_panel`) |
| D15 | Smart typography (quotes/guillemets/hyphens/ellipsis) | IN_PROGRESS | L10N (`smart_*`, `replace_*`) |
| D16 | Automatic indentation / hyphenation | IN_PROGRESS (indentation) / PLANNED (hyphenation) | L10N, NOV (`apply_automatic_indentation`) |
| D17 | Editor font + size + zoom | IN_PROGRESS | STR (Google Fonts), L10N (`zoom_level`) |
| D18 | Word count per scene/book | IN_PROGRESS | DDL (`book_word_count`), L10N (`word_count`) |
| D19 | Bottom-aligned save state / auto-save | IN_PROGRESS | L10N (`save_scene`), architecture |
| D20 | Insert comment / link | NOT_INSPECTED | L10N (`insert_a_comment`, `insert_a_link`) |

## E. Books / Organize / manuscript

| # | Feature | Status | Evidence |
|---|---|---|---|
| E1 | Multiple books per project, list + create/rename/delete | IN_PROGRESS | QS, FAQ, DDL (`book_project_id`) |
| E2 | Book metadata (title, author, genre, language, publisher, ISBN, copyright, description) | IN_PROGRESS | DDL (`book_metadata`), L10N |
| E3 | Hierarchical sections (acts/parts/chapters) via parent | IN_PROGRESS | DDL (`section_parent_id`) |
| E4 | Add/edit/delete/rename section, add subsection | IN_PROGRESS | QS, L10N (`add_section`, `add_subsection`, `organize_add_section`) |
| E5 | Expand/collapse persisted per section | IN_PROGRESS | DDL (`section_is_expanded`) |
| E6 | Attach **existing** scenes to a section | IN_PROGRESS | QS, DDL (`section_scene`), L10N (`section_set_existing_scenes`) |
| E7 | Reorder scenes inside a section; reorder sections | IN_PROGRESS | QS, L10N (`reorder_sections`) |
| E8 | Remove scene from section (without deleting the scene) | IN_PROGRESS | DDL |
| E9 | Manuscript contains only attached scenes | IN_PROGRESS | QS, FAQ — **core invariant** |
| E10 | Per-section compile flag | IN_PROGRESS | DDL (`section_is_compiled`), L10N (`compile_select_section`) |
| E11 | Book table of contents toggle + custom title | IN_PROGRESS | NOV, L10N (`show_table_of_contents`, `table_of_contents_title`) |
| E12 | Duplicate detection on book import | PLANNED | L10N (`duplicated_books_have_been_found`) |
| E13 | Book archive | PLANNED | DDL (`book_is_archived`) |

## F. Schedule

| # | Feature | Status | Evidence |
|---|---|---|---|
| F1 | Word-count goal per book | IN_PROGRESS | QS, L10N (`set_goals`) |
| F2 | Deadline (due date) + remaining days | IN_PROGRESS | DDL (`book_due_date`), L10N (`remaining_days`, `due_date`) |
| F3 | Daily progress recording (year/month/day/word_count) | IN_PROGRESS | DDL (`book_progress`), NOV (`book_progresses`) |
| F4 | Progress chart (daily word counts) | IN_PROGRESS | QS, L10N (`no_progresses_to_display`) |
| F5 | Calendar entry mode (manual progress entry per date) | IN_PROGRESS | L10N (`calendar_entry_mode`, `selected_date`) |
| F6 | Current / longest streak | IN_PROGRESS | L10N (`current_streak`, `longest_streak`) |
| F7 | Writing days count / total words | IN_PROGRESS | L10N (`writing_days`, `total_words`) |

## G. Preview & export (compile)

| # | Feature | Status | Evidence |
|---|---|---|---|
| G1 | Manuscript preview (book scope, tree order) | IN_PROGRESS | QS (`preview`, eye icon) |
| G2 | Preview zoom | IN_PROGRESS | L10N (`preview_zoom_level`, `zoom_in`, `zoom_out`) |
| G3 | Table of contents in preview + optional TOC title | IN_PROGRESS | L10N, NOV |
| G4 | Export dialog: format choice (EPUB/ODT/HTML) | IN_PROGRESS | QS, FAQ, L10N (`select_a_format`) |
| G5 | Include sections / scenes / items toggles | IN_PROGRESS | L10N (`include_sections`, `include_scenes`, `include_items`) |
| G6 | EPUB 3 output (mimetype, container, OPF, NCX/nav, XHTML) | IN_PROGRESS | L10N (`epub3_description`) |
| G7 | ODT output (mimetype, content.xml, styles.xml, META-INF) | IN_PROGRESS | L10N (`odt_description`) |
| G8 | HTML output | IN_PROGRESS | L10N (`html_description`) |
| G9 | Share / save exported file | IN_PROGRESS | L10N (`export_share`) |
| G10 | Copy compiled text to clipboard | PLANNED | L10N (`copy_into_clipboard`) |
| G11 | Compile requires ≥1 section | IN_PROGRESS | L10N (`at_least_one_section_is_required_to_compile`) |
| G12 | Manuscript excludes reference-only images | IN_PROGRESS | FAQ |

## H. Backup / recovery / sync

| # | Feature | Status | Evidence |
|---|---|---|---|
| H1 | `.nov` export (manual backup to device) | IN_PROGRESS | NOV, L10N (`backup`) |
| H2 | `.nov` import/restore (file picker) | IN_PROGRESS | L10N (`restore_backup`, `invalid_backup_file`) |
| H3 | Last backup date per project + library indicator | IN_PROGRESS | DDL, QS |
| H4 | Automatic backup interval setting | PLANNED | DDL (`book_automatic_backup_hours`, `book_automatic_backup_url`) |
| H5 | Internal rolling backups folder | PLANNED | inference |
| H6 | Scene/item history restore | PLANNED | DDL (`*_history`) |
| H7 | Send to cloud (Google Drive / iCloud) | BLOCKED (no credentials/consent; offline-only per FAQ) | FAQ, L10N, MAN (GMS sign-in) |
| H8 | Receive from cloud + version comparison (`local_version`/`remote_version`) | BLOCKED | L10N |
| H9 | Device name for sync | PLANNED | L10N (`set_device_name`) |
| H10 | Invalid/duplicate file handling with clear errors | IN_PROGRESS | L10N |

## I. Settings / help / other

| # | Feature | Status | Evidence |
|---|---|---|---|
| I1 | Theme: light / dark / system + seed colour picker | IN_PROGRESS | L10N (`set_theme`, `pick_color`), logos |
| I2 | Language selection (13 locales) | IN_PROGRESS (English shipped; selector present) | assets/localisations |
| I3 | Easy/Normal mode | PLANNED | L10N |
| I4 | Typography preferences (font, size, line height) | IN_PROGRESS | STR |
| I5 | Smart typography preferences | IN_PROGRESS | L10N |
| I6 | Quick guide (bundled HTML) | IN_PROGRESS | asset |
| I7 | FAQ list | IN_PROGRESS | `faqs_en.json` |
| I8 | Help centre / support email / Facebook / YouTube links | IN_PROGRESS (links) / PLANNED (email) | L10N |
| I9 | Privacy policy + Terms & conditions (light/dark variants) | IN_PROGRESS | assets |
| I10 | Third-party licences page | PLANNED | L10N (`third_party_libraries`) |
| I11 | First-run tutorials (create book/scene/section/compile) | PLANNED | L10N (`tutorial_*`, `show_overlay`) |
| I12 | Debug mode (tap-to-activate) | NOT_INSPECTED | L10N (`debug_mode_activated`) |
| I13 | Biometric app lock | PLANNED | MAN (`USE_BIOMETRIC`) |
| I14 | About / version | IN_PROGRESS | MAN |

## J. Cross-cutting invariants to test

| # | Invariant | Status |
|---|---|---|
| J1 | Data survives app restart (DB persisted) | IN_PROGRESS |
| J2 | Deleting a project removes all dependent rows (no orphans) | IN_PROGRESS |
| J3 | A scene not attached to a section never appears in preview/export | IN_PROGRESS |
| J4 | Reordering sections/scenes does not corrupt references | IN_PROGRESS |
| J5 | `.nov` round-trip preserves codes, text, embeds, ordering | IN_PROGRESS |
| J6 | Backup → restore reproduces identical project content | IN_PROGRESS |
| J7 | Exported EPUB/ODT/HTML contain only expected content and open correctly | IN_PROGRESS |
| J8 | Word counts/progress consistent between editor, schedule, and export | IN_PROGRESS |

---

## Z. Route parity (mined from `libapp.so` in build 250)

Every route the reference registers, with the state of the rebuild. Evidence column `STR` = route
path or interface string recovered from the shipping binary (`docs/reference/original_ui_strings.txt`).

| # | Route / surface | Status | Evidence |
|---|---|---|---|
| Z1 | `/books` bookshelf with sort, grid/list and menu | IMPLEMENTED | STR |
| Z2 | `/project` workspace drawer with books switcher | IMPLEMENTED | STR (`drawer_open`, `end_drawer_open`) |
| Z3 | `/scene/:id` scene editor with block menu | IMPLEMENTED | STR (`ScenePopupMenuAction`) |
| Z4 | `/item/:id` item detail with six tabs | IMPLEMENTED | STR (`ItemPopupMenuAction`) |
| Z5 | `/categories`, `/statuses/:entity/:id`, `/tags/:entity/:id` managers | IMPLEMENTED | STR |
| Z6 | `/search?query=` | IMPLEMENTED · TESTED | STR |
| Z7 | `/preview`, `/compile` | IMPLEMENTED | STR |
| Z8 | `/progress` | IMPLEMENTED · TESTED | STR (`book_progress_*`) |
| Z9 | `/history` + `Restore this version` | IMPLEMENTED · TESTED | STR (`Restore from history`) |
| Z10 | `/cloud_library` with Drive/iCloud vendors | IMPLEMENTED (UI) · BLOCKED (transfer) | STR (`CloudVendor`, `resumable/upload/drive/v3/files`) |
| Z11 | `/help_center` (FAQ, quick guide, privacy, terms) | IMPLEMENTED · TESTED | STR, assets |
| Z12 | `/tutorial` with `End tutorial` | IMPLEMENTED · TESTED | STR |
| Z13 | `/intro` first-launch pages | IMPLEMENTED · TESTED | STR, assets |
| Z14 | `/easy_mode` | IMPLEMENTED | STR (`easy_mode_incompatibility`) |
| Z15 | Reorder dialogs (books, sections, scenes, items, statuses, categories, subplots, relationships, metadata groups/elements) | IMPLEMENTED | STR (`Reorder …`) |
| Z16 | Pickers (`select_items/:id`, `select_scenes`, `select_section`, `select_online_image`) | IMPLEMENTED | STR |
| Z17 | 13 locales | BLOCKED | STR (translated values exist in the binary but cannot be keyed reliably) |
| Z18 | Intro/empty-state artwork (10 illustrations + `intro.jpg`) | BLOCKED | assets (size/licensing) |
| Z19 | Font Awesome iconography | IMPLEMENTED (approximated) | `FontManifest.json` |
