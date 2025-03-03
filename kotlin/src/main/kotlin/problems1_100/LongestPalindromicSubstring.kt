package problems1_100

enum class LongestPalindromicSubstring {
    DEFAULT {
        override fun longestPalindrome(s: String): String {
            if (s.length == 1) {
                return s
            }
            var longestPalindrome = ""
            for (i in 0 until s.lastIndex) {
                var palindrome: String

                // check odd
                var start = i
                var end = i
                while (start >= 0 && end < s.length && s[start] == s[end]) {
                    palindrome = s.substring(start, end + 1)
                    if (palindrome.length > longestPalindrome.length) {
                        longestPalindrome = palindrome
                    }
                    start--
                    end++
                }

                // check even
                start = i
                end = i + 1
                while (start >= 0 && end < s.length && s[start] == s[end]) {
                    palindrome = s.substring(start, end + 1)
                    if (palindrome.length > longestPalindrome.length) {
                        longestPalindrome = palindrome
                    }
                    start--
                    end++
                }
            }
            return longestPalindrome
        }
    },
    ;

    abstract fun longestPalindrome(s: String): String
}
