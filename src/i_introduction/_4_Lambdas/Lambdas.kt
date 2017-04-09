package i_introduction._4_Lambdas

import util.TODO
import util.doc4

fun example() {

    val sum = { x: Int, y: Int -> x + y }
    val square: (Int) -> Int = { x -> x * x }

    sum(1, square(2)) == 5
}

fun todoTask4(collection: Collection<Int>): Nothing = TODO(
    """
        Task 4.
        Rewrite 'JavaCode4.task4()' in Kotlin using lambdas.
        You can find the appropriate function to call on 'collection' through IntelliJ IDEA's code completion feature.
        (Don't use the class 'Iterables').
    """,
    documentation = doc4(),
    references = { JavaCode4().task4(collection) })

//https://kotlinlang.org/docs/reference/lambdas.html
//It's very common that a lambda expression has only one parameter.
// If Kotlin can figure the signature out itself,
// it allows us not to declare the only parameter,
// and will implicitly declare it for us under the name it:
fun task4(collection: Collection<Int>): Boolean =
        collection.any { it % 42 == 0 }




