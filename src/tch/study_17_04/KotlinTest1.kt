/**
 * Created by tianch on 2017/4/6.
 */

fun maxValue(a:Int, b:Int) :Int? {
    println(a * b)

    println("args: '${a}' $b")
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun classCast(obj: Any) {
    if (obj is String) {
        println(obj.length)
    }
}

fun main(args: Array<String>) {
    println(maxValue(1,2))
    var a :Int? = null

    classCast("str")

    var list = listOf(1,2,3,4)
    println(list)
    for (index in list.indices) {
        println("index is $index, ele is ${list[index]}")
    }

    var l = listOf("aa", "bb")

    var index = 0;
    while(index < list.size) {
        println("index is $index, value is ${list[index]}")
        index++
    }

    for (ele in 1..10) {
        println(ele)
    }

    var ele = 9;
    if (ele in 1..10) {
        println("---- ele is $ele")
    }

    var stepList = 1..10 step 2

    for (x in 1..10 step 2) {
        print(x)
    }
    println("-----")
    for (x in 9 downTo 0 step 3) {
        print(x)
    }
    println("----- 2")
    for (x in 0..9) {
        println(x)
    }

    var list2 = 0..9
    list2.filter { it > 3 }
            .sortedBy { it }
            .map { it * 2 }
            .forEach { println(it) }


}




