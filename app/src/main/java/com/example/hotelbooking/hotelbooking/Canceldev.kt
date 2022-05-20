package com.example.hotelbooking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class Canceldev : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.canceldev)

        val btnback: Button =findViewById(R.id.button7)
        val comme: Button =findViewById(R.id.button4)
        val logout: TextView =findViewById(R.id.textView37)
        logout.setOnClickListener {
            Toast.makeText(applicationContext, "Log out Successfull ", Toast.LENGTH_SHORT)
                .show()
            val intent = Intent(this, LogIn::class.java)
            startActivity(intent)
        }
        btnback.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        comme.setOnClickListener {
            val intent = Intent(this, Comments::class.java)
            startActivity(intent)
        }
    }
}