package com.carlosmiguel.learncompose.ui.theme


import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyButtons(modifier: Modifier) {
    Column(modifier = modifier) {
        Button(
            onClick = { Log.i("Carlos", "Boton Pulsado") },
            enabled = true,
            shape = RoundedCornerShape(20.dp),
            border = BorderStroke(3.dp,Color.Red),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.Red,
                containerColor = Color.White,
                disabledContentColor = Color.Yellow,
                disabledContainerColor = Color.Green
            )
        ) {
            Text("Pulsame")
        }
        OutlinedButton(onClick = {}, colors = ButtonDefaults.outlinedButtonColors(
            containerColor = Color.Blue
        )) {
            Text("Outlined")
        }
        TextButton(onClick = {}) {
            Text("Text Button")
        }
        ElevatedButton(onClick = {}) {
            Text("ElevatedButton")
        }
        FilledTonalButton(onClick = {}) {}
        Button(onClick = {}) { }
    }


}