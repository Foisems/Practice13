package ru.mggtk.practice13

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

        val kurs = findViewById<EditText>(R.id.textView1)
        kurs.requestFocus()
    }

    fun btnClick(view: View) {
        val kurs = findViewById<EditText>(R.id.textView1)
        val summa = findViewById<EditText>(R.id.textView2)
        val result = findViewById<TextView>(R.id.textView5)
        val res: Double

        if (kurs.text.toString() == "") {
            val toast:Toast = Toast.makeText(baseContext, R.string.toast1, Toast.LENGTH_SHORT)
            toast.show()
            kurs.requestFocus()
        }
        else if (summa.text.toString() == "") {
            val toast:Toast = Toast.makeText(baseContext, R.string.toast2, Toast.LENGTH_SHORT)
            toast.show()
            summa.requestFocus()
        }
        else {
            res = round((kurs.text.toString().toDouble() * summa.text.toString().toDouble()) * 100) / 100
            result.text =
                if (res.toInt().toDouble() == res) res.toInt().toString()
                else res.toString()
        }
    }
}