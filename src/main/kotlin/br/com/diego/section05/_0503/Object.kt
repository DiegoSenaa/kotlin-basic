package br.com.diego.section05._0503

fun main() {
    val location1 = object {
        var xCoordinate = 2000
        var yCoordinate = 4000
    }

    println("Coordinates = (${location1.xCoordinate}, ${location1.yCoordinate})")

    val location2 = object {
        var xCoordinate = 3000
        var yCoordinate = 6000

        fun printIt(){
            println("Coordinates = (${xCoordinate}, ${yCoordinate})")
        }
    }

    location2.printIt()

    location2.xCoordinate = 7000
    location2.yCoordinate = 9000

    location2.printIt()
    println(MySingleton.getLastTemperature())
}

object MySingleton {
    var temperatures = arrayOf(18,22,26)
    fun getLastTemperature() = temperatures.last()
}