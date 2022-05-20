package com.example.hotelbooking

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class Detail3: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.details3)
        val btnback: Button =findViewById(R.id.button7)
        btnback.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


        val button: Button =findViewById(R.id.button2)
        button.setOnClickListener {
            val intent = Intent(this, Booking::class.java)
            startActivity(intent)
        }
    }
}