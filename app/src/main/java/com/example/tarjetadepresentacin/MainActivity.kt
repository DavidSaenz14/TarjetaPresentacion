package com.example.tarjetadepresentacin

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tarjetadepresentacin.ui.theme.TarjetaDePresentaciónTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaDePresentaciónTheme {
                Tarjeta_Presentacion(modifier = Modifier.fillMaxSize())
            }
        }
    }
}

@Composable
fun Tarjeta_Presentacion(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Image(
            painterResource(R.drawable.carta_presentacion),
            contentDescription = "1"
        )
        Text(stringResource(R.string.david_s_enz_de_pipa_n))
        Text(stringResource(R.string.estudiante_de_grado_superior))
        Spacer(modifier = Modifier.height(100.dp))
        Text(stringResource(R.string._34_678_768_567))
        Text(stringResource(R.string.androiddev))
        Text(stringResource(R.string.dam115_2023_gmail_com))
    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    Tarjeta_Presentacion(modifier = Modifier.fillMaxSize())
}
