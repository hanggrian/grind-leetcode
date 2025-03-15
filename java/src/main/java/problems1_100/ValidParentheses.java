package problems1_100;

import java.util.Stack;

enum ValidParentheses {
    DEFAULT {
        @Override
        boolean isValid(String s) {
            if (s.length() % 2 == 1) {
                return false;
            }

            Stack<Character> symbols = new Stack<>();
            for (char c : s.toCharArray()) {
                if (c != ')' && c != '}' && c != ']') {
                    symbols.push(c);
                    continue;
                }

                if (!symbols.isEmpty()
                    && ((symbols.peek() == '(' && c == ')')
                    || (symbols.peek() == '{' && c == '}')
                    || (symbols.peek() == '[' && c == ']'))
                ) {
                    symbols.pop();
                    continue;
                }
                return false;
            }
            return symbols.isEmpty();
        }
    };

    abstract boolean isValid(String s);
}
