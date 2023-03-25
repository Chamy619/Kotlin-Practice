package src.advanced

fun String.first(): Char {
    return this[0]
}

fun String.addFirst(char: Char): String {
    return char + this.substring(0)
}

class MyExample {
    fun printMessage() = println("클래스 출력")

    fun printName() = println("이름 출력")
}

fun MyExample.printMessage() = println("확장 출력")

fun MyExample.printName(name: String) = println(name)

fun MyExample?.printNullOrNotNull() {
    if (this == null) println("널인 경우 출력")
    else println("널이 아닌 경우 출력")
}

fun main() {
    println("ABCD".first())
    println("ABCE".addFirst('1'))

    val myExample = MyExample()
    myExample.printMessage()
    myExample.printName("Marco")

    var nullableMyExample: MyExample? = null;
    nullableMyExample.printNullOrNotNull()

    nullableMyExample = MyExample()
    nullableMyExample.printNullOrNotNull()
}