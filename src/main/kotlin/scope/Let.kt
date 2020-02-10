package scope

data class FictionalPerson(
    var firstName: String,
    var lastName: String,
    var age: Int,
    var address: Address,
    var gender: String? = null,
    var hasFacebook: Boolean = false,
    var hasTwitter: Boolean = false,
    var occupation: String? = null
)
data class Address(
    var number: Int,
    var street: String,
    var city: String,
    var state: String,
    var zipCode: Int
)

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

    val returned = homer.address.let { address ->
        address.state = "Illinois"
        address.zipCode = 62629
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

    marge?.let { person ->
        person.address = homer.address
        person.gender = "Female"
        person.hasFacebook = true
        person.hasTwitter = false
    } ?: println("Whoops, marge is actually null, isn't that bad?")

    println(marge)
}