import kotlin.math.max

fun main() {
    println("Control Flow & Type Checks")

    println("Basic & traditional way...")
    val a = 1
    val b = 2
//    if (a < b) maxNumber = b
//    var maxNumber: Int
//    if (a > b) {
//        maxNumber = a
//    } else {
//        maxNumber = b
//    }

    val maxNumber = if (a > b) {
        println("It looks like a will be our max number :)")
        a
    } else {
        println("It looks like b will be our max number :(")
        b
    }

    println("The maxNumber is $maxNumber")

    println("When expressions...")

    val x: Any = 1
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> println("x is something else")
    }

    println("Multiple Options")
    when (x) {
        0, 1 -> println("x is 0 or 1")
        else -> println("x is something else")
    }

    println("Ranges")
    when (x) {
        in 1..10 -> println("x is in the range")
        in listOf(2, 4, 6, 8, 10, 12, 14, 16, 18, 20) -> println("x is at least a valid number...")
        !in 10..20 -> println("x is wayyyyyyyy outside of the range")
        else -> println("x is none of the above, somehow")
    }

    println("Casting & Smart Casting")
    when (x) {
        is String -> println("Length of x: ${x.length}")
        is Int -> println("Value of x: $x")
        else -> println("X is something else")
    }

    println("Replacing if/elseif/else with when")
    var y = 2
//    if (y % 2 != 0) {
//        println("y is odd")
//    } else if (y % 2 == 0) {
//        println("y is even")
//    } else {
//        println("y is funky")
//    }
    when {
        y % 2 != 0 -> println("y is odd")
        y % 2 == 0 -> println("y is even")
        else -> println("y is funky")
    }

    println("For Loops")
    for (i in 1..3) {
        println(i)
    }

    println("Fancier For Loops...")
    for (i in 6 downTo 0 step 2) {
        println(i)
    }

    println("For Loops With Collections")
    val myCollection = listOf("Hey", "Be", "Sure", "To", "Like", "&", "Subscribe", "😊")

    for (item in myCollection) println(item)

    println("For Loops With Collections on Indices")
    for (i in myCollection.indices) {
        println("$i : ${myCollection[i]}")
    }

    println("For Loops With Collections for Items & Indices")
    for ((index, value) in myCollection.withIndex()) {
        println("$index : $value")
    }

    println("While Loops")
    var number = 12
    while (number > 0) {
        number--
        println("We're still going to decrement the number...")
    }

    do {
        val anotherNumber = 0
        println("Do While...")
    } while (anotherNumber > 0)

    println("Break...")
    number = 12
    while (number > 0) {
        number --
        if (number % 5 == 0) break
        println("We're still going to decrement the number...")
    }

    println("Continue...")
    number = 12
    while (number > 0) {
        number--
        if (number % 2 == 0) continue
        println("We're still going to decrement the number...")
    }
}