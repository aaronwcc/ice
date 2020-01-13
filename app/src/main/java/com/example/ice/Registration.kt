package com.example.ice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_registration.*

class Registration : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        btnDoneSignUp.setOnClickListener(){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
    }
}
