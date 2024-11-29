package com.ds.nestedgraph.graph.root

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.ds.nestedgraph.graph.parent.auth.authNavGraph
import com.ds.nestedgraph.graph.root.Graph.AUTHENTICATION
import com.ds.nestedgraph.graph.root.Graph.HOME
import com.ds.nestedgraph.graph.root.Graph.ROOT
import com.ds.nestedgraph.ui.screens.home.BottomBarScreen

@Composable
fun RootNavGraph(
    navController: NavHostController,
) {

    val token = "fetch you token here"
    val startDestination = if (token.isEmpty()) AUTHENTICATION else HOME

    NavHost(
        navController = navController, route = ROOT,
        startDestination = startDestination
    ) {

        authNavGraph(
            navController = navController,
        )

        composable(route = HOME) {
            BottomBarScreen(
                mainNavController = navController,
            )
        }
    }
}

object Graph {

    // parent graphs
    const val ROOT = "root_graph"
    const val AUTHENTICATION = "auth_graph"
    const val HOME = "home_graph"


    // nested graphs
    const val A_NESTED = "a_nested"

}
