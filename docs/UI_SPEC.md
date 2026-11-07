# UI specification of the reference application (Novelist 2026.1.19, build 250)

This document is the screen-by-screen inventory the rebuild is measured against. It exists because
the user asked for the **real** interface to be reproduced, not an approximation.

## How this was obtained — and what could not be done

The request was to open <https://web.novelist.app/>, create a test project there and click through
every pop-up, option, block and tab. **That was not possible from this environment**, and no
click-through was simulated:

| Attempt | Result |
| --- | --- |
| `curl https://web.novelist.app/` from the sandbox | `SSL_ERROR_SYSCALL`; plain `http` returns an empty reply — the sandbox has no route to the host |
| Proxy fetch of the same URL | Works, but the page renders with the Flutter **canvas** backend: the HTML contains `flutter typography measurement` and no semantic DOM, so there is nothing to click |
| `/version.json` on the web build | `{"app_name":"novelist","version":"2026.1.19","build_number":"250"}` — same build as the APK analysed here |
| `/assets/AssetManifest.bin` on the web build | Readable; lists the bundled assets (see below) |

So the inventory below was reconstructed from the **same build's shipped artefacts**: the APK
(`Sources_Of_Original/Novelist+-+Write+novels_2026.1.19_APKPure.xapk` →
`it.returntrue.novelist.apk` + `config.arm64_v8a.apk`), in particular:

* `lib/arm64-v8a/libapp.so` (13 MB Dart AOT snapshot, 64 875 extracted strings) — route table,
  screen/view class names, enum names of every menu, dialog sentences, validation messages;
* `assets/flutter_assets/` — FAQ JSON, quick-start and legal documents, sample project, templates,
  fonts, artwork;
* the web `AssetManifest.bin` to confirm the asset names shipped on both platforms.

Extracted evidence kept in the repository:

| File | Contents |
| --- | --- |
| `docs/reference/original_l10n_keys.txt` | 597 identifiers recovered from the binary (UI keys, column names, package names — mixed) |
| `docs/reference/original_l10n_english.tsv` | 190 of those keys matched to a **verified** English value in the string table |
| `docs/reference/original_ui_strings.txt` | 1 568 English strings relevant to the app's vocabulary |
| `docs/reference/original_short_labels_all_locales.txt` | 8 010 short labels across all 13 locales (the reference compiles its translations into code) |
| `docs/reference/original_sql_ddl.txt` | SQL schema recovered from the binary |
| `docs/reference/app_assets/` | the shipped text assets (FAQ, quick-start, sample project, templates, logos) |

Limits that must stay visible: the string table is stored in a hash-ordered pool, so a key cannot be
paired with its value mechanically (only 190 of 597 could be verified by normalisation); translated
strings are compiled in per-locale but the mapping is not recoverable; and no screenshot or layout
metric survives in the binary. Everything below is therefore *structure and copy*, and the layout is
rebuilt from Material conventions.

## Routes registered by the reference

Recovered verbatim from `libapp.so`. They define the complete navigation surface.

| Route | Screen | Rebuild |
| --- | --- | --- |
| `/books` | Bookshelf (library home) | `ui/library/library_screen.dart` |
| `/project` | Project workspace with the module drawer | `ui/shell/project_screen.dart` |
| `/scene/:id` | Scene editor | `ui/write/scene_editor_screen.dart` |
| `/item/:id` | Plot item detail | `ui/plot/item_detail_screen.dart` |
| `/categories` | Category manager | `ui/plot/plot_management_sheets.dart` (sheet) |
| `/statuses`, `/statuses/:entity/:id`, `/statuses/item/…`, `/statuses/scene/…` | Status manager per entity | `ui/plot/plot_management_sheets.dart` |
| `/tags/:entity/:id`, `/tags/item/…` | Tag manager per entity | `ui/plot/plot_management_sheets.dart` |
| `/search?query=` | Project search | `ui/search/search_screen.dart` **new** |
| `/preview` | Manuscript preview | `ui/preview/preview_screen.dart` |
| `/compile` | Compile / export | `ui/export/export_sheet.dart` |
| `/progress` | Word-count progress | `ui/progress/progress_screen.dart` **new** |
| `/history` | Restore from history | `ui/history/history_screen.dart` **new** |
| `/cloud_library` | Cloud library (Drive / iCloud) | `ui/cloud/cloud_library_screen.dart` **new** |
| `/help_center` | FAQ, quick guide, legal documents | `ui/help/help_center_screen.dart` **new** |
| `/tutorial` | Guided tour | `ui/help/tutorial_screen.dart` **new** |
| `/intro` | First-launch introduction | `ui/library/intro_screen.dart` **new** |
| `/easy_mode` | Simplified interface | `ui/help/easy_mode_screen.dart` **new** |
| `/reorder_books`, `/reorder_sections`, `/reorder_section_scenes`, `/reorder_scenes`, `/reorder_items/category/:id`, `/reorder_statuses`, `/reorder_categories`, `/reorder_subplots`, `/reorder_relationships`, `/reorder_metadata_groups`, `/reorder_metadata_elements` | Reorder dialogs | `showReorderMenu` in `ui/widgets/common.dart` + per-screen reorder |
| `/select_items/:id`, `/select_scenes`, `/select_section`, `/select_online_image` | Pickers (attach items/scenes, choose a section, choose a picture) | `ui/write/scene_editor_screen.dart`, `ui/books/organize_screen.dart` |

