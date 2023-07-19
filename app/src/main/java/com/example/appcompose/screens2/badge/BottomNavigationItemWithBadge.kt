package com.example.appcompose.screens2.badge

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.BadgedBox
import androidx.compose.material.Badge
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.navigation.NavHostController

@Composable
fun BottomNavigationItemWithBadge(navController: NavHostController) {
Column(horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center,
    modifier = Modifier
        .fillMaxSize()) {
    BottomNavigation {
        BottomNavigationItem(
            icon = {
                BadgedBox(badge = {
                    Badge {
                        val badgeNumber = "10"
                        Text(
                            badgeNumber,
                            modifier = Modifier.semantics {
                                contentDescription = "$badgeNumber new notifications"
                            }
                        )
                    }
                }) {
                    Icon(
                        Icons.Filled.Menu,
                        contentDescription = ""
                    )
                }
            },
            selected = false,
            onClick = {}
        )
    }

}

}
