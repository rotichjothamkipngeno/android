package com.aj79.morning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aj79.morning.ui.theme.MorningTheme

class GridActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Gridd()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Gridd(


) {

    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        item (
        ){

           Column (modifier = Modifier.fillMaxSize() ,

//        horizontalAlignment = Alignment.End

           ){
            Row (

                horizontalArrangement = Arrangement.Absolute.SpaceBetween
            ){


                Image(imageVector = Icons.Default.Person, contentDescription = "")
                Text(text = "",fontFamily = FontFamily.Cursive )
                Spacer(modifier = Modifier.width(120.dp), )

                Image(imageVector = Icons.Default.Place, contentDescription = "")
                Text(text = "NAIROBI",fontFamily = FontFamily.Cursive )
                Spacer(modifier = Modifier.width(140.dp), )

                Image(imageVector = Icons.Default.ThumbUp, contentDescription = "")
                Text(text = "",fontFamily = FontFamily.Cursive )
                Spacer(modifier = Modifier.width(10.dp),
                    )



            }


               
               
               
               
               
               
               
               

             Row ( horizontalArrangement = Arrangement.SpaceEvenly,
                 modifier = Modifier
                     .padding(10.dp)
                     .fillMaxSize(),


             ){
                 androidx.compose.material3.Card (
                     modifier = Modifier
                         .padding(9.dp)
                         .height(50.dp)
                         .width(100.dp)
                 ){

                     Image(imageVector = Icons.Default.Home, contentDescription ="" ,
                         )
                     Text( "location")

                 }
androidx.compose.material3.Card (
                     modifier = Modifier
                         .padding(9.dp)
                         .height(50.dp)
                         .width(100.dp)
                 ){

                     Image(imageVector = Icons.Default.Phone, contentDescription ="" )
                      Text("contact us")
                 }

             }
 Row ( horizontalArrangement = Arrangement.SpaceEvenly,
                 modifier = Modifier
                     .padding(10.dp)
                     .fillMaxSize(),


             ){
                 androidx.compose.material3.Card (
                     modifier = Modifier
                         .padding(9.dp)
                         .height(50.dp)
                         .width(100.dp)
                 ){

                     Image(imageVector = Icons.Default.Notifications, contentDescription ="" ,
                         )
                     Text( "Notification")

                 }
androidx.compose.material3.Card (
                     modifier = Modifier
                         .padding(9.dp)
                         .height(50.dp)
                         .width(100.dp)
                 ){

                     Image(imageVector = Icons.Default.Settings, contentDescription ="" )
                      Text("Services")
                 }

             }











               Row(
                   horizontalArrangement = Arrangement.SpaceEvenly,
                   modifier = Modifier
                       .padding(10.dp)
                       .fillMaxSize(),
//
                   ){ androidx.compose.material3.
               Card (
                   elevation = CardDefaults.cardElevation(15.dp),
                   border = BorderStroke(1.dp, Color.Gray)
               ) {

                   Image(painter = painterResource(id = R.drawable.car4), contentDescription ="" )
                   Text(text = "car")

               }
                androidx.compose.material3.
               Card (
                   elevation = CardDefaults.cardElevation(9.dp),
                   border = BorderStroke(1.dp, Color.Gray)
               ) {

                   Image(painter = painterResource(id = R.drawable.car4), contentDescription ="" )
                   Text(text = "car")

               }

//               Row(
//                   horizontalArrangement = Arrangement.SpaceEvenly,
//                   modifier = Modifier
//                       .padding(10.dp)
//                       .fillMaxSize(),
//
//
//               ) {
//                   androidx.compose.material3.Card  (
//                       elevation = CardDefaults.cardElevation(9.dp),
//                       border = BorderStroke(1.dp, Color.Gray)
//
//                   ){
//                       Image(painter = painterResource(id = R.drawable.about), contentDescription = "" )
//
//                   }
//                   androidx.compose.material3.Card  (
//                       elevation = CardDefaults.cardElevation(9.dp),
//                       border = BorderStroke(1.dp, Color.Gray)
//
//                   ){
//                       Image(painter = painterResource(id = R.drawable.about), contentDescription = "" )
//
//                   }

//               }



           }




            }


























        }





    }


}

