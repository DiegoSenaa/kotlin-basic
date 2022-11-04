package br.com.diego.section08._0805

fun main() {

    val student = getStudents()

    val sqStudent = student.drop(1).take(3).toList()

    println("Sequenced students: $sqStudent")

    val number = generateSequence(100) { it + 1 }
    println("Numbers: ${number.drop(5).take(20).toList()}")

    val squares = generateSequence(1) { it + 1 }.map { it * it }
    val evenSquares = squares.filter { it % 2 == 0 }

    println("Even squares: ${evenSquares.take(5).toList()} ")

    val fibonacci = generateSequence(1 to 1)
                                            { it.second to it.first + it.second }.map { it.first }
    println("Fibonacci: ${fibonacci.take(15).toList()}")
}