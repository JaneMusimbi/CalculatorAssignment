package com.revision.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class Calculate : AppCompatActivity() {
    lateinit var btnAddition:Button
    lateinit var btnSubtraction:Button
    lateinit var btnModulus:Button
    lateinit var btnDivision:Button
    lateinit var tilNumber1:TextInputLayout
    lateinit var etNumber1:TextInputEditText
    lateinit var tilNumber2:TextInputLayout
    lateinit var etNumber2:TextInputEditText
    lateinit var tvResult: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        btnAddition=findViewById(R.id.btnAddition)
        btnSubtraction=findViewById(R.id.btnSubtraction)
        btnModulus=findViewById(R.id.btnModulus)
        btnDivision=findViewById(R.id.btnDivision)
        tilNumber1=findViewById(R.id.tilNumber1)
        etNumber1=findViewById(R.id.etNumber1)
        tilNumber2=findViewById(R.id.tilNumber2)
        etNumber2=findViewById(R.id.etNumber2)
        tvResult=findViewById(R.id.tvResult)

        btnAddition.setOnClickListener {
            var Number1 = etNumber1.text.toString().toInt()
            var Number2 = etNumber2.text.toString().toInt()
            calculateAddition(Number1,Number2)
        }
        btnSubtraction.setOnClickListener {
            var Number1 = etNumber1.text.toString().toInt()
            var Number2 = etNumber2.text.toString().toInt()
            calculateSubtraction(Number1,Number2)
        }
        btnModulus.setOnClickListener {
            var Number1 = etNumber1.text.toString().toInt()
            var Number2 = etNumber2.text.toString().toInt()
            calculateModulus(Number1,Number2)
        }
        btnDivision.setOnClickListener {
            var Number1 = etNumber1.text.toString().toInt()
            var Number2 = etNumber2.text.toString().toInt()
            calculateDivision(Number1,Number2)
        }
    }
    fun calculateAddition(Number1: Int, Number2: Int) {
        var addition = Number1 + Number2
        tvResult.text = addition.toString()
    }

    fun calculateSubtraction(Number1: Int, Number2: Int) {
        var subtract  = Number1 - Number2
        tvResult.text = subtract.toString()
    }

    fun calculateModulus(Number1: Int, Number2: Int) {
        var multiple = Number1 * Number2
        tvResult.text = multiple.toString()
    }

    fun calculateDivision(Number1: Int, Number2: Int) {
        var modulus = Number1 % Number2
        tvResult.text = modulus.toString()

    }
// Calculate.setOnClickListener {
//      validateCalculate()
//       }
    fun validateCalculate(){
        var error=false
        tilNumber1.error=null
        tilNumber2.error=null
        var Number1=etNumber1.text.toString()
        var Number2=etNumber2.text.toString()

        if (Number1.isBlank()){
            tilNumber1.error="A number is required"
            error=true
        }
        if (Number2.isBlank()){
            tilNumber2.error="A number is required"
            error=true
        }

    }

}


