package problems1_100;

import java.math.BigInteger;

enum StringToIntegerAtoi {
    DEFAULT {
        @Override
        int myAtoi(String s) {
            if (s.isEmpty()) {
                return 0;
            }
            s = s.trim();
            boolean negate = false;
            if (s.startsWith("-")) {
                s = s.substring(1);
                negate = true;
            } else if (s.startsWith("+")) {
                s = s.substring(1);
            }

            StringBuilder builder = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (Character.isDigit(c)) {
                    builder.append(c);
                    continue;
                }
                break;
            }
            if (negate) {
                builder.insert(0, '-');
            }
            if (builder.length() == 0
                || (builder.length() == 1 && (builder.charAt(0) == '-' || builder.charAt(0) == '+'))
            ) {
                return 0;
            }

            BigInteger result = new BigInteger(builder.toString());
            if (
                result.compareTo(new BigInteger(String.valueOf(Integer.MIN_VALUE))) < 0
            ) {
                return Integer.MIN_VALUE;
            } else if (
                result.compareTo(new BigInteger(String.valueOf(Integer.MAX_VALUE))) > 0
            ) {
                return Integer.MAX_VALUE;
            }
            return result.intValue();
        }
    };

    abstract int myAtoi(String s);
}
