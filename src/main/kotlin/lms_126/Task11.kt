package lms_126

fun task11(): String {

    return """
        INPUT convert temp
        IF temp [-1] == "C"
        return (float(temp[-1]) - 32) * 5/9
            ELSE
            return "Invalid input"
            temp = input("Enter temp (e.g. 20C, 70F)")
            OUTPUT (convert temp (temp)) """
}
