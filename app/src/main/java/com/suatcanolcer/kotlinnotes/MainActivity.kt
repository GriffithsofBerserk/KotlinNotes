package com.suatcanolcer.kotlinnotes

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        /*
        println("Hello Kotlin")
        println(4*5)

        //Değişken - Variable
        var age = 36
        println(age)
        age = 40
        println(age) // değişti

        //Sabit - Constant

        val x = 32 //sabit
        println(x)

        //Defining
        val myInteger : Int = 20 //:Double :String
        println(myInteger)

        println("----Conversion----")
        var myString : String = "25"

        println("first :  $myString ")

        var myOtherString = myString.toInt()

        println(myOtherString*2)

        //Arrays

        val myArray = arrayOf("James","Riemann","Sebastien","Derick")
        println(myArray[0])

        //Lists

        val myArrayString = arrayListOf<String>("Jane","Caulker")
        myArrayString.add("Rob")
        println(myArrayString[2])

        //Set

        val setExample = setOf<Int>(1,1,2,3)//tekrarlı elemanı görmezden geliyor.
        println(setExample.size)

        setExample.forEach { println(it) }

        //HashSet & HashMap

        val hashsetExample = HashSet<String>()
        hashsetExample.add("Jessy")
        hashsetExample.add("Kiraly")
        println("hashSet Example : $hashsetExample")

        val hashmapExample = hashMapOf<String,Int>()
        hashmapExample.put("Cole",22)
        hashmapExample.put("Jude",20)
        println("hashMap Example : $hashmapExample")
        println(hashmapExample["Jude"])

        //If gibi when kullanım ornek
        val day = 3
        var dayString = ""
        when(day){
            1 -> dayString = "Monday"
            2 -> dayString = "Tuesday"
            3 -> dayString = "Wednesday"
            else -> dayString = ""
        }
        println(dayString)

        //for

        val numbers = arrayOf(2,3,4,5,6,7,8)

        for (res in numbers){
            val z = res*5
            println(z)
        }

        //Function

        fun test(){
            println("Test function")
        }

        test()

        //Return


        fun exampleSum(a : Int, b : Int){
            val actmain = findViewById<TextView>(R.id.textView)
            val changeButton = findViewById<Button>(R.id.button)
            changeButton.setOnClickListener{
                actmain.text = "Result : ${a + b}"
            }

        }
        exampleSum(5,3)



        fun exampleMultiply(x: Int,y : Int) : Int{
            return x*y
        }

        val res = exampleMultiply(8,9)
        println(res)

        //classes
        /*
        val simpson = Simpson()
        println(simpson.age)
        */

        //Constructor

        val simpson = Simpson("Homer",45,"Nuclear Safety")
        println(simpson.name)
        println(simpson.getHeight())

        //Nullability

        var exString : String? = null
        exString = "testtt"
        println(exString)

        var exInt : Int? = null
        //exInt = 5
        println(exInt?.minus(10))

        //Recursive func

        fun toplam(n : Int) : Int{
            return if(n <= 0){
                0
            }else{
                n+(toplam(n-1))
            }
        }

        val number = 5
        val result = toplam(number)
        println("Toplam = $result")

        */

        //val simpson = Simpson()
    }
}