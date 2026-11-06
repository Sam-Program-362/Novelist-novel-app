# Novelist — reverse-engineering report

**Subject:** `Novelist.apks` (Android App Bundle export, app version `2026.1.19`)
**Secondary source:** `https://web.novelist.app/` (Flutter web build; blocked from this VM's egress, confirmed reachable and titled "Novelist")
**Deliverable:** a working reimplementation in this repository, sharing the app's project file format
**Date:** 2026-10-31

---

## 1. Executive summary

Novelist is a **local-first Flutter application** for writing novels. It has no backend of its own: projects live in a SQLite database on the device, backups/transfers are user-initiated (`.nov` file, Google Drive `appdata` folder, manual "send to cloud" / "receive from cloud"), and the only network calls found are third-party (Google sign-in and Drive, and the Pexels stock-photo API).

Because the app is offline-first, its most valuable interchange surface — and the thing worth reproducing faithfully — is the **`.nov` v4 JSON document**. That format was recovered exactly, together with the complete SQLite DDL, from artifacts shipped inside the APK. The reimplementation here reads and writes that format and reproduces the app's own `sample.nov` without loss. Whether the Android app accepts a file produced here could not be tested in this environment (no device or emulator); the export is shaped to match the observed writer, including the omission of empty fields.

No Dart decompilation was possible in this environment (see §3), so UI behaviour was reconstructed from the data model, the bundled help content, embedded UI strings, and observed fixture data. §8 states precisely what is exact and what is inferred.

---

## 2. Artifacts examined

| Artifact | Detail |
| --- | --- |
| `Novelist.apks` | 44,280,576 bytes, 5 files: base `Novelist-2026.1.19.apk` (15.9 MB) + `config.en.apk`, `config.es.apk`, `config.xxhdpi.apk`, `config.arm64_v8a.apk` (28.2 MB) |
| `classes.dex` | 2.29 MB — thin Kotlin shell (embedding, plugin registration) |
| `lib/arm64-v8a/libapp.so` | 14.6 MB — Dart AOT snapshot, the entire application logic |
| `lib/arm64-v8a/libflutter.so` | 11.6 MB — Flutter engine |
| `libsqlite3.so`, `libsqlite3_connection_pool.so` | Native SQLite + a connection pool, from the Dart `sqlite3`/`drift` stack |
| `libdartjni.so`, `libdatastore_shared_counter.so` | Dart↔JNI bridge, DataStore counter |
| `assets/flutter_assets/` | 57 files, 14 MB: `sample.nov` (1.1 MB), `template_standard_novel.json` (35 KB), 13 locales of FAQs and quickstart, 10 illustrations, logo, fonts manifest, shaders |
| `AndroidManifest.xml` (binary) | Package metadata; split delivery |

The bundled **`sample.nov`** was decisive: it is a real, complete project ("The Lighthouse Code", 15 scenes, 5 chapters, 23 plot items) in the app's own export format.

Evidence of libraries, read from the AOT string table:

- `dev.flutter.pigeon.google_sign_in_android.*` — Google Sign-In
- `https://www.googleapis.com/auth/drive.appdata` and the Drive query `files(id, name, createdTime, modifiedTime, appProperties)` — Drive appdata backup
- `https://api.pexels.com` — stock imagery
- `webview_flutter_android`, `image_picker_android`, `url_launcher_android`, `shared_preferences_android`
- `google_fonts` (bundled font names: Atkinson Hyperlegible, Bitter, IBM Plex, …)
- EPUB/ODT output: IDPF OPF/NCX namespaces, `application/epub+zip`-adjacent MIME entries, and a full `<office:document-content>`/`<style:style>` ODT template in strings
- A leaked build path: `file:///D:/Progetti/Novelist2/.dart_tool/flutter_build/dart_plugin_registrant.dart`

---

## 3. Method (and what was not possible)

1. **Unpacked** the bundle and the arm64 split with `unzip` to obtain the Dart snapshot and all bundled assets.
2. **Extracted the embedded SQLite DDL** from `libapp.so` with `strings`, then parsed every `CREATE TABLE`/`CREATE INDEX` statement into a normalised schema (§6).
3. **Parsed the shipped fixtures** (`sample.nov`, `template_standard_novel.json`, `faqs_en.json`, `quickstart_en.html`) to derive the interchange format and feature inventory.
4. **Read the UI string table** for feature names and settings labels across 13 locales.

Limitations that shape the fidelity claims:

- **No Java/Dalvik tooling** (`java`, `jadx`, `apktool`, `aapt` all absent). `classes.dex` was not decompiled; it is only a shell, so this costs little.
- **No Dart decompiler.** `libapp.so` is AOT-compiled Dart. Only literal strings, the DDL, and the asset fixtures are recoverable. Control flow, exact ordering rules and UI layout are not.
- **`web.novelist.app` is unreachable from this VM** (TLS handshake rejected by the edge). A plain fetch confirmed the page exists and is titled "Novelist", i.e. another Flutter build; its JS bundle could not be downloaded.
- **The REA agent tooling did not provide analysis engines.** `npx rea-agents@latest setup` installed the package but reported the skill as `missing` and no provider configured (`ghidra`, `ida`, `jadx`, `kuna` all unconfigured). Analysis therefore used direct static inspection, which was sufficient for an offline-first app whose format ships in its own assets.

---

## 4. Application anatomy

```
Novelist-2026.1.19.apk
├── classes.dex                      Kotlin shell (2.3 MB)
├── AndroidManifest.xml
├── resources.arsc
└── assets/flutter_assets/
    ├── sample.nov                   full sample project, .nov v4
    ├── template_standard_novel.json 6 categories, 5 statuses, ~100 metadata fields
    ├── template_empty.json          single status
    ├── faqs_{en,ar,bn,de,es,fr,hi,id,it,ja,pt,ru,zh}.json
    ├── quickstart_{...}.html
    ├── privacy_policy*.html, terms_and_conditions*.html
    ├── logo_{light,dark}.png, intro.jpg, 9 scene illustrations
    ├── NativeAssetsManifest.json, AssetManifest.bin, FontManifest.json
    └── shaders/

config.arm64_v8a.apk
└── lib/arm64-v8a/{libapp.so, libflutter.so, libsqlite3*.so, libdartjni.so, ...}
```

`libapp.so` carries the whole product. Its string table contains the SQL shipped by the migration layer, every localisation string, and all UI labels.

---

## 5. Architecture and storage

- **Presentation:** Flutter (Material), 13 locales, custom fonts.
- **Persistence:** SQLite via `sqlite3` + `sqlite3_connection_pool` (drift-style generated DAOs; the DDL text appears in the snapshot).
- **Sync model:** none automatic. Users export `.nov`, or push a project to Google Drive `appdata` ("Send to cloud") and pull it elsewhere ("Receive from cloud"). The FAQ states this explicitly and warns that deleted projects cannot be recovered by the vendor.
- **Import conflict handling** (UI string): *"One or more copies of this book already exist in your bookshelf. Do you want to keep or replace them?"*
- **Backups:** `last_backup_date` is tracked per project; the FAQ recommends manual backups.
- **Easy mode** (string: *"This book is not fully compatible with Easy Mode. Some scenes or sections may be hidden. Switch to Normal Mode in Settings."*).
- **Compilation settings:** table of contents, automatic indentation, automatic hyphenation, smart quotes.
- **Export:** EPUB, ODT, HTML (FAQ + embedded ODF/OPF templates).
- **Images:** attached to plot items and scenes for reference only; not included in the manuscript (FAQ).

No first-party HTTP API exists. Searching the snapshot for hosts yields only `api.pexels.com`, `googleapis.com`, `help.novelist.app`, `web.novelist.app`, social links and `info@novelist.app`. **The Android app contains no LLM integration**; the writing assistant in this repository is an addition via the project's Respan gateway, not a recovered feature.

---

## 6. Database schema (recovered DDL)

The snapshot contains three generations of schema, showing the app's own migration history: an early **revision-scoped** model (`*_revision_id`), an intermediate **project-scoped** model (`*_project_id`), and the current model where books belong to projects. Tables found:

`project`, `book`, `book_new`, `revision`, `book_progress`, `book_progress_new`, `book_template`, `category`, `category_new`, `metadata_group`, `metadata_element`, `item`, `item_name`, `item_tag`, `item_metadata`, `item_note`, `item_picture`, `item_relationship`, `item_history`, `tag`, `status`, `status_new`, `subplot`, `subplot_new`, `scene`, `scene_new`, `scene_item`, `scene_note`, `scene_picture`, `scene_subplot`, `scene_history`, `section`, `section_new`, `section_scene`.

Representative current-schema statements (verbatim, whitespace normalised):

```sql
CREATE TABLE project(project_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
  project_code TEXT NOT NULL, project_title TEXT NOT NULL, project_description TEXT,
  project_is_archived INTEGER NOT NULL, project_cover TEXT,
  project_last_update_date INTEGER NOT NULL, project_last_cloud_sync_date INTEGER,
  project_last_cloud_sync_device_name TEXT, project_last_backup_date INTEGER);

CREATE TABLE book(book_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
  book_project_id INTEGER NOT NULL, book_code TEXT NOT NULL, book_title TEXT NOT NULL,
  book_description TEXT, book_cover TEXT, book_word_count INTEGER, book_due_date INTEGER,
  book_last_update_date INTEGER, book_ranking INTEGER, book_metadata TEXT, book_settings TEXT,
  FOREIGN KEY(book_project_id) REFERENCES project(project_id) ON DELETE CASCADE);

CREATE TABLE scene(scene_id INTEGER PRIMARY KEY NOT NULL ON CONFLICT REPLACE,
  scene_code TEXT NOT NULL, scene_title TEXT NOT NULL, scene_synopsis TEXT, scene_text TEXT,
  scene_ranking INTEGER NOT NULL, scene_status_id INTEGER NOT NULL,
  FOREIGN KEY(scene_status_id) REFERENCES status(status_id) ON DELETE CASCADE);
```

Two observations matter for reimplementation:

1. **The book is the unit of export.** `book_progress` counts words per book per day; `revision` snapshots belong to a book.
2. **Everything cascades from project or book.** Deleting a project deletes its books, sections, scenes, plot items, statuses, subplots and history — matching the FAQ's "there is no recovery".

The `.nov` document maps onto this schema as follows:

| `.nov` field | SQLite source |
| --- | --- |
| `code`, `title`, `description`, `cover`, `last_*_date` | `project` (export of one book uses `book`) |
| `revisions[]` | `revision` (history snapshots) |
| `revisions[].statuses[]` | `status` |
| `revisions[].subplots[]` | `subplot` |
| `revisions[].categories[].metadata_groups[]` | `category` + `metadata_group` |
| `…metadata_groups[].metadata_elements[]` | `metadata_element` |
| `revisions[].categories[].items[]` | `item` + `item_name` + `item_metadata` + `item_tag`/`tag` + `item_relationship` + `item_note` + `item_picture` |
| `revisions[].scenes[]` | `scene` + `scene_item` + `scene_subplot` + `scene_note` + `scene_picture` |
| `revisions[].sections[]` | `section` + `section_scene` |
| `revisions[].book_progresses[]` | `book_progress` |

---

## 7. The `.nov` v4 format (recovered exactly)

Machine-readable schema: [`schema/novelist.nov.schema.json`](schema/novelist.nov.schema.json). Summary:

```jsonc
{
  "version": 4,
  "code": "66261d80",              // 8 hex chars
  "title": "The Lighthouse Code",
  "description": "…",
  "show_table_of_contents": true,
  "apply_automatic_indentation": true,
  "last_update_date": 1752421695400,     // epoch ms
  "last_cloud_sync_date": 1752304204740,
  "last_backup_date": 1752421713303,
  "cover": "/9j/4AAQ…",                  // base64 JPEG, no data: prefix
  "revisions": [{
    "number": 1, "date": 1752240196259,
    "book_progresses": [{ "year": 2025, "month": 7, "day": 11, "word_count": 2946 }],
    "statuses":  [{ "code": "1", "title": "To do", "color": 4292270041, "ranking": 1 }],
    "subplots":  [{ "code": "9e700349", "title": "…", "color": 4289705003, "ranking": 1 }],
    "scenes": [{
      "code": "fbfae51b", "title": "…", "synopsis": "…", "text": "…",
      "ranking": 1, "status": "ad3819b2",
      "scene_items":    [{ "code": "6acabda8" }],
      "scene_subplots": [{ "subplot": "9e700349", "synopsis": "…" }]
    }],
    "sections": [{
      "code": "3683e8ff", "title": "Chapter 1: Arrival in Santa Marea",
      "synopsis": "…", "ranking": 1,
      "section_scenes": [{ "code": "fbfae51b", "ranking": 1 }]
    }],
    "categories": [{
      "code": "9c3bcad6", "title": "Themes", "color": 4288423856, "ranking": 1,
      "metadata_groups": [{
        "code": "cf0e2684.jpg", "title": "General", "ranking": 1,
        "metadata_elements": [{ "code": "ac9df54d.jpg", "title": "Importance", "ranking": 1, "is_relevant": true }]
      }],
      "items": [{
        "code": "7ef69440", "title": "Tommaso \"Tom\" Rinaldi", "synopsis": "…",
        "ranking": 1, "status": "ad3819b2",
        "item_tags": [{ "tag": "05aa7761" }],
        "item_names": [{ "code": "2950d705", "name": "Tommaso", "ranking": 1 }],
        "item_metadatas": [{ "metadata_element": "5656e0b7.jpg", "value": "12" }],
        "item_relationships": [{ "other_item": "98a09da8", "description": "Cousin to", "ranking": 1, "is_relevant": true }],
        "item_notes": [{ "text": "…", "ranking": 1 }],
        "item_pictures": [{ "picture": "/9j/4AAQ…" }]
      }]
    }]
  }]
}
```

Formatter rules observed in `sample.nov` and reproduced by this implementation:

- Empty values are **omitted**, not written as `[]`, `""`, or `null`.
- All identifiers are 8 hex characters, except template-derived metadata codes which carry a legacy `.jpg` suffix (`"cf0e2684.jpg"`).
- Colours are **unsigned 32-bit ARGB** integers; the shipped templates also contain signed equivalents, so readers must accept both.
- Timestamps are epoch **milliseconds**; `book_progresses` uses calendar Y/M/D instead.
- Scenes are ordered twice: `scene.ranking` and, per chapter, `section_scenes[].ranking`. Section membership is authoritative for reading order.
- A scene may be referenced by exactly one section; unassigned scenes still exist in `scenes[]`.

---

## 8. Feature inventory and fidelity

| Capability | Evidence | This repo |
| --- | --- | --- |
| Projects/bookshelf, archive, covers | `project`, `book` tables; `book_is_archived`; cover base64 | Implemented |
| Chapters → scenes, reorder, TOC | `section`, `section_scene`, `section_ranking`; "Table of contents title" | Implemented |
| Scene editor with synopsis, text, status | `scene` table; `scene_text` | Implemented |
| Plot categories, metadata groups/fields, items | full category/metadata/item schema | Implemented |
| Item aliases, tags, relationships, notes, pictures | `item_name`, `tag`, `item_relationship`, `item_note`, `item_picture` | Implemented except tag/picture editing in UI (model + import/export supported) |
| Statuses with colour, per project | `status` table | Implemented |
| Subplots linked to scenes with per-link synopsis | `subplot`, `scene_subplot.scene_subplot_synopsis` | Implemented |
| Word counts, daily progress, per-chapter stats | `book_progress`, `book_word_count` | Implemented |
| Revision history | `revision` table, `revisions[]` | Implemented (snapshot / view / restore) |
| `.nov` import/export, duplicate-on-conflict | format + conflict string | Implemented |
| HTML/Markdown/plain-text compilation | compilation settings; ODF/OPF templates | Implemented |
| EPUB / ODT export | ODF/OPF templates in strings; FAQ | Implemented: EPUB 3 (nav, OPF, cover) and ODT 1.3, both written as stored ZIPs with a dependency-free writer |
| Google Drive "send/receive cloud" | Drive scope + `appProperties` query | **Not implemented** (needs OAuth client credentials that cannot be reconstructed) |
| Easy mode | `mode_easy_description`, compatibility warning | **Not implemented** |
| Hyphenation / smart quotes settings | UI strings | Not implemented (indentation + TOC are) |
| AI writing assistant | **not present in the app** | Added via Respan gateway, clearly separated |

### What is exact, inferred, or unknown

| Area | Confidence | Basis |
| --- | --- | --- |
| `.nov` v4 structure, field names, value encodings | **Exact** | Real export fixture; round trip in `tools/nov-roundtrip.mjs` |
| SQLite schema, cascade rules, migration history | **Exact** | DDL literals in the AOT snapshot |
| Bundled category/status names of the sample project | **Exact** | `sample.nov` |
| Standard-novel template *shape* (6 categories, 5 statuses, group/element counts) | **Exact** | `template_standard_novel.json` |
| Standard-novel template *English labels* | **Inferred** | Template ships `§template_standard_novel_*_title§` markers resolved through compiled l10n; the key→English map is not recoverable as data. Labels were reconstructed from `sample.nov` (Themes, Events, Characters, Locations, Props) and English UI strings in the snapshot ("Positive personality traits", "Introvert or extrovert", "Hobbies / pastimes", "Attitude towards school", …) |
| Feature set | **High** | Schema + FAQ/quickstart + UI strings |
| Exact UI layout, gestures, animations | **Unknown** | Requires Dart decompilation; not attempted |
| Exact word-count algorithm, hyphenation rules | **Approximate** | Reimplemented as whitespace tokens plus per-character CJK counting |
| Export layout of EPUB/ODT | **Rebuilt, not byte-identical** | Container structure follows EPUB 3/ODF 1.3; the app's original stylesheets and exact byte layout were not recoverable |

---

## 9. Verification

All checks were run in this workspace; commands and results:

| Check | Result |
| --- | --- |
| `node --check` on server, model and client | pass |
| `npm test` | **20/20 pass** (10 model tests, 3 packaging tests, 7 HTTP tests) |
| EPUB/ODT archives | 11-entry EPUB and 5-entry ODT; `unzip -t` reports no errors; Python `zipfile.testzip()` clean; every XML/OPF/XHTML part parses; `mimetype` first and uncompressed in both |
| jsdom UI check (rebuilt harness after the runner restart) | bookshelf, editor with a manuscript textarea, export menu, EPUB and ODT buttons produce the right export URLs, downloaded EPUB is a valid ZIP; zero captured page errors |
| `node tools/nov-roundtrip.mjs` | `sample.nov`: 15 scenes, 5 sections, 5 categories, 23 items, 2,689 words; round trip `ok` for scenes/sections/categories; output 1,122.5 KiB vs input 1,123.9 KiB |
| jsdom UI smoke test (dev harness, not committed) | 14 assertions: bookshelf, editor input → **7 words**, autosave persisted to disk, plot, stats, settings, plan, AI-unconfigured notice, sample project scene aside (7 chips), plot list (3 items), item editor open/save/close, sample statistics; **zero captured page errors** |
| HTTP smoke (`curl`) | `/` 200 `text/html`, `/app.js` 200 `text/javascript`, `/shared/nov-model.js` 200, `/api/health` `{"ok":true,"ai":false,…}` |

Tests exercise real files and a real server process: the API suite spawns `server.mjs` on a random port with a temporary `NOVELIST_DATA_DIR`, then creates, reads, mutates, exports, imports, duplicates and deletes projects.

Not verified: importing a generated `.nov` into the Android app (no device or emulator); rendering the EPUB/ODT in a third-party reader or office suite (archives are structurally validated, not visually inspected); interactive layout in a real browser (no browser in this environment); Google Drive transfer (requires app credentials).

---

## 10. Reproducing the analysis

```bash
# 1. Unpack the bundle and the arm64 split
unzip Novelist.apks -d work/apks
unzip work/apks/Novelist-2026.1.19.apk -d work/base
unzip work/apks/config.arm64_v8a.apk -d work/arm64

# 2. Dump the AOT string table (DDL, UI strings, hosts)
strings -n 20 work/arm64/lib/arm64-v8a/libapp.so > work/app-strings.txt
grep -oE 'https?://[^" ]+' work/app-strings.txt | sort -u

# 3. Inspect the interchange format and templates
python3 -m json.tool work/base/assets/flutter_assets/assets/sample.nov | less
python3 -m json.tool work/base/assets/flutter_assets/assets/template_standard_novel.json | less

# 4. Validate the reimplementation against the real export
npm test
npm run roundtrip
```

---

## 11. Android packaging

`Android/` is a Gradle project that packages this workspace as an installable APK. It is a shell around the same JavaScript, not a port:

- `syncWebAssets` copies `public/` and `shared/` into the build's asset directory before every build, so the APK and the web app cannot drift.
- `MainActivity` hosts the bundle in a WebView served by `WebViewAssetLoader` from `https://appassets.androidplatform.net`, which gives ES modules a real origin instead of the blocked `file://` scheme.
- A `@JavascriptInterface` bridge (`NovelistNative`) provides atomic project storage under `files/projects/`, and the system create/open document dialogs for exports and imports.
- `public/native.js` detects the bridge, intercepts the app's `/api/*` calls, computes `.nov`/EPUB/ODT/HTML/Markdown/text exports with the shared model in the WebView, and routes downloads to the save dialog. On the web it is inert.

The result is an offline APK: no server, no account, no network, projects stored as JSON on the device.

| Check | Result |
| --- | --- |
| `gradle assembleDebug` | BUILD SUCCESSFUL; `Android/dist/novelist-android-debug.apk`, 1.4 MB |
| `aapt2 dump badging` | `app.novelist.re` 1.0, minSdk 24, target 34, launchable `MainActivity` |
| APK contents | `assets/{index.html,app.js,native.js,styles.css,shared/nov-model.js,shared/zip.js}`, `classes.dex`, launcher icon |
| Native transport harness (jsdom, stubbed `NovelistNative`) | bookshelf stats, project load, autosave write, EPUB export as a valid ZIP through `saveExport`, project creation — zero captured errors |
| Install and launch on an Android 14 (API 34) emulator | `adb install` succeeds; `MainActivity` becomes the focused window; WebView opens `https://appassets.androidplatform.net/index.html` (confirmed via the WebView DevTools socket) |
| Renderer-death handling on the same device | The renderer was killed under memory pressure and Chromium aborted the app. `onRenderProcessGone` now reloads the workspace instead; the device log shows `renderer gone, crashed=true; reloading` and the process survives |

Not verified: page rendering, the file chooser, the save dialog and the back gesture. The test emulator had no KVM access, so Chromium's renderers trap under software CPU emulation (`EGL_emulation` reported ~21 s per frame and the system UI itself ANRed); this is a host limitation, not an app fault. They need a hardware-accelerated device or KVM-enabled emulator. Debug signing uses the standard Android debug key; a release build needs the user's own keystore.

## 12. Legal and ethical note

The analysis used only the application package supplied for this task and files the application itself publishes (assets, export fixtures). No DRM, licence check or authentication mechanism was bypassed, and no third-party content was redistributed. This reimplementation is a clean-room product of the recovered data format: it contains no decompiled or copied application code. Apply it only to material you have the rights to work with.

---

## 13. Suggested next steps

1. **Byte-level export parity.** Compare this EPUB/ODT output with files produced by the real app and align stylesheets, metadata and paragraph handling.
2. **Google Drive transfer.** Would require the user to register their own OAuth client; the app's client ID cannot be reused.
3. **Tag and picture editing UI.** Model, import and export already carry both.
4. **Android UI check on accelerated hardware.** Install the APK on a phone or a KVM-enabled emulator, then verify rendering, import through `ACTION_GET_CONTENT`, export through `ACTION_CREATE_DOCUMENT` and the back gesture. Software-only emulation cannot run Chromium renderers reliably, so these remain unverified.
4. **Deeper behavioural parity.** Needs a Dart snapshot analysis toolchain (e.g. `reFlutter`/`blutter` with a Flutter engine matching 2026.1.19) to recover ordering rules and exact UI copy.
5. **Real-browser visual check.** Serve the app and walk the five tabs; the jsdom harness covers logic but not layout.
