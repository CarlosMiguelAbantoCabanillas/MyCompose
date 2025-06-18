package com.carlosmiguel.learncompose.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun MyBasicConstraintLayout() {
    ConstraintLayout(modifier = Modifier.fillMaxSize()){
        val(boxCyan,boxBlack,boxDarkGray,boxBlue,boxRed,boxGray,boxGreen,boxMagenta,boxYellow) = createRefs()

        Box(modifier = Modifier.size(250.dp).background(Color.Cyan).constrainAs(boxCyan){
            bottom.linkTo(boxMagenta.top)
            end.linkTo(boxMagenta.end)
        })
        Box(modifier = Modifier.size(150.dp).background(Color.Black).constrainAs(boxBlack){
            start.linkTo(boxCyan.end)
            end.linkTo(boxDarkGray.start)
            top.linkTo(boxCyan.top)
            bottom.linkTo(boxCyan.bottom)
        })
        Box(modifier = Modifier.size(250.dp).background(Color.DarkGray).constrainAs(boxDarkGray){
            bottom.linkTo(boxGreen.top)
            start.linkTo(boxGreen.start)
        })

        Box(modifier = Modifier.size(300.dp).background(Color.Blue).constrainAs(boxBlue){
            top.linkTo(boxYellow.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        })

        Box(modifier = Modifier.size(150.dp).background(Color.Red).constrainAs(boxRed){
            top.linkTo(boxYellow.bottom)
            start.linkTo(boxYellow.end)
        })
        Box(modifier = Modifier.size(150.dp).background(Color.Gray).constrainAs(boxGray){
            top.linkTo(boxYellow.bottom)
            end.linkTo(boxYellow.start)
        })
        Box(modifier = Modifier.size(150.dp).background(Color.Green).constrainAs(boxGreen){
            bottom.linkTo(boxYellow.top)
            start.linkTo(boxYellow.end)
        })
        Box(modifier = Modifier.size(150.dp).background(Color.Magenta).constrainAs(boxMagenta){
            bottom.linkTo(boxYellow.top)
            end.linkTo(boxYellow.start)
        })
        Box(modifier = Modifier.size(150.dp).background(Color.Yellow).constrainAs(boxYellow){
            bottom.linkTo(parent.bottom)
            end.linkTo(parent.end)
            top.linkTo(parent.top)
            start.linkTo(parent.start)
        })
    }
}


@Composable
@Preview(showBackground = true, widthDp = 600, heightDp = 1050)
fun ConstraintLayout(){
    MyBasicConstraintLayout()
}
