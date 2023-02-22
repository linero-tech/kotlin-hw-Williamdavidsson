package lms_127

fun task1(): String {
    val countryName = "Sweden"
    val capitalName = "Stokholm"
    val currency = "SEK"
    val sentence = "$countryName, $capitalName, $currency"
    return sentence
}
fun main() {
    println(task1())
}