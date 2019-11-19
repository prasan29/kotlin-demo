/*fun main() {
//    getList()?.forEach { s -> println(s) }
    val array = arrayOf(1, "...Hi...", 30)
*//*
    array.forEach { s -> print(s) }
    array[1] = 10
    println()
    println("${array.get(0)}...${array[1]}...${array[2]}...${array.size}")
*//*

    var arrayInt = arrayOf<Int>(1, 2, 3)

    var arrayBool = booleanArrayOf(true, false)

    var arrayInt1 = intArrayOf(1, 2, 3)

    val list1 = listOf<Int>(10, 20)
//    list1.forEach { println(it) }

    val list2: MutableList<Int> = mutableListOf(10, 20, 30)
    *//*list2.forEach { println(it) }
    list2.set(2, 40)
    list2.forEach { println(it) }

    println(add(5, 6))*//*

    getData(number = 6, str = "Hello")
}*/

fun getData(str: String = "", number: Int) {
    println("${str}...${number}\n" + str + number)
}

fun add(a: Int, b: Int): Int = a + b
