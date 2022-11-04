package section06._0602

import br.com.diego.section6._0602.Animal

fun main() {

    val cat = Animal("Garfield", "cat", 10)
    println(cat.show())
    val dog = Animal("Totó", "Dog", 30)
    println(dog.show())
    cat.weight = 13
    println(cat.show())
}