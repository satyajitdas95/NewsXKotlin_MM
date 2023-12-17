@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.satyajit.android.library)
    alias(libs.plugins.satyajit.android.hilt)
}

android {
    namespace = "com.satyajit.domain"
}

dependencies {
    api(projects.model.entity)
    implementation(libs.androidx.corektx)
    implementation(libs.kotlinx.coroutines.android)
}