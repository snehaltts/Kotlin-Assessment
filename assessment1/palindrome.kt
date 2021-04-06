package com.ltts.assessment1

import java.util.*

fun Palindrome(n:Int):Boolean{
    var x : Int = n
    var reverse = 0
    while(x != 0){
        val reminder = x % 10
        reverse = reverse * 10 + reminder
        x /=10
    }
    val res = true

    for( i in 1..n){
        if(n  != reverse){
            var res = false
        }
    }
    return res
}
fun main() {
    val scanner = Scanner(System.`in`)
    println("Enter number: ")
    var number = scanner.nextInt();
    var a = 0
    val b = number
    while (a < b) {
        if (Palindrome(a)) {
            println("Palindrome $a")
        }
        ++a
    }
}