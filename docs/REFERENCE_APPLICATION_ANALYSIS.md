# Reference Application Analysis — Novelist (Android + Web)

> Evidence discipline: every statement below is tagged with its source. Anything not directly observed is
> listed under §8 “Unverified / inaccessible”. No screen in this document was inspected by running the
> original application in this environment — the environment has no Android runtime, no emulator and no
> browser engine. See §1 for exactly what *was* inspected.

## 1. What was actually inspectable (and what was not)

| Reference | Availability in this environment | How it was used |
|---|---|---|
| `Novelist+-+Write+novels_2026.1.19_APKPure.xapk` (44.4 MB, 5 split APKs) | **Inspected** — unpacked, its base APK resources and Dart AOT library analysed | Structure, assets, schema, strings |
| Decompiled `resources/` (res, manifest, layouts values) | **Inspected** | Theme resource names, manifest capabilities |
| Decompiled `sources/` (Java/Kotlin) | **Inspected (superficially)** — it is the standard Flutter embedding + plugins (Play Billing, Google Sign-In, image_picker, webview_flutter, DataStore). No application logic: the app logic is Dart compiled to `libapp.so` | Plugin/feature inventory only |
| `assets/flutter_assets/**` | **Inspected in full** — fonts, icons, templates, `sample.nov`, quickstart + FAQ + policy HTML, cover art | Behaviour, workflows, data formats |
| `lib/arm64-v8a/libapp.so` (14.6 MB AOT snapshot) | **Inspected via string/DDL extraction** — schema, l10n keys, UI copy, package identifiers | Data model, feature inventory, exact UI vocabulary |
| Official web app `https://web.novelist.app/` | **Not interactable**: it is a CanvasKit Flutter web build; fetching it returns a canvas page with a single text node (`flutter typography measurement`). Direct bundle download is blocked from this sandbox (only GitHub/npm/PyPI egress). No browser engine available to render it | Documented as a **gap** — see §8 |
| Screenshots / screen recordings | **None supplied** in the repository | Requested from owner |
| Android runtime of the original | **Unavailable** (no Android device/emulator, no JDK/Android SDK in sandbox) | — |

## 2. Application identity and technical shape

From `manifest.json` + `AndroidManifest.xml` (base APK):

* Package `it.returntrue.novelist`, version name **2026.1.19**, versionCode 250.
* `minSdk 24`, `targetSdk 36`, single `MainActivity` (`it.returntrue.novelist.MainActivity`), Flutter embedding v2.
* XAPK splits: `config.arm64_v8a`, `config.en`, `config.mdpi`, `config.zh` (ABI + locale + density splits).
* Permissions: `INTERNET`, `USE_BIOMETRIC`, `USE_FINGERPRINT` (+ generated receiver permission).
* `android:allowBackup="false"`, `windowSoftInputMode="adjustResize"`, `configChanges` include `locale`,
  `fontScale`, `uiMode`, `layoutDirection`.
* Storage engine: `libsqlite3.so`, `libsqlite3_connection_pool.so` + `NativeAssetsManifest.json` →
  **Drift over `package:sqlite3`** (not sqflite), plus `androidx.datastore` preferences and
  `shared_preferences`.
* Editor/typography: Material Icons + **Font Awesome 7** (brands/regular/solid) custom fonts; Google Fonts
  family names embedded in the binary (Hina Mincho, ZenTokyoZoo, IM Fell English SC, Love Ya Like A Sister,
  Noto Serif Devanagari, …) ⇒ `google_fonts` package for selectable editor/UI typography.
* Monetisation / accounts: Play Billing (`com.android.vending.*`), Google Sign-In (`com.google.android.gms.auth.api.signin`),
  ⇒ Drive backup and an `icloud_storage_plus` subscription path.
* Plugins implied by code strings: `image_picker` (`flutter_image_provider` FileProvider),
  `webview_flutter` (pigeon WebViewClient), `flutter_keyboard_visibility`, `share_plus`
  (`no_apps_can_perform_this_action`), file pickers (`invalid_file`, `invalid_backup_file`).
* Localisation: 13 shipped languages (`ar, bn, de, en, es, fr, hi, id, it, ja, pt, ru, zh`) via
  `quickstart_<lang>.html`, `faqs_<lang>.json` and locale-tagged string tables. English is the reference.

