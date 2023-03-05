package lms_129

fun task7(a: Int, b: Int): Int {
    var result = 1
    if (a == 0 && b == 0) {
        return result
    }
    for (i in 1..b) {
        result *= a
    }
    return result
}
fun main() {
    val a = 2
    val b = 3
val result = task7(a, b)
    println("$a raised to the power of $b is the $result")
}








