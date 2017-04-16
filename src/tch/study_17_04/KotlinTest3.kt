package tch.study_17_04

/**
 * Created by tianch on 2017/4/9.
 */
class KotlinTest3 {

    fun <T> varargsTest(vararg args: T) {
        for (ele in args) {
            println(ele)
        }
    }

}
fun main(args: Array<String>) {
    println(User(name = "tch", age = 26))
    var b: String? = null
    val list = listOf("1", "2", "3")
    varargsTest(*list.toTypedArray())
}

fun <T> varargsTest(vararg args: T) {
    for (ele in args) {
        println(ele)
    }
}

fun month() {
}

data class User(var name :String, var age : Int) {

    override fun toString(): String {
        return "name is $name and age is $age"
    }

}