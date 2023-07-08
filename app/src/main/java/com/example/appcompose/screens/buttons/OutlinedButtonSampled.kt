package com.example.appcompose.screens.buttons

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.appcompose.navigationApp.Destination

@Composable
fun OutlinedButtonSample(navController: NavHostController){
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()) {

        OutlinedButton(onClick = { /* Do something! */ }) {
            Text("Outlined Button")
        }
    }
}