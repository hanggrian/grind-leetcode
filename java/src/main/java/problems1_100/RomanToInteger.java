package problems1_100;

import java.util.HashMap;
import java.util.Map;

enum RomanToInteger {
    DEFAULT {
        @Override
        int romanToInt(String s) {
            int result = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (i > 0 && ROMANS.get(c) > ROMANS.get(s.charAt(i - 1))) {
                    result += ROMANS.get(c) - 2 * ROMANS.get(s.charAt(i - 1));
                } else {
                    result += ROMANS.get(c);
                }
            }
            return result;
        }
    };

    abstract int romanToInt(String s);

    private static final Map<Character, Integer> ROMANS = new HashMap<>();

    static {
        ROMANS.put('I', 1);
        ROMANS.put('V', 5);
        ROMANS.put('X', 10);
        ROMANS.put('L', 50);
        ROMANS.put('C', 100);
        ROMANS.put('D', 500);
        ROMANS.put('M', 1000);
    }
}
