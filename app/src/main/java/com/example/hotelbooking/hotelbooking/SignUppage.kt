package com.example.hotelbooking
import android.content.ContentValues.TAG
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import java.util.regex.Pattern


class SignUppage : AppCompatActivity() {


    private lateinit var sEmail: String
    private lateinit var sPassword: String


    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_uppage)

        val email: EditText = findViewById(R.id.password1)

        val password: EditText = findViewById(R.id.email)

        val checkpass: EditText = findViewById(R.id.password)
        val button: Button = findViewById(R.id.button1)
        val log: Button = findViewById(R.id.button9)
        var DB: DBHelper1? = null

        sEmail = email.text.toString().trim()
        sPassword = password.text.toString().trim()
        DB = DBHelper1(this)
        button.setOnClickListener {
            val user = password.text.toString()
            val pass = email.text.toString()
            val repass = checkpass.text.toString()
            if (user == "" || pass == "" || repass == ""){ Toast.makeText(
                applicationContext,
                "Please enter all the fields",
                Toast.LENGTH_SHORT
            ).show()} else {
                if (user == repass) {
                    val checkuser: Boolean = DB.checkusername(user)
                    if (checkuser == false) {
                        val insert: Boolean = DB.insertData(user, pass)
                        if (insert == true) {
                            Toast.makeText(
                                applicationContext,
                                "Registered successfully",
                                Toast.LENGTH_SHORT
                            ).show()

                            val intent = Intent(applicationContext, LogIn::class.java)
                            startActivity(intent)

                        } else {
                            Toast.makeText(
                                applicationContext,
                                "Registration failed",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    } else {
                        Toast.makeText(
                            applicationContext,
                            "User already exists! please sign in",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                } else {
                    Toast.makeText(applicationContext, "Passwords do not matching", Toast.LENGTH_SHORT)
                        .show()
                }
            }
        }
        log.setOnClickListener {
            val intent = Intent(applicationContext, LogIn::class.java)
            startActivity(intent)
        }




        // show password rules in text view

        // add text changed listener for edit text
        password.addTextChangedListener(object : TextWatcher {
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
                        password.error == null

                    } else {
                        // show error on input invalid password
                        password.error =
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







