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

    val returned = homer.apply {
        address.state = "Illinois"
        address.zipCode = 62629
        println("Homer Has Moved To Illinois")
        gender = "Male"
        hasFacebook = true
        hasTwitter = false
        occupation = "Nuclear Safety Inspector"
        println("Optional Values Have Been Applied")
    }

    println(homer)
    println(returned)
}