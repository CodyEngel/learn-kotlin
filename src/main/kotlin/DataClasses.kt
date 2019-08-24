data class Person(
    val name: String = "Jane Doe",
    val age: Int = 22,
    val gender: String = "Female",
    val nationality: List<String> = listOf("United States")
)

fun main() {
    printXtraLn("Data Classes")
    val cody = Person(
        age = 29,
        nationality = listOf("United States"),
        gender = "Male",
        name = "Cody Engel"
    )

    printXtraLn("Cody: $cody")

    val newCody = cody.copy(nationality = listOf("United States", "Canada"))

    printXtraLn("New Cody: $newCody")

    val (name, age) = newCody

    printXtraLn("Name: $name, Age: $age")

    val defaultPerson = Person(
        gender = "Male",
        age = 75,
        name = "John Smith"
    )
    printXtraLn("Default Person: $defaultPerson")
}