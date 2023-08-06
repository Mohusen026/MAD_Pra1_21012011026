package com.mo_husen.mad_pra1_21012011026

class p1_7 {
}

fun main() {
    val a = 5
    val ans: Long
    ans= factorial(a)
    println("Factorial of $a is = $ans")
}

fun factorial(n: Int): Long {
    return if(n == 1){
        n.toLong()
    }
    else{
        n*factorial(n-1)
    }
}
