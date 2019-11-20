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

class BasicInfoProvider(override val providerInfo: String) : PersonInfoProvider, SessionInfoProvider {
    override fun getSessionId(): String {
        return "SessionID"
    }
}

fun main() {
    var info = BasicInfoProvider("Hello Provider.")
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