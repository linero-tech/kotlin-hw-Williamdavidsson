package lms_129

fun task1(a: Int, b: Int): Int {
    var result = 0
    if (a >= b){
        result = 0
    } else {
for (i in a..b) {
    result += i
        }
    }
    return result
}
fun main(){
    val a = 1
    val b = 5
    val result = task1(a, b)
    println("result is $result")
}
