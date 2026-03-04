// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.compose) apply false

    /**
     * DAGGER HILT - INYECCION DE DEPENDENCIAS
     * Buscar en google Dagger Hilt -> Dependency injection with Hilt
     * devtools.ksp se agregó manualmente -> en el curso es version "2.0.21-1.0.27"
     */
    id("com.google.devtools.ksp") version "2.3.6" apply false
    id("com.google.dagger.hilt.android") version "2.59.2" apply false
}