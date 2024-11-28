package com.ds.nestedgraph.graph.parent.home

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.ds.nestedgraph.graph.root.Graph.HOME
import com.ds.nestedgraph.ui.screens.home.ScreenA
import com.ds.nestedgraph.ui.screens.home.ScreenB

fun NavGraphBuilder.homeNavGraph(
    navController: NavHostController,
) {
    navigation(
        route = HOME,
        startDestination = HomeScreen.ScreenA.route
    ) {

        composable(
            route = HomeScreen.ScreenA.route
        ) {
            ScreenA(

            )
        }

        composable(
            route = HomeScreen.ScreenA.route
        ) {
            ScreenB(

            )
        }

    }
}

sealed class HomeScreen(val route: String) {
    data object ScreenA : HomeScreen(route = "A")
    data object ScreenB : HomeScreen(route = "B")
}
