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


    object ScreenThird : Destination("ScreenThird")
    object ScreenFourth : Destination("ScreenFourth")
    object ScreenFive : Destination("ScreenFive")


}
