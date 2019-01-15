package lesson2

fun main(args: Array<String>) {
    val userJava = UserJava("java@test.test")
    val userKotlin = UserKotlin("kotlin@test.test")

    println("Java example: %s".format(userJava.email))
    println("Kotlin example: %s".format(userKotlin.email))
}