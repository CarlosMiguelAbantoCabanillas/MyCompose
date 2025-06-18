package com.carlosmiguel.learncompose.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun MyColumn(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceEvenly) {
        Text("Abanto Cabanillas 1", modifier = Modifier.background(Color.Red))
        Text("Abanto Cabanillas 2", modifier = Modifier.background(Color.Blue))
        Text("Abanto Cabanillas 3", modifier = Modifier.background(Color.Cyan))
        Text("Abanto Cabanillas 4", modifier = Modifier.background(Color.Gray))
        Text("Abanto Cabanillas 5", modifier = Modifier.background(Color.Yellow))
    }
}
