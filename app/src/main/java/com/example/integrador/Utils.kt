package com.example.integrador

class Utils {
    fun onSuccess(fee: Int): Unit {
        println("Your fee is $fee. Come back soon.")
    }
    
    fun onError(): Unit {
        println("Sorry, the check-out failed")
    }
}