package com.carlosmiguel.learncompose.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ExcerciseOne(modifier: Modifier){
    Column(modifier = modifier.fillMaxSize()) {
        Box(modifier = Modifier
            .weight(1f)
            .fillMaxWidth()
            .background(Color.Cyan),
            contentAlignment = Alignment.Center
        ){
            Text(text = "Ejemplo 1")
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            Modifier
            .weight(1f)
            .fillMaxWidth()
        ){
            Box(Modifier
                .weight(1f)
                .fillMaxHeight()
                .background(Color.Red),
                contentAlignment = Alignment.Center
            ){
                Text(text = "Ejemplo 2")
            }
            Spacer(modifier = Modifier.width(20.dp))
            Box(Modifier
                .weight(1f)
                .fillMaxHeight()
                .background(Color.Green),
                contentAlignment = Alignment.Center){
                Text(text = "Ejemplo 3")
            }
        }
        Box(modifier = Modifier
            .weight(1f)
            .fillMaxWidth()
            .background(Color.Magenta),
            BottomCenter){
            Text(text = "Ejemplo 4")
        }
    }
}

@Composable
@Preview(showBackground = true,showSystemUi = true)
fun ExcercisoneOne(){
    ExcerciseOne(modifier = Modifier)
}