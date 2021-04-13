package com.example.pruebadesarrollador

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import java.util.*

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        Handler().postDelayed({
            Home()
        },4000)

    }
    private fun Home(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}