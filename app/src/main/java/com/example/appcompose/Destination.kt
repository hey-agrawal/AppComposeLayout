package com.example.appcompose

sealed class Destination(val route: String) {
    object HomeScreen : Destination("HomeScreen")
    object AppBarBottom : Destination("AppBarBottom")
    object ScreenThird : Destination("ScreenThird")
    object ScreenFourth : Destination("ScreenFourth")
    object ScreenFive : Destination("ScreenFive")


}
