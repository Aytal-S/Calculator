package com.Allenhouse.myfirstapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val FNumber=findViewById<EditText>(R.id.FEdit)
        val SNumber=findViewById<EditText>(R.id.SEdit)
        val btn1=findViewById<Button>(R.id.AddBtn)
        val btn2=findViewById<Button>(R.id.SubBtn)
        val btn3=findViewById<Button>(R.id.MulBtn)
        val btn4=findViewById<Button>(R.id.DivBtn)
        val Result=findViewById<TextView>(R.id. Retv)

        btn1.setOnClickListener{
            val number1= FNumber.text.toString().toInt()
            val number2=SNumber.text.toString().toInt()
            val add= number1 + number2
            Result.text="Result:+$add".toString()
        }

        btn2.setOnClickListener{
            val number1= FNumber.text.toString().toInt()
            val number2=SNumber.text.toString().toInt()
            val minus= number1 - number2
            Result.text="Result:+$minus".toString()
        }

        btn3.setOnClickListener{
            val number1= FNumber.text.toString().toInt()
            val number2=SNumber.text.toString().toInt()
            val mul= number1 * number2
            Result.text="Result:+$mul".toString()
        }

        btn4.setOnClickListener{
            val number1= FNumber.text.toString().toInt()
            val number2=SNumber.text.toString().toInt()
            val div= number1 / number2
            Result.text="Result:+$div".toString()
        }

    }
}