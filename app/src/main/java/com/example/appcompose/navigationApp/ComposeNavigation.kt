package com.example.appcompose.navigationApp

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.appcompose.screens2.appBar.AppBarBottom
import com.example.appcompose.screens2.appBar.SimpleBottomAppBar
import com.example.appcompose.HomeScreen
import com.example.appcompose.screens2.appBar.AppBarTop
import com.example.appcompose.screens2.appBar.SimpleTopAppBar
import com.example.appcompose.screens2.backdrop.BackDrop
import com.example.appcompose.screens2.backdrop.BackDropScaffoldSample
import com.example.appcompose.screens2.badge.Badge
import com.example.appcompose.screens2.badge.BottomNavigationItemWithBadge
import com.example.appcompose.screens2.bottomNavigating.BottomNavigation
import com.example.appcompose.screens2.bottomNavigating.BottomNavigationSample
import com.example.appcompose.screens2.bottomNavigating.BottomNavigationWithOnlySelectedLabelsSamples
import com.example.appcompose.screens2.buttons.ButtonSample
import com.example.appcompose.screens2.buttons.ButtonWithIconSample
import com.example.appcompose.screens2.buttons.Buttons
import com.example.appcompose.screens2.buttons.OutlinedButtonSample
import com.example.appcompose.screens2.buttons.TextButtonsSample
import com.example.appcompose.screens2.cards.CardSample
import com.example.appcompose.screens2.cards.Cards
import com.example.appcompose.screens2.cards.ClickableCardSample
import com.example.appcompose.screens2.checkBoxes.CheckBoxes
import com.example.appcompose.screens2.checkBoxes.CheckBoxesSample
import com.example.appcompose.screens2.checkBoxes.TriStateCheckBoxSample
import com.example.appcompose.screens2.chips.ChipGroupReflowSample
import com.example.appcompose.screens2.chips.Chips
import com.example.appcompose.screens2.chips.ChipsGroupSingleLineSample
import com.example.appcompose.screens2.chips.ChipsSample
import com.example.appcompose.screens2.chips.OutlinedChipWithIconSample
import com.example.appcompose.screens2.dialogs.AlertDialogSample
import com.example.appcompose.screens2.dialogs.CustomAlertDialogSample
import com.example.appcompose.screens2.dialogs.Dialogs
import com.example.appcompose.screens2.floatingActionsButtons.FloatingActionButtons
import com.example.appcompose.screens2.floatingActionsButtons.FluidExtendedFab
import com.example.appcompose.screens2.floatingActionsButtons.SimpleExtendedFabNoIcon
import com.example.appcompose.screens2.floatingActionsButtons.SimpleExtendedFabWithIcon
import com.example.appcompose.screens2.floatingActionsButtons.SimpleFab
import com.example.appcompose.screens2.material.Material2
import com.example.appcompose.screens2.material.Material3
import com.example.appcompose.screens2.menus.ExposedDropDownMenuSample
import com.example.appcompose.screens2.menus.MenuSample
import com.example.appcompose.screens2.menus.MenuWithScrollStateSample
import com.example.appcompose.screens2.menus.Menus
import com.example.appcompose.screens2.navigationDrawer.BottomDrawerSample
import com.example.appcompose.screens2.navigationDrawer.ModalDrawerSample
import com.example.appcompose.screens2.navigationDrawer.NavigationDrawer
import com.example.appcompose.screens2.navigationRail.CompactNavigationRailSimple
import com.example.appcompose.screens2.navigationRail.NavigationRail
import com.example.appcompose.screens2.navigationRail.NavigationRailBottomAlignSimple
import com.example.appcompose.screens2.navigationRail.NavigationRailSample
import com.example.appcompose.screens2.navigationRail.NavigationRailWithOnlySelectedLabels
import com.example.appcompose.screens2.progressIndicators.CircularProgressIndicators
import com.example.appcompose.screens2.progressIndicators.LinearProgressIndicators
import com.example.appcompose.screens2.progressIndicators.ProgressIndicators
import com.example.appcompose.screens2.radioButtons.RadioButtons
import com.example.appcompose.screens2.radioButtons.RadioButtonsSample
import com.example.appcompose.screens2.radioButtons.RadioGroupSample
import com.example.appcompose.screens2.sheetsBottom.BottomSheetScaffoldSample
import com.example.appcompose.screens2.sheetsBottom.ModalBottomSheetSample
import com.example.appcompose.screens2.sheetsBottom.SheetsBottom
import com.example.appcompose.screens2.sliders.RangeSliderSample
import com.example.appcompose.screens2.sliders.SliderSample
import com.example.appcompose.screens2.sliders.Sliders
import com.example.appcompose.screens2.sliders.StepRangeSliderSample
import com.example.appcompose.screens2.snackbar.ScaffoldWithCoroutinesSnackbar
import com.example.appcompose.screens2.snackbar.ScaffoldWithCustomSnackBar
import com.example.appcompose.screens2.snackbar.ScaffoldWithSimpleSnackbar
import com.example.appcompose.screens2.snackbar.SnackBars
import com.example.appcompose.screens2.switches.SwitchSample
import com.example.appcompose.screens2.switches.Switches
import com.example.appcompose.screens2.tabs.FancyIndicatorsContainerTabs
import com.example.appcompose.screens2.tabs.FancyIndicatorsTabs
import com.example.appcompose.screens2.tabs.FancyTabs
import com.example.appcompose.screens2.tabs.IconTabs
import com.example.appcompose.screens2.tabs.LeadingIconTabs
import com.example.appcompose.screens2.tabs.ScrollingFancyIndicatorsContainerTabs
import com.example.appcompose.screens2.tabs.ScrollingTextTabs
import com.example.appcompose.screens2.tabs.Tabs
import com.example.appcompose.screens2.tabs.TextAndIconTab
import com.example.appcompose.screens2.tabs.TextTabs
import com.example.appcompose.screens2.textFields.OutlinedTextFieldSample
import com.example.appcompose.screens2.textFields.PasswordTextField
import com.example.appcompose.screens2.textFields.SimpleOutlinedTextFieldSample
import com.example.appcompose.screens2.textFields.SimpleTextFieldSample
import com.example.appcompose.screens2.textFields.TextArea
import com.example.appcompose.screens2.textFields.TextFieldSample
import com.example.appcompose.screens2.textFields.TextFieldWithErrorState
import com.example.appcompose.screens2.textFields.TextFieldWithHelperMessage
import com.example.appcompose.screens2.textFields.TextFieldWithHideKeyboardOnImeAction
import com.example.appcompose.screens2.textFields.TextFieldWithIcons
import com.example.appcompose.screens2.textFields.TextFieldWithPlaceHolder
import com.example.appcompose.screens2.textFields.TextFields

