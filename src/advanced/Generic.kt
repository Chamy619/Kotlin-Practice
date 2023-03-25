package src.advanced

class MyGeneric<out T>(val t: T) {

}

class Bag<T> {

    fun saveAll(
        to: MutableList<in T>,
        from: MutableList<T>
    ) {
        to.addAll(from)
    }
}

fun main() {
    val generic = MyGeneric("테스트")
    val charGeneric: MyGeneric<CharSequence> = generic

    val list1: MutableList<String> = mutableListOf()
    val list2 = mutableListOf<String>()
    val list3: List<*> = listOf<String>()
    val list4: List<*> = listOf(1, 2, 3, 4)

    val bag = Bag<String>()
    bag.saveAll(mutableListOf<CharSequence>("1", "2"), mutableListOf<String>("3", "4"))


}