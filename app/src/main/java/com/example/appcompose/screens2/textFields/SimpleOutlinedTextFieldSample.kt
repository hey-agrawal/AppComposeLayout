package com.example.appcompose.screens2.textFields

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
//import androidx.compose.material.TextFieldDefaults.indicatorLine
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue

@Composable
fun SimpleOutlinedTextFieldSample(navController: NavHostController){
    var text by rememberSaveable { mutableStateOf("") }

    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("Label") }
    )
}