class User {
    lateinit var data: String

    val str: String by lazy {
        println("lazy..")
        "lazy"
    }
}

fun main() {
    var userObj = User()
//    println(userObj.str)
//    userObj.data = "Hello"
    println(userObj.data)
}