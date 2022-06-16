package com.beatrice.calculatorapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tilFirstNumber: TextInputLayout
    lateinit var tilSecondNumber: TextInputLayout
    lateinit var etFirstNumber: TextInputEditText
    lateinit var etSecondNumber: TextInputEditText
    lateinit var btnAdd: Button
    lateinit var btnSubtract: Button
    lateinit var btnModulus: Button
    lateinit var btnDivision: Button
    lateinit var tvResult: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tilFirstNumber = findViewById(R.id.tilFirstNumber)
        tilSecondNumber = findViewById(R.id.tilFirstNumber)
        etFirstNumber = findViewById(R.id.etFirstNumber)
        etSecondNumber = findViewById(R.id.etSecondNumber)
        btnAdd = findViewById(R.id.btnAdd)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnDivision = findViewById(R.id.btnDivision)
        btnModulus = findViewById(R.id.btnModulus)
        tvResult = findViewById(R.id.tvResult)


        btnAdd.setOnClickListener {

            var value1 = etFirstNumber.text.toString().toDouble()
            var value2 = etSecondNumber.text.toString().toDouble()
            add(value1, value2)
        }


        btnSubtract.setOnClickListener {

            var value1 = etFirstNumber.text.toString().toDouble()
            var value2 = etSecondNumber.text.toString().toDouble()
            subtract(value1, value2)
        }

        btnModulus.setOnClickListener {

            var value1 = etFirstNumber.text.toString().toDouble()
            var value2 = etSecondNumber.text.toString().toDouble()
            modulus(value1, value2)
        }

        btnDivision.setOnClickListener {

            var value1 = etFirstNumber.text.toString().toDouble()
            var value2 = etSecondNumber.text.toString().toDouble()
              division(value1,value2)
        }


        }


    fun add(value1: Double, value2: Double) {
        var sum = value1 + value2
        tvResult.text = sum.toString()
    }

    fun subtract(value1: Double, value2: Double) {
        var difference = value1 - value2
        tvResult.text = difference.toString()
    }

    fun division(value1: Double, value2: Double) {
        var divide = value1 / value2
        tvResult.text = divide.toString()
    }

    fun modulus(value1: Double, value2: Double) {
        var remainder = value1 % value2
        tvResult.text = remainder.toString()
    }

    fun validate() {

        var error=false
        tilSecondNumber.error=null
        tilFirstNumber.error=null

        var firstNumber = etFirstNumber.text.toString()
        if (firstNumber.isBlank()) {
            tilFirstNumber.error = "First number required"
        }

        var secondNumber = etSecondNumber.text.toString()
        if (secondNumber.isBlank()) {
            tilSecondNumber.error="second number is required"
        }
    }
}