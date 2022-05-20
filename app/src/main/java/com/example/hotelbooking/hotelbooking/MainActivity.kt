package com.example.hotelbooking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnback: Button =findViewById(R.id.button7)
        val filt: Button =findViewById(R.id.button5)
        val see: TextView=findViewById(R.id.textView10)
        see.setOnClickListener {
            val intent = Intent(this, Comments1::class.java)
            startActivity(intent)
        }
        filt.setOnClickListener {
            val intent = Intent(this, Filterpage::class.java)
            startActivity(intent)
        }

        btnback.setOnClickListener {
            val intent = Intent(this, LogIn::class.java)
            startActivity(intent)
        }



        val card1: CardView =findViewById(R.id.cardView)
        card1.setOnClickListener {
            val intent = Intent(this, Details1::class.java)
            startActivity(intent)
        }

        val card2: CardView =findViewById(R.id.cardView2)
        card2.setOnClickListener {
            val intent = Intent(this, Details2::class.java)
            startActivity(intent)
        }
        val card3: CardView =findViewById(R.id.cardView3)
        card3.setOnClickListener {
            val intent = Intent(this, Detail3::class.java)
            startActivity(intent)
        }
        val card4: CardView =findViewById(R.id.cardView4)
        card2.setOnClickListener {
            val intent = Intent(this, Details2::class.java)
            startActivity(intent)
        }










    }
}
