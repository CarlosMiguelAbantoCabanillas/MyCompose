package com.carlosmiguel.learncompose.ui.theme

import android.R.attr.text
import android.content.ComponentName
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.Dimension.Companion.value
import com.carlosmiguel.learncompose.R
import com.carlosmiguel.learncompose.state.CheckBoxState

@Composable  
fun MySwitch(modifier: Modifier = Modifier) {
    var switchState : Boolean by remember { mutableStateOf(true) }
    Box(modifier = modifier.fillMaxSize(),contentAlignment = Alignment.Center) {
        Switch(checked = switchState,
            onCheckedChange = { switchState = it},
            thumbContent = {
                Icon(
                    painter = painterResource(R.drawable.personita),
                    contentDescription = "")},
            enabled = true,
            colors = SwitchDefaults.colors(
                //Bolita
                checkedThumbColor = Color.Red,
                uncheckedThumbColor = Color.Blue,
                disabledCheckedThumbColor = Color.Yellow,
                disabledUncheckedThumbColor = Color.Cyan,
                //Icono
                checkedIconColor = Color.Green,
                uncheckedIconColor = Color.Cyan,
                disabledUncheckedIconColor = Color.Red,
                disabledCheckedIconColor = Color.Red,
                //Borde
                checkedBorderColor = Color.Magenta,
                uncheckedBorderColor = Color.Magenta,
                disabledCheckedBorderColor = Color.Magenta,
                disabledUncheckedBorderColor = Color.Magenta,
                //Fondo
                checkedTrackColor = Color.White,
                uncheckedTrackColor = Color.Black,
                disabledCheckedTrackColor = Color.White,
                disabledUncheckedTrackColor = Color.Black))
    }
}


@Composable
fun Mycheckbox(modifier: Modifier = Modifier) {
    var state : Boolean by remember { mutableStateOf(false) }
    Box(modifier = modifier.fillMaxSize(),contentAlignment = Alignment.Center){
        Row (verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.clickable{state = !state}) {
            Checkbox(
                checked = state,
                onCheckedChange = { state = it },
                enabled = true,
                colors = CheckboxDefaults.colors(
                    checkedColor = Color.Green,
                    checkmarkColor = Color.DarkGray,
                    uncheckedColor = Color.Black,
                    disabledCheckedColor = Color.Yellow,
                    disabledUncheckedColor = Color.Red
                )
            )
            Spacer(Modifier.width(12.dp))
            Text(text = "Acepto los terminos y condiciones")
        }
    }
}


@Composable
fun ParentCheckBoxes(modifier: Modifier = Modifier) {

    var state:List<CheckBoxState> by remember {
        mutableStateOf(
            listOf(
                CheckBoxState(id = "terms", label = "Aceptar los terminos y condiciones"),
                CheckBoxState(id = "newsletter", label = "Recibir la newsletter", checked = true),
                CheckBoxState(id = "updates", label = "Recibir actualizaciones"),
            )
        )
    }

    Column(modifier = modifier.fillMaxSize()){
        state.forEach { myState ->
            CheckBoxWithState(checkBoxState = myState) {
                state = state.map {
                    if (it.id == myState.id) {
                        myState.copy(checked = !myState.checked)
                    } else {
                        it
                    }
                }
            }
        }
    }
}


@Composable
fun CheckBoxWithState(modifier: Modifier = Modifier, checkBoxState: CheckBoxState, onCheckedChange: (CheckBoxState) -> Unit){
    Row (verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.clickable{onCheckedChange(checkBoxState)}) {
        Checkbox(
            checked = checkBoxState.checked,
            onCheckedChange = { onCheckedChange(checkBoxState) },
            enabled = true,

        )
        Spacer(Modifier.width(12.dp))
        Text(checkBoxState.label)
    }
}


@Composable
fun TriStateCheckbox(modifier: Modifier = Modifier) {

    var parentState: Boolean by remember { mutableStateOf(false) } // Cambié ToggleableState por Boolean
    var child1: Boolean by remember { mutableStateOf(false) }
    var child2: Boolean by remember { mutableStateOf(false) }

    LaunchedEffect(child1, child2) {
        parentState = when {
            child1 && child2 -> true // Asigna true si ambos son seleccionados
            !child1 && !child2 -> false // Asigna false si ambos no son seleccionados
            else -> false // Estado indeterminado, puedes poner un valor por defecto
        }
    }





    Column(modifier = modifier) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(
                checked = parentState,
                onCheckedChange = {
                    parentState = it
                    child1 = it
                    child2 = it
                }
            )
            Text(text = "Seleccionar todo")
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(horizontal = 16.dp)
        ) {
            Checkbox(checked = child1, onCheckedChange = { child1 = it })
            Text(text = "Ejemplo 1")
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(horizontal = 16.dp)
        ) {
            Checkbox(checked = child2, onCheckedChange = { child2 = it })
            Text(text = "Ejemplo 2")
        }
    }
}


@Composable
fun MyRadioButton(modifier: Modifier = Modifier) {
    var state by remember { mutableStateOf(false) }
    Row (modifier = modifier, verticalAlignment = Alignment.CenterVertically){
        RadioButton(
        selected = state,
        onClick = {state = true},
        enabled = false,
            colors = RadioButtonDefaults.colors(
                selectedColor = Color.Red,
                unselectedColor = Color.Yellow,
                disabledSelectedColor = Color.Green,
                disabledUnselectedColor = Color.Magenta
            )
        )
        Text(text = "Ejemplo 1")
    }
}


@Composable
fun MyRadioButtonList(modifier: Modifier = Modifier) {
    var selectedName:String by remember { mutableStateOf("") }
    Column{
        RadioButtonComponent(name= "Carlos", selectedName = selectedName) { selectedName = it }
        RadioButtonComponent(name= "Miguel", selectedName = selectedName) { selectedName = it }
        RadioButtonComponent(name= "Abanto", selectedName = selectedName) { selectedName = it }
        RadioButtonComponent(name= "Cabanillas", selectedName = selectedName) { selectedName = it }
        RadioButtonComponent(name= "Maria", selectedName = selectedName) { selectedName = it }

    }
}

@Composable
fun RadioButtonComponent(name: String, selectedName: String? ,onItemSelect: (String) -> Unit) {
    Row (verticalAlignment = Alignment.CenterVertically){
        RadioButton(selected = name == selectedName, onClick = { onItemSelect(name) })
        Text(name,modifier = Modifier.clickable { onItemSelect(name) })
    }
}








































