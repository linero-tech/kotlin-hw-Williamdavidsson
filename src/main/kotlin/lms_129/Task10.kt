package lms_129

fun task10(password: String): Boolean {
    val regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$#@])[A-Za-z\\d$#@]{6,10}\$".toRegex()
    return regex.matches(password)
}
fun main(){
    val password = "MyP@ssw0rd"
    val result = task10(password)
    println("The password is " + if (result) "valid" else "invalid")
}