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
    )

    println(homer)

    moveToIllinois(homer)

    println(homer)

    var marge: FictionalPerson? = FictionalPerson(
        firstName = "Marge",
        lastName = "Simpson",
        age = 36,
        address = Address(
            number = 742,
            street = "Evergreen Terrace",
            city = "Springfield",
            state = "Oregon",
            zipCode = 97475
        )
    )

    moveToIllinois(marge!!)

    println(marge)
}

fun moveToIllinois(fictionalPerson: FictionalPerson) = with(fictionalPerson.address) {
    state = "Illinois"
    zipCode = 62629
}