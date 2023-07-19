package com.example.appcompose.screens2.appBar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.BottomAppBar
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable

fun SimpleBottomAppBar(navController: NavHostController) {
    Column( horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()) {
        BottomAppBar() {
            Row(modifier = Modifier.fillMaxWidth()) {
                IconButton(onClick = { }) {
                    Icon(Icons.Filled.Menu, contentDescription = "")
                }
            Spacer(Modifier.weight(1f, true))
            IconButton(onClick = { }) {
                Icon(Icons.Filled.Favorite, contentDescription = "")
            }
            IconButton(onClick = { }) {
                Icon(Icons.Filled.Favorite, contentDescription = "")
            }
        }
    }

}

}

