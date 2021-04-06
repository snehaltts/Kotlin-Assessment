package com.ltts.assessment1

import java.util.*
fun main(){
    val scanner = Scanner(System.`in`)
    println("Enter the year: ")
    var year = scanner.nextInt()

    if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
        println("It's a leap year.")
    }
    else{
        println("Not a leap year.")
    }
}