open class Person(val id: Int, val name: String) {
//    private var mName: String? = null
//    private var mId: Int? = null

    init {
//        mName = name
//        mId = id
        println("init block...")
    }

    override fun toString(): String {
        return "${name}...${id}"
    }
}

class Person1(val name: String) {
    constructor(name: String, age: Int) : this(name) {
        println("Hello")
    }

    init {
        println(name)
    }

    override fun toString(): String {
        return name
    }

}

fun main() {
    val person = Person(1, "Prasanna")

    println(person)

    val person1 = Person1("Prasanna", 0)

    println(person1)
}
