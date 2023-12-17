@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.satyajit.android.library)
    alias(libs.plugins.satyajit.android.hilt)
    alias(libs.plugins.satyajit.android.retrofit)
}
android {
    namespace = "com.satyajit.di"
}
dependencies {
    api(libs.log.timber)
    api(libs.bundles.network)
}
