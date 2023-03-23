package src

data class Person(val name: String, val age: Int) {
//    override fun equals(other: Any?): Boolean {
//        if (this === other) return true
//        if (javaClass != other?.javaClass) return false
//
//        other as Person
//
//        if (name != other.name) return false
//        if (age != other.age) return false
//
//        return true
//    }
//
//    override fun hashCode(): Int {
//        var result = name.hashCode()
//        result = 31 * result + age
//        return result
//    }
}

fun main() {
    val person1 = Person(name = "marco", age = 29)
    val person2 = Person(name = "marco", age = 29)

    println(person1 == person2)

    val set = hashSetOf(person1)
    println(set.contains(person2))

    println(person1.toString())

//    person1.name = "strange"
//    println(set.contains(person1))

    val person3 = person1.copy(name = "strange")
    println(set.contains(person3))
    println(person3)

    println("이름=${person1.component1()}, 나이=${person1.component2()}")

    val (name, age) = person1
    println("이름=${name}, 나이=${age}")
}