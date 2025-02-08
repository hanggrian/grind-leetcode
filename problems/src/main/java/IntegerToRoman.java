import java.util.TreeMap;

public enum IntegerToRoman {
    DEFAULT {
        @Override
        public String intToRoman(int num) {
            TreeMap<Integer, String> romans = new TreeMap<>();
            romans.put(1000, "M");
            romans.put(900, "CM");
            romans.put(500, "D");
            romans.put(400, "CD");
            romans.put(100, "C");
            romans.put(90, "XC");
            romans.put(50, "L");
            romans.put(40, "XL");
            romans.put(10, "X");
            romans.put(9, "IX");
            romans.put(5, "V");
            romans.put(4, "IV");
            romans.put(1, "I");
            return recurse(romans, num);
        }

        public String recurse(TreeMap<Integer, String> romans, int num) {
            int floor = romans.floorKey(num);
            if (num == floor) {
                return romans.get(num);
            }
            return romans.get(floor) + recurse(romans, num - floor);
        }
    };

    public abstract String intToRoman(int num);
}
