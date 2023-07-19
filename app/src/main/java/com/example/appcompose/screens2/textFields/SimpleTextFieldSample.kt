package com.example.appcompose.screens2.textFields

import androidx.compose.runtime.Composable
import androidx.compose.material.Text
import androidx.compose.material.TextField
//import androidx.compose.material.TextFieldDefaults.indicatorLine
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.navigation.NavHostController

@Composable
fun SimpleTextFieldSample(navController: NavHostController){
    var text by rememberSaveable { mutableStateOf("") }

    TextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("Label") },
        singleLine = true
    )
}