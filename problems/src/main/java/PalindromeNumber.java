public enum PalindromeNumber {
    REVERSE_STRING {
        @Override
        public boolean isPalindrome(int x) {
            String s = String.valueOf(x);
            return s.contentEquals(new StringBuilder(s).reverse());
        }
    },
    COMPARE_HALF_STRING {
        @Override
        public boolean isPalindrome(int x) {
            String s = String.valueOf(x);
            int start = 0;
            int end = s.length() - 1;
            while (start < end) {
                if (s.charAt(start++) != s.charAt(end--)) {
                    return false;
                }
            }
            return true;
        }
    };

    public abstract boolean isPalindrome(int x);
}
