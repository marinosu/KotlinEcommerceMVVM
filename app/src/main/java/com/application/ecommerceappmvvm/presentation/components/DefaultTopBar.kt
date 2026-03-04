package com.application.ecommerceappmvvm.presentation.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DefaultTopBar(
    title: String,
    upAvailable: Boolean = false,
    navController: NavHostController? = null /** Parámetro Opcional */
) {
    /** CenterAlignedTopAppBar
     * SmallTopAppBar
     * MediumTopAppBar
     * LargeTopAppBar
     */
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = "Registro",
                fontSize = 19.sp
            )
        },
        navigationIcon = {
            /**  if(navController != null) */
            if (upAvailable) {
                /** Metodo que me permite regresar a la pantalla anterior */
                IconButton(
                    onClick = { navController?.popBackStack() }
                ) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = ""
                    )
                }
            }
        },
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.background,
            titleContentColor = MaterialTheme.colorScheme.onBackground
        )
    )
}