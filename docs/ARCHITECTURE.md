# Architecture

## 1. Technology decisions

| Decision | Choice | Why (evidence-based) |
|---|---|---|
| Framework | **Flutter (Dart 3)** | The original is Flutter; the request requires a standalone Android APK and explicitly prefers Flutter unless constrained. Native APK, offline, no WebView. |
| Persistence | **SQLite via `package:sqlite3` + `sqlite3_flutter_libs`** | Original bundles `libsqlite3.so` + `sqlite3_connection_pool` (`NativeAssetsManifest.json`) and Drift-style DDL with numbered migrations. We use the same engine, same schema, same migration discipline — but hand-written SQL to avoid a `build_runner` codegen step. |
| DB access | Hand-written DAO/repository layer (`lib/data/dao/*.dart`) | Zero codegen keeps CI hermetic and fast; SQL is explicit and matches the reconstructed schema column-for-column. `package:sqlite3` has no Flutter binding requirement, so DAOs are unit-testable on the host. |
| State | `provider` (`ChangeNotifier` scopes) | Small dependency surface, well-understood semantics, no codegen. Scopes: `AppSettings`, `LibraryController`, `ProjectController` (owns book/plot/write/schedule slices). |
| Navigation | `Navigator` + named routes; **drawer-based workspace shell** | `drawer_open`/`end_drawer_open` keys prove a drawer shell on mobile. Adaptive: `>= 840 dp` shows the drawer permanently (two-pane), matching the web/tall-tablet layout without compressing desktop UI onto phones. |
| Theming | Material 3 `ColorScheme.fromSeed` + design tokens | The binary references M3 colour roles by name (`primary_container`, `surface_container_high`, `on_surface_variant`, …). Light + dark (`logo_light.png`/`logo_dark.png`). |
| Typography | `google_fonts` (runtime) + system fallback | The AOT snapshot embeds the Google Fonts family catalogue; the APK ships no font files for them ⇒ fonts are fetched at runtime. Editor + preview expose a font picker; offline falls back to the platform font. |
| Text documents | Custom `TextDoc` model (blocks + `\uFFFC` embeds) | The `.nov` format and `scene_text`/`item_text` columns store exactly `{"blocks":[{type,align,text,embeds}]}`. Re-implementing that structure (rather than adopting Quill) is required for `.nov` fidelity. |
| Compile/export | `archive` (ZIP) + hand-built EPUB 3 / ODT / HTML writers | Export targets are evidenced by `epub3_description`, `odt_description`, `html_description`, `compile_*` keys and the FAQ. No heavyweight document library needed. |
| Tests | `flutter test` (unit + widget + golden-free) | DAO/logic tests run on the host DB; widget tests cover navigation-critical flows. |
| CI | GitHub Actions (`ubuntu-latest`) — `flutter analyze`, `flutter test`, `build apk --release`, artifact upload | **No JDK/Android SDK/Flutter in the development sandbox**, and egress is restricted to GitHub/npm/PyPI. CI is therefore the *only* compiler; it is set up early so every change is verified. |

Rejected alternatives: Web-based wrapper (explicitly forbidden); Kotlin/Compose rewrite (would discard Flutter
parity in typography/editor behaviour and reuse none of the evidence); Drift + codegen (adds build fragility
for no functional gain); Hive/Isar document store (loses the relational guarantees the schema already encodes).

## 2. Layering

```
lib/
├── main.dart                 # bootstrap: DB open, settings load, app run
├── app.dart                  # MaterialApp, routes, localisation delegates, theme binding
├── core/
│   ├── theme/                # design tokens + ThemeData (light/dark), typography, spacing
│   ├── l10n/                 # Strings (English), keyed like the original l10n table
│   ├── utils/                # codes, colours, dates, word counting, smart typography
│   └── errors.dart
├── data/
│   ├── db/database.dart      # open, pragmas, schema v1 DDL, append-only migrations
│   ├── db/schema.dart        # DDL constants (mirrors reference DDL)
│   ├── dao/                  # projects, books, plot, scenes, sections, schedule, templates, history
│   ├── repositories/         # transactional use-cases crossing DAOs
│   └── io/                   # .nov reader/writer, backup service, compile (epub/odt/html)
├── models/                   # plain immutable entities (Project, Book, Category, Item, Scene, ...)
├── state/                    # LibraryController, ProjectController, AppSettings
└── ui/
    ├── shell/                # app shell, workspace drawer
    ├── library/              # bookshelf, project create/edit dialogs, template chooser
    ├── plot/                 # categories, item list, item detail (metadata/names/notes/pictures/relations/history)
    ├── write/                # scene pool list, editor, mention picker, reference panel, split scene
    ├── books/                # book list, Organize tree, attach-scenes picker
    ├── schedule/             # goals, progress chart, calendar, streaks
    ├── preview/              # manuscript preview + TOC + zoom
    ├── export/               # compile dialog, format selection, sharing
    ├── backup/               # backup/restore, history restore, cloud placeholders (labelled)
    ├── settings/             # theme/language/mode/typography/tutorial/help/about
    └── widgets/              # shared design-system components
```

Module boundaries: `data` never imports `ui`; `ui` never issues raw SQL; `state` is the only place that
coordinates multiple repositories. Cross-module rules that the architecture must protect:

* **A scene enters a manuscript only through `section_scene`.** `SceneDao` has no “book” concept;
  `SectionDao.attachScene` is the sole writer of that table.
* **Deleting a category/project/book is one transaction** relying on `ON DELETE CASCADE` + explicit
  `PRAGMA foreign_keys=ON`, so no orphan rows or dangling codes survive.
* **Codes are immutable after creation** (they back `.nov` cross-references and mentions).

## 3. Data flow for the editor

`SceneEditorScreen` ⇄ `SceneEditorController` (debounced, journaled) ⇄ `TextDoc` codec ⇄ `scene.scene_text`.
On debounce: write text + push previous snapshot into `scene_history` (capped) + update `book_word_count`
and today's `book_progress` row for the *current book* (progress is per book, per the schema). On lifecycle
pause/close: flush immediately. Mentions are `\uFFFC` + `embeds[]` entries referencing `item.code`, so
renaming an item does not corrupt a manuscript.

## 4. Build structure

* `app/` — the Flutter application (this is the deliverable APK project).
* `.github/workflows/android-ci.yml` — analyze + test + release APK artifact (debug-signed by default;
  optional keystore via repository secrets, documented in the workflow and `docs/IMPLEMENTATION_PROGRESS.md`).
* `Sources_Of_Original/` — untouched reference material (XAPK + decompilation).
* `docs/` — permanent project documentation, plus `docs/reference/` extracted evidence.

`app/android/app/build.gradle` targets `minSdk 24`, `targetSdk 36`, `compileSdk 36` to match the reference.

## 5. Known architectural risks

1. **No local compiler.** Every Dart change is verified only by CI, so changes are batched and CI is run
   frequently; the workflow surfaces analyzer errors verbatim.
2. **Reproducing a Flutter UI without screenshots.** Mitigated by centralising every visual decision in
   `core/theme/` so a corrected palette/spacing from owner screenshots is a single-file change.
3. **Character-level rich text is unsupported by the file format.** Implemented at paragraph level
   (alignment) + document typography; documented rather than invented.
