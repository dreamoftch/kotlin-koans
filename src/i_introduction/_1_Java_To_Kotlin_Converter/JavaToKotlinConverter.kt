package i_introduction._1_Java_To_Kotlin_Converter

import util.TODO
import java.lang.StringBuilder

fun todoTask1(collection: Collection<Int>): Nothing = TODO(
    """
        Task 1.
        Rewrite JavaCode1.task1 in Kotlin.
        In IntelliJ IDEA, you can just copy-paste the code and agree to automatically convert it to Kotlin,
        but only for this task!
    """,
    references = { JavaCode1().task1(collection) })


fun task1(collection: Collection<Int>): String {
    var builder = StringBuilder()
    builder.append("{");
    val iterator = collection.iterator()
    while(iterator.hasNext()) {
        builder.append(iterator.next())
        if (iterator.hasNext()) {
            builder.append(", ")
        }
    }
    builder.append("}");
    return builder.toString()
}
