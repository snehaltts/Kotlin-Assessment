package com.ltts.assessment1

import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    println("Enter the size of Array: ")
    val n = scanner.nextInt()
    var arr = Array(n){0}
    println("Enter values in your Array, Don't leave it empty")
    for(i in 0..n-1){
        var x :Int = scanner.nextInt()
        arr[i] = x
    }
    var greatest = arr[0]
    var g : (Int) -> Unit = { g: Int ->
        for(i in 1..n-1){
            if(arr[i] > greatest){
                greatest = arr[i]
            }
        }
    }
    g(arr[0])
    println("$greatest is the greatest number in your array.")

    var smallest = arr[0]
    var s : (Int) -> Unit = { s : Int->
        for(i in 1..n-1){
            if (arr[i] < smallest){
                smallest =arr[i]
            }
        }
    }
    s(arr[0])
    println("$smallest is the smallest in your array.")
}