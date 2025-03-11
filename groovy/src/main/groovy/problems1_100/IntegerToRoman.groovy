package problems1_100

enum IntegerToRoman {
    DEFAULT{
        @Override
        String intToRoman(int num) {
            return recurse(ROMANS, num)
        }

        String recurse(TreeMap<Integer, String> romans, int num) {
            var floor = romans.floorKey(num)
            if (num == floor) {
                return romans[num]
            }
            return romans[floor] + recurse(romans, num - floor)
        }
    }

    abstract String intToRoman(int num)

    private static final TreeMap<Integer, String> ROMANS = [
        1000: 'M',
        900: 'CM',
        500: 'D',
        400: 'CD',
        100: 'C',
        90: 'XC',
        50: 'L',
        40: 'XL',
        10: 'X',
        9: 'IX',
        5: 'V',
        4: 'IV',
        1: 'I',
    ]
}
