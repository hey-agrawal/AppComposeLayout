package com.example.appcompose.screens.backdrop

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.appcompose.cards.CardItem2
import com.example.appcompose.hyperlink.HyperlinkText
import com.example.appcompose.navigationApp.Destination

@Composable
fun BackDrop(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "BackDrop" ,color = Color.Black) }, backgroundColor = Color.White
            )
        }, backgroundColor = Color.White,
        content = {
            Column(modifier = Modifier.padding(16.dp)) {
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
                    style = MaterialTheme.typography.h5,color = Color.Black)
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "A backDrop appears behind all other surface in an app displaying contextual and actionable content" ,
                    style = MaterialTheme.typography.h6,color = Color.Black
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "Example",
                    style = MaterialTheme.typography.h6,color = Color.Black)
                Spacer(modifier = Modifier.height(8.dp))
                CardItem2(title = "Back Drop Scaffold Sample ", route = Destination.BackDropScaffoldSample.route, navController )
                Spacer(modifier = Modifier.height(8.dp))
                HyperlinkText(fullText = "SourceCode", linkText = listOf("SourceCode") , hyperlinks = listOf("https://github.com/hey-agrawal/BasicCode/blob/main/BackDropScaffold.kt") )
            }

        }


    )

}
