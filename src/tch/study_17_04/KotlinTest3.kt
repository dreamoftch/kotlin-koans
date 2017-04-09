package tch.study_17_04

/**
 * Created by tianch on 2017/4/9.
 */
class KotlinTest3 {

}
fun main(args: Array<String>) {
    println(User(name = "tch", age = 26))
    var b: String? = null
    var a = b!!.length
}

fun month() {
}

data class User(var name :String, var age : Int) {

    override fun toString(): String {
        return "name is $name and age is $age"
    }

}