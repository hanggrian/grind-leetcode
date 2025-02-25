package problems1_100;

enum ReverseInteger {
    DEFAULT {
        @Override
        int reverse(int x) {
            StringBuilder builder = new StringBuilder(String.valueOf(x));
            boolean negate = false;
            if (builder.charAt(0) == '-') {
                builder.deleteCharAt(0);
                negate = true;
            }
            try {
                return Integer.parseInt((negate ? "-" : "") + builder.reverse());
            } catch (NumberFormatException e) {
                return 0;
            }
        }
    };

    abstract int reverse(int x);
}
