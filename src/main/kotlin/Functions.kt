fun doSomeMath(x: Int = 2, y: Int = 2, operator: String = "add"): Int {
    return when (operator) {
        "add" -> x + y
        "subtract" -> x - y
        "multiply" -> x * y
        "divide" -> x / y
        else -> 0
    }
}

fun printXtraLn(message: Any) {
    println(message)
    println()
}

fun main() {
    printXtraLn("Kotlin Functions")
    printXtraLn(doSomeMath(8, 5, "subtract"))
    printXtraLn(doSomeMath(x = 3, operator = "multiply", y = 4))
}