package src.basic

fun getNullString(): String? = null

fun getLengthIfNotNull(str: String?): Int = str?.length ?: 0

fun main() {
//    val a: String = null
//    var b: String = "abcd"
//    b = null

    var a: String? = null
    val length = a?.length
    println(length)

    val b: Int = if (a != null) a.length else 0
    println(b)

    val c: Int = a?.length ?: 0
    println(c)

    val nullableStr = getNullString()

    val nullableStrLength = getLengthIfNotNull(nullableStr)

    println(nullableStrLength)

//    throw NullPointerException()

//    val d: String? = null;
//    val e = d!!.length
}