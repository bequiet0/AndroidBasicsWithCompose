package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material.icons.sharp.Phone
import androidx.compose.material.icons.twotone.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    general()
                }
            }
        }
    }
}

@Composable
fun general(modifier: Modifier = Modifier){
    Column(
        modifier
            .fillMaxSize()
            .background(color = Color(0xFFD2E8D4))
        )
         {
        upperPart("Ryan Swither", "Android Developer Extreordinary")
        Spacer(modifier = Modifier.height(270.dp))
        lowerPart()
    }
}



@Composable
fun upperPart(fullName : String, title: String, modifier: Modifier = Modifier){
    Column(
        modifier
            .fillMaxWidth()
            .padding(top = 150.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = null,
            modifier
                .width(150.dp)
                .background(color = Color(0xE6071830))
        )
        Text(
            text = fullName,
            fontSize = 50.sp,
            fontWeight = FontWeight.Light
        )
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            style = TextStyle(color = Color(0xEB176835))
        )
    }
}

@Composable
fun lowerPart(modifier: Modifier = Modifier) {
    Column(Modifier.fillMaxWidth(),  horizontalAlignment = Alignment.CenterHorizontally) {
        Box(modifier.padding(bottom = 10.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    Icons.Rounded.Phone ,
                    contentDescription = "phoneIcon",
                    modifier
                        .padding(end = 20.dp)
                        .size(30.dp),
                    tint = Color(0xFF186924)
                )
                Text(
                    text = "+11 (343) 342 534",
                    modifier
                        .padding(end = 41.dp)
                )
            }
        }
        Box(modifier.padding(bottom = 10.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    Icons.Rounded.Share,
                    contentDescription = "shareIcon",
                    modifier
                        .padding(end = 20.dp)
                        .size(30.dp),
                    tint = Color(0xFF186924)
                )
                Text(
                    text = "@androidDev",
                    modifier
                        .padding(end = 80.dp)
                )
            }
        }
        Box {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    Icons.Rounded.Email ,
                    contentDescription = "emailIcon",
                    modifier
                        .padding(end = 20.dp)
                        .size(30.dp),
                    tint = Color(0xFF186924)
                )
                Text(text = "androidDev@gmail.com")
            }
        }
    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    BusinessCardAppTheme {
        general()
    }
}