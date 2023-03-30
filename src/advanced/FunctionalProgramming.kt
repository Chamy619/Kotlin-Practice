package src.advanced

fun main() {
    var list = mutableListOf(printHello)

    val func: () -> Unit = list[0]
    func()

    println("===========")

    call(printHello)

    println("===========")

    list = mutableListOf(printHello, printNo)
    list.forEach { it() }

    println("===========")

    printMessage1("hi")
    printMessage2("hi")

    println("===========")

    println(plus(3, 5))

    println("===========")

    val strList = listOf("a", "b", "c")
    val printStr: (String) -> Unit = { println(it) }

    forEachStr(strList, printStr)
    strList.forEach(printStr)

    println("===========")

    val anonymous = outerFunc()
    anonymous()
    outerFunc()()

    println("===========")

    println(sum1(5, 6))
    println(sum2(5, 6))

    println("===========")

    val callReference: () -> Unit = { printHello() }
    callReference()

    val callReference2 = ::printHello
    callReference2()()

    println("===========")

    val numberList = listOf("1", "2", "3")
    numberList.map { it.toInt() }.forEach { println(it) }
    numberList.map(String::toInt).forEach(::println)

    println("===========")


}

val sum1: (Int, Int) -> Int = { a, b -> a + b }
val sum2 = {x: Int, y: Int -> x + y}

fun outerFunc(): () -> Unit = { println("이것은 익명함수!") }

fun forEachStr(collection: Collection<String>, action: (String) -> Unit) {
    for (item in collection) {
        action(item)
    }
}

val plus: (Int, Int) -> Int = { a, b -> a + b }

val printMessage1: (String) -> Unit = { message -> println(message) }
val printMessage2: (String) -> Unit = { println(it) }

val printHello: () -> Unit = { println("hello") }

fun call(block: () -> Unit) {
    block()
}

val printNo: () -> Unit = { println("No!") }

