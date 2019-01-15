package lesson1

fun main(args: Array<String> ) {
    var name: String = "Eu9en"
    var a: Int = 1
    var b: Int = 2

    println("Hello $name")
    println("Hello %s".format(name))
    println("A + B = ${a + b}")
    println("A + B = %d".format(a + b))
}