# Implementation progress

Status of the standalone rebuild that lives in `app/`. "Parity" is judged against
`docs/FEATURE_PARITY_CHECKLIST.md`; everything marked **Implemented** has code in `app/lib` and a
matching row in the schema, everything under *Gaps* is a deliberate, documented difference.

Last updated after a fully green CI run: analyzer clean, 48 tests passing (database, widget and
editor flows) and a release APK built on GitHub Actions.

## How to build and verify

```bash
cd app
flutter pub get
flutter analyze
flutter test          # needs libsqlite3 on the host (CI installs it)
flutter build apk --release
```

CI (`.github/workflows/android-ci.yml`) runs exactly those steps on every push, so the analyzer and
the test suite are the gate: a change that does not compile cannot land silently. Verified locally
only through CI, since this workspace has no Flutter/Dart SDK:

| Tool | Version |
| --- | --- |
| Flutter / Dart | 3.47.9 / 3.13.7 (stable) |
| Gradle | 8.14.3 (Flutter 3.47 minimum) |
| Android Gradle Plugin | 8.11.1 |
| Kotlin | 2.2.20 |
| minSdk / compileSdk | 24 / 36 |

The wrapper is generated out of tree by CI: running Gradle inside `app/android` before
`local.properties` exists cannot configure the Flutter project.

## Modules

| Module | State | Notes |
| --- | --- | --- |
| Library (projects) | Implemented | Grid/list bookshelf, cover data-URIs, sort, duplicate, delete, `.nov` import/export, backup indicator. |
| Project shell | Implemented | Drawer on phones, permanent 280 dp rail ≥840 dp, module switcher, book switcher, word counts. |
| Books | Implemented | Book list, metadata (author/genre/language/publisher/ISBN/copyright), per-book compile settings, due date. |
| Organize (sections) | Implemented | Nested sections, expand/collapse, attach/detach scenes (detaching never deletes), reorder sections and scenes, per-section compile toggle. |
| Plot | Implemented | Category tabs, items with status colour dots, status change on tap, long-press delete/merge, item detail with description, metadata, names, notes, pictures, relationships, history, tags. |
| Plot management | Implemented | Categories, metadata groups/elements, statuses and subplots CRUD with colours and ordering. |
| Write | Implemented | Project-wide scene pool, status changes, scene editor with paragraph blocks, alignment, mentions, split, notes, pictures, subplots, reference panel, history restore. |
| Schedule | Implemented | Word goals, due date, daily progress entry, writing days, current/longest streak, 30-day chart. |
| Preview | Implemented | Same compiler as export, zoom, TOC. |
| Export | Implemented | EPUB 3, ODT and HTML with include-sections/scenes/TOC switches, share sheet, clipboard copy. |
| Backup & restore | Partial | Local `.nov` export/restore implemented; cloud send/receive and automatic backups are **not** implemented (the reference syncs manually through Drive/iCloud). |
| Settings | Implemented (English only) | Theme mode, seed colour, Google Fonts family/size/line height, smart typography and auto-correction toggles, help/FAQ/legal surfaces, links. |
| Rich text | Implemented | Reference-compatible `{"blocks":[…]}` document, mention embeds with code + display value, alias-aware label lookup. |

## Gaps and deliberate differences

1. **Localisation** – the reference ships 13 locales; this build ships English only. Rather than
   emit machine translations, the gap is explicit in `docs/DATA_MODEL.md`/`S`. The string table is
   keyed like the original so a translation layer can be added without touching the UI.
2. **Cloud transfer** – no Drive/iCloud integration, no OAuth client ids, no automatic background
   backup. `Backup` explains this instead of showing dead buttons; the `.nov` format is the transfer
   vehicle. `project_last_backup_date` is updated when a backup is shared.
3. **App lock** – biometric protection is not implemented; `AppSettings` is the natural home for the
   flag once a plugin is added.
4. **Images** – pictures are stored as names (schema parity) and shown from data URIs; they are
   excluded from every compiled format, matching the reference FAQ.
5. **Status labels** – the shipping string table is hash-ordered, so the two unrecovered status
   names are reconstructed (`First draft`, `Writing`, `To revise`); colours are exact.
