package lesson6

class Car(private var weight: Float, private var size: Int ) {

    var isNew: Boolean = false
        get() {
            return false
        }
        set(value) {
            if (value) {
                println("Yeeees")
            }
            field = value
        }
}