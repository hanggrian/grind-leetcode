package problems1;

import java.util.Stack;

public enum ValidParentheses {
    DEFAULT {
        @Override
        public boolean isValid(String s) {
            if (s.length() % 2 == 1) {
                return false;
            }
            Stack<Character> symbols = new Stack<>();
            for (char c : s.toCharArray()) {
                if (c != ')' && c != '}' && c != ']') {
                    symbols.push(c);
                    continue;
                }
                if (!symbols.isEmpty() && symbols.peek() == '(' && c == ')') {
                    symbols.pop();
                } else if (!symbols.isEmpty() && symbols.peek() == '{' && c == '}') {
                    symbols.pop();
                } else if (!symbols.isEmpty() && symbols.peek() == '[' && c == ']') {
                    symbols.pop();
                } else {
                    return false;
                }
            }
            return symbols.isEmpty();
        }
    };

    public abstract boolean isValid(String s);
}
