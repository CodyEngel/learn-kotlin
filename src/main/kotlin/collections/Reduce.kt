package collections

import kotlin.math.roundToInt

fun main() {
    Library.books.map { it.price }
        .reduce { accumulator: Int, price: Int -> accumulator + price }
//        .also { println("Total Value: $it") }

    Library.books.map { it.price }.sum()
//        .also { println("Total Value: $it") }

    Library.books.sumBy { it.price }//.also { println("Total Value: $it") }

    Library.books.map { it.price }
        .average().roundToInt()
        .also { println("Average Value: $it") }

    Library.books.minBy { it.price }
        .also { println("Cheapest Book: $it") }

    Library.books.maxBy { it.price }
        .also { println("Most Expensive Book: $it") }
}