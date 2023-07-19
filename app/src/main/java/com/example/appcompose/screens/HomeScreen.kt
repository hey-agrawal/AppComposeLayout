package com.example.appcompose.screens
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.appcompose.R
import com.example.appcompose.cards.CardItem
import com.example.appcompose.navigationApp.Destination


@Composable
fun HomeScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Home", color = Color(0xFF090909)) },
                backgroundColor = Color(0xFFFFFFFF)
            )
        },
        backgroundColor = Color(0xFFF8F8F8),
        content = {
            LazyColumn(modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)){
                item {   Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                ) {
                    CardItem("App Bar Bottom",icon={Image(painter=painterResource(R.mipmap.ic_launcher),contentDescription = "hello",modifier = Modifier.size(55.dp)) },Destination.AppBarBottom.route,navController)
                    Spacer(modifier = Modifier.height(16.dp))
                    CardItem("App Bar top",icon={Image(painter=painterResource(R.mipmap.ic_launcher),contentDescription = "hello",modifier = Modifier.size(55.dp)) }, Destination.AppBarTop.route,navController)
                    Spacer(modifier = Modifier.height(16.dp))
                    CardItem("BackDrop",icon={Image(painter=painterResource(R.mipmap.ic_launcher),contentDescription = "hello",modifier = Modifier.size(55.dp)) }, Destination.BackDrop.route,navController)
                    Spacer(modifier = Modifier.height(16.dp))
                    CardItem("Badge",icon={Image(painter=painterResource(R.mipmap.ic_launcher),contentDescription = "hello",modifier = Modifier.size(55.dp)) }, Destination.Badge.route,navController)
                    Spacer(modifier = Modifier.height(16.dp))
                    CardItem("Bottom Navigation",icon={Image(painter=painterResource(R.mipmap.ic_launcher),contentDescription = "hello",modifier = Modifier.size(55.dp)) }, Destination.BottomNavigation.route,navController)
                    Spacer(modifier = Modifier.height(16.dp))
                    CardItem("Navigation Rail",icon={Image(painter=painterResource(R.mipmap.ic_launcher),contentDescription = "hello",modifier = Modifier.size(55.dp)) }, Destination.NavigationRail.route,navController)
                    Spacer(modifier = Modifier.height(16.dp))
                    CardItem("Buttons",icon={Image(painter=painterResource(R.mipmap.ic_launcher),contentDescription = "hello",modifier = Modifier.size(55.dp)) }, Destination.Buttons.route,navController)
                    Spacer(modifier = Modifier.height(16.dp))
                    CardItem("Floating Action Button",icon={Image(painter=painterResource(R.mipmap.ic_launcher),contentDescription = "hello",modifier = Modifier.size(55.dp)) }, Destination.FloatingActionButtons.route,navController)
                    Spacer(modifier = Modifier.height(16.dp))
                    CardItem("Cards",icon={Image(painter=painterResource(R.mipmap.ic_launcher),contentDescription = "hello",modifier = Modifier.size(55.dp)) },Destination.Cards.route,navController)
                    Spacer(modifier = Modifier.height(16.dp))
                    CardItem("Check Boxes",icon={Image(painter=painterResource(R.mipmap.ic_launcher),contentDescription = "hello",modifier = Modifier.size(55.dp)) },Destination.CheckBoxes.route,navController)
                    Spacer(modifier = Modifier.height(16.dp))
                    //CardItem("Chips",icon={Image(painter=painterResource(R.mipmap.ic_launcher),contentDescription = "hello",modifier = Modifier.size(55.dp)) },Destination.Chips.route,navController)
                   //Spacer(modifier = Modifier.height(16.dp))
                    CardItem("Dialog",icon={Image(painter=painterResource(R.mipmap.ic_launcher),contentDescription = "hello",modifier = Modifier.size(55.dp)) },Destination.Dialogs.route,navController)
                    Spacer(modifier = Modifier.height(16.dp))
                    CardItem("Menu",icon={Image(painter=painterResource(R.mipmap.ic_launcher),contentDescription = "hello",modifier = Modifier.size(55.dp)) },Destination.Menus.route,navController)
                    Spacer(modifier = Modifier.height(16.dp))
                    CardItem("Navigation Drawer",icon={Image(painter=painterResource(R.mipmap.ic_launcher),contentDescription = "hello",modifier = Modifier.size(55.dp)) },Destination.NavigationDrawer.route,navController)
                    Spacer(modifier = Modifier.height(16.dp))
                    CardItem("Progress Indicator",icon={Image(painter=painterResource(R.mipmap.ic_launcher),contentDescription = "hello",modifier = Modifier.size(55.dp)) },Destination.ProgressIndicators.route,navController)
                    Spacer(modifier = Modifier.height(16.dp))
                    CardItem("Radio Button",icon={Image(painter=painterResource(R.mipmap.ic_launcher),contentDescription = "hello",modifier = Modifier.size(55.dp)) },Destination.RadioButtons.route,navController)
                    Spacer(modifier = Modifier.height(16.dp))
                    CardItem("Sheet Bottom",icon={Image(painter=painterResource(R.mipmap.ic_launcher),contentDescription = "hello",modifier = Modifier.size(55.dp)) },Destination.SheetsBottom.route,navController)
                    Spacer(modifier = Modifier.height(16.dp))
                    CardItem("Slider",icon={Image(painter=painterResource(R.mipmap.ic_launcher),contentDescription = "hello",modifier = Modifier.size(55.dp)) },Destination.Sliders.route,navController)
                    Spacer(modifier = Modifier.height(16.dp))
                    CardItem("Snackbars",icon={Image(painter=painterResource(R.mipmap.ic_launcher),contentDescription = "hello",modifier = Modifier.size(55.dp)) },Destination.SnackBars.route,navController)
                    Spacer(modifier = Modifier.height(16.dp))
                    CardItem("Switches",icon={Image(painter=painterResource(R.mipmap.ic_launcher),contentDescription = "hello",modifier = Modifier.size(55.dp)) },Destination.Switches.route,navController)
                    Spacer(modifier = Modifier.height(16.dp))
                    CardItem("Tabs",icon={Image(painter=painterResource(R.mipmap.ic_launcher),contentDescription = "hello",modifier = Modifier.size(55.dp)) },Destination.Tabs.route,navController)
                    Spacer(modifier = Modifier.height(16.dp))
                    CardItem("Text Field",icon={Image(painter=painterResource(R.mipmap.ic_launcher),contentDescription = "hello",modifier = Modifier.size(55.dp)) },Destination.TextFields.route,navController)
                    Spacer(modifier = Modifier.height(16.dp))
                } }

                }}
        )
    }
