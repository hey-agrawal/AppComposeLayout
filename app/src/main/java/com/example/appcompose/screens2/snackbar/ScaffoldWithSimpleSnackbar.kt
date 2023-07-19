package com.example.appcompose.screens2.snackbar

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.ExtendedFloatingActionButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.rememberScaffoldState

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue

import kotlinx.coroutines.launch
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun ScaffoldWithSimpleSnackbar(navController: NavHostController){
    Column() {
        val scaffoldState = rememberScaffoldState()
        val scope = rememberCoroutineScope()
        Scaffold(
            scaffoldState = scaffoldState,
            floatingActionButton = {
                var clickCount by remember { mutableStateOf(0) }
                ExtendedFloatingActionButton(
                    text = { Text("Show snackbar") },
                    onClick = {
                        // show snackbar as a suspend function
                        scope.launch {
                            scaffoldState.snackbarHostState.showSnackbar("Snackbar # ${++clickCount}")
                        }
                    }
                )
            },
            content = { innerPadding ->
                Text(
                    text = "Body content",
                    modifier = Modifier.padding(innerPadding).fillMaxSize().wrapContentSize()
                )
            }
        )
    }
}