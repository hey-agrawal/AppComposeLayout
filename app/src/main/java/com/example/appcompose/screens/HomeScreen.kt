package com.example.appcompose.screens
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.appcompose.cards.CardItem
import com.example.appcompose.navigation.Destination


@Composable
fun HomeScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Home") }
            )
        },
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                CardItem("App Bar Bottom", Icons.Default.AccountBox, Destination.AppBarBottom.route,navController)
                Spacer(modifier = Modifier.height(16.dp))
                CardItem("App Bar top", Icons.Default.AccountBox, Destination.AppBarTop.route,navController)
                Spacer(modifier = Modifier.height(16.dp))
                CardItem("BackDrop", Icons.Default.AccountBox, Destination.BackDrop.route,navController)
                Spacer(modifier = Modifier.height(16.dp))
                CardItem("Screen3", Icons.Default.AccountBox, Destination.ScreenThird.route,navController
                )
                Spacer(modifier = Modifier.height(16.dp))
                CardItem("Screen4", Icons.Default.AccountBox, Destination.ScreenFourth.route,navController)
            }
        }
    )
}

