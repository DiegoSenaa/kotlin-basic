package br.com.diego.section07._0703

import br.com.diego.section6._0602.Animal

@Deprecated("Use the animal class instead", ReplaceWith("Animal"))
class Person internal constructor(var firstName: String, var lastName: String) {

    init {
        println("Created a person named: $firstName $lastName")
    }

    constructor(firstName: String, middleName: String, lastName: String) :
            this(firstName, lastName)
}