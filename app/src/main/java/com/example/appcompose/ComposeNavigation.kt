package com.example.appcompose

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.appcompose.appBar.Screen2

@Composable
fun ComposeNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Destination.HomeScreen.route) {
        composable(Destination.HomeScreen.route) { HomeScreen(navController) }
        composable(Destination.AppBarBottom.route) { Screen2(navController) }
        composable(Destination.ScreenThird.route) { Screen3(navController) }
        composable(Destination.ScreenFourth.route) { Screen4(navController) }
        composable(Destination.ScreenFive.route) { Screen5(navController) }
    }
}
