package com.example.hotelbooking

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Bookingdev : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bookdev)
        val btnback: Button = findViewById(R.id.button7)
        val cancelpage: Button = findViewById(R.id.button8)
        val cardno: EditText = findViewById(R.id.editTextNumberPassword3)
        val cvv: EditText = findViewById(R.id.editTextNumberPassword4)





        btnback.setOnClickListener {
            val intent = Intent(this, Booking::class.java)
            startActivity(intent)
        }
        cancelpage.setOnClickListener {
            if (cardno.text.toString().length == 16 && cvv.text.toString().length == 3) {
                val intent = Intent(this, Cancel::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(applicationContext, "Card No length must be 16 and CVV length must be 3", Toast.LENGTH_SHORT)
                    .show()
                cardno.error = "Card No length must be 16"
                cvv.error = "CVV length must be 3"

            }
        }






    }
}