package com.example.assignment61


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var textView1:TextView = findViewById(R.id.textView7)
        var textView2:TextView = findViewById(R.id.textView9)
        var number1:EditText=findViewById(R.id.text1)
        var number2:EditText=findViewById(R.id.text2)

        var btnplus:Button =findViewById(R.id.button1)
        var btnmult:Button =findViewById(R.id.button2)
        var btnminus:Button=findViewById(R.id.button3)
        var btnvidider:Button=findViewById(R.id.button4)
        var btnmodulo:Button=findViewById(R.id.button5)
        var btnclear:Button=findViewById(R.id.button6)
        //บวก
        btnplus.setOnClickListener() {
            var number1 = number1.text.toString()
            var number2 = number2.text.toString()
            var total = 0.00
            if(number1 == ""  || number2 == ""){
                val toast = Toast.makeText(applicationContext, "กรุณาใส่ทั้งnumber1 และ Number2", Toast.LENGTH_LONG)
                toast.show()
            }
            else{
                total = number1.toString().toDouble() + number2.toString().toDouble()
                textView1.setText("+")
                textView2.setText(total.toString())

            }
        }

        //ลบ
        btnminus.setOnClickListener(){
            var num1 = number1.text.toString()
            var num2 = number2.text.toString()
            var total = 0.000
            if(num1 == ""  || num2 == ""){
                val toast = Toast.makeText(applicationContext, "กรุณาใส่ทั้งnumber1 และ Number2", Toast.LENGTH_LONG)
                toast.show()
            }
            else{
                total = num1.toString().toDouble() - num2.toString().toDouble()
                textView1.setText("-")
                textView2.setText(total.toString())

            }
        }

        //คูณ
        btnmult.setOnClickListener(){
            var num1 = number1.text.toString()
            var num2 = number2.text.toString()
            var total = 0.000
            if(num1 == ""  || num2 == ""){
                val toast = Toast.makeText(applicationContext, "กรุณาใส่ทั้งnumber1 และ Number2", Toast.LENGTH_LONG)
                toast.show()
            }
            else{
                total = num1.toString().toDouble() * num2.toString().toDouble()
                textView1.setText("*")
                textView2.setText(total.toString())

            }
        }

        //หาร
        btnvidider.setOnClickListener(){
            var num1 = number1.text.toString()
            var num2 = number2.text.toString()
            var total = 0.000
            if(num1 == ""  || num2 == ""){
                val toast = Toast.makeText(applicationContext, "กรุณาใส่ทั้งnumber1 และ Number2", Toast.LENGTH_LONG)
                toast.show()
            }
            else{
                total = num1.toString().toDouble() / num2.toString().toDouble()
                textView1.setText("/")
                textView2.setText(total.toString())

            }
        }

        //มอด
        btnmodulo.setOnClickListener(){
            var num1 = number1.text.toString()
            var num2 = number2.text.toString()
            var total = 0.000
            if(num1 == ""  || num2 == ""){
                val toast = Toast.makeText(applicationContext, "กรุณาใส่ทั้งnumber1 และ Number2", Toast.LENGTH_LONG)
                toast.show()
            }
            else if(num2=="0") {
                val toast1 =
                    Toast.makeText(applicationContext, "ห้ามกรอกค่า number2 = 0", Toast.LENGTH_LONG)
                toast1.show()
            }
            else{
                total = num1.toString().toDouble() % num2.toString().toDouble()
                textView1.setText("%")
                textView2.setText(total.toString())

            }
        }

        btnclear.setOnClickListener(){
            number1.setText("")
            number2.setText("")
            textView1.setText("")
            textView2.setText("")
        }
    }
}