package lesson5

fun main(args: Array<String>) {

    // Exclude null pointer
    val st: String = getSt();
    println(st.length)

    val stOrNull: String? = getStOrNull()

    // Null Safety
    // Check null
    println(stOrNull?.length) // Variant A
    println(if (stOrNull != null) stOrNull.length else -1) //Variant B

    // Variant C
    if (stOrNull != null && stOrNull.isNotEmpty()) {
        println("String of length ${stOrNull.length}")
    } else {
        println("Empty string")
    }

    println(stOrNull?.length ?: -1) //Variant D

    // Throw null pointer exception
    println(stOrNull!!.length)
}

fun getSt(): String {
    return "Hello"
}

fun getStOrNull(): String? {
    return null
}