private var name: String = "Hello"
    get() = field
    set(value) {
        field = value
    }
val no: Int = 10
    get() {
        return field
    }

private var age: Int = 0
    set(value) {
        if (value < 0) {
            field = 0
        } else {
            field = value
        }
    }

var obj: String? = null
    get() {
        return field?.toUpperCase()
    }
    set(value) {
        field = value
    }

fun main() {
    println("${name}, ${no}")

    name = "Prasanna"

    age = -1

    println("${name}, ${no}")

    println(obj)

    obj = "Prasanna"

    println(obj)

    name.plus("H")

    name.chars()

    print(name.chars().count())
    println(name.length)
}