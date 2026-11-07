# Novelist App — Source & Reverse-Engineered Artefacts

This directory contains the full Novelist Android application, copied from the
original source APKs (version 2026.1.19), plus decoded/reconstructed artefacts
so the app can be inspected and rebuilt identically.

## What was copied

- `Novelist_App_Source/Novelist-2026.1.19.apk` — main base APK (Flutter shell +
  Kotlin/Android framework glue).
- `Novelist_App_Source/config.armeabi_v7a.apk` — native libraries for armeabi-v7a
  (`libapp.so`, `libflutter.so`, `libsqlite3.so`, etc.).
- `Novelist_App_Source/config.en.apk` — English config/resources split.
- `Novelist_App_Source/config.es.apk` — Spanish config/resources split.
- `Novelist_App_Source/config.xxhdpi.apk` — xxhdpi drawable resources split.
- `Novelist_App_Source/decoded_main_apk/` — apktool decode of the main APK
  (AndroidManifest.xml, `smali/`, `res/`, `assets/`, `kotlin/`, `apktool.yml`,
  `resources.arsc`, `META-INF/`, `original/`).
- `Novelist_App_Source/decoded_resources/` — apktool decode without source,
  keeping the readable resources-only view of the main APK (useful for readable
  `AndroidManifest.xml` with resource references resolved).
- `Novelist_App_Source/config_splits/` — per-config-split extracted contents
  (manifests, resources, and native libs where present).

## Tooling (to work with these APKs)

- `Android_Tooling/apktool.jar` — Apktool 2.11.0 (decode/rebuild APKs).
- `Android_Tooling/jadx/` — JADX 1.5.1 (decompile DEX/native assets to Java).
- `Android_Tooling/jdk-17/` — JDK 17 (required to run apktool/jadx here).

## Quick start (run from this repo root)

```bash
# set up Java for the tooling
export JAVA_HOME="$(pwd)/Android_Tooling/jdk-17"
export PATH="$JAVA_HOME/bin:$PATH"

# decode the main APK (full: manifest + resources + smali)
java -jar Android_Tooling/apktool.jar d \
  Novelist_App_Source/Novelist-2026.1.19.apk \
  -o Novelist_App_Source/decoded_main_apk -f

# decode main APK resources-only (readable manifest + res)
java -jar Android_Tooling/apktool.jar d \
  Novelist_App_Source/Novelist-2026.1.19.apk \
  -o Novelist_App_Source/decoded_resources -f --no-src

# decompile with jadx
Android_Tooling/jadx/bin/jadx -d /tmp/novelist_java \
  Novelist_App_Source/Novelist-2026.1.19.apk
```

## Reconstructed app identity (from the decoded APK)

- Package: `it.returntrue.novelist`
- App label: `Novelist`
- Entry activity: `it.returntrue.novelist.MainActivity`
- Flutter embedding v2 (`flutterEmbedding=2`)
- Compile SDK: 36 (targetting Android 16)
- Native libs shipped in config split `config.armeabi_v7a` (armeabi-v7a):
  `libapp.so`, `libflutter.so`, `libsqlite3.so`,
  `libsqlite3_connection_pool.so`, `libdartjni.so`,
  `libdatastore_shared_counter.so`
- Base APK contains `classes.dex` + Flutter assets
  (`assets/flutter_assets/...`) including `sample.nov`, faqs JSON files,
  quickstart HTML files, and assets images.
- Config splits: `config.en`, `config.es`, `config.xxhdpi`,
  `config.armeabi_v7a` (required split types: `base__abi`, `base__density`).

## Source files (original zip contents, preserved as-is)

- `Original_Source_Files/Novelist.zip` — the original zipped source APKs from the
  repo (untouched).
- `Novelist_app_source/` — direct extraction of `Novelist.zip` (untouched copy of
  the original APKs).

## Note on "exact same"

This is a copy of the app as it exists in the APKs, plus apktool/JADX decodes.
The APKs are the authoritative artefacts; the decoded directories are derived from
them and are included so the app structure can be rebuilt/reconstructed from
source.
