package collections

fun main() {

    // Print All Authors
    val justAuthors = Library.books
        .map { book: Book ->
            book.authors
        }
        .map { authors: List<Author> ->
            authors.joinToString { it.name }
        }
        .joinToString(separator = "\n")

//    println("=== Authors ===")
//    println(justAuthors)

    // Print Book Title + Authors
    val titleAndAuthors = Library.books
        .map { book: Book ->
            val authors = book.authors.joinToString { it.name }
            "${book.title} by $authors"
        }.joinToString(separator = "\n")

//    println("=== Title & Authors ===")
//    println(titleAndAuthors)

    // Book Title + Location/ID
    println("=== Books with Index")
    val booksWithIndex = Library.books
        .mapIndexed { index, book -> "$index - ${book.title}" }

    println(booksWithIndex.joinToString(separator = "\n"))
}