package br.com.diego.section04._0408

fun main() {
    var index = 0

    for (item in 10.rangeTo(20).step(2)) {
        println("${++index} $item,")
    }

    for ((i, item) in 10.rangeTo(20).step(2).withIndex()) {
        println("$i $item,")
    }

    val myArray = arrayOf(10,20,30,40,50)
    for (item in myArray.indices) {
        println("At index $item is ${myArray[item]}")
    }
}