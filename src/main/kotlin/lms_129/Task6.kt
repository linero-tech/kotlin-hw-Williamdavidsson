package lms_129

fun task6(number: Int): Int {
    var result = 0
    var input = number
    while (input > 0) {
        val remainder = input % 10
        result = result * 10 + remainder
        input /= 10
    }
    return result
}
    fun main(){
        val number = 678
        var result = task6(number)
        println("The reversed version of $number is $result")
    }


