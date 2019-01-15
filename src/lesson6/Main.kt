package lesson6

fun main(args: Array<String>) {

    val person = Person("Test", "Test", 20)

    println(person.firstname)
    println(person.lastname)
    println(person.age)


    val car = Car(20.5F, 10);
    println(car.isNew)
    car.isNew = true
    println(car.isNew)
}
