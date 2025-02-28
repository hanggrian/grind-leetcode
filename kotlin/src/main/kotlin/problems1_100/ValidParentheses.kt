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
                if (c != ')' && c != '}' && c != ']') {
                    symbols.push(c)
                    continue
                }
                if (!symbols.isEmpty() && symbols.peek() == '(' && c == ')') {
                    symbols.pop()
                } else if (!symbols.isEmpty() && symbols.peek() == '{' && c == '}') {
                    symbols.pop()
                } else if (!symbols.isEmpty() && symbols.peek() == '[' && c == ']') {
                    symbols.pop()
                } else {
                    return false
                }
            }
            return symbols.isEmpty()
        }
    },
    ;

    abstract fun isValid(s: String): Boolean
}