## 3. Authoritative workflow description (bundled `quickstart_en.html`)

The shipping app's own onboarding text is the highest-fidelity behavioural evidence available, and it is
the backbone of this reconstruction:

1. **Library — collection of projects.** “+” creates a project from *Novel standard template* or a *custom
   template based on an existing project*. Three-dot menu per project: **edit, set cover, delete**.
   Unlimited projects. **Safety indicator: green = safe/backed up, red = needs backup.**
   Tapping a project opens its **main workspace**.
2. **Project workspace — shared elements.** “Plot and Write serve as a shared pool of resources for all the
   books you create within this project.”
   * **Plot** — “create and manage the core elements of your world: Themes, Characters, Events, and more.”
     “+” adds an item (title required, synopsis optional). Categories are create/edit/delete-able
     (e.g. add “Factions”, “Planets”). The **status circle** tracks each item; **long-press the circle** to
     delete or merge items; **long-press an item to reorder**. Tapping an item opens details:
     “relationships, images, and rich text descriptions”.
   * **Write** — scenes are the shared pool. “+” adds a scene (title required). Rich text editor with
     formatting options; **mentions of Plot items via the “@” symbol**. Per-scene management:
     attach Plot items, **split scenes into two**, reorder by long-press. Scenes will *not* appear in a
     manuscript until attached to a book.
3. **Books — structuring manuscripts.** One project may contain one *or many* books that share the same
   Plot items and Scenes (“series, sequels, or spin-offs”).
   * **Organize** inside a book shapes the manuscript into “acts, parts, and chapters”.
     Add sections (tree), attach scenes from the shared pool, reorder. **Only attached scenes are compiled.**
4. **Schedule** — goals: word-count target, deadline, or both; a chart of daily word count.
5. **Preview and export** — eye icon in a book previews the manuscript; **Export and share** produces
   **EPUB, ODT or HTML**.
6. **Backup and sync** — local or cloud (Google Drive / iCloud); manual **Send to cloud** / **Receive from cloud**.

## 4. Navigation and screen inventory (reconstructed from l10n vocabulary + workflow text)

The l10n key table (`docs/reference/original_l10n_keys.txt`, 598 keys) is generated from the app's own
widget/column names and is the most reliable screen inventory available. Strong signals:

* `drawer_open`, `end_drawer_open` ⇒ the mobile shell uses a **navigation drawer** (Material `Drawer` /
  `endDrawer`), i.e. project workspace sections switch through a drawer, not a bottom bar.
* `bookshelf_is_grid`, `bookshelf_sort_field`, `bookshelf_sort_is_ascending`, `reorder_books`,
  `no_books_to_display` ⇒ the Library is a **“bookshelf”** with grid/list toggle and sorting.
* `book_organize`, `organize_add_section`, `section_is_expanded`, `section_select_scene`,
  `section_set_existing_scenes`, `select_parent_section` ⇒ hierarchical Organize view with expand/collapse
  and an attach-existing-scenes picker.
* `reference_panel`, `show_overlay` ⇒ a plot reference panel available while writing.
* `preview_zoom_level`, `set_zoom`, `zoom_in`, `zoom_out`, `table_of_contents`,
  `table_of_contents_title` ⇒ preview dialog with zoom + TOC.
* `calendar_entry_mode`, `writing_days`, `current_streak`, `longest_streak`, `remaining_days`, `set_goals`,
  `total_words`, `no_progresses_to_display` ⇒ Schedule with calendar entry mode and streaks.
* `mode_easy`, `mode_normal`, `mode_easy_description`, `set_mode`, `easy_mode_incompatibility` ⇒
  **Easy mode** vs **Normal mode** UX density switch.
* `smart_quotes`, `smart_guillemets`, `smart_hyphens`, `smart_ellipsis`, `set_automatic_correction`,
  `automatic_indentation`, `automatic_hyphenation`, `select_indentation`, `replace_quotes`,
  `replace_guillemets`, `replace_hyphens`, `replace_ellipsis` ⇒ typographic automation settings.
* `set_theme`, `set_language`, `pick_color`, `set_cover`, `clear_cover`, `from_camera`, `from_gallery`,
  `from_online_library`, `photos_provided_by`, `photographer_url` ⇒ settings; **Pexels** integration for
  cover images (attribution strings present).
