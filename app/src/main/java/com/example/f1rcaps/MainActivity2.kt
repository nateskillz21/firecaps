package com.example.f1rcaps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import java.lang.Math.abs
import android.os.Handler
import android.os.Looper



class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2);



        Handler().postDelayed({
            val intent = Intent(this@MainActivity2, MainActivity3::class.java)
            startActivity(intent)
            finish()
        }, 2500)


    }
}
