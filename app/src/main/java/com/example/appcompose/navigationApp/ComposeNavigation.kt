package com.example.appcompose.navigationApp

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.appcompose.Screen3
import com.example.appcompose.Screen4
import com.example.appcompose.Screen5
import com.example.appcompose.screens.appBar.AppBarBottom
import com.example.appcompose.screens.appBar.SimpleBottomAppBar
import com.example.appcompose.screens.HomeScreen
import com.example.appcompose.screens.appBar.AppBarTop
import com.example.appcompose.screens.appBar.SimpleTopAppBar
import com.example.appcompose.screens.backdrop.BackDrop
import com.example.appcompose.screens.backdrop.BackDropScaffoldSample
import com.example.appcompose.screens.badge.Badge
import com.example.appcompose.screens.badge.BottomNavigationItemWithBadge
import com.example.appcompose.screens.bottomNavigating.BottomNavigation
import com.example.appcompose.screens.bottomNavigating.BottomNavigationSample
import com.example.appcompose.screens.bottomNavigating.BottomNavigationWithOnlySelectedLabelsSamples
import com.example.appcompose.screens.navigationRail.CompactNavigationRailSimple
import com.example.appcompose.screens.navigationRail.NavigationRail
import com.example.appcompose.screens.navigationRail.NavigationRailBottomAlignSimple
import com.example.appcompose.screens.navigationRail.NavigationRailSample
import com.example.appcompose.screens.navigationRail.NavigationRailWithOnlySelectedLabels

@Composable
fun ComposeNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Destination.HomeScreen.route) {
        //Home-screen
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


        //bottom navigating
        composable(Destination.BottomNavigation.route){ BottomNavigation(navController)}
        composable(Destination.BottomNavigationSample.route){ BottomNavigationSample(navController)}
        composable(Destination.BottomNavigationWithOnlySelectedLabelsSamples.route){ BottomNavigationWithOnlySelectedLabelsSamples(navController)}


        //Navigation Rail
        composable(Destination.CompactNavigationRailSimple.route){ CompactNavigationRailSimple(navController)}
        composable(Destination.NavigationRail.route){ NavigationRail(navController)}
        composable(Destination.NavigationRailBottomAlignSimple.route){ NavigationRailBottomAlignSimple(navController)}
        composable(Destination.NavigationRailSimple.route){ NavigationRailSample(navController)}
        composable(Destination.NavigationRailWithOnlySelectedLabels.route){ NavigationRailWithOnlySelectedLabels(navController)}



        //old app normal navigation
        composable(Destination.ScreenThird.route) { Screen3(navController) }
        composable(Destination.ScreenFourth.route) { Screen4(navController) }
        composable(Destination.ScreenFive.route) { Screen5(navController) }

    }
}
