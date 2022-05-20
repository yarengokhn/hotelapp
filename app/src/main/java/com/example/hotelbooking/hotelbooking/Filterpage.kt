package com.example.hotelbooking

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class Filterpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filterpage)
        val filter:Button=findViewById(R.id.button11)
        val back:Button=findViewById(R.id.button7)
        back.setOnClickListener {
            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }

        filter.setOnClickListener {
            val intent = Intent(applicationContext, Filterdev::class.java)
            startActivity(intent)
        }
        val cid: TextView = findViewById(R.id.date1)
        val btn: Button = findViewById(R.id.btn1)
        val cid2: TextView = findViewById(R.id.date2)
        val btn2: Button = findViewById(R.id.btn7)



        val cal: Calendar = Calendar.getInstance()
        val cal1: Calendar = Calendar.getInstance()

        val datePicker = DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
            cal.set(Calendar.YEAR, year)
            cal.set(Calendar.MONTH, month)
            cal.set(Calendar.DAY_OF_MONTH, dayOfMonth)
            updateLable(cal)

        }


        val datePicker1 = DatePickerDialog.OnDateSetListener { view1, year, month, dayOfMonth ->
            cal1.set(Calendar.YEAR, year)
            cal1.set(Calendar.MONTH, month)
            cal1.set(Calendar.DAY_OF_MONTH, dayOfMonth)

            updateLable1(cal1)
        }



        btn.setOnClickListener {
            DatePickerDialog(
                this, datePicker, cal.get(Calendar.YEAR), cal.get(Calendar.MONTH),
                cal.get(Calendar.DAY_OF_MONTH)
            ).show()

        }

        btn2.setOnClickListener {
            DatePickerDialog(
                this, datePicker1, cal1.get(Calendar.YEAR), cal1.get(Calendar.MONTH),
                cal1.get(Calendar.DAY_OF_MONTH)
            ).show()

        }


    }

    private fun updateLable(cal: Calendar) {
        val cid: TextView = findViewById(R.id.date1)

        val myFormat = "dd-MM-yyyy"
        val gg = SimpleDateFormat(myFormat, Locale.UK)
        cid.setText(gg.format(cal.time))


    }
    private fun updateLable1(cal1: Calendar) {

        val cid2: TextView =findViewById(R.id.date2)
        val myFormat1 = "dd-MM-yyyy"
        val gg1= SimpleDateFormat(myFormat1, Locale.UK)

        cid2.setText(gg1.format(cal1.time))

    }




}