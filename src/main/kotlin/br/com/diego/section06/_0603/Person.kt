package br.com.diego.section06._0603

class Person internal constructor(var firstName: String, var lastName: String) {

    init {
        println("Created a person named: $firstName $lastName")
    }

    constructor(firstName: String, middleName: String, lastName: String) :
            this(firstName, lastName)
}