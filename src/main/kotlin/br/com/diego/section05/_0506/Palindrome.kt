package br.com.diego.section05._0506

fun main() {
    println(checkString("civic"))
    println(checkString("bob"))
    println(checkString("brow"))
    println(checkString("1001"))
    println(checkString("12"))

}

fun checkString(s1: String): Boolean {
    return s1 == s1.reversed()
}