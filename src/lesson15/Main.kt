package lesson15


fun main(args: Array<String>) {

    val nums = 1..10
    val characters = 'a'..'z'

    for (num in nums) {
        if (num == 3) {
            println(true)
            break
        }
    }


    println(3 in nums)
    println(30 in nums)
    println('b' in characters)
    println('/' in characters)
}

