package com.example.appcompose.navigation

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


    //Navigating
    object BottomNavigation : Destination("BottomNavigation")
    object BottomNavigationSample : Destination("BottomNavigationSample")
    object BottomNavigationWithOnlySelectedLabelsSamples : Destination("BottomNavigationWithOnlySelectedLabelsSamples")



    object ScreenThird : Destination("ScreenThird")
    object ScreenFourth : Destination("ScreenFourth")
    object ScreenFive : Destination("ScreenFive")


}
