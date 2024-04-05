package com.aj79.morning

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class AboutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            About()
        }
    }
}



@Preview(showBackground = true)
@Composable
fun About() {
  Box {

      Column(

          modifier = Modifier
              .fillMaxSize()
              .background(Color.DarkGray)
              .padding(10.dp)
      ) {


    androidx.compose.foundation.Image(
              painter = painterResource
                  (id = R.drawable.img),
              contentDescription = "image",
              modifier = Modifier
                  .background(Color.Yellow)
                  .clip(CircleShape)
                  .size(150.dp),
              colorFilter = ColorFilter.tint(Color.Magenta),
              contentScale = ContentScale.FillBounds


          )
      }








      Column {
          Text(
              text = "about us", color = Color.Cyan , fontSize = 20.sp
          )

          val gg = LocalContext.current
          Text(text = "Click me",
              modifier = Modifier
                  .clickable {
                      gg.startActivity(Intent(gg, MainActivity::class.java))
                  }
          )





      }
  }

}



