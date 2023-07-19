package com.example.appcompose.screens2.textFields

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.material.TextField
//import androidx.compose.material.TextFieldDefaults.indicatorLine
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TextArea(navController: NavHostController){
    var text by rememberSaveable {
        mutableStateOf(
            "This is a very long input that extends beyond " +
                    "the height of the text area."
        )
    }
    TextField(
        value = text,
        onValueChange = { text = it },
        modifier = Modifier.height(100.dp),
        label = { Text("Label") }
    )
}//