package com.ltts.assessment1

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    print("Enter two numbers: ")

    // nextDouble() reads the next double from the keyboard
    val num1 = sc.nextDouble()
    val num2 = sc.nextDouble()

    print("Enter an operator (/, *, +, -): ")
    val operator = sc.next()[0]

    val result: Double

    when (operator) {
        '/' -> result = num1/num2
        '*' -> result = num1*num2
        '+' -> result = num1+num2
        '-' -> result = num1-num2
        else -> {
            System.out.printf("Wrong choice!Choose the correct operator.")
            return
        }
    }

    System.out.printf("%.1f %c %.1f = %.1f", num1, operator, num2, result)
}
