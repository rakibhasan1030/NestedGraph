package com.ds.nestedgraph.graph.parent.home.a_details

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.ds.nestedgraph.graph.root.Graph.A_NESTED
import com.ds.nestedgraph.graph.root.Graph.HOME
import com.ds.nestedgraph.ui.screens.home.a_details.ScreenAChildOne
import com.ds.nestedgraph.ui.screens.home.a_details.ScreenAChildThree
import com.ds.nestedgraph.ui.screens.home.a_details.ScreenAChildTwo

fun NavGraphBuilder.screenANestedNavGraph(
    navController: NavHostController,
) {
    navigation(
        route = A_NESTED,
        startDestination = ANestedScreen.ScreenAChild1.route
    ) {

        composable(
            route = ANestedScreen.ScreenAChild1.route
        ) {
            ScreenAChildOne(
                onBackPressed = {
                    navController.navigateUp()
                },
                onForwardPress = {
                    navController.navigate(ANestedScreen.ScreenAChild2.route)
                }
            )
        }

        composable(
            route = ANestedScreen.ScreenAChild2.route
        ) {
            ScreenAChildTwo(
                onBackPressed = {
                    navController.navigateUp()
                },
                onForwardPress = {
                    navController.navigate(ANestedScreen.ScreenAChild3.route)
                }
            )
        }

        composable(
            route = ANestedScreen.ScreenAChild3.route
        ) {
            ScreenAChildThree(
                onBackPressed = {
                    navController.navigateUp()
                },
                onPopOutToFirst = {
                    navController.navigate(HOME) {
                        popUpTo(HOME) { inclusive = true }
                    }
                }
            )
        }

    }
}

sealed class ANestedScreen(val route: String) {
    data object ScreenAChild1 : ANestedScreen(route = "ScreenAChild1")
    data object ScreenAChild2 : ANestedScreen(route = "ScreenAChild2")
    data object ScreenAChild3 : ANestedScreen(route = "ScreenAChild3")
}
