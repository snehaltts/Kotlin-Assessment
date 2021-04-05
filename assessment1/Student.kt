package com.ltts.assessment1

import java.util.*
import kotlin.math.tan

fun main(args: Array<String>){

    val scanner = Scanner(System.`in`)
    println("Enter Marks of Physics")
    val subject1 =scanner.nextDouble()
    println("Enter Marks of Chemistry")
    val subject2 =scanner.nextDouble()
    println("Enter Marks of Math")
    val subject3 =scanner.nextDouble()

val totalmarks = totalMarks(subject1,subject2,subject3)
    println("Total marks of student: $totalmarks")
val percentage = Percentage(subject1,subject2,subject3)
    println("Total Percentage of student: $percentage")
}
fun totalMarks(a:Double, b:Double, c:Double):Double{
    val total=a+b+c
    return total
}
fun Percentage(m: Double, n: Double, p:Double): Double{
    val percentage = totalMarks(m,n,p)/3.0
    return percentage
}