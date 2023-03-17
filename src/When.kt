package src

fun main() {
    val day = 2

    val result = when (day) {
        1 -> "월요일"
        2 -> "화요일"
        3 -> "수요일"
        4 -> "목요일"
        5 -> "금요일"
        6 -> "토요일"
        7 -> "일요일"
        else -> "없음"
    }

    println(result)

    when (getColor()) {
        Color.RED -> println("빨강")
        Color.GREEN -> println("초록")
    }

    when (getNumber()) {
        0, 1 -> println("0 또는 1")
        else -> println("0 또는 1 아님")
    }
}

enum class Color {
    RED, GREEN
}

fun getColor() = Color.RED

fun getNumber() = 2
