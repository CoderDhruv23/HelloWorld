fun isPalindrome(str: String): Boolean {
    var start = 0
    var end = str.length - 1
    while (start < end) {
        if (str[start] != str[end]) {
            return false
        }
        start++
        end--
    }
    return true
}

fun main() {
    val input = "racecar"
    println("Is '$input' a palindrome? ${isPalindrome(input)}")
}
