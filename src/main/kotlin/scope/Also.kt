package scope

fun main() {
    val homer = FictionalPerson(
        firstName = "Homer",
        lastName = "Simpson",
        age = 39,
        address = Address(
            number = 742,
            street = "Evergreen Terrace",
            city = "Springfield",
            state = "Oregon",
            zipCode = 97475
        )
    ).also { insert(it) }

    println(homer)
}

fun insert(fictionalPerson: FictionalPerson) {
    println("Inserted $fictionalPerson into the database.")
}