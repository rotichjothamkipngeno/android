package com.aj79.morning

import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest

class ImageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

             Picha()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Picha() {
    
    Column(

        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray)
            .padding(10.dp)
    ) {
       
        
//        Image(painter = painterResource
//            (id = R.drawable.img),
//            contentDescription = "image",
//        modifier = Modifier
//            .background(Color.Yellow)
//            .clip(CircleShape )
//            .size(150.dp),
//            colorFilter = ColorFilter.tint(Color.Magenta),
//            contentScale = ContentScale.FillBounds
//
//        )


        val result = remember { mutableStateOf<Uri?>(null) }
        val launcher = rememberLauncherForActivityResult(ActivityResultContracts.PickVisualMedia()) {
            result.value = it
        }

        Column (){





            Button(onClick = {
                launcher.launch(
                    PickVisualMediaRequest(mediaType = ActivityResultContracts.PickVisualMedia.ImageOnly),
                )
            }) {
                Text(text = "Select Image")
            }

            result.value?.let { image ->

                val painter = rememberAsyncImagePainter(
                    ImageRequest
                        .Builder(LocalContext.current)
                        .data(data = image)
                        .build()
                )
                Image(
                    painter = painter,
                    contentDescription = null,
                    modifier = Modifier.size(150.dp, 150.dp)
                        .padding(16.dp)
                )

            }

            AsyncImage(
                model = " https://www.google.com/imgres?q=coil%20jetpack%20compose&imgurl=https%3A%2F%2Fmiro.medium.com%2Fv2%2Fresize%3Afit%3A1000%2F1*KWQCocqgO6gXm57fSTjQTw.png&imgrefurl=https%3A%2F%2Fmjmanaog.medium.com%2Fjetpack-compose-tips-load-an-image-from-url-using-coil-fast-and-easy-742b52a1dddc&docid=bVigwCmhyl8vZM&tbnid=jLJnt93h4fDWFM&vet=12ahUKEwjQ09a2_6eFAxWs9gIHHeuSD4AQM3oECGgQAA..i&w=1000&h=500&hcb=2&ved=2ahUKEwjQ09a2_6eFAxWs9gIHHeuSD4AQM3oECGgQAA",
                contentDescription = null,
            )


        }










    }




}


