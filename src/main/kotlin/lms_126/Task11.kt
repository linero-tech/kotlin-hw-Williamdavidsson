package lms_126

fun task11(): String {

    return  """
        INPUT convert temperature
        IF temp == "C":
        temp in Fahrenheit = (float(temp[:-1]) * 9/5 + 32
        return (temp in fahrengeit) + "F"
        IF temp == "F":
        temp in celsius = (float(temp[:-1]) - 32) * 5/9
        return (temp in celsius) + "c"
            ELSE:
            return "Invalid input":
            print("Enter temp (e.g. 20C, 70F): ")
            OUTPUT (convert_temp (temp))"""
}
