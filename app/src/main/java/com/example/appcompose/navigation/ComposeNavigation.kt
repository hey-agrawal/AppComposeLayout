package com.example.appcompose

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.appcompose.screens.appBar.AppBarBottom
import com.example.appcompose.screens.appBar.SimpleBottomAppBar
import com.example.appcompose.navigation.Destination
import com.example.appcompose.screens.HomeScreen
import com.example.appcompose.screens.appBar.AppBarTop
import com.example.appcompose.screens.appBar.SimpleTopAppBar
import com.example.appcompose.screens.backdrop.BackDrop
import com.example.appcompose.screens.backdrop.BackDropScaffoldSample
import com.example.appcompose.screens.badge.Badge
import com.example.appcompose.screens.badge.BottomNavigationItemWithBadge

@Composable
fun ComposeNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Destination.HomeScreen.route) {
        //Homescreen
        composable(Destination.HomeScreen.route) { HomeScreen(navController) }

        //AppBars
        composable(Destination.AppBarBottom.route) { AppBarBottom(navController) }
        composable(Destination.SimpleBottomAppBar.route){ SimpleBottomAppBar(navController) }
        composable(Destination.AppBarTop.route){ AppBarTop(navController)}
        composable(Destination.SimpleTopAppBar.route){ SimpleTopAppBar(navController)}


        //backdrop Scaffold
        composable(Destination.BackDrop.route){ BackDrop(navController)}
        composable(Destination.BackDropScaffoldSample.route){ BackDropScaffoldSample(navController) }

        //Badge
        composable(Destination.Badge.route){ Badge(navController)}
        composable(Destination.BottomNavigationItemWithBadge.route) { BottomNavigationItemWithBadge(navController)}


        //normal navigation
        composable(Destination.ScreenThird.route) { Screen3(navController) }
        composable(Destination.ScreenFourth.route) { Screen4(navController) }
        composable(Destination.ScreenFive.route) { Screen5(navController) }

    }
}
