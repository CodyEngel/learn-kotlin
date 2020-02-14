package collections

fun main() {
    Library.books.groupBy { book ->
        book.genres
    }
//        .forEach { key, value ->
//        println("=== $key ===")
//        value.forEachIndexed { index, book ->
//            println("${index + 1}. ${book.title}")
//        }
//    }

    Library.books.map { book ->
        book.genres.map { genre ->
            Pair(genre, book)
        }
    }.flatten().groupBy { genreBooks ->
        genreBooks.first
    }.forEach { entry ->
        println("=== ${entry.key} ===")
        entry.value.forEachIndexed { index, pair ->
            println("${index + 1}. ${pair.second.title}")
        }
    }
}