* `tutorial_create_book_*`, `tutorial_create_scene_*`, `tutorial_create_section_*`, `tutorial_compile_book_*`,
  `end_tutorial` ⇒ scripted first-run tutorials with overlay highlighting (`show_overlay`).
* `restore_from_history`, `restore_this_version`, `restore_previous_position`, `duplicated_books_have_been_found`,
  `invalid_backup_file`, `message_backup_moved`, `sent_to_cloud`, `received_from_cloud` ⇒ recovery,
  import conflict handling and user-visible outcome messages.
* Help surfaces: `help_center`, `quick_guide`, `no_questions_to_display` (FAQ list from `faqs_en.json`),
  `email_support_*`, `url_facebook_page`, `url_youtube_channel`, `url_web_version_page`,
  `web_message_beta_version`, `privacy_policy`, `terms_and_conditions`, `third_party_libraries`.
* `compile_book`, `compile_select_compiler`, `compile_selection`, `select_a_format`, `include_items`,
  `include_scenes`, `include_sections`, `export_share`, `epub3_description`, `odt_description`,
  `html_description` ⇒ the compile/export dialog with content-inclusion toggles and format choice.

### Recommended mobile shell (reconstructed)

```
Drawer (project workspace)                 Library (bookshelf)
├─ Books (choose/organize a book)          ├─ grid ⇄ list toggle
├─ Plot     (categories → items)            ├─ sort menu
│   └─ item detail: metadata, names,        ├─ "+" → template chooser
│      relationships, notes, pictures,      └─ ⋮ per project → edit / set cover / delete
│      rich text, history
├─ Write    (scene pool → editor)
│   └─ editor: @mentions, reference panel,
│      split scene, attach items, notes, pictures, history
├─ Schedule (goals, streaks, calendar)
├─ Preview / Export (per book)
├─ Backup & sync (send/receive/restore)
└─ Settings (theme, language, mode, typography, tutorial, help, about)
```

## 5. Visual language (evidence + reconstruction)

Directly evidenced:

* App icon: white calligraphic “Nov” wordmark on a blue gradient (`docs/reference/…/icon.png`).
* `logo_light.png` / `logo_dark.png` shipped for both themes ⇒ **light + dark themes are first-class**.
* TIER-1 colour roles referenced by name in the runtime: Material 3 tokens (`primary_container`,
  `on_surface_variant`, `surface_container_high`, `tertiary_fixed`, `outline_variant`, …) ⇒ the UI is
  **Material 3** with a `ColorScheme` derived from a seed colour (`pick_color`, `set_theme`).
* Typography: system/default Roboto-like UI text plus **Google Fonts** families for the editor/preview,
  selectable (`set_automatic_correction`, font selection implied by the embedded font-name table).
* Icons: Material + Font Awesome ⇒ mixed iconography (Font Awesome brands used for cloud providers).
* `preview_zoom_level` etc. ⇒ manuscripts are rendered with a zoomable, page-like presentation.

Reconstructed (no screenshot evidence — flagged):

* Compact, list-first mobile layout: category chips/lists rather than dashboards; a single `+` FAB per
  list; per-row overflow menus; long-press for reorder; status dot as the leading affordance.
* Project covers shown in the bookshelf as image cards with title overlays and a small coloured safety dot.

## 6. Platform differences (Android vs web) — evidence status

* Both are Flutter; the web build is CanvasKit-rendered. Shared widgets are almost certain (`Library`,
  `Plot`, `Write`, `Organize`, compile/export), because the same l10n table and asset bundle ship together.
* Android-only, evidenced by manifest/plugins: image_picker camera capture, biometric lock, Play Billing,
  native file share (`share_plus`), DataStore preferences.
* Web-only, evidenced by l10n keys: `web_version`, `url_web_version_page`, `web_message_beta_version`
  (“beta”), `icloud_storage_plus` being subscription-gated on mobile, and browser-based compile download
  instead of “Export and share”.
* Layout: web exposes side-by-side panels (the `end_drawer`/`reference_panel` pattern) on wide screens;
  mobile stacks them behind drawers. We reproduce the **mobile** pattern as primary, with a wider two-pane
  layout on tablets (Material adaptive), never a shrunken desktop UI.
