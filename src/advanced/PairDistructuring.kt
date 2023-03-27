package src.advanced

data class Tuple(val a: Int, val b: Int)

fun plus(pair: Pair<Int, Int>) = pair.first + pair.second

fun main() {
    val plus = plus(Pair(1, 3))
    println(plus)

    val pair = Pair("A", 1)
    println(pair.component2())
    println(pair.toList())

    val triple = Triple("A", "B", "C")
    println(triple)
    triple.first
    triple.second
    triple.third
    val newTriple = triple.copy(third = "D")
    println(newTriple)

    val (a, b, c) = newTriple
    println("$a, $b, $c")

    val list = newTriple.toList()
    val (a1, a2, a3) = list;
    println("$a1, $a2, $a3")

    val map = mutableMapOf("Marco" to "Developer")
    for ((key, value) in map) {
        println("$key : $value")
    }
}