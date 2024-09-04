package com.example.classwork

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Arrangement.Vertical
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.classwork.ui.theme.ClassworkTheme
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ClassworkTheme {




                }
            }
        }
    }
@Composable
fun Greeting() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Logoandname()
        Spacer(modifier = Modifier.height(24.dp))
        ContactInfoSection()
    }
}
@Composable
fun Logoandname(){
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Image(painter = painterResource(id = R.drawable.pic_one),
            contentDescription =null
        )
        Spacer(modifier = Modifier.height(8.dp))
          Text(text = "Aguoru johnbosco", fontSize=16.sp, fontWeight =  FontWeight.Bold)
        Text(text = "Investor", fontSize=16.sp, color = Color.Gray)
    }
}
@Composable
fun ContactInfoSection() {
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        ContactInfoItem(
            icon = ImageVector.vectorResource(id = R.drawable.phone_logo), // Replace with your icon resource
            contactText = "09137941884"
        )
        ContactInfoItem(
            icon = ImageVector.vectorResource(id = R.drawable.instagram_reveals_simplified_logo_and_app_design), // Replace with your icon resource
            contactText = "AguoruJB"
        )
        ContactInfoItem(
            icon = ImageVector.vectorResource(id = R.drawable.twitter_x_icon_png), // Replace with your icon resource
            contactText = "AguoruJB"
        )
    }
    }


@Composable
fun  ContactInfoItem  (icon: ImageVector, contactText: String){
    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color(0xFF3ddc84),
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = contactText,
            fontSize = 16.sp
        )
    }
}
@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun GreetingPreview() {
    ClassworkTheme {
        Greeting ()
        ContactInfoSection()

    }
}