* **Not verifiable here** (no browser): exact web navigation, exact responsive breakpoints, exact palette.

## 7. Feature inventory beyond the brief

Discovered during investigation and added to parity scope:

1. **Easy mode / Normal mode** (`set_mode`, `easy_mode_incompatibility`).
2. **Item aliases** (`item_name`) used by mentions (`Tommaso`, `Tom`), nickname/surname metadata.
3. **Item notes**, **item pictures** (multi), **item relationships** with descriptions and relevance toggle,
   **item tags** with colours, **item history**.
4. **Scene notes**, **scene pictures**, **scene subplot links with per-scene synopsis**, **scene history**,
   **scene splitting** (quickstart).
5. **Per-project custom templates** created from an existing project (`project_template`, `book_template`).
6. **Statuses are user-editable** (title + colour + order) and shared by items *and* scenes.
7. **Subplots** are first-class project entities with colours and per-scene synopsis.
8. **Section-level compile flags** (`section_is_compiled`) and hierarchy (acts/parts/chapters).
9. **Word-count progress per book per day**, streaks, writing-days calendar, remaining days to deadline.
10. **Mentions/`@` with reference panel** while writing.
11. **Smart typography** (quotes/guillemets/hyphens/ellipsis, indentation, hyphenation) + auto-correction.
12. **Tutorials**, help centre, FAQ, legal pages, third-party licences, support email, Facebook/YouTube links.
13. **Duplicate detection** on import, invalid-backup handling, “backup moved” messages.
14. **Device names** for cloud sync (`set_device_name`, `last_cloud_sync_device_name`).
15. **Archive projects** (`project_is_archived`), book archive (`book_is_archived`).
16. **Table of contents** toggle + custom TOC title in compiled output.
17. **Copy/paste of items**, `copy_into_clipboard` for compile output.
18. **Font Awesome brand icons** for cloud providers in Settings/Backup UI.

## 8. Unverified / inaccessible behaviour (explicit)

| Item | Status | Impact / mitigation |
|---|---|---|
| Any actual screenshot of Android or web UI | **Not available** | Layout/colour reconstruction is evidence-based but not pixel-verified. Owner-provided screenshots requested. |
| Web app live behaviour | **Not interactable here** (CanvasKit + egress limits) | Treated as shared Flutter UI; documented rather than guessed in detail. |
| Exact colour palette values | **Unknown** | M3 seed-based scheme derived from the blue of the official icon/logo; centralised tokens so a corrected palette is a one-file change. |
| Character-level rich text (bold/italic) | **No representation found in `.nov`/DB** | Implemented as paragraph-level (alignment) + document typography settings, matching evidence. Revisit if screenshots show inline styling. |
| Inline image blocks in scene text | **No evidence** | Images implemented as attachments (`scene_picture`, `item_picture`), which the schema proves. |
| `.nov` version currently written by 2026 build | **Unknown** (we have v4 sample) | Reader accepts v4 and project-shaped bodies; writer emits v4-compatible + version tag. |
| Google Drive / iCloud implementation details | **Unknown** (auth is native + Play Billing) | Data path implemented behind a provider interface; cloud claims withheld until configured. |
| Exact tutorial copy/animation | **Only keys + subtitles known** | Tutorial scaffolding implemented with our own concise copy, marked as approximate. |
| Tablet/desktop breakpoints | **Unknown** | Adaptive layout (drawer ⇄ two-pane) documented as reconstruction. |

## 9. Evidence index

* `docs/reference/original_sql_ddl.txt` — 160 DDL statements (schema + full migration history).
* `docs/reference/original_l10n_keys.txt` — 598 runtime keys (screens, columns, settings, empty states).
* `docs/reference/app_assets/sample.nov` — a real 15-scene, 5-chapter project.
* `docs/reference/app_assets/template_standard_novel.json` / `template_empty.json` — system templates.
* `docs/reference/app_assets/quickstart_en.html` — the app's own workflow documentation.
* `docs/reference/app_assets/faqs_en.json` — 20+ in-app FAQ entries (feature-usage evidence).
* `docs/reference/app_assets/logo_light.png`, `logo_dark.png` — brand marks for both themes.
