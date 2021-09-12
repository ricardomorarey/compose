package com.antonioleiva.mymovies.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import coil.annotation.ExperimentalCoilApi
import com.antonioleiva.mymovies.ui.screens.detail.DetailScreen
import com.antonioleiva.mymovies.ui.screens.main.MainScreen

@ExperimentalCoilApi
@ExperimentalFoundationApi
@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "main"
    ) {
        composable("main") {
            MainScreen(navController)
        }
        composable(
            route = "detail/{mediaId}",
            arguments = listOf(navArgument("mediaId") { type = NavType.IntType })
        ) { backStackEntry ->
            val id = backStackEntry.arguments?.getInt("mediaId")
            requireNotNull(id)
            DetailScreen(id)
        }
    }
}