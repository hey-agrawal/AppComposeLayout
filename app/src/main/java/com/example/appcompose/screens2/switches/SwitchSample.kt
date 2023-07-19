package com.example.appcompose.screens2.switches
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.toggleable
import androidx.compose.material.Switch
import androidx.compose.material.Text

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment

import androidx.compose.ui.unit.dp

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.navigation.NavHostController

@Composable
fun SwitchSample(navController: NavHostController){
    Column(  horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()) {
        val checkedState = remember { mutableStateOf(true) }
        var pineappleOnPizza by remember { mutableStateOf(true) }
        Row(
            Modifier
                .padding(16.dp)
                .toggleable(
                    role = Role.Switch,
                    value = pineappleOnPizza,
                    onValueChange = { pineappleOnPizza = it },
                )
        ) {
            Switch(checked = pineappleOnPizza, onCheckedChange = null)
            Spacer(Modifier.width(8.dp))
            Text("Dark Mode")
        }
    }
}