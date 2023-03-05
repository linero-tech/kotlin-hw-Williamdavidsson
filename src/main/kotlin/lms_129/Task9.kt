package lms_129

fun task9(temperature: String): String {
        val value = temperature.substring(0, temperature.length - 1).toDouble()
        val unit = temperature.last().toUpperCase()

        val convertedValue = if (unit == 'C') {
            (value * 9 / 5 + 32).toInt()
        } else {
            ((value - 32) * 5 / 9).toInt()
        }

        val convertedUnit = if (unit == 'C') 'F' else 'C'

        return "$convertedValue$convertedUnit"
    }

    fun main() {
        val temperature1 = "-30C"
        val result1 = task9(temperature1)
        println("Temperature $temperature1 is equivalent to $result1")

        val temperature2 = "50f"
        val result2 = task9(temperature2)
        println("Temperature $temperature2 is equivalent to $result2")
    }
