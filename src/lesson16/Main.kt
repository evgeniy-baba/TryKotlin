package lesson16


fun main(args: Array<String>) {

    val person = Person("Eu9en", 32)
    val person2 = person.copy(age = 1)
    val (age) = person
    println(person)
    println(person2)
    println(age)
}

