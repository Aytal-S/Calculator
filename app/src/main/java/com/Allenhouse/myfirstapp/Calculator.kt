package com.Allenhouse.myfirstapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.min

class Calculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_calculator)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var n1 = 0.0
        var n2 = 0.0
        var n3 = 0.0
        var opr = ""

        val PlusBtn = findViewById<Button>(R.id.Plus)
        val CBtn = findViewById<Button>(R.id.Clear)
        val MinusBtn = findViewById<Button>(R.id.Minus)
        val percentBtn = findViewById<Button>(R.id.percent)
        val EqualBtn = findViewById<Button>(R.id.Equal)
        val MulBtn = findViewById<Button>(R.id.Mul)
        val DivBtn = findViewById<Button>(R.id.Div)
        val DelBtn = findViewById<Button>(R.id.Del)
        val DotBtn = findViewById<Button>(R.id.Dot)
        val OneBtn = findViewById<Button>(R.id.One)
        val TwoBtn = findViewById<Button>(R.id.Two)
        val ThreeBtn = findViewById<Button>(R.id.Three)
        val FourBtn = findViewById<Button>(R.id.Four)
        val FiveBtn = findViewById<Button>(R.id.Five)
        val SixBtn = findViewById<Button>(R.id.Six)
        val SevenBtn = findViewById<Button>(R.id.Seven)
        val EightBtn = findViewById<Button>(R.id.Eight)
        val NineBtn = findViewById<Button>(R.id.Nine)
        val ZeroBtn = findViewById<Button>(R.id.Zero)
        val answer = findViewById<TextView>(R.id.Ans)
        val Remen = findViewById<TextView>(R.id.remn)


        OneBtn.setOnClickListener {
            answer.text = answer.text.toString() + "1"
        }

        TwoBtn.setOnClickListener {
            answer.text = answer.text.toString() + "2"
        }
        ThreeBtn.setOnClickListener {
            answer.text = answer.text.toString() + "3"
        }
        FourBtn.setOnClickListener {
            answer.text = answer.text.toString() + "4"
        }
        FiveBtn.setOnClickListener {
            answer.text = answer.text.toString() + "5"
        }
        SixBtn.setOnClickListener {
            answer.text = answer.text.toString() + "6"
        }
        SevenBtn.setOnClickListener {
            answer.text = answer.text.toString() + "7"
        }
        EightBtn.setOnClickListener {
            answer.text = answer.text.toString() + "8"
        }
        NineBtn.setOnClickListener {
            answer.text = answer.text.toString() + "9"
        }
        ZeroBtn.setOnClickListener {
            answer.text = answer.text.toString() + "0"
        }
        DotBtn.setOnClickListener {
            answer.text = answer.text.toString() + "."
        }
        DelBtn.setOnClickListener {
            answer.text = answer.text.toString().dropLast(1)
        }

        PlusBtn.setOnClickListener {
            if(n1.toString().endsWith(".0")) {
                n1 = answer.text.toString().toDouble()
                opr = "+"
                Remen.text = n1.toInt().toString() + opr
                answer.text = ""
            }
            else
            {
                n1 = answer.text.toString().toDouble()
                opr = "+"
                Remen.text = n1.toString() + opr
                answer.text = ""
            }
        }
        MinusBtn.setOnClickListener {
            if(n1.toString().endsWith(".0")) {
                n1 = answer.text.toString().toDouble()
                opr = "-"
                Remen.text = n1.toInt().toString() + opr
                answer.text = ""
            }
            else
            {
                n1 = answer.text.toString().toDouble()
                opr = "-"
                Remen.text = n1.toString() + opr
                answer.text = ""
            }
        }
        MulBtn.setOnClickListener {
            if(n1.toString().endsWith(".0")) {
                n1 = answer.text.toString().toDouble()
                opr = "*"
                Remen.text = n1.toInt().toString() + opr
                answer.text = ""
            }
            else
            {
                n1 = answer.text.toString().toDouble()
                opr = "*"
                Remen.text = n1.toString() + opr
                answer.text = ""
            }
        }
        DivBtn.setOnClickListener {
            if(n1.toString().endsWith(".0")) {
                n1 = answer.text.toString().toDouble()
                opr = "/"
                Remen.text = n1.toInt().toString() + opr
                answer.text = ""
            }
            else
            {
                n1 = answer.text.toString().toDouble()
                opr = "/"
                Remen.text = n1.toString() + opr
                answer.text = ""
            }
        }
        percentBtn.setOnClickListener {
            if(n1.toString().endsWith(".0")) {
                n1 = answer.text.toString().toDouble()
                opr = "%"
                Remen.text = n1.toInt().toString() + opr
                answer.text = ""
            }
            else
            {
                n1 = answer.text.toString().toDouble()
                opr = "%"
                Remen.text = n1.toString() + opr
                answer.text = ""
            }
        }
        EqualBtn.setOnClickListener {
            n2=answer.text.toString().toDouble()
            if(n2.toString().endsWith(".0"))
                Remen.text=Remen.text.toString()+n2.toInt().toString()
            else
                Remen.text=Remen.text.toString()+n2.toString()

            if(opr.equals("+"))
            {
                n3=n1+n2

                if(n3.toString().endsWith(".0"))
                    answer.text=n3.toInt().toString()
                else
                    answer.text=n3.toString()
            }

            if(opr.equals("-"))
            {
                n3=n1-n2

                if(n3.toString().endsWith(".0"))
                    answer.text=n3.toInt().toString()
                else
                    answer.text=n3.toString()
            }

            if(opr.equals("*"))
            {
                n3=n1*n2

                if(n3.toString().endsWith(".0"))
                    answer.text=n3.toInt().toString()
                else
                    answer.text=n3.toString()
            }
            if(opr.equals("/"))
            {
                n3=n1/n2

                if(n3.toString().endsWith(".0"))
                    answer.text=n3.toInt().toString()
                else
                    answer.text=n3.toString()
            }
            if(opr.equals("%"))
            {
                n3=n1%n2

                if(n3.toString().endsWith(".0"))
                    answer.text=n3.toInt().toString()
                else
                    answer.text=n3.toString()
            }
        }

    }
}