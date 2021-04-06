package com.ltts.assessment1

import java.util.*

class Universityresult {
    var scanner = Scanner(System.`in`)
    fun course() {
        print("Enter Course Name: ")
        var cname = scanner.nextLine()
    }
    fun subject() {
        println("Enter Subject Details:- ")
        println("Subject Name: ")
        var sname: String = scanner.next()
        println("Maximum Marks: ")
        var smax: Int = scanner.nextInt()
        println("Minimum Passing Marks: ")
        var smin: Int = scanner.nextInt()
    }
    var name : String = ""
    fun student( )  {
        println("Enter Student Details: ")
        println("Student Name: ")
        name = scanner.next()
        println("Student Mobile Number: ")
        var mobile: String = scanner.next()
        println("Student Date Of Birth: ")
        var dob: String = scanner.next()
        println("Student Address: ")
        val add: String = scanner.next()
    }
    fun s_marks() {
        val subjectName = arrayOf<String>("PHYSICS", "CHEMISTRY", "MATH", "CORE JAVA", "MYSQL")
        val scanner = Scanner(System.`in`)
        val marksArray = DoubleArray(5)
        println("Input Marks:- ")
        for (i in marksArray.indices) {
            print("${subjectName[i]}: ")
            marksArray[i] = scanner.nextDouble()
        }
        val total = marksArray.sum()
        val percentage = marksArray.average()
        println("Total of All subjects Marks: $total")
        println("Percentage: $percentage")
        when {
            percentage > 80 -> println("Grade: A")
            percentage > 60 -> println("Grade: B")
            percentage > 40 -> println("Grade: C")
            else -> println("Grade: D. $name failed")
        }
    }
}
fun main()
{
    var U = Universityresult()
    U.course()
    U.subject()
    U.student()
    U.s_marks()
}