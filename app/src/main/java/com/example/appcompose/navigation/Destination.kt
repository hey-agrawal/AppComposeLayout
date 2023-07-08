package com.example.appcompose.navigation

sealed class Destination(val route: String) {
    object HomeScreen : Destination("HomeScreen")
    object AppBarBottom : Destination("AppBarBottom")
    object AppBarTop : Destination("AppBarTop")
    object SimpleTopAppBar : Destination("SimpleTopAppBar")
    object SimpleBottomAppBar : Destination("SimpleBottomAppBar")
    object ScreenThird : Destination("ScreenThird")
    object ScreenFourth : Destination("ScreenFourth")
    object ScreenFive : Destination("ScreenFive")


}
