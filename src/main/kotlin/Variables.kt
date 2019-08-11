fun main() {
    // Variables in Kotlin
    val okayEmojiPleaseWork = "😭" // immutable
    println(okayEmojiPleaseWork)

    var changingEmoji = "😭"
    println(changingEmoji)
    changingEmoji = "😂"
    println(changingEmoji)

    // More common use case...
    var counter = 0
    println(counter++)
    println(counter++)
    println(counter++)
}