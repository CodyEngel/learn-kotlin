package scope

fun main() {
    println("Scope Functions")
    println()
    val scopeFunctions = "Hello scope functions!"

    val let = scopeFunctions.let {
        println("What is let?")
        it.replace(" ", ".").reversed()
    }
    println(let)
    println()

    val run = scopeFunctions.run {
        println("What is run?")
        toUpperCase().removePrefix("HELLO").trim()
    }
    println(run)
    println()

    val with = with(scopeFunctions) {
        println("What is with?")
        drop(5).toByteArray().contentToString()
    }
    println(with)
    println()

    val apply = mutableListOf<Int>().apply {
        println("What is apply?")
        add(1)
        add(2)
        add(3)
    }
    println(apply.toString())
    println()

    val also = mutableListOf<Int>().also {
        it.add(1)
        it.add(2)
        println("This is a side effect thing.")
    }
    println(also.toString())
    println()
}