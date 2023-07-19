package com.example.appcompose.screens2.sliders

import androidx.compose.material.Slider
import androidx.compose.material.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun SliderSample(navController: NavHostController){
    Column() {
        var sliderPosition by remember { mutableStateOf(0f) }
        Text(text = sliderPosition.toString())
        Slider(value = sliderPosition, onValueChange = { sliderPosition = it })
    }
}