package com.application.ecommerceappmvvm.presentation.screens.auth.register

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.application.ecommerceappmvvm.presentation.components.DefaultTopBar
import com.application.ecommerceappmvvm.presentation.screens.auth.register.components.RegisterContent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            DefaultTopBar(
                title = "Registro",
                upAvailable = true,
                navController = navController
            )
        }
    ) { paddingValues ->
        RegisterContent(paddingValues = paddingValues)
    }
}