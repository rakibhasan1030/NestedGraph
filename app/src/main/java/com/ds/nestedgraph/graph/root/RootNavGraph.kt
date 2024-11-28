package com.ds.nestedgraph.graph.root

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.ds.nestedgraph.graph.parent.auth.authNavGraph
import com.ds.nestedgraph.graph.root.Graph.AUTHENTICATION
import com.ds.nestedgraph.graph.root.Graph.HOME
import com.ds.nestedgraph.graph.root.Graph.ROOT

@Composable
fun RootNavGraph(
    navController: NavHostController,
) {

    val token = "here is your token"

    // Determine the start destination based on whether a token exists
    val startDestination = if (token.isEmpty()) AUTHENTICATION else HOME

    NavHost(
        navController = navController, route = ROOT,
        startDestination = startDestination
    ) {

        authNavGraph(
            navController = navController,
        )

        /*homeNavGraph(
            navController = navController,
            sharedViewModel = sharedViewModel
        )*/

    }
}

object Graph {

    // parent graphs
    const val ROOT = "root_graph"
    const val AUTHENTICATION = "auth_graph"
    const val HOME = "home_graph"

    // nested graphs
    const val QR_GRAPH = "qr_graph"
    const val SECOND_ISSUE_GRAPH = "second_issue_graph"
    const val RECHARGE_GRAPH = "recharge"
    const val CANCEL_RECHARGE_GRAPH = "cancel_recharge"
    const val BALANCE_GRAPH = "balance"
    const val TRANSACTION_HISTORY_GRAPH = "transaction_history_balance"
    const val PENALTY_GRAPH = "penalty"
    const val REFUND_GRAPH = "refund"
    const val REISSUE_REGISTRATION_GRAPH = "reissue_registration"
    const val REISSUE_GRAPH = "reissue"
}
