package com.example.fibonacci

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var rivNumbers=findViewById<RecyclerView>(R.id.rivnumbers)
        rivNumbers.layoutManager=LinearLayoutManager(baseContext)
        val nums= NumbersRecyclerViewAdapter(fibonacciNumbers(100))
        rivNumbers.adapter=nums
    }
    fun fibonacciNumbers ( number:Int):List<BigInteger>{
        var numberList= MutableList<BigInteger>(number,{BigInteger.ZERO })
        var n1=BigInteger.ZERO
        var n2=BigInteger.ONE
        numberList[0]=n1
        numberList[1]=n2
        for (i in 1..number){
            var sum=n1+n2
            n1=n2
            n2=sum
            numberList[i-1]=n1
        }
        return numberList
    }
}