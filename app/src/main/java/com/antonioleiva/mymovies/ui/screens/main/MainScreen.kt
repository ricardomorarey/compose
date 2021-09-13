package com.antonioleiva.mymovies.ui.screens.main

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import coil.annotation.ExperimentalCoilApi
import com.antonioleiva.mymovies.ui.MyMoviesApp

@ExperimentalCoilApi
@ExperimentalFoundationApi
@Composable
fun MainScreen(navController: NavHostController) {
    MyMoviesApp {
        Scaffold(
            topBar = { MainAppBar() }
        ) { padding ->
            MediaList(navController, Modifier.padding(padding))
        }

    }
}