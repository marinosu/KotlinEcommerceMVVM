package com.application.ecommerceappmvvm.presentation.navigation.screen

sealed class AuthScreen(val route: String) {
    object Login: AuthScreen("login")
    object Register: AuthScreen("register")
}

/**
 * Los archivos sealed class no esta en esta versión de kotlin (Panda 1 : 2025)
 * Solo se crea un archivo de kotlin normal, y se escribe la función "sealed class"
 */