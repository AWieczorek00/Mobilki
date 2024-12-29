package com.example.proj1.screens.detals

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.compose.ui.Alignment

@Composable
fun DetailsScreen(navController: NavController, movieData: String?) {
    Scaffold(
        topBar = {
            TopAppBar(backgroundColor = Color.LightGray, elevation = 5.dp) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Arrow Back",
                        modifier = Modifier.clickable {
                            navController.popBackStack()
                        })
                    Spacer(modifier = Modifier.width(16.dp))
                    Text(text = "Movie Details")
                }
            }
        }
    ) { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {
            Surface(modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()) {
                Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                    Text(text = movieData.toString(), style = MaterialTheme.typography.h5)
                    Spacer(modifier = Modifier.height(23.dp))
                    Button(onClick = { navController.popBackStack() }) {
                        Text(text = "Go Back")
                    }
                }
            }
        }
    }
}