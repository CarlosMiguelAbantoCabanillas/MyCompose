package com.carlosmiguel.learncompose

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp

@Composable
fun MyTexts(modifier: Modifier) {

    Column(modifier = modifier) {
        Text(text = "Carlos")
        Text(text = "Carlos rojo", color = Color.Red)
        Text(text = "Carlos", fontSize = 30.sp)
        Text(text = "Carlos", fontStyle = FontStyle.Italic)
        Text(
            text = "Carlos",
            fontWeight = FontWeight.ExtraBold,
            fontStyle = FontStyle.Italic,
            fontSize = 30.sp
        )
        Text(text = "Carlos", letterSpacing = 20.sp)
        Text(
            text = "www.Carlos.Miguel.com",
            textDecoration = TextDecoration.Underline,
            color = Color.Blue,
            modifier = Modifier.clickable {})
        Text(
            text = "Carlos",
            textDecoration = TextDecoration.Underline + TextDecoration.LineThrough
        )
        Text(text = "Carlos MAS MAS MAS MAS MAS MAS M M M M M M M M M M M",
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth().background(Color.Green),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis)
    }
}
