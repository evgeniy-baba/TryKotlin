package lesson7

import lesson7.animals.cat.CatA
import lesson7.animals.dog.DogA
import lesson7.animals.superMethod

fun main(args: Array<String>) {

    val catA = CatA()
    val dogA = DogA()

    catA.a1()
    dogA.a1()

    superMethod()
}

