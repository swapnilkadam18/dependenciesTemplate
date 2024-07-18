plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("org.jetbrains.kotlin.kapt")
    alias(libs.plugins.hilt.compiler)
}

android {
    namespace = "com.swapnil.newstrial"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.swapnil.newstrial"
        minSdk = 28
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    buildFeatures {
        viewBinding = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    // Core
    implementation(libs.core.ktx)
    implementation(libs.appcompat)
    implementation(libs.material)

    //lifecycle
    implementation(libs.lifecycle.runtime.ktx)
    implementation(libs.lifecycle.viewmodel.ktx)
    implementation(libs.lifecycle.livedata.ktx)
    implementation(libs.lifecycle.viewmodel.savedstate)
    implementation(libs.lifecycle.common.java8)
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.fragment.ktx)

    //recycler view
    implementation(libs.recycle.view)
    implementation(libs.recycle.selection)

    //paging
    implementation(libs.paging)

    // Compose
    implementation(libs.compose.ui)
    implementation(libs.compose.material)
    implementation(libs.compose.ui.tooling.preview)
    implementation(libs.activity.compose)
    implementation(libs.compose.foundation)

    // Retrofit
    implementation(libs.retrofit)
    implementation(libs.retrofit.gson)

    // Room
    implementation(libs.room.runtime)
    implementation(libs.androidx.junit.ktx)
    kapt(libs.room.compiler)
    implementation(libs.room.ktx)
    implementation(libs.room.paging)

    // Hilt
    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)
    kaptTest(libs.hilt.compiler)

    // glide
    implementation(libs.glide)

    //swipe refresh
    implementation(libs.swipe.refresh)

    // Testing
    testImplementation(libs.junit)
    testImplementation(libs.mockito.core)
    testImplementation(libs.mockito.inline)
    testImplementation(libs.mockito.kotlin)
    testImplementation(libs.kotlinx.coroutines.test)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.espresso.core)
    testImplementation(libs.hilt.android.test)
    kaptAndroidTest(libs.kapt.android.test)
    androidTestImplementation(libs.compose.ui.test.junit4)
    debugImplementation(libs.compose.ui.tooling)
    debugImplementation(libs.compose.ui.test.manifest)
}