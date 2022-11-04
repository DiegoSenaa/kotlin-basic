package br.com.diego.section05._0502

//class Person constructor( firstName: String, lastName: String)
//class Person ( firstName: String, lastName: String)
class Person internal constructor(firstName: String, lastName: String) {

    init {
        println("Created a person named: $firstName $lastName")
    }

    constructor(firstName: String, middleName: String, lastName: String) :
            this(firstName, lastName)
}