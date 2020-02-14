package collections

import kotlin.system.measureTimeMillis

fun main() {

    (0 until 10).map {
        measureTimeMillis {
            testingSequence()
        }
    }.sum().also { executionTime -> println("Exeucted in ${executionTime}ms") }

}

fun testingSequence() {
//    Library.books
//        .asSequence()
    (0 until 100_000)
        .map {
            Book(
                title = it.toString(),
                author = Author(it.toString()),
                genre = Genre.NonFiction.SelfHelp,
                price = it * 100
            )
        }
        .asSequence()
        .map { book ->
            book.copy(title = book.title.toUpperCase())
        }
        .map { book ->
            val firstAuthor = book.authors.first()
            book.copy(authors = listOf(firstAuthor))
        }
        .filter { book ->
            book.genres.all { it is Genre.NonFiction }
        }
        .filter { book ->
            book.price >= 1000
        }
        .map { book ->
            book.title
        }
        //.forEach { bookTitle -> println(bookTitle) }
}