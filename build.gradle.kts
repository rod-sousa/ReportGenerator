// Top-level build file. Só declara os plugins (com versão fixada no catálogo) que os
// módulos aplicam; nenhum módulo além de :app existe ainda (ADR §8, task T-03).
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.kotlin.compose) apply false
    alias(libs.plugins.kotlin.serialization) apply false
    alias(libs.plugins.ksp) apply false
    alias(libs.plugins.androidx.room) apply false
    alias(libs.plugins.detekt) apply false
    alias(libs.plugins.spotless) apply false
}