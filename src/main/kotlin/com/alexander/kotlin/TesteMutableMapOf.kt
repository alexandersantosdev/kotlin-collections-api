package com.alexander.kotlin

fun main() {
    val repositorio = Repositorio<Funcionario>()

    val alex = Funcionario("Alex", 2000.0)
    val lucas = Funcionario("Lucas", 3000.0)
    val michele = Funcionario("Michele", 5000.0)

    repositorio.create(alex.nome, alex)
    repositorio.create(lucas.nome, lucas)
    repositorio.create(michele.nome, michele)

    println("--------------------------")
    println(repositorio.findById(alex.nome))

    println("--------------------------")
    repositorio.findAll().forEach { println(it) }
}