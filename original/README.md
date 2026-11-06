# Novelist 2026.1.19 — the real app, packaged

This folder holds the **actual Novelist Android app** exactly as distributed, plus a full
extraction of every file inside it. Nothing here was rewritten, recompiled or reconstructed.

| | |
|---|---|
| Package | `it.returntrue.novelist` |
| Version | `2026.1.19` (versionCode 250) |
| Label | Novelist |
| Launcher | `it.returntrue.novelist.MainActivity` |
| Min / target SDK | 24 (Android 7.0) / 36 |
| ABI | **arm64-v8a only** (no armeabi-v7a, no x86/x86_64) |
| Framework | Flutter (engine `3.12.1`, release AOT) |
| Permissions | `INTERNET`, `USE_BIOMETRIC`, `USE_FINGERPRINT` |
| `.apks` SHA-256 | `9c603e129d0973e6ebd518f5ba9197557fe376418e273c1acdebed1a5fcd04e8` |

## Install it

`Novelist-2026.1.19.apks` is an **Android App Bundle split set**, not a single APK — the app
is split across a base APK plus config splits (language and screen density) and an
arm64 native-code split. All five must be installed together.

**With adb:**

```bash
unzip -o Novelist-2026.1.19.apks -d splits
adb install-multiple -r splits/Novelist-2026.1.19.apk splits/config.*.apk
```

**On the phone:** open the `.apks` with *SAI — Split APKs Installer* (or any split-aware
installer) and install all parts.

Because only arm64-v8a is included, it will not install on an x86_64 emulator
(`INSTALL_FAILED_NO_MATCHING_ABIS`) — use a real 64-bit ARM phone. If you get
`INSTALL_FAILED_UPDATE_INCOMPATIBLE`, the copy already on the phone was signed with a
different key; uninstall it first, and export your projects as `.nov` before you do, because
uninstalling deletes them.

Split checksums (SHA-256):

```
61bed0fc84acd382b384f5def588053086b74f43ebebb568fd720cf96684b24a  Novelist-2026.1.19.apk
a3944c23c96314b4d79b1fe5ba6e9b77bd0d9690f454e9a29b324dd860ecf4fd  config.arm64_v8a.apk
27a0e5c4955d8dc300b8a19c4943c2fcfd0de56b2437113013a721b75c000034  config.en.apk
860c3cf54beee11250f3fe57780e78e8becc896557f9a0e05b8e48a5dd596eb5  config.es.apk
91be3a828ff943e8d58f671d5188da13d269aaba1f590888b83cb26937838d89  config.xxhdpi.apk
```

## What is inside `extracted/`

Every file of every split, unpacked:

```
extracted/
├── base/                     the base APK's contents
│   ├── AndroidManifest.xml   binary XML (compiled, not text)
│   ├── classes.dex           2.2 MB — Flutter/Android glue + plugins (Kotlin/Java)
│   ├── resources.arsc        compiled resource table
│   ├── res/                  icons, layouts, animations, XML config
│   ├── assets/flutter_assets/
│   │   ├── assets/           app data: 13 locales each of faqs_*.json and
│   │   │                     quickstart_*.html (ar bn de en es fr hi id it ja
│   │   │                     pt ru zh), terms_and_conditions*.html,
│   │   │                     privacy_policy*.html, template_empty.json,
│   │   │                     template_standard_novel.json, sample.nov, intro.jpg,
│   │   │                     and 13 illustrations (logo_light/dark, lighthouse,
│   │   │                     bulb, rocket, boat, balloon, cactus, island,
│   │   │                     mountain, planet, telescope, pexels)
│   │   ├── fonts/            MaterialIcons-Regular.otf
│   │   ├── packages/         Font Awesome 7 Free (brands, regular, solid)
│   │   ├── shaders/          Flutter shaders (ink_sparkle, etc.)
│   │   ├── AssetManifest.bin, FontManifest.json, NativeAssetsManifest.json
│   │   └── NOTICES.Z         third-party license bundle
│   └── org/, kotlin/, *.properties   bundled SDK metadata
├── arm64_v8a_lib/arm64-v8a/  the native-code split
│   ├── libapp.so             14 MB — the entire Flutter app, AOT-compiled Dart
│   ├── libflutter.so         12 MB — Flutter engine
│   ├── libsqlite3.so, libsqlite3_connection_pool.so
│   ├── libdartjni.so, libdatastore_shared_counter.so
├── config.en/                English language resources
├── config.es/                Spanish language resources
└── config.xxhdpi/            xxhdpi density resources
```

## What cannot be extracted

There is **no Dart/Flutter source code in this package**, and no tool can produce it:

- A release Flutter build compiles Dart ahead of time into `libapp.so` — arm64 machine code.
  There is no `kernel_blob.bin` (the Dart intermediate representation) in a release APK.
- Consequently the UI, the editor, the `.nov` handling and every other behaviour exist only
  as native instructions and data. You can inspect the extracted assets, strings, resources
  and manifests, but you cannot rebuild, modify or recompile the app from them.
- `classes.dex` is only the Android glue and plugin wiring; it calls into Flutter, it does
  not contain the app's logic.

So the way to "have the application" is to install the APK set above — it *is* the app.

## Rights

Novelist is proprietary software by Return True (`it.returntrue.novelist`). This is a personal
copy of a purchased app, kept for inspection and archiving. It is not open source, and the
files here are not licensed for redistribution — if this repository is public, consider
making it private.
