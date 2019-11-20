package kotlindemo

fun printFilteredStrings(list: List<String>, predicate: ((String) -> Boolean)?) {
    list.forEach {
        if (predicate?.invoke(it) == true) {
            println(it)
        }
    }
}

fun main() {
    val list = listOf("Kotlin", "Java", "C++", "JavaScript")
    printFilteredStrings(list) {
        it.startsWith("K")
    }

    printFilteredStrings(list, predicate)

    printFilteredStrings(list, getPrintPredicate())
}

val predicate: (String) -> Boolean = {
    it.startsWith("F")
}

fun getPrintPredicate(): (String) -> Boolean {
    return { it.startsWith("K") }
}
