package com.example.f1rcaps

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity3 : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val button1 = findViewById<ImageButton>(R.id.button1)
        button1.setOnClickListener {
            val Intent = Intent(this, MainActivity4::class.java)
            startActivity(Intent)


        }

        val button2 = findViewById<ImageButton>(R.id.button2)
        button2.setOnClickListener {
            val Intent = Intent(this, MainActivity5::class.java)
            startActivity(Intent)


        }

        }
    }
