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

* APIS  [Anime TMDP API](https://docs.google.com/document/d/1SkfY5QrJ9yl-fKKDu4LFYvqTtZ_kPlGA-vbo4whotOk/edit?usp=sharing)
* Design 1 from Figma by Cielo [Figma Resource File](https://www.figma.com/community/file/1342073736688756940/moviear)
* Design 2 from Figma by Cielo [Figma Resource File](https://www.figma.com/design/RACoVdfJDN4wgIBjuiWC0m/Movies-App--Community-?node-id=1-935&t=HXRp99PtLDUb2E3F-0)
* Design 3 from Figma by Cielo [Figma Resource File](https://www.figma.com/design/LMcPLnuxJgMrUNY50Y8Ibe/App-Anime---Movies-NEON-MODE--Community-?t=gWm5l3evPL1jujZp-0)
* Tasks Tracking and Plan for next steps [Notion](https://www.notion.so/Moviear-Application-1e295ef762988092bb28dc9c9b09b2b5?pvs=4))

Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)…
