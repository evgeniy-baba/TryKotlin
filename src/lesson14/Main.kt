package lesson14


fun main(args: Array<String>) {

    var index: Int = 0

    while (index < 10) {
        println("Yo :) while index = $index")
        index++
    }

    index = 0
    do {
        println("Yo :) do while index = $index")
        index++
    } while (index < 10)


    var nums = 1..10
    for (value in nums) {
        println("Yo :) for index = $value")
    }

    for (value in nums step 2) {
        println("Yo :) for variant 2 index = $value")
    }

    for (value in 10 downTo 1 step 3) {
        println("Yo :) for variant 3 index = $value")
    }

}

