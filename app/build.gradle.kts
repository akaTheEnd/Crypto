plugins {
    id(Plugins.Id.application)
    id(Plugins.Id.hilt)
    kotlin(Plugins.Kotlin.android)
    kotlin(Plugins.Kotlin.kapt)
}

android {
    compileSdk = Constants.compileSdk

    defaultConfig {
        applicationId = "com.nikede.crypto"
        minSdk = Constants.minSdk
        targetSdk = Constants.targetSdkVersion
        versionCode = Constants.versionCode
        versionName = Constants.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Dependencies.AndroidX.Compose.composeVersion
    }
    packagingOptions {
        resources {
            excludes.add("/META-INF/{AL2.0,LGPL2.1}")
        }
    }
}

dependencies {
    // Modules
    implementation(project(Modules.core))
    implementation(project(Modules.coreUi))
    implementation(project(Modules.coinFeatureApi))
    implementation(project(Modules.coinFeatureImpl))

    implementation(Dependencies.AndroidX.coreKtx)
    implementation(Dependencies.AndroidX.appCompat)
    implementation(Dependencies.AndroidX.lifecycle)
    implementation(Dependencies.AndroidX.activityCompose)
    implementation(Dependencies.Google.androidMaterial)

    // Compose
    implementation(Dependencies.AndroidX.Compose.material)
    implementation(Dependencies.AndroidX.Compose.UI.ui)
    implementation(Dependencies.AndroidX.Compose.UI.uiToolingPreview)
    implementation(Dependencies.AndroidX.Compose.navigation)

    // Hilt
    implementation(Dependencies.Hilt.core)
    implementation(Dependencies.Hilt.navigationCompose)
    implementation(Dependencies.Hilt.viewModelLifecycle)
    kapt(Dependencies.Hilt.compiler)
    kapt(Dependencies.Hilt.daggerAndroidCompiler)
}