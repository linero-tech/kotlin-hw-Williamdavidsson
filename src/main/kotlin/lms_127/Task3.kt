package lms_127

fun task3(radius: Double): Double {

    val pi = 3.1416
    val result = 2 * pi * radius
    return result

}
fun main() {
    println(task3(radius = 2.0))
    println(task3(radius = 4.0))
    println(task3(radius = 6.0))
    println(task3(radius = 20.9))

}

