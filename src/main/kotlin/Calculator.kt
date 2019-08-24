import kotlin.random.Random

fun main() {
    printXtraLn("Properties & Fields / Calculator")
    val calculator = RandomCalculator()
    calculator.add(12)
    calculator.add(32)
    calculator.subtract(3)
    calculator.multiply(54)
    calculator.add(1)
    printXtraLn("Result: ${calculator.currentValue}")
//    val remainder = calculator.remainder(2)
//    printXtraLn("Remainder: $remainder")
}

class RandomCalculator : Calculator(
    initialValue = Random.nextInt(Int.MIN_VALUE, Int.MAX_VALUE)
) {
    override fun print(string: String) {
        println("$string - ALBLJADFLJ")
    }
}

class BetterCalculator(initialValue: Int = 0) : Calculator(initialValue) {
    override fun print(string: String) {
        println(string)
    }

    fun remainder(number: Int): Int {
        println("$currentValue % $number")
        return currentValue % number
    }
}

abstract class Calculator(initialValue: Int = 0) {
    var currentValue = initialValue

    abstract fun print(string: String)

    fun add(number: Int): Int {
        print("$currentValue + $number")
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