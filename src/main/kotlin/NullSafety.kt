fun main() {
    // Let's Talk About Null
    var thisCouldExist: String? = "Sometimes this exists, sometimes it does not."
    println(thisCouldExist)

//    thisCouldExist = null
//    println(thisCouldExist)
//    println(thisCouldExist!!.length)
//    thisCouldExist = null

    if (thisCouldExist != null) {
        println(thisCouldExist.length)
    }

    thisCouldExist?.let {
        println(it.length)
    }

    println(thisCouldExist?.length ?: 0)
}