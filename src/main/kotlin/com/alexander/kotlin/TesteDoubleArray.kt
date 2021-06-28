package com.alexander.kotlin

fun main() {
    val array = DoubleArray(3)
    array[0] = 1.5
    array[1] = 5.0
    array[2] = 99.9

    array.forEach { println(it) }
}