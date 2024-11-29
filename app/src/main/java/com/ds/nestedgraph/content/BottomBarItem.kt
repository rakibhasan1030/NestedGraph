package com.ds.nestedgraph.content

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarItem(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object ScreenA : BottomBarItem(
        route = "ScreenA",
        title = "Screen A",
        icon = Icons.Default.Home
    )
    object ScreenB : BottomBarItem(
        route = "ScreenB",
        title = "Screen B",
        icon = Icons.Default.Star
    )
}
