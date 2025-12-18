# youtube-app

Minimal Android app (Jetpack Compose) that hosts a `WebView`.

Overview
- Entry: `MainActivity` (loads a WebView at runtime)
- Language: Kotlin + Compose
- Build: Gradle wrapper (`gradlew.bat`), AGP 8.5.0

How to build
```powershell
./gradlew.bat assembleDebug
```

APK location: `app/build/outputs/apk/debug/app-debug.apk`

Notes
- Remove `package` attribute from `AndroidManifest.xml` (project uses Gradle `namespace`).
- WebView enables JavaScript; review security before publishing.
