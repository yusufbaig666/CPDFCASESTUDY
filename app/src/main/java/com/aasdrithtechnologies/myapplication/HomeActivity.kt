package com.aasdrithtechnologies.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        var profile=findViewById<ImageView>(R.id.img)
        var results=findViewById<ImageView>(R.id.imgres)

        profile.setOnClickListener{
            intent= Intent(this,EmployeeProfile::class.java)
            startActivity(intent)
        }
        results.setOnClickListener{
            intent= Intent(this,EmployeeResults::class.java)
            startActivity(intent)
        }
    }
}