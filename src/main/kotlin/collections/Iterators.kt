package collections

fun main() {
    Library.books.iterator().let { iterator ->
        while (iterator.hasNext()) {
            val book = iterator.next()
//            println(book)
        }
    }

    Library.books.let { books: List<Book> ->
        for (book in books) {
//            println(book)
        }
    }

    Library.books.forEach { book ->
//        println(book)
    }

    Library.books.forEachIndexed { index, book ->
        println("${index + 1} - $book")
    }
}