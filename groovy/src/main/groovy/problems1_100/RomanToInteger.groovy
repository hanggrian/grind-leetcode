package problems1_100

enum RomanToInteger {
    DEFAULT{
        @Override
        int romanToInt(String s) {
            var result = 0
            for (var i = 0; i < s.length(); i++) {
                var c = s.charAt(i)
                if (i > 0 && ROMANS[c] > ROMANS[s.charAt(i - 1)]) {
                    result += ROMANS[c] - 2 * ROMANS[s.charAt(i - 1)]
                } else {
                    result += ROMANS[c]
                }
            }
            return result
        }
    }

    abstract int romanToInt(String s)

    private static final HashMap<Character, Integer> ROMANS = [
        ('I' as char): 1,
        ('V' as char): 5,
        ('X' as char): 10,
        ('L' as char): 50,
        ('C' as char): 100,
        ('D' as char): 500,
        ('M' as char): 1000,
    ]
}
