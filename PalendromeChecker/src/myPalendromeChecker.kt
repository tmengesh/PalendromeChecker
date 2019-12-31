fun main (args : Array<String>) {

    println("Is \" \" palindrome? ->" + isPalendrome(""))
    println("Is \"a\" palindrome? ->" + isPalendrome("a"))
    println("Is \"aba\" palindrome? ->" + isPalendrome("aba"))
    println("Is \"abba\" palindrome? ->" + isPalendrome("abba"))
    println("Is \"car\" palindrome? ->" + isPalendrome("car"))
    println("Is \"1rrorr1\" palindrome? ->" + isPalendrome("1rrorr1"))
}

fun isPalendrome (str: String): Boolean {
    var result = true
    if(str.isEmpty() || str.length == 1) {
        return true
    }
    else {
        for (i in str.length - 1 downTo  0) {
            if (str [i] != str[str.length - 1 - i]) {
                result = false
                break
            }
        }
    }
    return result
}