package kotlindemo

fun sayHello(greeting: String, vararg itemsToGreet: String) {
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun greetPerson(greeting: String, name: String = "Prasanna") = println("$greeting $name")

fun main() {
    val interestingThings = arrayOf("Kotlin", "Java", "Coding")
    val map = mapOf(1 to "A", 2 to "B", 4 to "D")
    val mutableMap = mutableMapOf(1 to "A", 2 to "B")
    println(interestingThings.size)
    println(interestingThings[0])
    println(interestingThings.get(0))

    for (interestingThing in interestingThings) {
        println(interestingThing)
    }

    interestingThings.forEach { item ->
        println(item)
    }

    interestingThings.forEachIndexed { index, item ->
        println("$item..in the index..$index")
    }

    interestingThings.forEach { interestingThing -> println(interestingThing) }

    map.forEach { (key, value) ->
        println("$key -> $value")
    }

    mutableMap.putIfAbsent(3, "Z")

    mutableMap.forEach { (key, value) -> println("$key -> $value") }

    sayHello("HI", *interestingThings)

    greetPerson(name = "Prasanna", greeting = "Hi")
    greetPerson(greeting = "Hey")
    greetPerson(greeting = "Hola", name = "Kotlin")
}
