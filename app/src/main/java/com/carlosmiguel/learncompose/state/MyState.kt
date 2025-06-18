package com.carlosmiguel.learncompose.state

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MyState(modifier: Modifier) {
    var number by rememberSaveable { mutableIntStateOf(0) }
    Column (modifier = modifier){
        Text(text = "Pulsame: $number", modifier = modifier.clickable{number += 1})
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun MyStatePreview(){
    MyState(modifier = Modifier)
} 