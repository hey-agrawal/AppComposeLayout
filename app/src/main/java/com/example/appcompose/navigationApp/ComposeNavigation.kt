package com.example.appcompose.navigationApp

import android.provider.MediaStore.Audio.Radio
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
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
import com.example.appcompose.screens.radioButtons.RadioButtons
import com.example.appcompose.screens.radioButtons.RadioButtonsSample
import com.example.appcompose.screens.radioButtons.RadioGroupSample
import com.example.appcompose.screens.sheetsBottom.BottomSheetScaffoldSample
import com.example.appcompose.screens.sheetsBottom.ModalBottomSheetSample
import com.example.appcompose.screens.sheetsBottom.SheetsBottom
import com.example.appcompose.screens.sliders.RangeSliderSample
import com.example.appcompose.screens.sliders.SliderSample
import com.example.appcompose.screens.sliders.Sliders
import com.example.appcompose.screens.sliders.StepRangeSliderSample
import com.example.appcompose.screens.snackbar.ScaffoldWithCoroutinesSnackbar
import com.example.appcompose.screens.snackbar.ScaffoldWithCustomSnackBar
import com.example.appcompose.screens.snackbar.ScaffoldWithSimpleSnackbar
import com.example.appcompose.screens.snackbar.SnackBars
import com.example.appcompose.screens.switches.SwitchSample
import com.example.appcompose.screens.switches.Switches
import com.example.appcompose.screens.tabs.FancyIndicatorsContainerTabs
import com.example.appcompose.screens.tabs.FancyIndicatorsTabs
import com.example.appcompose.screens.tabs.FancyTabs
import com.example.appcompose.screens.tabs.IconTabs
import com.example.appcompose.screens.tabs.LeadingIconTabs
import com.example.appcompose.screens.tabs.ScrollingFancyIndicatorsContainerTabs
import com.example.appcompose.screens.tabs.ScrollingTextTabs
import com.example.appcompose.screens.tabs.Tabs
import com.example.appcompose.screens.tabs.TextAndIconTab
import com.example.appcompose.screens.tabs.TextTabs
import com.example.appcompose.screens.textFields.OutlinedTextFieldSample
import com.example.appcompose.screens.textFields.PasswordTextField
import com.example.appcompose.screens.textFields.SimpleOutlinedTextFieldSample
import com.example.appcompose.screens.textFields.SimpleTextFieldSample
import com.example.appcompose.screens.textFields.TextArea
import com.example.appcompose.screens.textFields.TextFieldSample
import com.example.appcompose.screens.textFields.TextFieldWithErrorState
import com.example.appcompose.screens.textFields.TextFieldWithHelperMessage
import com.example.appcompose.screens.textFields.TextFieldWithHideKeyboardOnImeAction
import com.example.appcompose.screens.textFields.TextFieldWithIcons
import com.example.appcompose.screens.textFields.TextFieldWithPlaceHolder
import com.example.appcompose.screens.textFields.TextFields

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


    }
}
