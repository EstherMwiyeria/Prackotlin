fun main() {
    var names = arrayOf("Java","Sarova")
    var phonenumbers = arrayOf(798788909,791784628)
    val genderMale = true

    var details = arrayOf("details", names[0], phonenumbers[0], genderMale )
    var list = arrayOf("list",names[1], phonenumbers[1], !genderMale)

    println(details.contentToString())
    println(list.contentToString())

}