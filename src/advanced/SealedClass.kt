package src.advanced

sealed class Developer {

    abstract val name: String
    abstract fun code(language: String)
}

data class BackendDeveloper(override val name: String) : Developer() {

    override fun code(language: String) {
        println("저는 백엔드 개발자입니다. ${language}를 사용합니다.")
    }

}

data class FrontendDeveloper(override val name: String) : Developer() {

    override fun code(language: String) {
        println("저는 프론트엔드 개발자입니다. ${language}를 사용합니다.")
    }
}

object OtherDeveloper : Developer() {

    override val name: String = "익명"

    override fun code(language: String) {
        println("hi")
    }
}

data class AndroidDeveloper(override val name: String) : Developer() {

    override fun code(language: String) {
        println("저는 안드로이드 개발자입니다. ${language}를 사용합니다.")
    }
}

object DeveloperPool {

    val pool = mutableMapOf<String, Developer>()

    fun add(developer: Developer) = when(developer) {
        is BackendDeveloper -> pool[developer.name] = developer
        is FrontendDeveloper -> pool[developer.name] = developer
        is AndroidDeveloper -> pool[developer.name] = developer
        is OtherDeveloper -> println("지원하지 않는 개발자 종류입니다.")
    }

    fun get(name: String) = pool[name]
}

fun main() {
    val backendDeveloper = BackendDeveloper(name = "Marco")
    DeveloperPool.add(backendDeveloper)

    val frontendDeveloper = FrontendDeveloper(name = "Noah")
    DeveloperPool.add(frontendDeveloper)

    val androidDeveloper = AndroidDeveloper(name = "David")
    DeveloperPool.add(androidDeveloper)

    DeveloperPool.get("Marco")?.code("Java")
    DeveloperPool.get("Noah")?.code("Javascript")
}