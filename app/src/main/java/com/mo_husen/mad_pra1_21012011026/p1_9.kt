package com.mo_husen.mad_pra1_21012011026

class p1_9 {
}

fun main() {
    var array = Array<Int>(5){0}
    var x:Int = 0
    val abc:Int = array.size
    while( x < abc)
    {
        print("a[$x]=")
        array[x] = readLine()!!.toInt()
        x++
    }
    var a = array[0]
    for (num in array) {
        if (a < num)
           a= num
    }
    println("Largest element = $a")
}
