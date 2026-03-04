plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.compose)

    /**
     * DAGGER HILT -> INYECCION DE DEPENDENCIAS
     */
    id("com.google.devtools.ksp")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.application.ecommerceappmvvm"
    compileSdk {
        version = release(36) {
            minorApiLevel = 1
        }
    }

    defaultConfig {
        applicationId = "com.application.ecommerceappmvvm"
        minSdk = 24
        targetSdk = 36
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11

        /**
         * Hilt usa funciones de Java 8
         *
         * sourceCompatibility = JavaVersion.VERSION_1_8
         * targetCompatibility = JavaVersion.VERSION_1_8
         */
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.compose.material3)

    /**
     * NAVIGATION COMPOSE
     * buscar en web -> navigation compose implementation y sincronizar con Sync Now
     */
    implementation(libs.androidx.navigation.compose)

    /**
     * DAGGER HILT - INYECCION DE DEPENDENCIAS
     * Buscar en google Dagger Hilt -> Dependency injection with Hilt
     */
    implementation(libs.hilt.android)
    /**
     * DAGGER NAVIGATION COMPOSE
     * Buscar en google dagger hilt navigation compose
     * seleccionar hilt jetpack -> Hilt-Navigation-Compose
     */
    implementation(libs.androidx.hilt.navigation.compose)
    ksp(libs.hilt.android.compiler)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
    debugImplementation(libs.androidx.compose.ui.tooling)
    debugImplementation(libs.androidx.compose.ui.test.manifest)
}