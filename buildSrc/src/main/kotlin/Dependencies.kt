object Versions {
    object UI {
        const val androidCore = "1.9.0"
        const val appCompat = "1.6.0"
        const val material = "1.8.0."
        const val constraintLayout = "2.1.4"
        const val jUnit = "4.13.2"
        const val androidJUnit = "1.1.5"
        const val espresso = "3.5.1"
        const val fragment = "1.5.5"
    }

    const val room = "2.4.3"
    const val daggerHilt = "2.44"
    const val coroutines = "1.6.4"
    const val lifecycle = "2.5.1"
    const val navVersion = "2.5.3"
    const val AGP = "7.3.1"
    const val kotlin = "1.7.20"
}

object Dependencies {

    object MinifyEnabled{
        const val isMinifyEnabled = false
    }

    object UI {
        const val androidCore = "androidx.core:core-ktx:${Versions.UI.androidCore}"
        const val appCompat = "androidx.appcompat:appcompat:${Versions.UI.appCompat}"
        const val material = "com.google.android.material:material:${Versions.UI.material}"
        const val constraintLayout =
            "androidx.constraintlayout:constraintlayout:${Versions.UI.constraintLayout}"
        const val jUnit = "junit:junit:${Versions.UI.jUnit}"
        const val androidJUnit = "androidx.test.ext:junit:${Versions.UI.androidJUnit}"
        const val espresso = "androidx.test.espresso:espresso-core:${Versions.UI.espresso}"
        const val fragment = "androidx.fragment:fragment-ktx:${Versions.UI.fragment}"

    }

    object Room {
        const val runTime = "androidx.room:room-runtime:${Versions.room}"
        const val compilation = "androidx.room:room-compilation:${Versions.room}"
        const val room = "androidx.room:room-ktx${Versions.room}"
    }

    object DaggerHilt {
        const val hiltAndroid = "com.google.dagger:hilt-android:${Versions.daggerHilt}"
        const val hiltCompiler = "com.google.dagger:hilt-compiler:${Versions.daggerHilt}"
    }

    object KotlinCoroutines {
        const val coroutinesAndroid =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
        const val coroutinesCore =
            "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    }

    object NavComponents {
        const val fragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navVersion}"
        const val ui = "androidx.navigation:navigation-ui-ktx:${Versions.navVersion}"
    }

    object Lifecycle {
        const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
        const val runTime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
    }

    object ViewBindingDelegate {
        const val delegate = "com.github.kirich1409:viewbindingpropertydelegate-noreflection:1.5.6"
    }
}

object Plugins {

    object AGP {
        const val application = "com.android.application"
        const val library = "com.android.library"
    }

    object Kotlin {
        const val kotlin = "org.jetbrains.kotlin.android"
        const val kapt = "kotlin-kapt"
    }

    object Dagger {
        const val hilt = "com.google.dagger.hilt.android"
    }

}