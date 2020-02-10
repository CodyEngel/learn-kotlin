import kotlin.random.Random

fun main() {
    printXtraLn("Properties & Fields / Calculator")
    val calculator = CalculatorStore.theBestCalculator
    calculator.add(2)
    calculator.add(2)
    calculator.subtract(3)
//    calculator.multiply(4)
    calculator.add(1)
    printXtraLn("Result: ${calculator.currentValue}")

    val subtractionCalculator = CalculatorStore.subtractionCalculator

}

object CalculatorStore {
    val theBestCalculator: Calculator = BetterCalculator(42)
    val aRandomCalculator: Calculator = RandomCalculator()

    val subtractionCalculator: SubtractionCalculator = BetterCalculator()

    const val ZERO = 0
    const val LARGE_NEGATIVE = Int.MIN_VALUE
    const val LARGE_POSITIVE = Int.MAX_VALUE
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

    companion object {
        val negativeCalculator = BetterCalculator(-10)

        fun clone(calculator: Calculator): Calculator {
            return BetterCalculator(calculator.currentValue)
        }

        fun empty(): Calculator {
            return BetterCalculator()
        }

        fun fix(calculator: BadCalculator): BetterCalculator {
            return clone(calculator) as BetterCalculator
        }
    }
}

interface AdditionCalculator {
    fun add(previousNumber: Int, number: Int): Int

    class Real : AdditionCalculator {
        override fun add(previousNumber: Int, number: Int): Int {
            println("$previousNumber + $number")
            return previousNumber + number
        }
    }
}

interface SubtractionCalculator {
    fun subtract(previousNumber: Int, number: Int): Int

    class Real : SubtractionCalculator {
        override fun subtract(previousNumber: Int, number: Int): Int {
            println("$previousNumber - $number")
            return previousNumber - number
        }
    }
}

interface MultiplicationCalculator {
    fun multiply(number: Int): Int
}

abstract class Calculator(
    initialValue: Int = 0
) : AdditionCalculator by AdditionCalculator.Real(), SubtractionCalculator by SubtractionCalculator.Real() {
    open var currentValue = initialValue
        protected set

    fun add(number: Int): Int {
        currentValue = add(currentValue, number)
        return currentValue
    }

    fun subtract(number: Int): Int {
        currentValue = subtract(currentValue, number)
        return currentValue
    }

//    fun add(number: Int): Int {
//        println("$currentValue + $number")
//        currentValue += number
//        return currentValue
//    }
//
//    fun subtract(number: Int): Int {
//        println("$currentValue - $number")
//        currentValue -= number
//        return currentValue
//    }
//
//    fun multiply(number: Int): Int {
//        println("$currentValue * $number")
//        currentValue *= number
//        return currentValue
//    }

    fun divide(number: Int): Int {
        println("$currentValue / $number")
        currentValue /= number
        return currentValue
    }
}