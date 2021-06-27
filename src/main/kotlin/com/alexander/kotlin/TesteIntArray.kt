package com.alexander.kotlin

fun main() {
    val numeros = IntArray(5)
    numeros[0] = 10
    numeros[1] = 45
    numeros[2] = 32
    numeros[3] = 88
    numeros[4] = 3

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