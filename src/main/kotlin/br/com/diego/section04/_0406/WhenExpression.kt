package br.com.diego.section04._0406

import kotlin.math.abs

fun main() {

    val pizzasOrdered = 7

    when (pizzasOrdered) {
        0 -> println("Not Hungry")
        1 -> println("Hungry")
        2 -> println("Very Hungry")
        else -> println("Are you sure?")
    }

    when (pizzasOrdered) {
        0 -> println("Not Hungry")
        1,2 -> println("Hungry")
        3 -> println("Very Hungry")
        else -> println("Are you sure?")
    }

    when (pizzasOrdered) {
        abs(pizzasOrdered) -> println("Ordered 0 or more pizzas")
        else -> println("Ordered less than 0")
    }

    when (pizzasOrdered) {
        0 -> println("Not Hungry")
        in 1..4 -> println("Hungry")
        in 5..9 -> println("Very Hungry")
        else -> println("Are you sure?")
    }

    when  {
        pizzasOrdered <= 0 -> println("None ordered")
        pizzasOrdered % 2 == 1 -> println("Odd number ordered")
        pizzasOrdered % 2 == 0 -> println("Even number ordered")
    }
}