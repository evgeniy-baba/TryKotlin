package lesson13.mouse

internal class SuperMouse: Mouse() {
    fun funB() {
        println("Text")
        funA()
    }
}