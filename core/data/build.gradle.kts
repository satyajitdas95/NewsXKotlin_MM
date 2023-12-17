@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.satyajit.android.library)
    alias(libs.plugins.satyajit.android.hilt)
}
android {
    namespace = "com.satyajit.data"

}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.core.di)
    api(projects.model.apiresponse)
}