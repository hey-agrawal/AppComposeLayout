package com.example.appcompose.navigationApp

sealed class Destination(val route: String) {

   //HomeScreen
    object HomeScreen : Destination("HomeScreen")

    //Appbars
    object AppBarBottom : Destination("AppBarBottom")
    object AppBarTop : Destination("AppBarTop")
    object SimpleTopAppBar : Destination("SimpleTopAppBar")
    object SimpleBottomAppBar : Destination("SimpleBottomAppBar")

    //Back drop scaffold
    object BackDrop : Destination("BackDrop")
    object BackDropScaffoldSample : Destination("BackDropScaffoldSample")


   //Badge
   object Badge : Destination("Badge")
   object BottomNavigationItemWithBadge : Destination("BottomNavigationItemWithBadge")


    //Bottom Navigating
    object BottomNavigation : Destination("BottomNavigation")
    object BottomNavigationSample : Destination("BottomNavigationSample")
    object BottomNavigationWithOnlySelectedLabelsSamples : Destination("BottomNavigationWithOnlySelectedLabelsSamples")

    //Navigation Rail
    object NavigationRail : Destination("NavigationRail")
    object CompactNavigationRailSimple : Destination("CompactNavigationRailSimple")
    object NavigationRailBottomAlignSimple : Destination("NavigationRailBottomAlignSimple")
    object NavigationRailSimple : Destination("NavigationRailSimple")
    object NavigationRailWithOnlySelectedLabels : Destination("NavigationRailWithOnlySelectedLabels")


    //Buttons
    object Buttons : Destination("Buttons")
    object ButtonSample : Destination("ButtonSample")
    object ButtonWithIconSample : Destination("ButtonWithIconSample")
    object OutlinedButtonSample : Destination("OutlinedButtonSampled")
    object TextButtonsSample : Destination("TextButtonSample")


   //Floating Action Button
   object FloatingActionButtons : Destination("FloatingActionButtons")
   object FluidExtendedFab : Destination("FluidExtendedFab")
   object SimpleExtendedFabNoIcon : Destination("SimpleExtendedFabNoIcon")
   object SimpleExtendedFabWithIcon : Destination("SimpleExtendedFabIcon")
   object SimpleFab : Destination("SimpleFab")


    //Cards
    object Cards : Destination("Cards")
    object CardSample : Destination("CardSample")
    object ClickableCardSample : Destination("ClickableCardSample")

    //Check Boxes
    object CheckBoxes : Destination("Checkboxes")
    object CheckBoxesSample : Destination("CheckBoxesSample")
    object TriStateCheckBoxSample : Destination ("TriStateCheckBoxSample")



    //Chips
    object ChipGroupReflowSample : Destination("ChipGroupReflowSample")
    object Chips : Destination("Chips")
    object ChipSample : Destination("ChipSample")
    object ChipsGroupSingleLineSample : Destination("ChipsGroupSingleLineSample")
    object OutlinedChipWithIconSample : Destination("OutlinedChipWithIconSample")


   //Dialogs
   object AlertDialogSample : Destination("AlertDialogSample")
   object CustomAlertDialogSample : Destination("CustomAlertDialogSample")
   object Dialogs : Destination("Dialogs")

    //Menus
    object ExposedDropDownMenuSample : Destination("ExposedDropDownMenuSample")
    object Menus : Destination("Menus")

    object MenuSample : Destination("MenuSample")

    object MenuWithScrollStateSample : Destination("MenuWithScrollStateSample")



    object ScreenThird : Destination("ScreenThird")
    object ScreenFourth : Destination("ScreenFourth")
    object ScreenFive : Destination("ScreenFive")


}
