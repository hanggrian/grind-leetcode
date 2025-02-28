package problems1_100

enum class PalindromeNumber {
    REVERSE_STRING {
        override fun isPalindrome(x: Int): Boolean {
            val s = x.toString()
            return s.contentEquals(s.reversed())
        }
    },
    COMPARE_HALF_STRING {
        override fun isPalindrome(x: Int): Boolean {
            val s = x.toString()
            var start = 0
            var end = s.length - 1
            while (start < end) {
                if (s[start++] != s[end--]) {
                    return false
                }
            }
            return true
        }
    },
    ;

    abstract fun isPalindrome(x: Int): Boolean
}
