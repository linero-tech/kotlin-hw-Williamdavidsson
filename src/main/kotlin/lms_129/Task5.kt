package lms_129

fun task5(sentence: String): Int {
        var result = 0
        for (char in sentence) {
            result += 1
        }

        println("The sentence '$sentence' has $result characters.")

        return result
    }
    fun main () {
        println(task5(sentence = "I love GBG"))
    }




