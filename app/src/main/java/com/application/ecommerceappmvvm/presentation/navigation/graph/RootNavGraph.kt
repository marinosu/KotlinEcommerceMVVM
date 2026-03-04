package com.application.ecommerceappmvvm.presentation.navigation.graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.application.ecommerceappmvvm.presentation.navigation.Graph

@Composable
fun RootNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        route = Graph.ROOT,
        startDestination = Graph.AUTH
    ) {
        AuthNavGraph(navController = navController)
    }
}

/**
 * Gráfico de navegación
 * Antes se usaba intents
 * Para pasar de una pantalla a otra pantalla
 */