internal class Sample private constructor() {

    init {
        println("Sample")
    }

    fun printValue() {
        println("Hello")
    }

    companion object {
        private var mInstance: Sample? = null

        val insance: Sample
            get() {
                if (mInstance == null) {
                    mInstance = Sample()
                }

                return mInstance as Sample
            }
    }
}

object Solution {
    @JvmStatic
    fun main(args: Array<String>) {
        Sample.insance.printValue()
    }
}
