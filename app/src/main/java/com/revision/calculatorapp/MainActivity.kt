package com.revision.calculatorapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnCalculator:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        btnCalculator.setOnClickListener {
            var intent = Intent(this, Calculate::class.java)
            startActivity(intent)
    }
}
}