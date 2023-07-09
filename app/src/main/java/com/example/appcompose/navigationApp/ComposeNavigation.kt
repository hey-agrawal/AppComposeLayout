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
import com.example.appcompose.screens.buttons.ButtonSample
import com.example.appcompose.screens.buttons.ButtonWithIconSample
import com.example.appcompose.screens.buttons.Buttons
import com.example.appcompose.screens.buttons.OutlinedButtonSample
import com.example.appcompose.screens.buttons.TextButtonsSample
import com.example.appcompose.screens.cards.CardSample
import com.example.appcompose.screens.cards.Cards
import com.example.appcompose.screens.cards.ClickableCardSample
import com.example.appcompose.screens.checkBoxes.CheckBoxes
import com.example.appcompose.screens.checkBoxes.CheckBoxesSample
import com.example.appcompose.screens.checkBoxes.TriStateCheckBoxSample
import com.example.appcompose.screens.chips.ChipGroupReflowSample
import com.example.appcompose.screens.chips.Chips
import com.example.appcompose.screens.chips.ChipsGroupSingleLineSample
import com.example.appcompose.screens.chips.ChipsSample
import com.example.appcompose.screens.chips.OutlinedChipWithIconSample
import com.example.appcompose.screens.dialogs.AlertDialogSample
import com.example.appcompose.screens.dialogs.CustomAlertDialogSample
import com.example.appcompose.screens.dialogs.Dialogs
import com.example.appcompose.screens.floatingActionsButtons.FloatingActionButtons
import com.example.appcompose.screens.floatingActionsButtons.FluidExtendedFab
import com.example.appcompose.screens.floatingActionsButtons.SimpleExtendedFabNoIcon
import com.example.appcompose.screens.floatingActionsButtons.SimpleExtendedFabWithIcon
import com.example.appcompose.screens.floatingActionsButtons.SimpleFab
import com.example.appcompose.screens.menus.ExposedDropDownMenuSample
import com.example.appcompose.screens.menus.MenuSample
import com.example.appcompose.screens.menus.MenuWithScrollStateSample
import com.example.appcompose.screens.menus.Menus
import com.example.appcompose.screens.navigationDrawer.BottomDrawerSample
import com.example.appcompose.screens.navigationDrawer.ModalDrawerSample
import com.example.appcompose.screens.navigationDrawer.NavigationDrawer
import com.example.appcompose.screens.navigationRail.CompactNavigationRailSimple
import com.example.appcompose.screens.navigationRail.NavigationRail
import com.example.appcompose.screens.navigationRail.NavigationRailBottomAlignSimple
import com.example.appcompose.screens.navigationRail.NavigationRailSample
import com.example.appcompose.screens.navigationRail.NavigationRailWithOnlySelectedLabels
import com.example.appcompose.screens.progressIndicators.CircularProgressIndicators
import com.example.appcompose.screens.progressIndicators.LinearProgressIndicators
import com.example.appcompose.screens.progressIndicators.ProgressIndicators

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

        // Buttons
        composable(Destination.Buttons.route){ Buttons(navController)}
        composable(Destination.ButtonSample.route){ ButtonSample(navController) }
        composable(Destination.ButtonWithIconSample.route){ ButtonWithIconSample(navController) }
        composable(Destination.OutlinedButtonSample.route){ OutlinedButtonSample(navController) }
        composable(Destination.TextButtonsSample.route){ TextButtonsSample(navController) }


        //Floating Actions Buttons
        composable(Destination.FloatingActionButtons.route){ FloatingActionButtons(navController)}
        composable(Destination.FluidExtendedFab.route){ FluidExtendedFab(navController)}
        composable(Destination.SimpleExtendedFabNoIcon.route) { SimpleExtendedFabNoIcon(navController)}
        composable(Destination.SimpleExtendedFabWithIcon.route){ SimpleExtendedFabWithIcon(navController)}
        composable(Destination.SimpleFab.route){ SimpleFab(navController)}


        //Cards
        composable(Destination.Cards.route){ Cards(navController )}
        composable(Destination.CardSample.route){ CardSample(navController)}
        composable(Destination.ClickableCardSample.route){ ClickableCardSample(navController)}


        //Check boxes
        composable(Destination.CheckBoxes.route){ CheckBoxes(navController)}
        composable(Destination.CheckBoxesSample.route){ CheckBoxesSample(navController)}
        composable(Destination.TriStateCheckBoxSample.route){ TriStateCheckBoxSample(navController)}



        //Chips
        composable(Destination.ChipGroupReflowSample.route){ ChipGroupReflowSample(navController)}
        composable(Destination.Chips.route){ Chips(navController)}
        composable(Destination.ChipSample.route){ ChipsSample(navController)}
        composable(Destination.ChipsGroupSingleLineSample.route){ ChipsGroupSingleLineSample(navController)}
        composable(Destination.OutlinedChipWithIconSample.route){ OutlinedChipWithIconSample(navController)}

        //dialog
        composable(Destination.AlertDialogSample.route){ AlertDialogSample(navController)}
        composable(Destination.CustomAlertDialogSample.route){ CustomAlertDialogSample(navController)}
        composable(Destination.Dialogs.route){ Dialogs(navController)}


        //Menus
        composable(Destination.ExposedDropDownMenuSample.route){ ExposedDropDownMenuSample(navController)}
        composable(Destination.Menus.route){ Menus(navController)}
        composable(Destination.MenuSample.route){ MenuSample(navController)}
        composable(Destination.MenuWithScrollStateSample.route){ MenuWithScrollStateSample(navController)}

        //Navigation Drawer
        composable(Destination.BottomDrawerSample.route){ BottomDrawerSample(navController )}
        composable(Destination.ModalDrawerSample.route){ ModalDrawerSample(navController)}
        composable(Destination.NavigationDrawer.route){ NavigationDrawer(navController)}

        //Progress Indicators
        composable(Destination.CircularProgressIndicators.route){ CircularProgressIndicators(navController)}
        composable(Destination.LinearProgressIndicators.route){ LinearProgressIndicators(navController)}
        composable(Destination.ProgressIndicators.route){ ProgressIndicators(navController)}


        //old app normal navigation
        composable(Destination.ScreenThird.route) { Screen3(navController) }
        composable(Destination.ScreenFourth.route) { Screen4(navController) }
        composable(Destination.ScreenFive.route) { Screen5(navController) }

    }
}
