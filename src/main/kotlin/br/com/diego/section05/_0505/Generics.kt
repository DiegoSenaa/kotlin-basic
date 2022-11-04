package br.com.diego.section05._0505

fun main() {

    val maxInt: Int = max(42,99)
    val maxLong: Long = max(42_42_42L,99_99L)
    val maxByte: Byte = max(((-128).toByte()), (-125).toByte())
    val maxString: String = max("Alpha", "Beta")

    println(maxInt)
    println(maxLong)
    println(maxByte)
    println(maxString)
}