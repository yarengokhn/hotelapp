package com.example.hotelbooking

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Details2: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.details2)
        val btnback: Button =findViewById(R.id.button7)
        btnback.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


        val button: Button =findViewById(R.id.button2)

        val bu: Button =findViewById(R.id.button4)

        val but: Button =findViewById(R.id.button6)

        bu.setOnClickListener {
            val intent = Intent(this, Booking::class.java)
            startActivity(intent)
        }
        button.setOnClickListener {
            val intent = Intent(this, Booking::class.java)
            startActivity(intent)
        }
        but.setOnClickListener {
            val intent = Intent(this, Booking::class.java)
            startActivity(intent)
        }
    }
}