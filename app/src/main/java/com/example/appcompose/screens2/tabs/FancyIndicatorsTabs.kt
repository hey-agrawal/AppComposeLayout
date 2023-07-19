package com.example.appcompose.screens2.tabs

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Tab
import androidx.compose.material.TabPosition
import androidx.compose.material.TabRow
import androidx.compose.material.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material.Text

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun FancyIndicatorsTabs(navController: NavHostController){
    Column() {
        var state by remember { mutableStateOf(0) }
        val titles = listOf("TAB 1", "TAB 2", "TAB 3")

        // Reuse the default offset animation modifier, but use our own indicator
        val indicator = @Composable { tabPositions: List<TabPosition> ->
            FancyIndicator(Color.White, Modifier.tabIndicatorOffset(tabPositions[state]))
        }

        Column {
            TabRow(
                selectedTabIndex = state,
                indicator = indicator
            ) {
                titles.forEachIndexed { index, title ->
                    Tab(
                        text = { Text(title) },
                        selected = state == index,
                        onClick = { state = index }
                    )
                }
            }
            Text(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                text = "Fancy indicator tab ${state + 1} selected",
                style = MaterialTheme.typography.body1
            )
        }
    }
}