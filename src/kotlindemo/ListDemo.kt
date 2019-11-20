package kotlindemo

fun main() {
    val list = listOf("Kotlin", "Java", null, null, "C++", "JavaScript")
    list
        .filterNotNull()
        .filter { it.startsWith("J") }
        .map {
            it.length
        }
        .forEach {
            println(it)
        }
}