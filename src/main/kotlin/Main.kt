fun main() {
    var names = arrayOf("Esther","Mwiyeria")
    var phonenumbers = arrayOf( 757197885,706132130)
    val genderFemale = true

    var details = arrayOf("details",names[0],phonenumbers[0],!genderFemale)
    var list = arrayOf("list",names[1],phonenumbers[1],genderFemale)

    println(details.contentToString())
    println(list.contentToString())
}