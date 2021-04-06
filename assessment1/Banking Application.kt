package com.ltts.assessment1

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDateTime
import java.util.*

class BankApplication() {
    var scanner = Scanner(System.`in`)
    var accountnumber: Int = 0
    var accountholder: String = ""
    var accounttype: String = ""
    var t: Int = 0
    var amount: Float = 0.0f
    var with: Float = 0.toFloat()
    var result: Float = 0.toFloat()
    @RequiresApi(Build.VERSION_CODES.O)
    fun accountinfo() {
        print("Enter Account Number: ")
        accountnumber = scanner.nextInt()
        print("Enter Name of Account Holder: ")
        accountholder = scanner.next()
        print("Enter Account Type(Current/Savings): ")
        accounttype = scanner.next()
        print("Enter Amount in $accounttype Bank Account: ")
        amount = scanner.nextFloat()
        println("Enter Transaction Mode (Withdraw -> 1 /Deposit -> 2 ): ")
        t = scanner.nextInt()
        when (t)
        {
            2 -> Deposit().deposit()
            1 -> Withdrawal().withdraw()
        }
        val current = LocalDateTime.now()
        println("Date and Time of Transaction is: $current")
    }
}
class Deposit
{
    var scanner = Scanner(System.`in`)
    @RequiresApi(Build.VERSION_CODES.O)
    fun deposit()
    {
        var bank = BankApplication()
        var am = bank.amount
        println(am)
        println("Enter the amount to be deposited: ")
        var with = scanner.nextFloat()
        var result = am + with
        System.out.printf("Final Amount in Account is = %.2f", result)
        println()
    }
}
class Withdrawal
{
    var am = BankApplication().amount
    var scanner = Scanner(System.`in`)
    fun withdraw()
    {
        println("Enter the amount to be withdrawed: ")
        var with = scanner.nextFloat()
        var result = am - with
        System.out.printf("Final Amount in Account is = %.2f", result)
        println()
    }
}
@RequiresApi(Build.VERSION_CODES.O)
fun main()
{
    var scanner = Scanner(System.`in`)
    println("Choose from the following options :  " +"\n"+
            "1. Open New Account  " +"\n"+
            "2. Deposit Amount" +"\n"+
            "3. Withdraw Amount" +"\n"+
            "4. Search Account by A/C No" +"\n"+
            "5. Close Account" +"\n"+
            "6. Exit the Application")
    var s = scanner.nextInt()
    var b = BankApplication()
    var d = Deposit()
    var w = Withdrawal()
    when(s) {
        1 -> b.accountinfo()
        2 -> d.deposit()
        3 -> w.withdraw()
    }
}