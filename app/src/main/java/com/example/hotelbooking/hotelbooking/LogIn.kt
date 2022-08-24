package com.example.hotelbooking

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.regex.Pattern


class LogIn : AppCompatActivity() {

    var DB: DBHelper1? = null
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginpage)
        var DB: DBHelper1? = null
        val password1: EditText = findViewById(R.id.password)
        val btnlogin: Button = findViewById(R.id.loginbutton)

        val btnSignUp: Button = findViewById(R.id.signupbutton)
        var email1: EditText = findViewById(R.id.email)
        DB = DBHelper1(this)
        btnlogin.setOnClickListener {
            val user = email1.text.toString()
            val pass = password1.text.toString()
            if (user == "" || pass == "") Toast.makeText(
                applicationContext,
                "Please enter all the fields",
                Toast.LENGTH_SHORT
            ).show() else {
                val checkuserpass2: Boolean = DB.checkusernamepassword(user, pass)
                val checkuser: Boolean = DB.checkusername(user)

                if(checkuser!=true) {
                    if (checkuserpass2 == false) {
                        Toast.makeText(
                            applicationContext,
                            "Sign in successfull",
                            Toast.LENGTH_SHORT
                        )
                            .show()
                        val intent = Intent(applicationContext, MainActivity::class.java)
                        startActivity(intent)
                    }
                }


                else {
                    Toast.makeText(applicationContext, "You are not registered yet!", Toast.LENGTH_SHORT)
                        .show()
                }
            }
        }
        btnSignUp.setOnClickListener {
            val intent = Intent(applicationContext, SignUppage::class.java)
            startActivity(intent)
        }

        // show password rules in text view

        // add text changed listener for edit text
        password1.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(
                s: CharSequence?,
                start: Int, count: Int, after: Int
            ) {

            }

            override fun onTextChanged(
                s: CharSequence?,
                start: Int, before: Int, count: Int
            ) {

                s?.apply {

                    if (isValidPassword() && toString().length >= 8) {
                        password1.error == null

                    } else {
                        // show error on input invalid password
                        password1.error =
                            "invalid password.\"Password minimum length 8\n1 uppercase\n1 number \n1 special character"
                    }
                }
            }


            override fun afterTextChanged(s: Editable?) {

            }
        })
    }



    // extension function to validate password rules/patterns
    fun CharSequence.isValidPassword(): Boolean {
        val passwordPattern = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{4,}$"
        val pattern = Pattern.compile(passwordPattern)
        val matcher = pattern.matcher(this)
        return matcher.matches()
    }
}






