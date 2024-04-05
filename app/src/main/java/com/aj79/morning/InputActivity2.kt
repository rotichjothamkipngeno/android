
package com.aj79.morning

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Text as Text

class InputActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Form()

        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Form() {
    Column (

        modifier = Modifier
            .background(Color.Gray)

            .padding(20.dp),





    ){

        var name by remember { mutableStateOf(TextFieldValue(""))}
        TextField(value = name,
            onValueChange = {name = it},
            label = { Text(text = "NAME")},
            textStyle =  TextStyle(Color.Blue),

            leadingIcon = { Icon(imageVector =Icons.Default.Face , contentDescription ="" ) },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor  = Color.Blue,
                unfocusedBorderColor = Color.Magenta,
                focusedLabelColor = Color.Blue,
                unfocusedLabelColor = Color.Blue,
                focusedLeadingIconColor = Color.Magenta,
                unfocusedLeadingIconColor = Color.Magenta,
                cursorColor = Color.White



            )





        )



        Spacer(modifier = Modifier.height(10.dp))

        var email by remember { mutableStateOf(TextFieldValue(""))}

        OutlinedTextField(value = email,
            onValueChange = {email = it},
            label = { Text(text = "email")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)

        )
        var phone by remember {
            mutableStateOf(TextFieldValue(""))

        }
        OutlinedTextField(value = phone,
        onValueChange = {phone = it},
        label = { Text(text = "number")},
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)

        )



val  about = LocalContext.current
        Button(
            {about.startActivity(Intent(about, AboutActivity::class.java))},
        shape = RoundedCornerShape(31.dp),
        colors = ButtonDefaults.outlinedButtonColors(Color.Green)
        ){
            Text(text = "LOGIN",color= Color.Yellow)



        }



    Row (){

        

    }

    }


}





