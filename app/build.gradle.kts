plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.aikei.lorby"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.aikei.lorby"
        minSdk = 24
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    val nav_version = "2.7.7"

    //Dagger-Hilt
    implementation("com.google.dagger:hilt-android:2.44")
    kapt("com.google.dagger:hilt-android-compiler:2.44")

    //Basic dependencies
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    // Navigation Component
    implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")
    implementation("androidx.navigation:navigation-ui-ktx:$nav_version")
    implementation("androidx.navigation:navigation-dynamic-features-fragment:$nav_version")

    // Kotlin Standard Library
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // ViewModel and LiveData
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.1")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.5.1")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.5.1")
    // Hilt ViewModel integration
    implementation("androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03")
    kapt("androidx.hilt:hilt-compiler:1.0.0")

    // Retrofit for network operations
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    // Gson converter for Retrofit
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    // If you use Moshi or another serialization library, add its converter accordingly

    // Picasso for image loading, or use Glide if preferred
    implementation("com.squareup.picasso:picasso:2.8")
    // If using Glide:
    // implementation("com.github.bumptech.glide:glide:4.12.0")
    // kapt("com.github.bumptech.glide:compiler:4.12.0")

    // For Kotlin coroutines support, if needed
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4")

    // If using Room for local database
    // implementation("androidx.room:room-runtime:2.4.3")
    // kapt("androidx.room:room-compiler:2.4.3")
    // For Kotlin coroutines support in Room
    // implementation("androidx.room:room-ktx:2.4.3")

}
// Allow references to generated code
kapt {
    correctErrorTypes = true
}