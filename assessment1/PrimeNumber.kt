package com.ltts.assessment1

import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    println("Enter number: ")
    val number = scanner.nextInt()
    var p : Int = 0
    var q : Int = 1
    for (i in 1.. number){
        println("$p")
        var x : Int = p + q
        p = q
        q = x
    }
}