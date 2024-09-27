package com.example.lenguajesdeprogramacion.LenguajesProgramacion.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.lenguajesdeprogramacion.R

@Composable
fun CppScreen(navController: NavController) {
    val nextScreen = "home_screen"
    val previousScreen = "mysql_screen"

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF121212)),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "C++",
                style = MaterialTheme.typography.headlineMedium,
                color = Color(0xFF00FFFF),
                modifier = Modifier.padding(bottom = 8.dp)
            )

            Text(
                text = "C++ es un lenguaje de programación poderoso y de propósito general que se utiliza principalmente en el desarrollo de sistemas de alto rendimiento.",
                color = Color(0xFF00FFFF),
                modifier = Modifier.padding(horizontal = 16.dp)
            )
        }
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .padding(16.dp),
            painter = painterResource(id = R.drawable.cpp),
            contentDescription = "Imagen de presentación"
        )

        Spacer(modifier = Modifier.weight(1f))


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(
                onClick = { navController.navigate(previousScreen) },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Yellow)
            ) {
                Text("Atrás", color = Color.Black)
            }


            Button(
                onClick = { navController.navigate(nextScreen) },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Yellow)
            ) {
                Text("Volver a inicio", color = Color.Black)
            }
        }
    }
}

