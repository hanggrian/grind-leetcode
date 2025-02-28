package problems1_100

enum RomanToInteger {
    DEFAULT{
        @Override
        int romanToInt(String s) {
            int result = 0
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i)
                if (i > 0 && ROMANS.get(c) > ROMANS.get(s.charAt(i - 1))) {
                    result += ROMANS.get(c) - 2 * ROMANS.get(s.charAt(i - 1))
                } else {
                    result += ROMANS.get(c)
                }
            }
            return result
        }
    }

    abstract int romanToInt(String s)

    private static final HashMap<Character, Integer> ROMANS = []

    static {
        ROMANS.put('I' as char, 1)
        ROMANS.put('V' as char, 5)
        ROMANS.put('X' as char, 10)
        ROMANS.put('L' as char, 50)
        ROMANS.put('C' as char, 100)
        ROMANS.put('D' as char, 500)
        ROMANS.put('M' as char, 1000)
    }
}