## Screen inventory and copy

Copy below is quoted from the string table; where a label could not be verified it is marked
*(unverified)*.

### 1. Bookshelf (`/books`)

* App bar: `Library`; actions in the reference map to `BookshelfView` / `BookshelfSortField`: sort
  field (`bookshelf_sort_field`), direction (`bookshelf_sort_is_ascending`), grid or list
  (`bookshelf_is_grid`), and a menu.
* Menu (`BookShelfMenuAction` / `CloudLibraryMenuAction`): `Cloud library`, `Tutorial`,
  `Help center`, `Restore backup`, `Settings`.
* FAB: `Add project`. Empty state offers the sample project.
* Project card long-press menu (`ProjectMenuAction` / `BookMenuAction`): edit, duplicate, archive,
  delete, export and share, set cover.
* Destructive confirmations: `Are you sure you want to delete the entire project?`,
  `Are you sure you want to delete the entire book?`, `Are you sure you want to delete?`.
* Duplicate handling: `duplicated_books_have_been_found` — French copy confirms the choice is
  “keep or replace the existing copies”.

### 2. Project workspace (`/project`)

* Drawer (`drawer_open` / `end_drawer_open`) with the books switcher; wide layouts keep it visible.
* Modules in the drawer: `Books`, `Plot`, `Write`, `Schedule`; then `Search`, `Progress`,
  `Cloud library`, `Backup`, `Help center`, `Tutorial`, `Easy mode`, `Settings`.
* App bar context menu (`ProjectMenuAction`): project title and description editing, preview,
  compile, export.

### 3. Books module

* Book list with settings entry (`book_settings`, `book_metadata`, `book_organize`), table of
  contents (`book_show_table_of_contents`, `book_table_of_contents_title`), automatic indentation
  (`book_apply_automatic_indentation`), word count (`book_word_count`), progress (`book_progress`).
* Metadata fields: `book_title`, `book_author`, `book_genre`, `book_language`, `book_publisher`,
  `book_isbn`, `book_copyright`, `book_date`, `book_description`, `book_cover`.
* Sections and scenes: `Add section`, `Add subsection`, `Reorder sections`, `Reorder scenes`,
  `Select scenes`, `Attach existing scenes`, `Remove from section`, `Include when compiling`.
* Compile guards: `At least one section is required to compile`, `Include sections`, `Include scenes`,
  `Include items`, `compile_select_section`, `compile_select_compiler`.

### 4. Plot module

* Categories (`Add category`, `Edit category`, `Reorder categories`, `Cannot find category.`).
* Items (`Add item`, `Edit item`, `Reorder items`, `item_*` actions in the string table), item detail
  tabs: `Description`, `Metadata`, `Names`, `Notes`, `Pictures`, `Relationships`.
* Per-item pop-up menu (`ItemPopupMenuAction`): status change, `Merge`, `Archive`, delete, history.
* Statuses: `Statuses`, `Add status`, `Edit status`, `Reorder statuses`, `No statuses to display`,
  `Cannot insert an item without an available status.`, `Cannot insert a scene without an available
  status.`, `Could not move items to first status.`
* Tags: `Tags`, `Add tag`, `Edit tag`, `Select tags`, `No tags to display`.
* Subplots: `Subplots`, `Add subplot`, `Reorder subplots`.
* Metadata groups and elements: `Add metadata group`, `Add metadata element`, `Reorder metadata
  groups`, `Reorder metadata elements`, `Show on item card`.
* Relationships: `Relationships`, `Add relationship`, `Reorder relationships`, `is_relevant`.
* Pictures: `Add picture`, `select_online_image`, picture ranking.

### 5. Write module

* Scene list (`Add scene`, `Reorder scenes`, `No scenes to display`), scene editor (`/scene/:id`).
* Scene pop-up menu (`ScenePopupMenuAction`): `History` → `Restore from history`,
  `Scene notes`, `Scene pictures`, `Subplots`, `Split scene`, delete.
* Editor blocks: `TextBlock` and `FlowBlock` (the accessibility enum `AccessibilityFocusBlockType`
  lists the block kinds); alignment actions `align_left`, `align_center`, `align_right`,
  `align_justify`; `Mention an item` inserts an item embed; `Automatic hyphenation` and
  `Automatic indentation` toggles.
