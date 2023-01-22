package lms_126

fun task10(): String {

    return """
        INPUT createAccount(email, password)
        INPUT (password.length < 6)
        IF ("Error: password must be at least 6 charactar.)
        ELSE
        OUTPUT Account created
    """
}
