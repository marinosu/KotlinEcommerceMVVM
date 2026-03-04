package com.application.ecommerceappmvvm.presentation.screens.auth.register

import android.util.Patterns
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RegisterViewModel @Inject constructor(): ViewModel() {
    var state by mutableStateOf(RegisterState())

    var errorMessage by mutableStateOf("")
        private set

    fun onNameInput(input: String) {
        state = state.copy(name = input)
    }

    fun onLastnameInput(input: String) {
        state = state.copy(lastname = input)
    }

    fun onEmailInput(input: String) {
        state = state.copy(email = input)
    }

    fun onPhoneInput(input: String) {
        state = state.copy(phone = input)
    }

    fun onPasswordInput(input: String) {
        state = state.copy(password = input)
    }

    fun onConfirmPasswordInput(input: String) {
        state = state.copy(confirmPassword = input)
    }

    /**
     * Método asyncrono
     */
    fun validateForm() = viewModelScope.launch {
        if (state.name == "") {
            errorMessage = "Ingrese el nombre"
        }
        else if (state.lastname == "") {
            errorMessage = "Ingrese el apellido"
        }
        else if (state.email == "") {
            errorMessage = "Ingrese el email"
        }
        else if (state.phone == "") {
            errorMessage = "Ingrese el teléfono"
        }
        else if (state.password == "") {
            errorMessage = "Ingrese el password"
        }
        else if (state.confirmPassword == "") {
            errorMessage = "Ingrese el password de confirmación"
        }
        else if (!Patterns.EMAIL_ADDRESS.matcher(state.email).matches()) {
            errorMessage = "El email no es válido"
        }
        else if (state.password.length < 6) {
            errorMessage = "La contraseña debe tener al menos 6 caracteres"
        }
        else if (state.password != state.confirmPassword) {
            errorMessage = "Las contraseñas no coinciden"
        }

        /**
         * Delay de 3 segundos
         */
        delay(3000)
        errorMessage = ""
    }
}