plugins {
    id(Plugins.Id.library)
    id(Plugins.Id.hilt)
    kotlin(Plugins.Kotlin.android)
    kotlin(Plugins.Kotlin.kapt)
}

android {
    compileSdk = Constants.compileSdk

    defaultConfig {
        minSdk = Constants.minSdk
        targetSdk = Constants.targetSdkVersion

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
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Dependencies.AndroidX.Compose.composeVersion
    }
}

dependencies {
    // Modules
    implementation(project(Modules.core))
    implementation(project(Modules.coreUi))
    implementation(project(Modules.coinFeatureApi))

    implementation(Dependencies.AndroidX.coreKtx)
    implementation(Dependencies.AndroidX.appCompat)
    implementation(Dependencies.AndroidX.lifecycle)
    implementation(Dependencies.AndroidX.activityCompose)
    implementation(Dependencies.Google.androidMaterial)
    implementation(Dependencies.Google.accompanistFlowlayout)

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

    // Network
    implementation(Dependencies.Retrofit.retrofit)
    implementation(Dependencies.Retrofit.converterGson)
    implementation(Dependencies.OkHTTP.okHTTP)
    implementation(Dependencies.OkHTTP.logginInterceptor)
}