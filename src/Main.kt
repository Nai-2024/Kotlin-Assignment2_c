
/*
    * Check if sub string is substring of the main string without using the contains method
    * @param mainStr - The main str to search within
    * @param subStr- The Sub str to check for
    * return True if the subStr is a substring of mainStr. if not return false
   */


fun isSubString(mainStr: String, subStr: String): Boolean {
    // Use indexOf to find the first occurrence of 'subStr' in 'mainStr'
    // If 'subStr' is found, indexOf returns its starting index; otherwise, it returns -1
    return mainStr.indexOf(subStr) != -1
}

fun main() {
    println(isSubString("Kotlin is powerful!", "is"))
    println(isSubString("Kotlin is powerful!", "Java"))
    println(isSubString("Kotlin is powerful!", "Powerful"))
    println(isSubString("Kotlin is powerful!", "powerful"))
}

// Alternate approach
/*
fun isSubString(mainStr: String, subStr: String): Boolean {
    if (subStr.length > mainStr.length) return false // Compare their length
    for (i in 0..mainStr.length - subStr.length) {
        if (mainStr.substring(i, i + subStr.length) == subStr) {
            return true
        }
    }
    return false
}

fun main() {
    println(isSubString("Kotlin is powerful!", "is"))
    println(isSubString("Kotlin is powerful!", "Java"))
    println(isSubString("Kotlin is powerful!", "Powerful"))
    println(isSubString("Kotlin is powerful!", "powerful"))
}*/
