1 plugins {
    id(Plugins.AGP.application)
    id(Plugins.Kotlin.kotlin)

    id(Plugins.Kotlin.kapt)
    id(Plugins.Dagger.hilt)
}

android {
    namespace = "com.example.test"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.test"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            minifyEnabled = Dependencies.MinifyEnabled.isMinifyEnabled
            proguardFiles(
                getDefaultProguardFile(
                    "proguard-android-optimize.txt"
                ), "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = '1.8'
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(Dependencies.UI.androidCore)
    implementation(Dependencies.UI.appCompat)
    implementation(Dependencies.UI.material)
    implementation(Dependencies.UI.constraintLayout)
    testImplementation(Dependencies.UI.jUnit)
    androidTestImplementation(Dependencies.UI.androidJUnit)
    androidTestImplementation(Dependencies.UI.espresso)

    implementation(Dependencies.UI.fragment)

    // Room
    implementation(Dependencies.Room.runTime)
    kapt(Dependencies.Room.compilation)
    implementation(Dependencies.Room.room)

    //Dagger-Hilt
    implementation(Dependencies.DaggerHilt.hiltAndroid)
    kapt(Dependencies.DaggerHilt.hiltCompiler)

    //Kotlin Coroutines
    implementation(Dependencies.KotlinCoroutines.coroutinesAndroid)
    implementation(Dependencies.KotlinCoroutines.coroutinesCore)

    //ViewBindingDelegate
    implementation(Dependencies.ViewBindingDelegate.delegate)

    // NavComponents
    implementation(Dependencies.NavComponents.fragment)
    implementation(Dependencies.NavComponents.ui)

    // Lifecycle
    implementation(Dependencies.Lifecycle.viewModel)
    implementation(Dependencies.Lifecycle.runTime)

}