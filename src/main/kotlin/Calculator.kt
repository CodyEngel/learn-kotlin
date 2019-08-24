fun main() {
    printXtraLn("Properties & Fields / Calculator")
    val calculator = Calculator(initialValue = 2)
    calculator.add(12)
    calculator.add(32)
    calculator.subtract(3)
    calculator.multiply(54)
    calculator.add(1)
    calculator.divide(2)
    printXtraLn("Result: ${calculator.currentValue}")
}

class Calculator(initialValue: Int = 0) {
    var currentValue = initialValue

    fun add(number: Int): Int {
        println("$currentValue + $number")
        currentValue += number
        return currentValue
    }

    fun subtract(number: Int): Int {
        println("$currentValue - $number")
        currentValue -= number
        return currentValue
    }

    fun multiply(number: Int): Int {
        println("$currentValue * $number")
        currentValue *= number
        return currentValue
    }

    fun divide(number: Int): Int {
        println("$currentValue / $number")
        currentValue /= number
        return currentValue
    }
}