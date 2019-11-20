package kotlindemo

class Person(var mFirstName: String = "Prasanna", var mLastName: String = "Srinivasan") {

    var mNickName: String? = null

    override fun toString(): String {
        return "$mFirstName $mLastName $mNickName"
    }

    fun printInfo() {
        var nickNameToPrint = mNickName ?: "Prasan"
        println("$mFirstName $mLastName $nickNameToPrint")
    }

    /*private val firstName: String = _firstName
    private val lastName: String = _lastName

    override fun toString(): String {
        return "$firstName $lastName"
    }*/

    /*constructor() : this("Peter", "Parker") {
        println("Secondary constructor.")
    }

    init {
        println("init 1")
    }

    init {
        println("init 2")
    }*/

}

fun main() {
    val person = Person()
    person.mFirstName = "Prasan"
    person.mLastName = "Srini"
//    person.mNickName = "Poonai"
//    person.mNickName = "Thair Saadham"

    person.printInfo()

//    println(person)
}
