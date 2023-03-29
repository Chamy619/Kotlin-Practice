package src.advanced

fun getStr(): Nothing = throw Exception("예외 발생 기본 값으로 초기화")

fun main() {
    var result: String? = try {
        getStr()
    } catch (e: Exception) {
        println(e.message)
        "기본값"
    }
    println(result)

    result = runCatching { getStr() }
        .getOrElse {
            println(it.message)
            "기본값"
        }
    println(result)

    val result2: Throwable? = runCatching { getStr() }
        .exceptionOrNull()
    println(result2)

    result = runCatching { getStr() }
        .getOrDefault("기본값입니다")
    println(result)

    result = runCatching { "안녕" }
        .map { "${it}하세요" }
        .getOrThrow()
    println(result)
}