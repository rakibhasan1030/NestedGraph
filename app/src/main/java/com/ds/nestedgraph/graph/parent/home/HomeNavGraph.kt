package com.ds.nestedgraph.graph.parent.home

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.ds.nestedgraph.content.BottomBarItem
import com.ds.nestedgraph.graph.parent.home.a_details.screenANestedNavGraph
import com.ds.nestedgraph.graph.root.Graph.A_NESTED
import com.ds.nestedgraph.graph.root.Graph.HOME
import com.ds.nestedgraph.ui.screens.home.ScreenA
import com.ds.nestedgraph.ui.screens.home.ScreenB

@Composable
fun HomeNavGraph(
    mainNavController: NavHostController,
    bottomNavController: NavHostController,
) {
    NavHost(
        navController = bottomNavController,
        route = HOME,
        startDestination = BottomBarItem.ScreenA.route
    ) {

        composable(
            route = BottomBarItem.ScreenA.route
        ) {
            ScreenA(
                onForward = {
                    bottomNavController.navigate(A_NESTED)
                }
            )
        }

        composable(
            route = BottomBarItem.ScreenB.route
        ) {
            ScreenB(

            )
        }

        // nested graphs

        screenANestedNavGraph(
            navController = bottomNavController
        )

    }
}