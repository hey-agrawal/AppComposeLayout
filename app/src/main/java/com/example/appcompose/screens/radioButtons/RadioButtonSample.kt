package com.example.appcompose.screens.radioButtons

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material.RadioButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun RadioButtonsSample(navController: NavHostController){
    Column() {
        // We have two radio buttons and only one can be selected
        var state by remember { mutableStateOf(true) }
        // Note that Modifier.selectableGroup() is essential to ensure correct accessibility behavior
        Row(Modifier.selectableGroup()) {
            RadioButton(
                selected = state,
                onClick = { state = true }
            )
            RadioButton(
                selected = !state,
                onClick = { state = false }
            )
        }
    }
}