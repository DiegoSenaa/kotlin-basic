package br.com.diego.section05._0504

interface Vehicle {

    val autoMakerName: String

    fun start() {
        println("Vruuuuuuuuuuuummmm!")
    }

    fun stop() {
        println("Brake noise")
    }

    fun getKmPerLiter(): Int {
        return 17
    }

    fun getDoors(): Int
}