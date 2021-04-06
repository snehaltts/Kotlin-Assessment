package com.ltts.assessment1

import java.util.*
import java.util.function.DoubleUnaryOperator

fun main(){
    val scanner = Scanner(System.`in`)
    print("Enter the Quantity: ")
    val quantity = scanner.nextDouble()
    print("Enter the Unit Price of a sold item: ")
    val unitPrice = scanner.nextDouble()

    val bill = billAmount(quantity, unitPrice)
    println("Bill Amount is : $bill")

    var Discount :Double = (.15*bill)
    var Total : Double = bill-Discount

    println("Discount is: $Discount")
    println("Final Bill Amount is : $Total")
}
fun billAmount(a:Double, b:Double): Double{
    val bill = a*b
    return bill
}