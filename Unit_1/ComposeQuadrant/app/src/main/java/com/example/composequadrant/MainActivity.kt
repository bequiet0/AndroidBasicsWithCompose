package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
                }
            }
        }
    }



@Composable
fun ComposeQuadrantApp(){
    Column(Modifier.fillMaxSize()) {
            Row(Modifier.weight(1f)) {
                ComposableInfoCard(
                    title = stringResource(R.string.text_composable),
                    description = stringResource(R.string.Desc1),
                    backgroundColor = Color(0xFFEADDFF),
                    modifier = Modifier.weight(1f)
                )
                ComposableInfoCard(
                    title = stringResource(R.string.image_composable),
                    description = stringResource(R.string.Desc2),
                    backgroundColor = Color(0xFFD0BCFF),
                    modifier = Modifier.weight(1f)
                )
            }
            Row(Modifier.weight(1f)) {
                ComposableInfoCard(
                    title = stringResource(R.string.row_composable),
                    description = stringResource(R.string.Desc3),
                    backgroundColor = Color(0xFFD0BCFF),
                    modifier = Modifier.weight(1f)
                )
                ComposableInfoCard(
                    title = stringResource(R.string.column_composable),
                    description = stringResource(R.string.Desc4),
                    backgroundColor = Color(0xFFEADDFF),
                    modifier = Modifier.weight(1f)
                )
            }
    }
}

@Composable
private fun ComposableInfoCard(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ComposeQuadrantAppPreview() {
    ComposeQuadrantTheme {
        ComposeQuadrantApp()
    }
}