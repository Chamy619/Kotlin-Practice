package src.advanced

class DatabaseClient {
    var url: String? = null
    var username: String? = null
    var password: String? =null

    fun connect(): Boolean {
        println("DB 접속중 ...")
        Thread.sleep(1000)
        println("DB 접속 완료")
        return true
    }
}

fun main() {

    val config = DatabaseClient()
    config.url = "localhost:3306"
    config.username = "mysql"
    config.password = "1234"
    val connected1 = config.connect()
    println(connected1)

    val connected2 = DatabaseClient().run {
        url = "localhost:3306"
        username = "mysql"
        password = "1234"
        connect()
    }
    println(connected2)

}