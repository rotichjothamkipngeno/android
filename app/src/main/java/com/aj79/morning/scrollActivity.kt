package com.aj79.morning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

class scrollActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
       lazy()
        }
    }
}

//@Preview(showBackground = true)
@Composable
fun lazy() {

    LazyColumn {

item { 
    
    Column {
        Text(text = "hello ")


    }

}




    }
    



}


