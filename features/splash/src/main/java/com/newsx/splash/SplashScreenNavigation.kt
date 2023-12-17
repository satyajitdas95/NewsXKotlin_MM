package com.newsx.splash

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val splashScreenRoute = "splashScreenRoute"

fun NavGraphBuilder.splashScreen(
    onCompletedTimer:()->Unit
){
    composable(route = splashScreenRoute){
        SplashScreenRoute(
            onCompletedTimer = onCompletedTimer
        )
    }
}