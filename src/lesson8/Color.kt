package lesson8

enum class Color(var colorHex: String, val opacity: Double? = 1.0) {
    RED("#FFFFFF", 0.5),
    WHITE("#000000"),
    BLACK("#22rr33"),
    GREEN("#tttttt")
}