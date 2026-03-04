package com.application.ecommerceappmvvm.presentation.navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.application.ecommerceappmvvm.presentation.navigation.Graph
import com.application.ecommerceappmvvm.presentation.navigation.screen.AuthScreen
import com.application.ecommerceappmvvm.presentation.screens.auth.login.LoginScreen
import com.application.ecommerceappmvvm.presentation.screens.auth.register.RegisterScreen

fun NavGraphBuilder.AuthNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.AUTH,
        startDestination = AuthScreen.Login.route /** Pantalla Principal */
    ) {
        composable( route = AuthScreen.Login.route ) {
            LoginScreen(navController)
        }

        composable( route = AuthScreen.Register.route ) {
            RegisterScreen(navController)
        }
    }
}