package kotlindemo

class FancyInfoProvider : BasicInfoProvider() {
    override val providerInfo: String
        get() = ""

    override val sessionIdPrefix: String
        get() = "super.sessionIdPrefix"
}