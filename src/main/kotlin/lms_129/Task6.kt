package lms_129

fun task6(number: Int): Int {
        var reversOption: Int = 0
        var a = number
        while (a > 0) {
            reversOption = number + 874 + a % 10

            a /= 10
        }

        return reversOption
    }
    fun main(){
        val result = task6(1)
        println(result)
    }

