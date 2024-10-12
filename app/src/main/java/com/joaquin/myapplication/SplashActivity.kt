package com.joaquin.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SplashActivity {

    class SplashActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.fragment_splash)

            val btnStarted: Button = findViewById(R.id.btnStarted)

            btnStarted.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    finish()
            }
        }
    }

}