import kotlin.random.Random

fun main() {
    printXtraLn("Properties & Fields / Calculator")
    val calculator = BadCalculator()
    calculator.add(2)
    calculator.add(2)
    calculator.subtract(3)
    calculator.multiply(4)
    calculator.add(1)
    printXtraLn("Result: ${calculator.currentValue}")
//    val remainder = calculator.remainder(2)
//    printXtraLn("Remainder: $remainder")
}

class RandomCalculator : Calculator(
    initialValue = Random.nextInt(Int.MIN_VALUE, Int.MAX_VALUE)
)

class BadCalculator : Calculator() {
    override var currentValue: Int = super.currentValue
        get() {
            return field - 1
        }
        set(value) {
            field = value * value
        }
}

class BetterCalculator(initialValue: Int = 0) : Calculator(initialValue) {
    fun remainder(number: Int): Int {
        println("$currentValue % $number")
        return currentValue % number
    }
}

abstract class Calculator(initialValue: Int = 0) {
    open var currentValue = initialValue

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