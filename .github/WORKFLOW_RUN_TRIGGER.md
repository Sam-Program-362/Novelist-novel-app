# APK builder workflow trigger

This commit exists only to trigger the `apk-builder` GitHub Actions workflow
on `main`.

- Workflow: `.github/workflows/apk-builder.yml`
- Branch: `main`
- Reason: run the APK building workflow now.
- Note: The finalized APK artifact remains on the feature branch
  `freebuff/455862e9a26e7c5c215ab43f` under `artifacts/`.

This file is intentionally small to avoid pushing large binaries to `main`.
