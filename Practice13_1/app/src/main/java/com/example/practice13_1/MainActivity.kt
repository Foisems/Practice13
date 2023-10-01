package com.example.practice13_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.math.round

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnClick(view: View) {
        val side1 = findViewById<EditText>(R.id.textView1)
        val side2 = findViewById<EditText>(R.id.textView2)
        val result1 = findViewById<TextView>(R.id.textView5)
        val result2 = findViewById<TextView>(R.id.textView7)
        val result3 = findViewById<TextView>(R.id.textView8)
        val res1: Double
        val res2: Double
        val res3: Double

        if (side1.text.toString() == "") {
            val toast: Toast = Toast.makeText(baseContext, R.string.toast1, Toast.LENGTH_SHORT)
            toast.show()
            side1.requestFocus()
        }
        else if (side2.text.toString() == "") {
            val toast: Toast = Toast.makeText(baseContext, R.string.toast2, Toast.LENGTH_SHORT)
            toast.show()
            side2.requestFocus()
        }
        else if (side1.text.toString() == "0" || side2.text.toString() == "0") {
            val toast: Toast = Toast.makeText(baseContext, R.string.toast3, Toast.LENGTH_SHORT)
            toast.show()
        }
        else {
            res1 = round((Math.sqrt(Math.pow(side1.text.toString().toDouble(), 2.0) + Math.pow(side2.text.toString().toDouble(), 2.0))) * 100) / 100
            result1.text =
                if (res1.toInt().toDouble() == res1) res1.toInt().toString()
                else res1.toString()
            res2 = round(res1 + side1.text.toString().toDouble() + side2.text.toString().toDouble()* 100) / 100
            result2.text =
                if (res2.toInt().toDouble() == res2) res2.toInt().toString()
                else res2.toString()
            res3 = round(side1.text.toString().toDouble() * side2.text.toString().toDouble() / 2 * 100) / 100
            result3.text =
                if (res3.toInt().toDouble() == res3) res3.toInt().toString()
                else res3.toString()
        }
    }
}