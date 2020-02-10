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

    val returned = homer.address.run {
        state = "Illinois"
        zipCode = 62629
    }

    println(homer)
    println(returned)

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

    println(marge)
    marge = null

    marge?.run {
        address = homer.address
        hasTwitter = true
        gender = "Female"
        occupation = "Housewife"
    } ?: println("Whoops, marge was null.")

    println(marge)
}