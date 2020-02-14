package collections

fun main() {
    val listOfAListOfAuthors: List<List<Author>> = Library.books.map { it.authors }
//        .also { it.forEach { println(it) } }

    val authors: List<Author> = listOfAListOfAuthors.flatten()
//        .also { it.forEach { println(it) } }

    val flatMappedAuthors: List<String> = listOfAListOfAuthors
        .flatMap { authorList ->
//            val flattenedAuthorNames = mutableListOf<String>()
//            authorList.forEach { author ->
//                flattenedAuthorNames.add(author.name)
//            }
//            flattenedAuthorNames
            authorList.map { it.name }
        }.also { it.forEach { println(it) } }
}