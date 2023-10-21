package com.example.f1rcaps

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity5 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val button8 = findViewById<ImageButton>(R.id.imageButton3)
        button8.setOnClickListener {
            val Intent = Intent(this, MainActivity7::class.java)
            startActivity(Intent)
        }
    }
}