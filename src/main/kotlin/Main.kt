fun main() {
    var names = arrayOf("Regina", "Esther")
    var phonenumber = arrayOf(794363077,757197885)
    val genderFemale = true

    var details = arrayOf("details", names[0], phonenumber[0], genderFemale)
    var list = arrayOf("list", names[1], phonenumber[1], !genderFemale)

    println(details.contentToString())
    println(list.contentToString())
}