package problems101_200

import java.util.Locale

enum class ValidPalindrome {
    REVERSE_STRING {
        override fun isPalindrome(s: String): Boolean {
            val builder = StringBuilder()
            for (c in s.toCharArray()) {
                if (Character.isLetterOrDigit(c)) {
                    builder.append(c)
                }
            }

            return builder
                .toString()
                .lowercase(Locale.getDefault())
                .contentEquals(builder.reverse().toString().lowercase(Locale.getDefault()))
        }
    },
    COMPARE_HALF_STRING {
        override fun isPalindrome(s: String): Boolean {
            var s = s

            val builder = StringBuilder()
            for (c in s.toCharArray()) {
                if (Character.isLetterOrDigit(c)) {
                    builder.append(c)
                }
            }

            s = builder.toString()
            var start = 0
            var end = s.length - 1
            while (start < end) {
                if (s[start++].lowercaseChar() != s[end--].lowercaseChar()) {
                    return false
                }
            }
            return true
        }
    },
    ;

    abstract fun isPalindrome(s: String): Boolean
}
