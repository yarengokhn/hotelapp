package com.example.hotelbooking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Commentsdev : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_commentsdev)
        val name = intent.getStringExtra("Name")
        val tx8:TextView=findViewById(R.id.tx8)
        tx8.text =  name
        val btnback: Button =findViewById(R.id.button7)

        btnback.setOnClickListener {
            val intent = Intent(this, Canceldev::class.java)
            startActivity(intent)
        }

    }
}