/*
    File of gradle constants
 */
object Dependencies {

    object AndroidX {
        const val coreKtx = "androidx.core:core-ktx:1.7.0"
        const val appCompat = "androidx.appcompat:appcompat:1.4.0"
        const val activityCompose = "androidx.activity:activity-compose:1.4.0"
        const val lifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:2.4.0"
        const val datastore = "androidx.datastore:datastore-preferences:1.0.0"

        object Compose {
            const val composeVersion = "1.0.5"

            const val material = "androidx.compose.material:material:$composeVersion"

            object UI {
                const val ui = "androidx.compose.ui:ui:$composeVersion"
                const val uiToolingPreview =
                    "androidx.compose.ui:ui-tooling-preview:$composeVersion"
            }

            const val navigation = "androidx.navigation:navigation-compose:2.4.0-rc01"
        }
    }

    object Google {
        const val androidMaterial = "com.google.android.material:material:1.4.0"
        const val accompanistFlowlayout = "com.google.accompanist:accompanist-flowlayout:0.17.0"
    }

    object Hilt {
        const val core = "com.google.dagger:hilt-android:2.38.1"
        const val daggerAndroidCompiler = "com.google.dagger:hilt-android-compiler:2.37"
        const val navigationCompose = "androidx.hilt:hilt-navigation-compose:1.0.0-rc01"
        const val viewModelLifecycle = "androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03"
        const val compiler = "androidx.hilt:hilt-compiler:1.0.0"
        const val gradlePlugin = "com.google.dagger:hilt-android-gradle-plugin:2.38.1"
    }

    object Retrofit {
        private const val retrofitVersion = "2.9.0"

        const val retrofit = "com.squareup.retrofit2:retrofit:$retrofitVersion"
        const val converterGson = "com.squareup.retrofit2:converter-gson:$retrofitVersion"
    }

    object OkHTTP {
        private const val okHTTPVersion = "5.0.0-alpha.2"

        const val okHTTP = "com.squareup.okhttp3:okhttp:$okHTTPVersion"
        const val logginInterceptor = "com.squareup.okhttp3:logging-interceptor:$okHTTPVersion"
    }
}

object Constants {
    const val kotlinVersion = "1.5.31"
    const val gradleVersion = "7.0.4"

    const val minSdk = 21
    const val targetSdkVersion = 31
    const val compileSdk = 31
    const val versionCode = 1
    const val versionName = "1.0"
}

object Modules {
    const val core = ":core"
    const val coreUi = ":core-ui"
    const val coinFeatureApi = ":feature-coin-api"
    const val coinFeatureImpl = ":feature-coin-impl"
}

object Plugins {

    object Id {
        const val application = "com.android.application"
        const val library = "com.android.library"
        const val hilt = "dagger.hilt.android.plugin"
    }

    object Kotlin {
        const val android = "android"
        const val kapt = "kapt"
    }
}