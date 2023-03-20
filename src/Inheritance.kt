package src

open class Dog {

    open var age: Int = 0

    open fun bark() {
        println("멍멍")
    }
}

open class Bulldog(override var age: Int = 0): Dog() {

    override fun bark() {
        super.bark()
        println("컹컹")
    }
}

abstract class Developer {

    abstract var age: Int
    abstract fun code(language: String)
}

class BackendDeveloper(override var age: Int = 0) : Developer() {

    override fun code(language: String) {
        println("$language 로 코딩")
    }

}

class ChildBulldog(override var age: Int = 0): Bulldog() {

    override fun bark() {
        println("왈왈")
    }
}

fun main() {
    val bulldog = Bulldog(age = 10)
    println(bulldog.age)
    bulldog.bark()

    val backendDeveloper = BackendDeveloper(29)
    println(backendDeveloper.age)
    backendDeveloper.code("Kotlin")
}