package lesson9

import lesson9.Color.*

fun main(args: Array<String>) {
    // Example 1
    var n = 10
    var result = when(n) {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        5 -> "Five"
        6 -> "Six"
        else -> "None"
    }

    println(result)

    // Example 2
    println(getColor(GREEN))
    println(getColor(BLACK))

    // Example 3

    var a = 2
    var b = 2

    when {
        (a > b) -> println(" $a > $b = true")
        (a < b) -> println(" $a < $b = true")
        (a == b) -> println(" $a == $b = true")
    }

}

private fun getColor(color: Color): String {
    return when (color) {
        BLACK, WHITE -> "Черный или Белый"
        RED -> "Красный"
        GREEN -> "Зеленый"
        else -> "Никакой"
    }
}