6. **`template_standard_novel` category 5** – resolved to **Props** (the reference's noun list),
   not "Items"; group/element labels are derived from the uppercase codes and therefore exact.

## Test coverage

`app/test/` contains database-level tests (they run on the host VM with `sqlite3` FFI, no emulator
needed):

| File | Proves |
| --- | --- |
| `text_doc_test.dart` | Block/embed codec, alias round-trip, realignment, word counting. |
| `nov_file_test.dart` | The reference `sample.nov` imports (categories, 23 items, 15 scenes, 5 chapters × 3 scenes, 3 subplots, mentions by alias code) and survives an export → import round trip; malformed and future-version files are rejected without touching the database. |
| `project_flow_test.dart` | Template parsing, project creation, cascade deletes, the manuscript invariant (unattached scenes never compile, detaching keeps the scene, deleting a section keeps scenes), nested section flattening, scene ordering, split, and EPUB/ODT/HTML output structure (zip entries, `mimetype`, resolved mentions, alignment classes). |
| `persistence_test.dart` | Data reaches disk across close/reopen, foreign keys stay enabled, newer schemas are refused, and a backup file restores intact. |
| `editor_text_test.dart` | Smart-quote/guillemet/hyphen/ellipsis conversion and the guarantee that `@mention` tokens survive typography and become embeds. |
| `editor_screen_test.dart` | The scene editor as a user drives it: paragraphs load, typing is debounced and persisted with typography applied, alignment reaches the stored document, the mention picker writes the item code. |
| `app_smoke_test.dart` | The real application tree: empty library, project creation from the template, opening a project, walking all four workspace modules through the drawer, and the settings toggles. |

## Bugs the widget tests caught (and what they taught us)

Three defects only became visible once the app tree was mounted, which is why these tests exist:

1. **The Navigator was rebuilt on project open.** The project controller was conditionally provided
   *around* `MaterialApp`, so adding the provider changed the tree shape, destroyed the `Navigator`
   and silently reset the route stack back to the library. The provider is now always present (with
   an inert placeholder controller) so the tree shape never changes.
2. **Three floating action buttons shared the default hero tag**, which throws during a route
   transition because the shell keeps every module alive in an `IndexedStack`. Every FAB now has an
   explicit tag (or opts out) — this is the kind of crash that only appears on navigation.
3. **`CoverThumb` forwarded `double.infinity` sizes to `Container`/`Image`**, tripping a layout
   assertion in grid cards. Infinite sizes are now translated into a fill layout instead.

## Known follow-ups

* Add widget tests for the library → project → editor navigation once the analyzer baseline is green.
* Smart typography currently runs when a paragraph is **saved**, not as you type; the reference
  corrects on commit, so this matches observable behaviour but is not character-by-character.
* Editor mentions are typed as `@Label` tokens and converted to embeds on save. The reference shows
  them as inline chips; a `TextField` cannot host arbitrary inline widgets, so the display differs
  while the stored document is identical.
* Add a translation table (ARB or a simple map) once the English strings are frozen.

## Route-parity pass (November 2026)

Triggered by the owner's report that the interface was “not completely correct”. The reference could
not be driven interactively (see `docs/UI_SPEC.md` for the two attempts and why the canvas web build
has no clickable DOM), so the route table, drawer entries and menu enums were mined from
`libapp.so` and implemented one by one.

Newly implemented routes and screens:

| Route | Screen | Tests |
| --- | --- | --- |
| `/intro` | `ui/library/intro_screen.dart` — first-launch pages, `Skip`/`Start` | `app_smoke_test` (first launch → library) |
| `/search?query=` | `ui/search/search_screen.dart` — searches books, scenes and items of the open project | `parity_screens_test` |
| `/progress` | `ui/progress/progress_screen.dart` — daily words vs. goal, streak, 30-day bars | `parity_screens_test` |
| `/history` | `ui/history/history_screen.dart` — scene and item versions, `Restore this version` | `parity_screens_test` (both targets, restore round-trip) |
| `/cloud_library` | `ui/cloud/cloud_library_screen.dart` — Drive/iCloud vendor switch, connect state, send/receive | `parity_screens_test` |
| `/help_center` | `ui/help/help_center_screen.dart` — FAQ, quick guide, privacy, terms, email support | `parity_screens_test` (injected content) |
| `/tutorial` | `ui/help/tutorial_screen.dart` — five steps, `End tutorial`, remembered in prefs | `parity_screens_test` |
| `/easy_mode` | `ui/help/easy_mode_screen.dart` — toggle plus explanation; the drawer keeps Books + Write only | `app_smoke_test` (drawer) |

Supporting changes:

* `core/utils/html_text.dart` reduces the bundled HTML documents to text (the reference renders them
  in a `HtmlWidget` web view; this build has no web view dependency).
* `AppSettings` gained `easyMode`, `introSeen`, `tutorialSeen` and `dailyWordGoal`.
* The project drawer now carries `Search`, `Progress`, `Cloud library`, `Backup`, `Help center`,
  `Tutorial`, the easy-mode switch and `Settings`; the bookshelf menu carries `Cloud library`,
  `Tutorial`, `Help center`, `Restore backup`, `Settings`; the item detail app bar opens history.
* Settings' own FAQ/legal dialogs were replaced by links to the full help centre (one implementation
  instead of two), and it gained `Tutorial`, `Easy mode` and the daily word goal.

Test baseline is now **56 tests** (49 in the existing suites + 7 in `parity_screens_test.dart`).
