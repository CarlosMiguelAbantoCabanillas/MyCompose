package com.carlosmiguel.learncompose.ui.theme

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MyTextFieldParent(modifier: Modifier) {
    var email: String by remember { mutableStateOf("") }
    var password: String by remember { mutableStateOf("") }

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        MysecondTextField(value = email) { email = it }
        MyPasswordTextField(value = password) { password = it }
    }
}


@Composable
fun MysecondTextField(value: String, onUserChanged: (String) -> Unit) {
    TextField(
        value,
        onValueChange = { onUserChanged(it) },
        label = { Text("Introduce tu email") }
    )
}

@Composable
fun MyPasswordTextField(value: String, onUserChanged: (String) -> Unit) {
    var passwordHidden: Boolean by remember { mutableStateOf(value = true) }
    TextField(
        value = value,
        onValueChange = { onUserChanged(it) },
        singleLine = true,
        label = { Text("Introduce tu contraseña") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        visualTransformation = if (passwordHidden) PasswordVisualTransformation() else VisualTransformation.None,
        trailingIcon = {
            Text(
                text = if (passwordHidden) "Mostrar" else "Ocultar",
                modifier = Modifier.clickable { passwordHidden = !passwordHidden })
        }
    )
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun MyTextFieldParentPreview() {
    MyTextFieldParent(modifier = Modifier)
}











