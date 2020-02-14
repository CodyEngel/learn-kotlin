package collections

fun main() {
    listOf(10, 4, 3, 1, 57, 80, 0, -12).sorted()
//        .also { println(it) }

//    Library.books.sorted()
    Library.books.sortedBy { book ->
        book.title
    }//.forEach { println(it.title) }

    Library.books.sortedByDescending { book ->
        book.title
    }//.forEach { println(it.title) }

    Library.books.reversed()//.forEach { println(it.title) }

    Library.books.sortedBy { it.title }
        .shuffled()
//        .forEach { println(it.title) }

    val aToZBooks = Library.books.sortedBy { it.title }
    val shuffledBooks = aToZBooks.shuffled()
//        .forEach { println(it.title) }
}