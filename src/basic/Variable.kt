package src.basic

fun sum(a: Int, b: Int) : Int {
    return a + b;
}

fun sum2(a: Int, b: Int) = a + b

fun greeting(message: String = "안녕하세요") {
    println(message)
}

fun log(level: String = "INFO", message: String) {
    println("[$level] $message")
}

fun main() {
    println(sum(1, 2))
    println(sum2(5, 6))

    greeting()
    greeting("안녕")

    log(message = "인포 로그")
    log(level = "DEBUG", message = "디버그 로그")
    log("WARN", "경고 로그")
    log(level = "ERROR", "에러 로그")
}