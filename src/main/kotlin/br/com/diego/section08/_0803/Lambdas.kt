package br.com.diego.section08._0803

fun main() {

    val students = getStudents()

    val combos = students.map { s -> "{$s.name} : ${s.age}" }
    println(combos)

    println("The oldest student is: ${students.maxByOrNull { it.age  }}")

    println("Student with longest name is: ${students.filter { it.name.length > 5  }}")
}