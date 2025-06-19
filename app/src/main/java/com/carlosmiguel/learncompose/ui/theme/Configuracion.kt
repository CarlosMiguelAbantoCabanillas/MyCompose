package com.carlosmiguel.learncompose.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PantallaConfiguracion() {
    // Estados
    var modoOscuro by remember { mutableStateOf(true) }
    var notificaciones by remember { mutableStateOf(false) }
    var mostrarConsejos by remember { mutableStateOf(true) }
    var usarDatosMoviles by remember { mutableStateOf(false) }
    var idiomaSeleccionado by remember { mutableStateOf("Español") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "Configuración de la App",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )

        // Switches
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text("Modo oscuro")
            Switch(checked = modoOscuro, onCheckedChange = { modoOscuro = it })
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text("Notificaciones activadas")
            Switch(checked = notificaciones, onCheckedChange = { notificaciones = it })
        }

        // Checkboxes
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text("Mostrar consejos")
            Checkbox(checked = mostrarConsejos, onCheckedChange = { mostrarConsejos = it })
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text("Usar datos móviles")
            Checkbox(checked = usarDatosMoviles, onCheckedChange = { usarDatosMoviles = it })
        }

        // Radio Buttons
        Text(text = "Idioma preferido:", fontWeight = FontWeight.Medium)

        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(
                selected = idiomaSeleccionado == "Español",
                onClick = { idiomaSeleccionado = "Español" }
            )
            Text("Español")
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(
                selected = idiomaSeleccionado == "Inglés",
                onClick = { idiomaSeleccionado = "Inglés" }
            )
            Text("Inglés")
        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = { /* Guardar cambios */ },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp)
        ) {
            Text(text = "Guardar cambios")
        }
    }
}
