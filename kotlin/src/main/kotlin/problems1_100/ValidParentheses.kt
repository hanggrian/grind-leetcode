package problems1_100

import java.util.Stack

enum class ValidParentheses {
    DEFAULT {
        override fun isValid(s: String): Boolean {
            if (s.length % 2 == 1) {
                return false
            }

            val symbols = Stack<Char>()
            for (c in s.toCharArray()) {
                if (!PARENTHESES.containsValue(c)) {
                    symbols.push(c)
                    continue
                }

                if (!symbols.isEmpty() && PARENTHESES[symbols.peek()] == c) {
                    symbols.pop()
                    continue
                }
                return false
            }
            return symbols.isEmpty()
        }
    },
    ;

    abstract fun isValid(s: String): Boolean

    companion object {
        private val PARENTHESES =
            hashMapOf(
                '(' to ')',
                '{' to '}',
                '[' to ']',
            )
    }
}
