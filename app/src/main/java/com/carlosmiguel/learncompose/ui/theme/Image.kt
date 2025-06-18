package com.carlosmiguel.learncompose.ui.theme

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage

@Preview
@Composable
fun MyImge() {
//    Image(
//        painter = painterResource(R.drawable.persona),
//        contentDescription = "avatar image profile",
//        modifier = Modifier
//            .size(300.dp)
//            .clip(RoundedCornerShape(50))
//            .border(width = 5.dp, shape = CircleShape,
//                brush = Brush.linearGradient(colors = listOf(Color.Red,Color.Blue, Color.Yellow))),
//        contentScale = ContentScale.FillBounds
//    )

    AsyncImage(
        model = "https://e.radio-grpp.io/large/2022/06/28/422242_1278486.jpg",
        contentDescription = "avatar image profile",
        modifier = Modifier
            .size(300.dp)
            .clip(RoundedCornerShape(50))
            .border(width = 5.dp, shape = CircleShape,
                brush = Brush.linearGradient(colors = listOf(Color.Red,Color.Blue, Color.Yellow))),
        contentScale = ContentScale.FillBounds
    )
}


