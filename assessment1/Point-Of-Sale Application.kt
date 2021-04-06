package com.ltts.assessment1

import java.util.*
import kotlin.collections.ArrayList
class pointOfSale
{
    var scanner = Scanner(System.`in`)
    fun register()
    {
        print("Enter Customer's Name: ")
        println()
        var customerName = readLine()
        print("Enter Customer's Contact Number: ")
        println()
        var mobile = scanner.nextLong()
        print("Enter Customer's Address : ")
        println()
        var address = readLine()
        scanner.nextLine()
        print("Enter Total items in cart: ")
        println()
        var itemnumber = scanner.nextInt()
        val list = ArrayList<Any>()
        var TotalBill = 0.toFloat()
        for (i in 1..itemnumber)
        {
            println("Enter sale detail of $i item")
            print("Enter Item ID : ")
            println()
            var itemid = scanner.nextInt()
            list.add(itemid)
            print("Enter Item Name: ")
            println()
            var itemname = readLine()
            if (itemname != null) {
                list.add(itemname)
            }
            print("Enter Price: ")
            println()
            var price = scanner.nextFloat()
            list.add(price)
            print("Enter Quantity: ")
            println()
            var quantity = scanner.nextLong()
            list.add(quantity)
            TotalBill += price * quantity
        }
        println("BILL DETAILS: ")
        println("Customer's Name : $customerName")
        println("Customer's Contact: $mobile")
        println("Customer's Address: $address")
        println("SALE DETAILS: ")
        for (i in list)
        {
            when(i){
                is Int -> print("Item ID: $i \n")
                is String -> print("Item name: $i \n")
                is Float -> print("Price: $i \n")
                is Long -> print("Quantity : $i \n")
            }
        }
        println()
        println("TOTAL BILL AMOUNT: $TotalBill")
    }
}
fun main()
{
    var obj = pointOfSale()
    obj.register()
}