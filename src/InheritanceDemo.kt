open class Shape {
    var x: Int = 0
    var y: Int = 0

    open fun print() {
        println("Location: $x $y")
    }
}

class Rect : Shape() {
    var width: Int = 0
    var height: Int = 0
    override fun print() {
        println()
        super.print()
    }
}

abstract class Super {
    abstract val data: Int

    abstract fun myFunc()
}

class Sub(override val data: Int) : Super() {
    override fun myFunc() {

    }
}

fun main() {
    val superClass = Sub(1)

    superClass.toString()
}

interface SampleInterface {
    var str: String

    fun muFunc()
}

class SubInterface(override var str: String) : SampleInterface {
    override fun muFunc() {

    }
}