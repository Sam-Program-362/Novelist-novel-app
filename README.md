# Novelist RE

## What is in this repository

Two different things — they are not the same app:

| Folder | What it is |
|---|---|
| [`original/`](original/README.md) | **The real Novelist app** (2026.1.19), packaged as its untouched split APK set, plus every file inside it extracted. This is the actual product; install it and it behaves exactly like the original. |
| [`public/`](public), [`shared/`](shared), `server.mjs`, [`Android/`](Android) | A **separate reimplementation** of Novelist's behaviour (web app + Android WebView shell), written from scratch. It resembles the original but is not the original, and it is not built from it. |

The rest of this file describes the reimplementation. [REPORT.md](REPORT.md) holds the reverse-engineering notes it was based on.

## The reimplementation

A working reimplementation of the **Novelist** novel-writing app, reconstructed from `Novelist.apks` (version 2026.1.19) and its `.nov` v4 project format. It ships as a **web app** (Node server + browser SPA, no npm dependencies) and as a **native Android APK** that runs the same workspace fully offline.

- **Bookshelf** of projects stored as `.nov` files on disk
- **Write**: chapters and scenes, distraction-free serif editor, live word counts, autosave
- **Plot**: categories → metadata groups/fields → items, with aliases, statuses, relationships and notes
- **Plan**: chapter/scene outline with inline synopses
- **Stats**: word counts, status breakdown, words per chapter, daily progress
- **Settings**: statuses, subplots, revision snapshots, cover, compilation options
- **Import / export** `.nov` v4, EPUB 3, ODT, HTML, Markdown and plain text
- **AI assistant** for continuing, rewriting, describing and outlining, proxied through the Respan gateway

The reverse-engineering findings, evidence and fidelity notes are in [REPORT.md](REPORT.md).

## Requirements

- Web: Node.js 20 or newer. No npm dependencies are used at runtime or in tests.
- Android: JDK 17 and the Android SDK (API 34, build-tools 34.0.0).

## Run

```bash
npm start            # http://localhost:3000
PORT=8080 npm start  # custom port
```

Projects are written to `data/projects/<code>.json`. Set `NOVELIST_DATA_DIR` to store them elsewhere.

The server has no authentication and is intended for local use. It binds to `0.0.0.0` so a preview proxy can reach it; on an untrusted network, start it with `HOST=127.0.0.1 npm start`.

## Test

```bash
npm test                          # 20 model, packaging and HTTP tests
npm run roundtrip                 # validate/round-trip sample.nov
node tools/nov-roundtrip.mjs my.nov --write out.nov
```

## AI assistant (optional)

The assistant is served by the Respan hosted gateway, so only one server-side key is needed.

1. Create a key at <https://www.respan.ai>.
2. Put it in `.env.local` (git-ignored), see `.env.example`:

   ```
   RESPAN_API_KEY=...
   ```

3. Restart the server. Without a key the drawer reports that the gateway is unconfigured instead of failing.

Model and base URL can be overridden with `RESPAN_MODEL` and `RESPAN_BASE_URL`.

## Android app

The APK is built from this repository, not copied from the original app: `Android/` is a small native shell that bundles `public/` and `shared/` as assets and stores projects on the device, so it runs with no server and no network.

```bash
cd Android
./gradlew assembleDebug     # -> app/build/outputs/apk/debug/app-debug.apk
adb install -r app/build/outputs/apk/debug/app-debug.apk
```

A prebuilt debug APK is in [`Android/dist/novelist-android-debug.apk`](Android/dist/novelist-android-debug.apk), and the GitHub Actions workflow in [`.github/workflows/android.yml`](.github/workflows/android.yml) rebuilds it on every push. See [`Android/README.md`](Android/README.md) for the bridge design, signing notes and the exact differences from the original Android app.

## Layout

```
server.mjs              Node HTTP server: static files, project API, export, AI proxy
respan-gateway.mjs      OpenAI-compatible client for the Respan gateway
shared/nov-model.js     .nov v4 model, templates, stats, compilation, validation
shared/zip.js           Dependency-free ZIP writer used by EPUB/ODT export
public/                 Browser SPA (vanilla ES modules, no build step)
public/native.js        Offline bridge used by the Android build (no-op on the web)
schema/                 JSON Schema for the .nov v4 format
tools/nov-roundtrip.mjs Import/validate/round-trip CLI
test/                   node:test suites and the sample.nov fixture
Android/                Native Android shell, Gradle project and prebuilt APK
```

## Interoperability

Exports follow the shape the Android app writes: 8-hex-character codes, unsigned ARGB colours, epoch-millisecond dates, base64 JPEG covers, and no keys for empty values. `npm run roundtrip` proves the model reproduces the app's own `sample.nov` without data loss. Importing an export back into the Android app itself was not testable in this environment (no device or emulator).

## Scope note

This is a clean-room reimplementation built from the published binary and its own data files. It contains no decompiled or copied application code, and it is not the original app; for an exact copy of the original, use the APK you already have. Use it only with content and applications you have the rights to work with.
