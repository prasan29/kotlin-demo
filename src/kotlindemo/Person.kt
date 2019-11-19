package kotlindemo

class Person(val firstName: String, val lastName: String) {

    /*private val firstName: String = _firstName
    private val lastName: String = _lastName

    override fun toString(): String {
        return "$firstName $lastName"
    }*/

    constructor() : this("Peter", "Parker") {
        println("Secondary constructor.")
    }

    init {
        println("init 1")
    }

    init {
        println("init 2")
    }

}

fun main() {
    Person()
}
