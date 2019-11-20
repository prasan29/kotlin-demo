package kotlindemo

interface PersonInfoProvider {
    val providerInfo: String
    fun getPerson(): Person {
        println(providerInfo)
        return Person()
    }
}

interface SessionInfoProvider {
    fun getSessionId(): String
}

open class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider {
    override val providerInfo: String
        get() = "BasiInfo"

    open val sessionIdPrefix = "Session"

    override fun getSessionId(): String {
        return sessionIdPrefix
    }
}

fun main() {
    val info = object : PersonInfoProvider {
        override val providerInfo: String
            get() = "New Provider."

        fun getSessionId() = "ID"
    }

    info.getPerson().printInfo()
    println(info.getSessionId())

    checkType(info)
}

fun checkType(infoProvide: PersonInfoProvider) {
    if (infoProvide is SessionInfoProvider) {
        println("SessionInfoProvider")
        println((infoProvide as SessionInfoProvider).getSessionId())
        infoProvide.getSessionId()
    } else {
        println("!SessionInfoProvider")
    }
}