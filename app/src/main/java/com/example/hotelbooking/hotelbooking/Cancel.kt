package com.example.hotelbooking

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Cancel:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cancelpage)

        val btnback: Button =findViewById(R.id.button7)
        val nobook: Button =findViewById(R.id.button2)

        btnback.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
nobook.setOnClickListener{
    val intent = Intent(this, Canceldev::class.java)
    startActivity(intent)
}


    }
}