@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.satyajit.android.feature.compose)
}

android {
    namespace = "com.newsx.splash"
}
dependencies{
    implementation(libs.image.coil.compose)
    implementation(libs.lottie.animation)
}