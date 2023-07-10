package com.example.appcompose.screens.textFields

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
fun TextFields(navController: NavHostController){
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Tabs", color = Color.Black) }, backgroundColor = Color.White
            )
        },  backgroundColor = Color.White,
        content = {
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
                    Text(text = "Text Fields let user enter and edit text" ,
                        style = MaterialTheme.typography.h6,color = Color.Black
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = "Examples",
                        style = MaterialTheme.typography.h6,color = Color.Black)
                    Spacer(modifier = Modifier.height(8.dp))
                    CardItem2(title = "Simple Text Field",route = Destination.SimpleTextFieldSample.route,navController)
                    Spacer(modifier = Modifier.height(8.dp))
                    HyperlinkText(fullText = "SourceCode", linkText = listOf("SourceCode") , hyperlinks = listOf("https://github.com/hey-agrawal/BasicCode/blob/main/SimpleTextField.kt") )
                    Spacer(modifier = Modifier.height(8.dp))
                    CardItem2(title = "Text Field ",route = Destination.TextFieldSample.route,navController)
                    Spacer(modifier = Modifier.height(8.dp))
                    HyperlinkText(fullText = "SourceCode", linkText = listOf("SourceCode") , hyperlinks = listOf("https://github.com/hey-agrawal/BasicCode/blob/main/TextField.kt") )
                    Spacer(modifier = Modifier.height(8.dp))
                    CardItem2(title = "Simple Outlined Text Field",route = Destination.SimpleOutlinedTextFieldSample.route,navController)
                    Spacer(modifier = Modifier.height(8.dp))
                    HyperlinkText(fullText = "SourceCode", linkText = listOf("SourceCode") , hyperlinks = listOf("https://github.com/hey-agrawal/BasicCode/blob/main/SimpleOutlinedTextField.kt") )
                    Spacer(modifier = Modifier.height(8.dp))
                    CardItem2(title = "Outline Text Field",route = Destination.OutlinedTextFieldSample.route,navController)
                    Spacer(modifier = Modifier.height(8.dp))
                    HyperlinkText(fullText = "SourceCode", linkText = listOf("SourceCode") , hyperlinks = listOf("https://github.com/hey-agrawal/BasicCode/blob/main/OutlinedTextField.kt") )
                    Spacer(modifier = Modifier.height(8.dp))
                    CardItem2(title = "Text Field With Icon",route = Destination.TextFieldWithIcon.route,navController)
                    Spacer(modifier = Modifier.height(8.dp))
                    HyperlinkText(fullText = "SourceCode", linkText = listOf("SourceCode") , hyperlinks = listOf("https://github.com/hey-agrawal/BasicCode/blob/main/TextFieldWithIcon.kt") )
                    Spacer(modifier = Modifier.height(8.dp))
                    CardItem2(title = "Text Field With Place Holder",route = Destination.TextFieldWithPlaceHolder.route,navController)
                    Spacer(modifier = Modifier.height(8.dp))
                    HyperlinkText(fullText = "SourceCode", linkText = listOf("SourceCode") , hyperlinks = listOf("https://github.com/hey-agrawal/BasicCode/blob/main/TextFieldWithPlaceHolder.kt") )
                    Spacer(modifier = Modifier.height(8.dp))
                    CardItem2(title = "Text Field With Helper Message",route = Destination.TextFieldWithHelperMessage.route,navController)
                    Spacer(modifier = Modifier.height(8.dp))
                    HyperlinkText(fullText = "SourceCode", linkText = listOf("SourceCode") , hyperlinks = listOf("https://github.com/hey-agrawal/BasicCode/blob/main/TextFieldWithHelperMessage.kt") )
                    Spacer(modifier = Modifier.height(8.dp))
                    CardItem2(title = "Password Text Field",route = Destination.PasswordTextField.route,navController)
                    Spacer(modifier = Modifier.height(8.dp))
                    HyperlinkText(fullText = "SourceCode", linkText = listOf("SourceCode") , hyperlinks = listOf("https://github.com/hey-agrawal/BasicCode/blob/main/PasswordTextField.kt") )
                    Spacer(modifier = Modifier.height(8.dp))
                    CardItem2(title = "Hide Keyboard Animation",route = Destination.TextFieldWithHideKeyboardOnImeAction.route,navController)
                    Spacer(modifier = Modifier.height(8.dp))
                    HyperlinkText(fullText = "SourceCode", linkText = listOf("SourceCode") , hyperlinks = listOf("https://github.com/hey-agrawal/BasicCode/blob/main/HideKeyBoardAnimation.kt") )
                    Spacer(modifier = Modifier.height(8.dp))
                    CardItem2(title = "Text Area",route = Destination.TextArea.route,navController)
                    Spacer(modifier = Modifier.height(8.dp))
                    HyperlinkText(fullText = "SourceCode", linkText = listOf("SourceCode") , hyperlinks = listOf("https://github.com/hey-agrawal/BasicCode/blob/main/TextArea.kt") )
                } }
            }

        }
    )
}