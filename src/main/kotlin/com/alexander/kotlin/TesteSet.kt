package com.alexander.kotlin

fun main() {
    val array = mutableSetOf(1 to "Alex",2 to "Lucas",3 to "Michele")

    array.add(4 to "Gabriel")
    array.add(5 to "Daniel")


    array.forEach { println(it) }
}