package com.ltts.assessment1

import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    println("Enter number")
    val num = scanner.nextInt()
    var a : Int = 0
    var b : Int = 1
    for (i in 1.. num){
        println("$a")
        var x : Int = a + b
        a = b
        b = x
    }
}