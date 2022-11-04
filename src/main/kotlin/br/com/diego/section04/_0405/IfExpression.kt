package br.com.diego.section04._0405

fun main() {

    val myInt = 199
    val aInt = 7

    val lowest = if (myInt < aInt) myInt else aInt

    val temp = 25
    val isAirConditionerOn = if (temp >= 26) {
        println("It is warm")
        true
    } else {
        println("It isn't warm")
        false
    }
    println("Is the air conditioner on: $isAirConditionerOn")
}