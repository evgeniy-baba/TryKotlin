package lesson12

open class Person(val name: String) {

    open val age: Int = 1;
    override fun toString(): String {
        return "Pesron(name = '$name')"
    }


    open fun getAddress(): String {
        return "My Address"
    }
}