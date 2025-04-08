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
                if (!PARENTHESES.containsValue(c)) {
                    symbols.push(c)
                    continue
                }

                if (!symbols.isEmpty() && PARENTHESES.get(symbols.peek()) == c) {
                    symbols.pop()
                    continue
                }
                return false
            }
            return symbols.isEmpty()
        }
    }

    abstract boolean isValid(String s)

    private static final Map<Character, Character> PARENTHESES = [
        ('(' as char): ')' as char,
        ('{' as char): '}' as char,
        ('[' as char): ']' as char,
    ]
}
