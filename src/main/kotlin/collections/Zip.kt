package collections

fun main() {

    val authors: List<List<Author>> = Library.books.map { it.authors }
    val genres: List<List<Genre>> = Library.books.map { it.genres }

    val authorGenres: List<Pair<List<Author>, List<Genre>>> = authors.zip(genres)
//    authorGenres.forEach { println("${it.first} : ${it.second}") }

    authorGenres.unzip()
        .also {
            println(it.first)
            println(it.second)
        }
}