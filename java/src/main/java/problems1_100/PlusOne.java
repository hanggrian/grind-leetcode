package problems1_100;

enum PlusOne {
    DEFAULT {
        @Override
        int[] plusOne(int[] digits) {
            int carry = 0;
            for (int i = digits.length - 1; i >= 0; i--) {
                if (i == digits.length - 1) {
                    digits[i] = digits[i] + 1;
                }
                digits[i] = digits[i] + carry;
                carry = digits[i] / 10;
                digits[i] = digits[i] % 10;
            }
            if (carry == 1) {
                int[] digits2 = new int[digits.length + 1];
                digits2[0] = 1;
                System.arraycopy(digits, 0, digits2, 1, digits2.length - 1);
                return digits2;
            }
            return digits;
        }
    };

    abstract int[] plusOne(int[] digits);
}
