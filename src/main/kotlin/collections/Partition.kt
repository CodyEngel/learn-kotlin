package collections

fun main() {
    val fictionNonFiction: Pair<List<Book>, List<Book>> =
        Library.books.partition { book ->
        book.genres.all { genre ->
            genre is Genre.NonFiction
        }
    }

    println("=== Non Fiction ===")
    fictionNonFiction.first.forEach { println(it) }

    println("=== Fiction ===")
    fictionNonFiction.second.forEach { println(it) }
}