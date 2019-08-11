fun main() {
    // Numbers - Min/Max Values
    println(Byte.MIN_VALUE)
    println(Byte.MAX_VALUE)
    println()
    println(Short.MIN_VALUE)
    println(Short.MAX_VALUE)
    println()
    println(Int.MIN_VALUE)
    println(Int.MAX_VALUE)
    println()
    println(Long.MIN_VALUE)
    println(Long.MAX_VALUE)
    println()
    println(Float.MIN_VALUE)
    println(Float.MAX_VALUE)
    println()
    println(Double.MIN_VALUE)
    println(Double.MAX_VALUE)
    println()

    // Different Ways to Represent 1
    println(1L)
    println(1)
    println(0x01)
    println(0b01)
    println(1.0)
    println()

    // Numeric Conversations
    println(1.toLong())
    println(1.toByte())
    println(1.toShort())
    println(1.toDouble().toFloat().toLong().toByte().toShort())
    println()

    // Math
    println(2 + 2)
    println(7 / 3)
    println(7 / 3.toFloat())
    println(7 / 3.toDouble())
    println(7 * 2 + 1 / 16 - 32)
    println()

    // Binary Operations
    println(4 shr 2) // 0b100 -> 0b001
    println(1 shl 1) // 0b01 -> 0b10
    println(8 and 2)
    println(8 or 2)
    println(8 xor 2)
    println()

    // Underscores to make numbers more readable
    println(1000000)
    println(1_000_000)
    println(1234_5678_9012_3456L)
    println(0xFFECDE5E)
    println(0xFF_EC_DE_5E)
    println(0b11010010_01101001_10010100_10010010)
    println()

    // Characters
    println('a')
    println(97.toChar())
    println("EMOJI REDEMPTION")
    "😅".toCharArray().forEach { println(it.toInt()) }
    println('\u1F60')
    println('\t')
    print('b')
    print('\n')
    print('c')
    println()
    println()

    // Strings
    println("abcd")
    println("🤷‍♂️")
    println("abcd\nefgh\tijkl")
    println("""
        abcd
        efgh    ijkl
    """.trimIndent())
    println("Int: ${2 + 3}")
    println()

    // Booleans
    println(true)
    println(false)
    println(true || false)
    println(true && false)
    println(!true)
    println(!false)

    // Arrays
    println(Array(5) { it * it }) // [0, 1, 2, 3, 4]
    Array(5) { it * it }.forEach { println(it) }
    println()
    println(intArrayOf(0, 1, 2, 3, 4))
    intArrayOf(0, 1, 2, 3, 4).forEach { println(it) }
    println()
    longArrayOf(0, 1, 2, 3, 4)
    doubleArrayOf(0.3, 0.5, 1.0, 232.3423)
    floatArrayOf(3.4.toFloat(), 0.23.toFloat(), Double.MAX_VALUE.toFloat())
        .forEach { println(it) }
}