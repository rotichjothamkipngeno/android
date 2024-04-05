package com.aj79.morning

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Greeting()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun Greeting() {
    
    Column(

        modifier = Modifier
            .background(Color.Blue)
//            .fillMaxWidth()
//            .fillMaxHeight()
            .fillMaxSize(),
//        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally



    ){






        Row(
            modifier= Modifier
                .background(Color.Magenta)
                .fillMaxWidth(),

            horizontalArrangement = Arrangement.SpaceEvenly

        ) {
            Spacer(modifier = Modifier.width(5.dp))
          val image = LocalContext.current
          Button({ image.startActivity(Intent(image, ImageActivity::class.java))}) {
              Text("image")
              Spacer(modifier = Modifier.height(10.dp))

              Spacer(modifier = Modifier.width(5.dp))
              val gg = LocalContext.current
              Text(text = "Click me",
                  modifier = Modifier
                      .clickable {
                          gg.startActivity(Intent(gg, InputActivity2::class.java))
                      }
              )
              Spacer(modifier = Modifier.width(5.dp))
              val cc = LocalContext.current
              Text(text = "Card",
                  modifier = Modifier
                      .clickable {
                          cc.startActivity(Intent(cc, CardActivity2::class.java))
                      }
              )
              Spacer(modifier = Modifier.width(5.dp))
              val gr = LocalContext.current
              Text(text = "grd",
                  modifier = Modifier
                      .clickable {
                          gr.startActivity(Intent(gr, GridActivity::class.java))
                      }
              )
              Spacer(modifier = Modifier.width(5.dp))
              val gy = LocalContext.current
              Text(text = "home",
                  modifier = Modifier
                      .clickable {
                          gy.startActivity(Intent(gy, HomeActivity::class.java))
                      }
              )







          }






//            val image = LocalContext.current
//            Text(text = "Click me",
//                modifier = Modifier
//                    .clickable {
//                        image.startActivity(Intent(image,MainActivity::class.java))
//                    }
//            )






            Text(text = "CHATS",fontFamily = FontFamily.Cursive )
            Spacer(modifier = Modifier.width(60.dp), )

            Text(text = "STATUS",fontFamily = FontFamily.Cursive )
            Spacer(modifier = Modifier.width(60.dp))
            Text(text = "CALLS",fontFamily = FontFamily.Cursive )
            Spacer(modifier = Modifier.width(60.dp))
        }
        Spacer(modifier = Modifier.height(height = 90.dp))
        Text(text = "coding is good", color =  Color.Red)
        Text(text = "elephant" , color = Color.Magenta, fontFamily = FontFamily.Cursive , modifier = Modifier.background(Color.Gray ))
    }
    
}


