package com.example.appcompose.screens2.tabs

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ScrollableTabRow
import androidx.compose.material.Tab
import androidx.compose.material.TabPosition
import androidx.compose.material.Text

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun ScrollingFancyIndicatorsContainerTabs(navController: NavHostController){
    Column() {
        var state by remember { mutableStateOf(0) }
        val titles = listOf(
            "TAB 1",
            "TAB 2",
            "TAB 3 WITH LOTS OF TEXT",
            "TAB 4",
            "TAB 5",
            "TAB 6 WITH LOTS OF TEXT",
            "TAB 7",
            "TAB 8",
            "TAB 9 WITH LOTS OF TEXT",
            "TAB 10"
        )
        val indicator = @Composable { tabPositions: List<TabPosition> ->
            FancyAnimatedIndicator(tabPositions = tabPositions, selectedTabIndex = state)
        }

        Column {
            ScrollableTabRow(
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
                text = "Scrolling fancy transition tab ${state + 1} selected",
                style = MaterialTheme.typography.body1
            )
        }
    }
}