fun main() {
    printXtraLn("Classes / Calculator")
    val calculator = Calculator()

    val result = calculator.multiply(12, 43)
    println("Our result is: $result")
}

class Calculator {

    fun add(first: Int, second: Int): Int {
        println("$first + $second")
        return first + second
    }

    fun subtract(first: Int, second: Int): Int {
        println("$first - $second")
        return first - second
    }

    fun multiply(first: Int, second: Int): Int {
        println("$first * $second")
        return first * second
    }

    fun divide(first: Int, second: Int): Int {
        println("$first / $second")
        return first / second
    }
}