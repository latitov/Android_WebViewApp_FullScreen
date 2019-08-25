# Android_WebViewApp_FullScreen

Ref example to implement web apps on Android using WebView in full screen mode

It's in Kotlin, but otherwise equally applies to Java as well.

This repository demonstrates and provides a reference example of three things at once:

1. How to make full-screen activity
2. How to use WebView, and integrate it with Android backend using JavascriptInterface
3. How to __properly__ make calls back and forth between JS and Android, placing them on UI thread

To make things lightweight, I didn't attach whole Android Studio project, but instead only the essential files that should be placed in an empty project: manifest, layout, and two files with code, and html file (put it into res/assets/ project folder).

This has been tested and _works_. Thus you can rely on it.
