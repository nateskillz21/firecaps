package com.example.f1rcaps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageButton

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        supportActionBar?.hide()

        val button7 = findViewById<ImageButton>(R.id.imageButton2)
        button7.setOnClickListener {
            val Intent = Intent(this, MainActivity6::class.java)
            startActivity(Intent)


        }
    }
}