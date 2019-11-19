package kotlindemo

val name = "Prasanna"
var greeting: String? = null

fun main() {
    greeting = "Hello"

    /*if (greeting != null) {
        println(greeting)
    } else {
        println("Hi")
    }
    */
//    val greetingToPrint = if (greeting != null) greeting else "Hi"
    val greetingToPrint = when (greeting) {
        null -> "Hi"
        else -> greeting
    }
    println(greetingToPrint)




    println(name)
}
