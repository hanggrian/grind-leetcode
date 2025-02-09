package problems1;

public enum ReverseInteger {
    DEFAULT {
        @Override
        public int reverse(int x) {
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

    public abstract int reverse(int x);
}
