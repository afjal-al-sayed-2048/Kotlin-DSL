plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    compileSdk = AndroidApp.compileSdk

    defaultConfig {
        applicationId = AndroidApp.appid
        minSdk = AndroidApp.minSdk
        targetSdk = AndroidApp.targetSdk
        versionCode = AndroidApp.versionCode
        versionName = AndroidApp.versionName

        testInstrumentationRunner = ExtConfig.test_instrumentation_runner
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName("release") {
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
        useIR = true
    }
    /*buildFeatures {
        compose = true
    }*/
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.compose
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    //kotlin-ktx
    implementation(Libraries.core_ktx)

    //appcom
    implementation(Libraries.appcompat)
    implementation(Libraries.material)

    //compose
    implementation(Libraries.compose_ui)
    implementation(Libraries.compose_material)
    implementation(Libraries.compose_ui_preview)
    implementation(Libraries.activity_compose)

    //lifecycle
    implementation(Libraries.lifecycle_runtime)

    //testing
    testImplementation(Libraries.juni)
    androidTestImplementation(Libraries.ext_junit)
    androidTestImplementation(Libraries.espresso)
    androidTestImplementation(Libraries.compose_ui_test_junit)
    debugImplementation(Libraries.compoose_ui_tooling)
}