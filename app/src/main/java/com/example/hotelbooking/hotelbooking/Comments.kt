package com.example.hotelbooking

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


const val BASE_URL="https://jsonplaceholder.typicode.com/"

class Comments: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.comments)
        val comment: EditText = findViewById(R.id.comment)
        val gecis: Button = findViewById(R.id.button12)

        gecis.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, Commentsdev::class.java)

            intent.putExtra("Name", comment!!.text.toString())

            startActivity(intent)


        }
        )      //  getMyData()
    }
}
