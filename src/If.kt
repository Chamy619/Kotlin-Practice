package src

fun main() {
    val job = "Software Developer"

    if (job == "Software Developer") {
        println("개발자")
    } else {
        println("비개발자")
    }

    val jobName = if (job == "Software Developer") {
        "개발자"
    } else {
        "비개발자"
    }
    println(jobName)

    val jobName2 = if (job == "Software Developer") "개발자" else "비개발자"
    println(jobName2)
}