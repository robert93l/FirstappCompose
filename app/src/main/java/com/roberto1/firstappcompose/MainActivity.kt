package com.roberto1.firstappcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            PreviewPersonalData()
            //PersonalData(name = "Brais")
        }

    }
    @Composable
    private fun PersonalData(name: String){
        MaterialTheme(){
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(16.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.descarga),
                contentDescription = "roberto que onda",
                modifier = Modifier.height(200.dp))
            
            Spacer(modifier = Modifier.height(50.dp))

            Text(text = "Mi nombre es $name")
            Text(text = "soy programador")
            Text(text = "@robertolazaro")
        }
    }}

    @Preview
    @Composable
    fun PreviewPersonalData(){
        PersonalData(name="Roberto")
    }
}