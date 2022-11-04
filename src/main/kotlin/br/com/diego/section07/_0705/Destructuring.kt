package br.com.diego.section07._0705

import br.com.diego.section07._0702.Coordinates

fun main() {

    showComponents()
    return

    val c1 = Coordinates(200, 100)
    val c2 = Coordinates(100, 2000)
    val c3 = c1 + c2
    println(c3)

    val (xCoordinate, yCoordinate) = c3
    println("xCoordinate = $xCoordinate, yCoordinate = $yCoordinate")

    println("xCoordinate = ${c3.component1()}")
}

fun showComponents() {
    val myPoint = Point(1,2,3)
    val (myX, myY, myZ) = myPoint
    println("myX = $myX, myY = $myY, myZ = $myZ")
}