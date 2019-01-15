package lesson12

class Driver(name: String) : Person(name) {

    override val age: Int = 2;

    override fun getAddress(): String {
        return "Address"
    }

    override fun toString(): String {
        return "Driver(age=$age, name=$name)"
    }


}