* Section pop-up menu (`SectionPopupMenuAction`): edit, add scene, reorder, select scenes, delete.

### 6. Preview and compile

* Formats: EPUB (`epub3_description`), ODT, HTML; `compile_book`, `compile_selection`,
  `is_compiled`; table of contents toggle; `Copy into clipboard`; `Export and share book`.

### 7. Schedule and progress

* Goals (`Set goals`, `Word count goal`, `Deadline`, `Due date`, `Remaining days`, `Writing days`,
  `Current streak`), calendar entry mode (`calendar_entry_mode`), daily progress
  (`book_progress_day/month/year`, `book_progress_word_count`), `No progresses to display`.
* `/progress` shows the same rows as the calendar — both read `book_progress`.

### 8. Cloud library (`/cloud_library`)

* Vendors: `Google Drive`, `Apple iCloud` (`CloudVendor`); states `Cloud connect`, `Cloud connected`,
  `Cloud disconnected`, `Cloud disconnect`; actions `Send to cloud`, `Receive from cloud`,
  `Received from cloud`; list header `From online library`; error copy
  `Apple iCloud connection error`, `api_google_drive_error`, `invalid_grant`,
  `ICloudTransferProgressType`.
* The reference uploads a resumable backup (`/resumable/upload/drive/v3/files`). The FAQ itself says
  there is **no automatic sync** — transfers are explicit backups.

### 9. Help centre, tutorial, intro, easy mode

* `Help center` tabs: `FAQ` (`faqs_<locale>.json`), `Quick guide` (`quickstart_<locale>.html`),
  `Privacy policy`, `Terms and conditions`; `Email support` → `info@novelist.app`.
* `Tutorial` with `End tutorial`; intro pages with artwork (see assets below); `Easy mode` and
  `easy_mode_incompatibility`.

### 10. Settings

* `Theme` (light/dark/system), colour seed, editor `Font`, `Font size`, `Line height`,
  `Smart quotes`, `Smart guillemets`, `Smart hyphens`, `Smart ellipsis`, `Automatic correction`,
  `Apply automatic indentation`, `Language` (13 locales: ar, bn, de, en, es, fr, hi, id, it, ja, pt,
  ru, zh), `Help center`, `About`, `Version`, `Third-party libraries`, `Web version`,
  `YouTube channel`, `Facebook page`, `Email support`.
* Font catalogue: the binary contains the Google Fonts names (e.g. `Antic Didone`,
  `Atkinson Hyperlegible Next`, `BhuTuka Expanded One`, `Alegreya`, `Merriweather`, `Lora`,
  `EB Garamond`, `Literata`) — the reference selects fonts by name, as this rebuild does through
  the `google_fonts` package.

## Bundled artwork (not reproduced here)

| Asset | Size | Role |
| --- | --- | --- |
| `balloon`, `boat`, `bulb`, `cactus`, `island`, `lighthouse`, `mountain`, `planet`, `rocket`, `telescope` `.png` | ~0.9–1.5 MB each, 1080 px tall | intro / empty-state illustrations |
| `intro.jpg` | 354 KB | intro hero |
| `pexels.png` | 800×333 | sample/placeholder picture |
| `logo_dark.png`, `logo_light.png` | 840×249 | wordmark |

The ten illustrations and `intro.jpg` are **deliberately not vendored** (about 10 MB of binary art
would dominate the repository and could not be verified for licensing). `assets/logo_light.png` and
`assets/logo_dark.png` are bundled and the intro falls back to Material icons where an illustration
would be.

## Icons

`FontManifest.json` shows `MaterialIcons` at only 10.8 KB — a tree-shaken subset, so some Material
icons do not exist in the reference — plus Font Awesome 7 `Brands` (215 KB), `Regular` (87 KB) and
`Solid` (1.8 KB). The rebuild uses the Material subset only; any icon that the reference draws from
Font Awesome is approximated by its closest Material glyph. This is a cosmetic deviation, listed in
`docs/FEATURE_PARITY_CHECKLIST.md`.

## Deviations in this rebuild

| Area | Reference | Rebuild | Reason |
| --- | --- | --- | --- |
| Translations | 13 locales compiled into the binary | English only | machine-produced translations would be worse than an explicit gap |
| Cloud transfer | Google Drive / iCloud OAuth upload | full UI, actions route to local backup | no OAuth client can be registered for a rebuilt application |
| Intro/empty-state artwork | 11 large PNGs | logo + Material icons | repository size, licensing |
| Layout metrics | unknown (canvas UI) | Material 3 conventions | no metrics survive in the binary |
| Alerts/long-press menus | exact placements unknown | placed on the equivalent Material affordances | as above |
