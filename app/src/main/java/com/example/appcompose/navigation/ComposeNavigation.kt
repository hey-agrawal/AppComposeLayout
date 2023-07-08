package com.example.appcompose

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.appcompose.screens.appBar.AppBarBottom
import com.example.appcompose.screens.appBar.SimpleBottomAppBar
import com.example.appcompose.navigation.Destination
import com.example.appcompose.screens.appBar.AppBarTop
import com.example.appcompose.screens.appBar.SimpleTopAppBar

@Composable
fun ComposeNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Destination.HomeScreen.route) {
        composable(Destination.HomeScreen.route) { HomeScreen(navController) }
        composable(Destination.AppBarBottom.route) { AppBarBottom(navController) }
        composable(Destination.SimpleBottomAppBar.route){ SimpleBottomAppBar(navController) }
        composable(Destination.AppBarTop.route){ AppBarTop(navController)}
        composable(Destination.SimpleTopAppBar.route){ SimpleTopAppBar(navController)}
        composable(Destination.ScreenThird.route) { Screen3(navController) }
        composable(Destination.ScreenFourth.route) { Screen4(navController) }
        composable(Destination.ScreenFive.route) { Screen5(navController) }
    }
}
