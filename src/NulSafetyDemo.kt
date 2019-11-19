var data1: String = "data"
var data2: String? = null

fun main() {
    val length: Int = data2?.length ?: -1

    println(length)

    val str = "one"
//    val int: Int = str as? Int
}