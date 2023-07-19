package com.example.appcompose.screens2.textFields

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.Text
import androidx.compose.material.TextField
//import androidx.compose.material.TextFieldDefaults.indicatorLine
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.error
import androidx.compose.ui.semantics.semantics

@Composable
fun TextFieldWithErrorState(navController: NavHostController){
    var text by rememberSaveable { mutableStateOf("") }
    var isError by rememberSaveable { mutableStateOf(false) }

    fun validate(text: String) {
        isError = text.count() < 5
    }

    TextField(
        value = text,
        onValueChange = {
            text = it
            isError = false
        },
        singleLine = true,
        label = { Text(if (isError) "Email*" else "Email") },
        isError = isError,
        keyboardActions = KeyboardActions { validate(text) },
        modifier = Modifier.semantics {
            // Provide localized description of the error
            if (isError) error("Email format is invalid.")
        }
    )
}