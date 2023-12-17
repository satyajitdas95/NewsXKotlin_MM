package com.satyajit.newsx.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.newsx.splash.splashScreen
import com.newsx.splash.splashScreenRoute
import com.satyajit.profile.navigateToProfileScreen
import com.satyajit.profile.profileScreen
import com.satyajit.repolist.repoListScreen
import com.satyajit.repolist.repoListScreenRoute

@Composable
fun AppNavigation(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination:String = splashScreenRoute
){
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        splashScreen(onCompletedTimer = {} )
        repoListScreen(onRepoItemClick = navController::navigateToProfileScreen)
        profileScreen(onBackBtnClick = navController::popBackStack)
    }
}