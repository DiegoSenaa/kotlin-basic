package br.com.diego.section04._0409

fun main() {
    println("10 + 20 = ${myMathFunction(10,20)}")
    println("15 + 25 = ${myMathFunctionExpressionBody(10,20)}")
    println("15 + 25 = ${myMathFunctionExpressionBodyWithInference(10,10)}")
    println("Result default = ${myMathFunctionWithDefaults()}")
    println("Result default = ${myMathFunctionWithDefaults(greeting = "Hey bro!")}")


}

fun myMathFunction(number1: Int, number2: Int): Int {
    return number1 + number2
}

fun myMathFunctionExpressionBody(number1: Int, number2: Int): Int = number1 + number2

fun myMathFunctionExpressionBodyWithInference(number1: Int, number2: Int) = number1 + number2

fun myMathFunctionWithDefaults(number1: Int = 5, number2: Int = 3, greeting: String = "hi"): Int {
    println(greeting)
    return number1 + number2
}

