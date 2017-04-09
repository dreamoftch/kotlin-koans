package i_introduction._4_Lambdas

import com.google.common.collect.Iterables
import util.JavaCode

class JavaCode4 : JavaCode() {
    fun task4(collection: Collection<Int>): Boolean {
        return Iterables.any(collection) { element -> element!! % 42 == 0 }
    }
}
