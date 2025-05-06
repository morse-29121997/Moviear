# Moviear

This is a Kotlin Multiplatform project targeting Android, iOS.

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - `commonMain` is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    `iosMain` would be the right folder for such calls.

* `/iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform, 
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.

Project Resources :

* API from TMDP.org [Movies TMDP API](https://developer.themoviedb.org/reference/intro/getting-started)
* Design from Figma by Cielo [Figma Resource File](https://www.figma.com/community/file/1342073736688756940/moviear)
* Tasks Tracking and Plan for next steps [Notion](https://www.notion.so/Moviear-Application-1e295ef762988092bb28dc9c9b09b2b5?pvs=4))

Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)…
