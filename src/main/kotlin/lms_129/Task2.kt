package lms_129

fun task2(number: Int): Boolean {
    if(number <= 1) {
        return false
    }
    for(i in 2 until number){
        if(number % i == 0){
            return false
        }
    }
       return true
    }
fun main(){
    val number = 5
    val result= task2(number)
    println("result is $result")
}
