package com.joaquin.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity{

    class LoginActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.fragment_login)

            val usernameEditText: EditText = findViewById(R.id.usernameEditText)
            val passwordEditText: EditText = findViewById(R.id.passwordEditText)
            val loginButton: Button = findViewById(R.id.btnStarted)

            loginButton.setOnClickListener {
                val username = usernameEditText.text.toString()
                val password = passwordEditText.text.toString()

                if (username == "admin@travelapp.com" && password == "admin123") {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    finish()
                } else {
                    Toast.makeText(this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

}