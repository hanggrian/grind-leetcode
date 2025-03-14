package problems1_100;

import java.util.TreeMap;

enum IntegerToRoman {
    DEFAULT {
        @Override
        String intToRoman(int num) {
            return recurse(ROMANS, num);
        }

        String recurse(TreeMap<Integer, String> romans, int num) {
            int floor = romans.floorKey(num);
            if (num == floor) {
                return romans.get(num);
            }
            return romans.get(floor) + recurse(romans, num - floor);
        }
    };

    abstract String intToRoman(int num);

    private static final TreeMap<Integer, String> ROMANS = new TreeMap<>();

    static {
        ROMANS.put(1000, "M");
        ROMANS.put(900, "CM");
        ROMANS.put(500, "D");
        ROMANS.put(400, "CD");
        ROMANS.put(100, "C");
        ROMANS.put(90, "XC");
        ROMANS.put(50, "L");
        ROMANS.put(40, "XL");
        ROMANS.put(10, "X");
        ROMANS.put(9, "IX");
        ROMANS.put(5, "V");
        ROMANS.put(4, "IV");
        ROMANS.put(1, "I");
    }
}
