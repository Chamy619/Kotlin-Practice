package src.advanced

import java.util.ArrayList
import java.util.LinkedList

fun main() {

    val currencyList = listOf("달러", "유로", "원")

    val mutableCurrencyList = mutableListOf<String>().apply {
        add("달러")
        add("유로")
        add("원")
    }

    val numberSet = setOf(1, 2, 3, 4)

    val mutableSet = mutableSetOf<Int>().apply {
        add(1)
        add(2)
        add(3)
        add(4)
    }

    val numberMap = mapOf("one" to 1, "two" to 2, "three" to 3)

    val mutableMap = mutableMapOf<String, Int>().apply {
        this["one"] = 1
        this["two"] = 2
        this["three"] = 3
    }

    val numberList: List<Int> = buildList {
        add(1)
        add(2)
        add(3)
        add(4)
    }

    val linkedList = LinkedList<Int>().apply {
        addFirst(3)
        add(2)
        addLast(1)
    }

    val arrayList = ArrayList<Int>().apply {
        add(1)
        add(2)
        add(3)
    }

    val iterator = currencyList.iterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }

    println("==================")

    for (currency in currencyList) {
        println(currency)
    }

    println("==================")

    currencyList.forEach {
        println(it)
    }

    println("==================")

    val lowerList = listOf("a", "b", "c")
    val upperList = mutableListOf<String>()

    for (lowerCase in lowerList) {
        upperList.add(lowerCase.uppercase())
    }

    println(upperList)
    upperList.clear()

    println("==================")

    lowerList.map { upperList.add(it.uppercase()) }
    println(upperList)

    println("==================")

    val filteredList = mutableListOf<String>()
    for (upperCase in upperList) {
        if (upperCase == "A" || upperCase == "C") {
            filteredList.add(upperCase)
        }
    }
    println(filteredList)

    println("==================")

    val filteredList2 = upperList.filter { it == "A" || it == "C" }
    println(filteredList2)

    println("==================")


}