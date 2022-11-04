package br.com.diego.section07._0704

import br.com.diego.section07._0703.Person


fun main() {
    val person = Person("Stan", "Lee")

    val kCLass = person::class

    println("Simple name = ${kCLass.simpleName}")

//    for (fields in kCLass.members){
    for(fields in kCLass.java.declaredFields){
//        println("Property name = $fields")
        println("Property name = ${fields.name}")
    }

    for(constructor in kCLass.constructors){
        println("Constructor = $constructor")
        println("Constructor return = ${constructor.returnType}")
        println("Constructor return = ${constructor.parameters}")
    }
}