package com.ltts.assessment1

import java.util.*

val PI=3.14

fun AreaOfCircle(radius:Double): Double{
    return PI*radius*radius
}
fun PerimeterOfCircle(radius:Double): Double{
    return 2*PI*radius
}
fun LenOfSideOfSquare(radius:Double): Double{
    val x = (PI * radius)/ 2
    return x
}
fun main(){
    val sc=Scanner(System.`in`)
    println("Enter the length of the radious: ")
    val radius=sc.nextDouble()
    val areaOfCircle = AreaOfCircle(radius)
    val perimeterOfCircle = PerimeterOfCircle(radius)
    val LenOfSideOfSquare = LenOfSideOfSquare(radius)
    println("Area of circle:$areaOfCircle")
    println("Perimeter of circle:$perimeterOfCircle")
    println("Length of circle:$LenOfSideOfSquare")

}
