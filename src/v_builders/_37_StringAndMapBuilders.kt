package v_builders

import util.TODO

fun buildStringExample(): String {
    fun buildString(build: StringBuilder.() -> Unit): String {
        val stringBuilder = StringBuilder()
        stringBuilder.build()
        return stringBuilder.toString()
    }

    return buildString {
        this.append("Numbers: ")
        for (i in 1..10) {
            // 'this' can be omitted
            append(i)
        }
    }
}

fun todoTask37(): Nothing = TODO(
    """
        Task 37.
        Uncomment the commented code and make it compile.
        Add and implement function 'buildMap' with one parameter (of type extension function) creating a new HashMap,
        building it and returning it as a result.
    """
)
//build: MutableMap<K, V>.() -> Unit 跟前面的测试中val isOdd: Int.() -> Boolean { this % 2 == 0} 一样，相当于
//定义了一个匿名扩展函数，并赋给了一个变量
fun <K, V> buildMap(build: MutableMap<K, V>.() -> Unit): MutableMap<K, V> {
    val map = mutableMapOf<K, V>()
    map.build()
    return map
}

fun task37(): Map<Int, String> {
    return buildMap {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}
