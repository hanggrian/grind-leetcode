package problems1_100;

import java.util.HashMap;
import java.util.Map;
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
                if (!PARENTHESES.containsValue(c)) {
                    symbols.push(c);
                    continue;
                }

                if (!symbols.isEmpty() && PARENTHESES.get(symbols.peek()) == c) {
                    symbols.pop();
                    continue;
                }
                return false;
            }
            return symbols.isEmpty();
        }
    };

    abstract boolean isValid(String s);

    private static final Map<Character, Character> PARENTHESES = new HashMap<>();

    static {
        PARENTHESES.put('(', ')');
        PARENTHESES.put('{', '}');
        PARENTHESES.put('[', ']');
    }
}
