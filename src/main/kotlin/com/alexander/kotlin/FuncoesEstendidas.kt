package com.alexander.kotlin

fun Array<Int>.somatoria() = this.reduce {
    a, v -> a + v
}

fun Array<Int>.media() =
    if (this.isEmpty()) 0
    else this.somatoria() / this.size