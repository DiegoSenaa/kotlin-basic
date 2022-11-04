package br.com.diego.section08._0803

data class Student(
    val name: String,
    val age: Int
)

fun getStudents(): List<Student> {
    return listOf(
        Student("Diego", 19),
        Student("Dan", 23),
        Student("Manuel", 20),
        Student("João", 39),
        Student("José", 16)
    )
}
