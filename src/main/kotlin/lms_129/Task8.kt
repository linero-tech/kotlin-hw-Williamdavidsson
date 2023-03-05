package lms_129

fun task8(number: Int): Int {
        var result = 0
        var n = number
        while (n > 0) {
            result += n % 10
            n /= 10
        }
        return result
    }
    fun main(){
        val number = 123
        val result = task8(number)
        println("the sum of the digits in $number is $result")
    }

