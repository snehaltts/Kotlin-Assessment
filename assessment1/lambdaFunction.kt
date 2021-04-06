package com.ltts.assessment1

import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    println("Enter a number: ")
    var n = scanner.nextInt()
    val f = factorial(n)
    println(f)
}
val factorial = fun(n : Int): Long{
    if (n < 1){
        println("Error! Enter non-negative number.")
    }
    var fact : Long = 1
    for (i in n downTo 2){
        fact *= i
    }
    return fact
}