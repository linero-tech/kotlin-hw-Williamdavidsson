package lms_126

fun task9(): String {

    return """
        INPUT withdraw money = amount money
        INPUT account balanc => amount money
        if (amount > account Balance)
        Output ("Insufficient funds.")
        Else account balance = amount money
        Output "Withdrawal successful"
        Output "Remaining balanc: $ account balanc"
    """
}
