package com.aasdrithtechnologies.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var username=findViewById<EditText>(R.id.txtuser)
        var password=findViewById<EditText>(R.id.txtpass)
        var login=findViewById<Button>(R.id.btnLogin)
        var reset=findViewById<Button>(R.id.btnReset)



        login.setOnClickListener{
            var usr:String=username.text.toString()
            var pass:String=password.text.toString()
            if(usr=="admin"&&pass=="admin"){
               val intent=Intent(this,HomeActivity::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(applicationContext,"this is toast message",Toast.LENGTH_SHORT).show()
            }
        }

        reset.setOnClickListener{
            username.getText().clear()
            password.getText().clear()
        }
    }
}