# Android Architecture Samples

These samples showcase different architectural approaches to developing Android apps. In its different branches you'll find the same app (a TODO app) implemented with small differences.

In this branch you'll find:
*   User Interface built with **[Jetpack Compose](https://developer.android.com/jetpack/compose)** 
*   A single-activity architecture, using **[Navigation Compose](https://developer.android.com/jetpack/compose/navigation)**.
*   A presentation layer that contains a Compose screen (View) and a **ViewModel** per screen (or feature).
*   Reactive UIs using **[Flow](https://developer.android.com/kotlin/flow)** and **[coroutines](https://kotlinlang.org/docs/coroutines-overview.html)** for asynchronous operations.
*   A **data layer** with a repository and two data sources (local using Room and a fake remote).
*   Two **product flavors**, `mock` and `prod`, [to ease development and testing](https://android-developers.googleblog.com/2015/12/leveraging-product-flavors-in-android.html).
*   A collection of unit, integration and e2e **tests**, including "shared" tests that can be run on emulator/device.
*   Dependency injection using [Hilt](https://developer.android.com/training/dependency-injection/hilt-android).

## Screenshots

<img src="screenshots/screenshots.png" alt="Screenshot">

## Why a to-do app?
# Add Hello World Feature

This update introduces a Hello World screen using Jetpack Compose. The screen is integrated into the main activity and tested to ensure it displays correctly.

### Features
* A simple Hello World display
* Integrated with activity navigation
* Tested for display functionality