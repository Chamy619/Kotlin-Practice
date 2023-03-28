package src.advanced

fun main() {
    val str: String? = "hello"

    val result: Int? = str?.let {
        println(it)

        val abc: String? = "abc"
        val def: String? = "def"
        if (!abc.isNullOrEmpty() && !def.isNullOrEmpty()) {
            println("abcdef가 null 아님")
        }

        1234
    }

    println(result)
}