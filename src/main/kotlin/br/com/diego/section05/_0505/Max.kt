package br.com.diego.section05._0505

fun <T: Comparable<T>> max(n1: T, n2: T): T {
    val result = n1.compareTo(n2)
    return if(result > 0) n1 else n2
}