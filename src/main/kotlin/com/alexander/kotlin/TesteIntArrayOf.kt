package com.alexander.kotlin

fun main() {
    val numeros = intArrayOf(1,5,99,45,32,76)

    for(numero in numeros) {
        println(numero)
    }

    println("--------------")

    numeros.forEach { println(it) }

    println("--------------")
    numeros.sort()
    numeros.forEach { println(it) }

    println("--------------")
    println(numeros.maxOrNull())

    println("--------------")
    println(numeros.minOrNull())

    println("--------------")
    println(numeros.average())
}