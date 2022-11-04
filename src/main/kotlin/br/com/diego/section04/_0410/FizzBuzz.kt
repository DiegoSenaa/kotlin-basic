package br.com.diego.section04._0410

fun main() {
    println(fizzBuzz(5))
    println(fizzBuzz(16))
}

fun fizzBuzz(i: Int): MutableList<String> {

    val values = mutableListOf<String>();

    for (item in 1 .. i) {

        when {
            (item % 3 == 0 && item % 5 == 0) -> values.add("FizzBuzz")
            item % 3 == 0 -> values.add("Fizz")
            item % 5 == 0 -> values.add("Buzz")
            else -> values.add(item.toString())
        }
    }

    return values
}
