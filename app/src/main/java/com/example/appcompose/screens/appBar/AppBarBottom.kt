package com.example.appcompose.screens.appBar

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.appcompose.navigationApp.Destination
import com.example.appcompose.cards.CardItem2


@Composable
fun AppBarBottom(navController:NavHostController) {
    Scaffold(

        topBar = {
            TopAppBar(
                title = { Text(text = "Screen 2") }
            )
        },
        content = {
            Column {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Icon(
                        imageVector = Icons.Default.Favorite,
                        contentDescription = "Favorite Icon",
                        modifier = Modifier.size(80.dp)
                    )
                    Spacer(modifier = Modifier.height(8.dp))


                    }

                    Text(
                        text = "Description",
                        style = MaterialTheme.typography.h5)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = "A bottom app bar displays navigation and key actions at the bottom of the mobile screen ",
                        style = MaterialTheme.typography.h6
                        )
                Spacer(modifier = Modifier.height(8.dp))
                    Text(text = "Example",
                        style = MaterialTheme.typography.h6)
                Spacer(modifier = Modifier.height(8.dp))
                    CardItem2(title = "Simple Bottom App Bar", route = Destination.SimpleBottomAppBar.route, navController )

            }

        }


    )

}
