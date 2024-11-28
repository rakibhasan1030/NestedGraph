package com.ds.nestedgraph.graph.parent.auth

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.ds.nestedgraph.graph.root.Graph.AUTHENTICATION
import com.ds.nestedgraph.graph.root.Graph.HOME
import com.ds.nestedgraph.ui.screens.auth.LoginScreen

fun NavGraphBuilder.authNavGraph(
    navController: NavHostController,
) {
    navigation(
        route = AUTHENTICATION,
        startDestination = AuthScreen.Login.route
    ) {
        composable(
            route = AuthScreen.Login.route
        ) {
            LoginScreen(
                onSuccessfulLoggedIn = {
                    navController.navigate(HOME) {
                        popUpTo(AUTHENTICATION) { inclusive = true }
                        launchSingleTop = true
                    }
                }
            )
        }
    }
}

sealed class AuthScreen(val route: String) {
    data object Login : AuthScreen(route = "Login")
}
