package com.example.appcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
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


@Composable
fun Screen2(navController:NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "App Bar Bottom") }
            )
        },
        content = {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.TopCenter
            ) {
                Column(
                    horizontalAlignment = Alignment.Start,
                    verticalArrangement = Arrangement.Center,

                    modifier = Modifier.padding(start = 16.dp,top = 16.dp)

                ) {
                    Icon(
                        imageVector = Icons.Default.Favorite,
                        contentDescription = "Favorite Icon",
                        modifier = Modifier.size(48.dp)
                    )

                }


            }
            Column() {
                Text(
                    text = "Description",
                    style = MaterialTheme.typography.body1,
                    modifier = Modifier.padding(start = 0.dp, top = 8.dp)
                )}
        }
    )

}

//    Scaffold(
//        topBar = {
//            TopAppBar { Text(text = "App Bar Bottom") }
//        }
//    )
////     {
////        // Screen content
////        Column(
////            horizontalAlignment = Alignment.CenterHorizontally,
////
////
////            modifier = Modifier.fillMaxSize()
////
////        ) {
////            Button(onClick = {navController.navigateUp()}) {
////                Text(text = "Back")
////            }
////        }
////    }
////
////
//// }
//    content = {
//        Box(
//            modifier = Modifier.fillMaxSize(),
//            contentAlignment = Alignment.Center
//        ) {
//            Column(
//                horizontalAlignment = Alignment.CenterHorizontally
//            ) {
//                Icon(
//                    imageVector = Icons.Default.Favorite,
//                    contentDescription = "Favorite Icon",
//                    modifier = Modifier.size(48.dp)
//                )
//                Text(
//                    text = "Description",
//                    style = MaterialTheme.typography.body1,
//                    modifier = Modifier.padding(start = 16.dp)
//                )
//            }
//        }
//    }
//    )
//}