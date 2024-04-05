package com.aj79.morning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.expandVertically
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aj79.morning.ui.theme.MorningTheme

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
              Act()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Act() {

    Box(
        modifier = Modifier
            .fillMaxSize()
//            .height(400.dp)
//            .width(400.dp)

    ) {
        Image(
            modifier = Modifier
                .fillMaxSize(),
            painter = painterResource(id = R.drawable.uu),
            contentDescription = "", contentScale = ContentScale.Crop

        )

        Column {

        Row (
            horizontalArrangement = Arrangement.Absolute.SpaceBetween


        )

        {
            Spacer(modifier =Modifier.width(130.dp) )

            Image(imageVector = Icons.Default.Person, contentDescription = "")
            Text(text = "TRAVELEZY",fontFamily = FontFamily.Cursive, color = Color.Yellow )




        }
            Spacer(modifier =Modifier.height(600.dp))
            Row () {
                androidx.compose.material3.Card(
                    modifier =
                    Modifier
                        .background(Color.Black)
                        .padding(20.dp)
                        .background(Color.Black),


                ) {

                    Text(
                        text = "   CREATE a django project\n" +
                                "   inside the created projectxcreate an app\n" +
                                "   in the project settings file, install the app\n" +
                                "inside the app create a url file\n" +
                                "in the project  urls import include\n" +
                                "create a default url/path and include your app  urls file\n" +
                                "\n" +
                                "in the app urls file within",

                        modifier = Modifier
                            .background(Color.Black)
                            .padding(10.dp),


                    )

                }
            }





       }


    }







}


