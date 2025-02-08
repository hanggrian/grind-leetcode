import java.util.HashMap;
import java.util.Map;

public enum RomanToInteger {
    DEFAULT {
        @Override
        public int romanToInt(String s) {
            Map<Character, Integer> romans = new HashMap<>();
            romans.put('I', 1);
            romans.put('V', 5);
            romans.put('X', 10);
            romans.put('L', 50);
            romans.put('C', 100);
            romans.put('D', 500);
            romans.put('M', 1000);

            int result = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (i > 0 && romans.get(c) > romans.get(s.charAt(i - 1))) {
                    result += romans.get(c) - 2 * romans.get(s.charAt(i - 1));
                } else {
                    result += romans.get(c);
                }
            }
            return result;
        }
    };

    public abstract int romanToInt(String s);
}
