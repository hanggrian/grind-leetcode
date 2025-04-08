package problems301_400

import java.util.Stack

enum class DecodeString {
    DEFAULT {
        override fun decodeString(s: String): String {
            val stack = Stack<Char>()
            for (c in s.toCharArray()) {
                if (c != ']') {
                    stack.push(c)
                    continue
                }
                val contentBuilder = StringBuilder()
                val timeBuilder = StringBuilder()
                while (stack.peek() != '[') {
                    contentBuilder.append(stack.pop())
                }
                stack.pop() // remove '['
                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    timeBuilder.append(stack.pop())
                }

                val content = contentBuilder.reverse().toString()
                val times = timeBuilder.reverse().toString().toInt()

                for (i in 0 until times) {
                    for (contentC in content.toCharArray()) {
                        stack.push(contentC)
                    }
                }
            }
            return buildString {
                for (c in stack) {
                    append(c)
                }
            }
        }
    },
    ;

    abstract fun decodeString(s: String): String
}
