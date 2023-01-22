package lms_126

fun task10(): String {

    return """
        INPUT createAccount(email, password)
        IF (password.length < 6)
        print("Error: password must be at least 6 charactar.)
        ELSE print("Account created")
    """
}
