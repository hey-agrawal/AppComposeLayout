package com.example.appcompose.screens2.tabs

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
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
fun Tabs(navController: NavHostController){
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Tabs", color = Color.Black) }, backgroundColor = Color.White
            )
        },  backgroundColor = Color.White,
        content = {it
            LazyColumn(modifier = Modifier.fillMaxSize().padding(16.dp)){
                item { Column(modifier = Modifier.padding(16.dp)) {
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
                    Text(text = "Organize content across different screen,data sets, and other interactions" ,
                        style = MaterialTheme.typography.h6,color = Color.Black
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = "Examples",
                        style = MaterialTheme.typography.h6,color = Color.Black)
                    Spacer(modifier = Modifier.height(8.dp))
                    CardItem2(title = "Text Tabs",route = Destination.TextTabs.route,navController)
                    Spacer(modifier = Modifier.height(8.dp))
                    HyperlinkText(fullText = "SourceCode", linkText = listOf("SourceCode") , hyperlinks = listOf("https://github.com/hey-agrawal/BasicCode/blob/main/TextTabs.kt") )
                    Spacer(modifier = Modifier.height(8.dp))
                    CardItem2(title = "Icon Tabs",route = Destination.IconTabs.route,navController)
                    Spacer(modifier = Modifier.height(8.dp))
                    HyperlinkText(fullText = "SourceCode", linkText = listOf("SourceCode") , hyperlinks = listOf("https://github.com/hey-agrawal/BasicCode/blob/main/IconTabs.kt") )
                    Spacer(modifier = Modifier.height(8.dp))
                    CardItem2(title = "Text And Icon Tabs",route = Destination.TextAndIconTab.route,navController)
                    Spacer(modifier = Modifier.height(8.dp))
                    HyperlinkText(fullText = "SourceCode", linkText = listOf("SourceCode") , hyperlinks = listOf("https://github.com/hey-agrawal/BasicCode/blob/main/TextAndIconTab.kt") )
                    Spacer(modifier = Modifier.height(8.dp))
                    CardItem2(title = "Leading Icon Tabs",route = Destination.LeadingIconTabs.route,navController)
                    Spacer(modifier = Modifier.height(8.dp))
                    HyperlinkText(fullText = "SourceCode", linkText = listOf("SourceCode") , hyperlinks = listOf("https://github.com/hey-agrawal/BasicCode/blob/main/LeadingIconTabs.kt") )
                    Spacer(modifier = Modifier.height(8.dp))
                    CardItem2(title = "Scrolling Text Tabs",route = Destination.ScrollingTextTabs.route,navController)
                    Spacer(modifier = Modifier.height(8.dp))
                    HyperlinkText(fullText = "SourceCode", linkText = listOf("SourceCode") , hyperlinks = listOf("https://github.com/hey-agrawal/BasicCode/blob/main/ScrollingTextTab.kt") )
                    Spacer(modifier = Modifier.height(8.dp))
//                    CardItem2(title = "Fancy Tab",route = Destination.FancyTabs.route,navController)
//                    Spacer(modifier = Modifier.height(8.dp))
//                    HyperlinkText(fullText = "SourceCode", linkText = listOf("SourceCode") , hyperlinks = listOf("https://www.google.co.in/") )
//                    Spacer(modifier = Modifier.height(8.dp))
//                    CardItem2(title = "Fancy Indicator Tab",route = Destination.FancyIndicatorsTabs.route,navController)
//                    Spacer(modifier = Modifier.height(8.dp))
//                    HyperlinkText(fullText = "SourceCode", linkText = listOf("SourceCode") , hyperlinks = listOf("https://www.google.co.in/") )
//                    Spacer(modifier = Modifier.height(8.dp))
//                    CardItem2(title = "Fancy Indicator Container Tabs",route = Destination.FancyIndicatorsContainerTabs.route,navController)
//                    Spacer(modifier = Modifier.height(8.dp))
//                    HyperlinkText(fullText = "SourceCode", linkText = listOf("SourceCode") , hyperlinks = listOf("https://www.google.co.in/") )
//                    Spacer(modifier = Modifier.height(8.dp))
//                    CardItem2(title = "Scrolling Fancy Indicators Container Tabs",route = Destination.ScrollingFancyIndicatorsContainerTabs.route,navController)
//                    Spacer(modifier = Modifier.height(8.dp))
//                    HyperlinkText(fullText = "SourceCode", linkText = listOf("SourceCode") , hyperlinks = listOf("https://www.google.co.in/") )
//                    Spacer(modifier = Modifier.height(8.dp))
                } }
            }

        }
    )
}