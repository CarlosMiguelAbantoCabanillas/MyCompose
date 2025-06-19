package com.carlosmiguel.learncompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.carlosmiguel.learncompose.ui.theme.CheckBoxWithState
import com.carlosmiguel.learncompose.ui.theme.LearnComposeTheme
import com.carlosmiguel.learncompose.ui.theme.MyRadioButton
import com.carlosmiguel.learncompose.ui.theme.MyRadioButtonList
import com.carlosmiguel.learncompose.ui.theme.PantallaConfiguracion
import com.carlosmiguel.learncompose.ui.theme.ParentCheckBoxes
import com.carlosmiguel.learncompose.ui.theme.RadioButtonComponent
import com.carlosmiguel.learncompose.ui.theme.TriStateCheckbox


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface {
                    Scaffold(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(WindowInsets.systemBars.asPaddingValues())
                    ) { paddingValues -> // 👈 aquí renombramos el 'it'
                        Box(modifier = Modifier.padding(paddingValues)) {
                            MyRadioButton()
                        }
                    }
                }
            }
        }
    }
}





@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LearnComposeTheme {
        Greeting()
    }
}

@Composable
fun Greeting() {
    Text("Hello Carlos!")
}