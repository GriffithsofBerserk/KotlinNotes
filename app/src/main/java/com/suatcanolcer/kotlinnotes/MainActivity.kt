package com.suatcanolcer.kotlinnotes

import android.os.Bundle
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



    }
}