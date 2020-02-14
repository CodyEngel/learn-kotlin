package collections

fun main() {
    Library.books.associate {
//        println("Associate Book: $it")
        Pair(it.genres.first(), it) // Pair<Genre, Book>
    }.forEach { key, value ->
//        println("$key : $value")
    }

    Library.books.associateBy { it.genres.first() }.forEach { key, value ->
//                println("$key : $value")
    }

    Library.books.associateWith { it.genres.first() }.forEach { key, value ->
//                println("$key : $value")
    }

    val theType: Map<Genre, Book> = Library.books.associateBy { it.genres.first() }
}