@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.iamkamrul.android.library)
    alias(libs.plugins.iamkamrul.android.hilt)
    alias(libs.plugins.iamkamrul.android.retrofit)
}
android {
    namespace = "com.satyajit.di"
}
dependencies {
    api(libs.log.timber)
    api(libs.bundles.network)
}
