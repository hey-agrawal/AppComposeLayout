package com.example.appcompose.screens2.textFields

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.compose.material.Text
import androidx.compose.material.TextField
//import androidx.compose.material.TextFieldDefaults.indicatorLine
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.TextFieldValue

@Composable
fun TextFieldSample(navController: NavHostController){
    var text by rememberSaveable(stateSaver = TextFieldValue.Saver) {
        mutableStateOf(TextFieldValue("example", TextRange(0, 7)))
    }

    TextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("Label") }
    )
}