@Composable
fun ComposeNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Destination.HomeScreen.route) {
        //Home-screen
        composable(Destination.Material2.route) { Material2(navController) }

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

        //Radio Buttons
        composable(Destination.RadioButtons.route){ RadioButtons(navController) }
        composable(Destination.RadioButtonSample.route){ RadioButtonsSample(navController) }
        composable(Destination.RadioGroupSample.route){ RadioGroupSample(navController) }

        //Bottom Sheet

        composable(Destination.BottomSheetScaffoldSample.route){ BottomSheetScaffoldSample(navController) }
        composable(Destination.ModalBottomSheetSample.route){ ModalBottomSheetSample(navController) }
        composable(Destination.SheetsBottom.route){ SheetsBottom(navController) }


        //Sliders
        composable(Destination.RangeSliderSample.route){ RangeSliderSample(navController)}
        composable(Destination.Sliders.route){ Sliders(navController )}
        composable(Destination.SliderSample.route){ SliderSample(navController)}
        composable(Destination.StepRangeSliderSample.route){ StepRangeSliderSample(navController)}
        composable(Destination.StepsSliderSample.route){ StepRangeSliderSample(navController )}

        //Snack bar
        composable(Destination.ScaffoldWithCustomSnackbar.route){ ScaffoldWithCustomSnackBar(navController)}
        composable(Destination.ScaffoldWithCoroutinesSnackbar.route){ ScaffoldWithCoroutinesSnackbar(navController)}
        composable(Destination.ScaffoldWithSimpleSnackbar.route){ ScaffoldWithSimpleSnackbar(navController)}
        composable(Destination.SnackBars.route){ SnackBars(navController )}


        //Switches
        composable(Destination.Switches.route){ Switches(navController )}
        composable(Destination.SwitchSample.route){ SwitchSample(navController)}

        //tabs
        composable(Destination.FancyIndicatorsContainerTabs.route){ FancyIndicatorsContainerTabs(navController)}
        composable(Destination.FancyIndicatorsTabs.route){ FancyIndicatorsTabs(navController)}
        composable(Destination.FancyTabs.route){ FancyTabs(navController)}
        composable(Destination.IconTabs.route){ IconTabs(navController)}
        composable(Destination.LeadingIconTabs.route){ LeadingIconTabs(navController)}
        composable(Destination.ScrollingFancyIndicatorsContainerTabs.route){ ScrollingFancyIndicatorsContainerTabs(navController)}
        composable(Destination.ScrollingTextTabs.route){ ScrollingTextTabs(navController)}
        composable(Destination.Tabs.route){ Tabs(navController)}
        composable(Destination.TextAndIconTab.route){ TextAndIconTab(navController)}
        composable(Destination.TextTabs.route){ TextTabs(navController)}


        //Text Fields
        composable(Destination.OutlinedTextFieldSample.route){ OutlinedTextFieldSample(navController)}
        composable(Destination.PasswordTextField.route){ PasswordTextField(navController)}
        composable(Destination.SimpleOutlinedTextFieldSample.route){ SimpleOutlinedTextFieldSample(navController)}
        composable(Destination.SimpleTextFieldSample.route){ SimpleTextFieldSample(navController)}
        composable(Destination.TextArea.route){ TextArea(navController)}
        composable(Destination.TextFields.route){ TextFields(navController)}
        composable(Destination.TextFieldSample.route){ TextFieldSample(navController)}
        composable(Destination.TextFieldWithErrorState.route){ TextFieldWithErrorState(navController)}
        composable(Destination.TextFieldWithHelperMessage.route){ TextFieldWithHelperMessage(navController)}
        composable(Destination.TextFieldWithHideKeyboardOnImeAction.route){ TextFieldWithHideKeyboardOnImeAction(navController)}
        composable(Destination.TextFieldWithIcon.route){ TextFieldWithIcons(navController)}
        composable(Destination.TextFieldWithPlaceHolder.route){ TextFieldWithPlaceHolder(navController)}


        // material Navigation
        composable(Destination.HomeScreen.route){ HomeScreen(navController) }
        composable(Destination.Material3.route){ Material3(navController )}

    }
}
