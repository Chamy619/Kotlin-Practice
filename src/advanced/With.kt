package src.advanced

fun main() {
    val str = "안녕하세요"

    val length = with(str) {
        println("length = $length")
        length
    }

    println(length)
}