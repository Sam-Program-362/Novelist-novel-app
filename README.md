# Novelist RE — Buildable codebase

This repository contains the **buildable source code** for a Novelist-like novel-writing application. The CI/CD workflow compiles and produces the Android APK from this code.

## What's in this repo

| Folder | Purpose |
|---|---|
| `Android/` | Gradle project that builds the debug APK. A native shell bundling the web assets as resources, storing projects on the device. Rebuilt by the GitHub Actions workflow on every push. |
| `public/` | Browser SPA (vanilla ES modules, no build step) — the UI that runs in WebView and on the web. |
| `shared/` | Shared modules: `.nov` v4 model/validation, ZIP writer for EPUB/ODT export, AI proxy gateway. |
| `server.mjs` | Node HTTP server: static file serving, project API, export, AI proxy. |
| `respan-gateway.mjs` | OpenAI-compatible client for the Respan gateway. |
| `schema/` | JSON Schema for the `.nov` v4 format. |
| `tools/nov-roundtrip.mjs` | CLI for import/validate/round-trip of `.nov` files. |
| `test/` | Node.js test suites and the `sample.nov` fixture; `npm test` runs 20+ checks. |
| `.github/workflows/android.yml` | GitHub Actions: builds `app-debug.apk` via `./gradlew assembleDebug`. |

## Build & CI

The GitHub Actions workflow rebuilds the APK from source on every push:

```bash
cd Android
./gradlew assembleDebug --no-daemon
# -> app/build/outputs/apk/debug/app-debug.apk
```

Install on device:

```bash
adb install -r app/build/outputs/apk/debug/app-debug.apk
```

A prebuilt debug APK is in [`Android/dist/novelist-android-debug.apk`](Android/dist/novelist-android-debug.apk).

## Run locally

```bash
npm start            # http://localhost:3000
PORT=8080 npm start  # custom port
```

## License & rights

This is a clean-room reimplementation built from the published Novelist binary. It contains **no decompiled or copied application code** from the original app. It is not the original Novelist application; for an exact copy, use the APK you already own. Use it only with content and applications you have the rights to work with.

## Scope note

This repository is for personal use — building, modifying, and extending the application. The original `Novelist.apks` binary is **not** tracked in this repository (it was removed after extraction). If you need the original binary, keep your own copy.

