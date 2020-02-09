package com.messio.basic

object Constants {
    val NAME = "BASIC"
}

fun sum(a: Int, b: Int): Int = a + b

fun max(a: Int, b: Int): Int = if (a > b) a else b

fun parseInt(s: String): Int? {
    // question mark means can be null
    return 0
}

fun main() {
    println("Hello World!")
    println(sum(3, 9))
    val b: Int = 15  // read-only
    println(b)
    var c: Int = 23  // rw
    println("c is $c")
    println("max of 4 and 6: ${max(4, 6)}")
    val items = listOf("apple", "banana", "orange")
    for (item in items) {
        println(item)
    }
    when {
        "apple" in items -> println("There are apples")
        "orange" in items -> println("There are oranges")
        "nut" in items -> println("There are nuts")
    }
    items.filter { it.startsWith("a") }.forEach { println(it) }
}