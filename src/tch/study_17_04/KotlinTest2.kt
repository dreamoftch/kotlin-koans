import java.util.*

/**
 * Created by tianch on 2017/4/7.
 */

fun main(args: Array<String>) {
    var str : String? = ""
    //if str is null, print the length
    println(str ?.length)
    //if str is not null, print 'str is null'
    println(str ?: "str is null")
    //if str is null, print the length, else print 'str is null'
    println(str ?.length ?: "str is null")
    str ?.let {
        println("str is not null...")
    }
    println(whenTest("red"))
    println(newList().add(1))
    for (ele in arrayOfMinusOnes(1)) {
        println(ele)
    }
    //
    var int1: Int = 127
    var int2: Int? = int1
    var int3: Int? = int1
    println(int2 === int3)

    var int4: Int = int1
    var int5: Int = int1
    println(int4 === int5)

    val b: Byte = 1 // OK, literals are checked statically
    val i: Int = b.toInt()

    "abc".print()
    ExtendClass().print()

    Parent().print() //'Parent.print'
    Child().print()  //'Child.print'
    myPrint(Child())  //'Parent.print'

    Parent().print2() //'Parent print2'
    Child().print2()  //'Child print2'
    myPrint2(Child())  //'Child print2'

    println(Child().javaClass)
}

fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) // ts is an Array
        result.add(t)
    return result
}

open class Parent{
    open fun print2() {
        println("Parent print2")
    }
}

class Child : Parent() {
    override fun print2() {
        println("Child print2")
    }
}

fun Parent.print() {
    println("Parent.print")
}

fun Child.print() {
    println("Child.print")
}

fun myPrint(obj: Parent) {
    obj.print()
}

fun myPrint2(obj: Parent) {
    obj.print2()
}

class ExtendClass {
    fun print() {
        println("method in class")
    }
}

fun ExtendClass.print() {
    println("method extended ");
}

object SingletonTest{
    var age:Int? = null
}

interface A1 {}
open class A2 : A1 {}
class A3 constructor(a:Int) : A2()  {}


//open class Base{
//    open fun baseFun() {}
//    open fun baseFun2() {}
//}
//
//open class Child : Base() {
//    override fun baseFun() {
//
//    }
//    override fun baseFun2() {}
//}
//
//class GrandChild : Child() {
//    override fun baseFun() {
//        super.baseFun()
//    }
//}

fun String.print() {
    println(this)
}


interface Interface1 {
    fun m1()
    fun m2() {}
}

open class SuperClass {
    fun m1 () {
        println("m1 in super class")
    }
    open fun m2 () {

    }
}

fun nullableArgs(args1:Int?, args2: String?) {

}

class A(name: String) {}

fun whenTest(color : String): String {
    return when(color) {
        "red" -> "r"
        else -> "x"
    }
}

fun arrayOfMinusOnes(size: Int): IntArray {
    return IntArray(size).apply { fill(-1) }
}

fun newList(size:Int = 10): java.util.ArrayList<Any> {
    return ArrayList<Any>(size)
}