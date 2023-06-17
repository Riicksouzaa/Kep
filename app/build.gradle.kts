plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.android.kotlin)
}

@Suppress("UnstableApiUsage") android {
    namespace = "com.codenome.kep"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.codenome.kep"
        minSdk = 33
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        named("release") {
            isMinifyEnabled = false
            setProguardFiles(listOf(getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"))
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {

    implementation(libs.androidx.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.google.material)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.test.junit)
    androidTestImplementation(libs.androidx.junitext)
    androidTestImplementation(libs.androidx.espresso)
}