package com.example.appcompose.screens2.tabs

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.compose.material.Icon
import androidx.compose.material.LeadingIconTab
import androidx.compose.material.MaterialTheme
import androidx.compose.material.TabRow
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun LeadingIconTabs(navController: NavHostController){
    Column() {
        var state by remember { mutableStateOf(0) }
        val titlesAndIcons = listOf(
            "TAB" to Icons.Filled.Favorite,
            "TAB & ICON" to Icons.Filled.Favorite,
            "TAB 3 WITH LOTS OF TEXT" to Icons.Filled.Favorite
        )
        Column {
            TabRow(selectedTabIndex = state) {
                titlesAndIcons.forEachIndexed { index, (title, icon) ->
                    LeadingIconTab(
                        text = { Text(title) },
                        icon = { Icon(icon, contentDescription = null) },
                        selected = state == index,
                        onClick = { state = index }
                    )
                }
            }
            Text(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                text = "Leading icon tab ${state + 1} selected",
                style = MaterialTheme.typography.body1
            )
        }
    }
}