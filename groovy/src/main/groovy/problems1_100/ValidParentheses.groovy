package problems1_100

enum ValidParentheses {
    DEFAULT{
        @Override
        boolean isValid(String s) {
            if (s.length() % 2 == 1) {
                return false
            }
            Stack<Character> symbols = []
            for (var c : s.toCharArray()) {
                if (c != ')' as char && c != '}' as char && c != ']' as char) {
                    symbols.push(c)
                    continue
                }
                if (
                    !symbols.isEmpty() &&
                        symbols.peek() == '(' as char &&
                        c == ')' as char
                ) {
                    symbols.pop()
                } else if (
                    !symbols.isEmpty() &&
                        symbols.peek() == '{' as char &&
                        c == '}' as char
                ) {
                    symbols.pop()
                } else if (
                    !symbols.isEmpty() &&
                        symbols.peek() == '[' as char &&
                        c == ']' as char) {
                    symbols.pop()
                } else {
                    return false
                }
            }
            return symbols.isEmpty()
        }
    }

    abstract boolean isValid(String s)
}
