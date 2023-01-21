package lms_126

fun task9(): String {

    return """
        INPUT withdrawMoney(amount: Double) {
        if (amount > accountBalance) {
        println("Insufficient funds.")
        } else {
        accountBalance -= amount
        println("Withdrawal successful."
        println("Remaining balanc: $ accountbalanc")
        }
    """
}
