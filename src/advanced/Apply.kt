package src.advanced

fun main() {

    val databaseClient: DatabaseClient = DatabaseClient().apply {
        url = "localhost:3306"
        username = "mysql"
        password = "1234"
        connect()
    }

    println(databaseClient)
}