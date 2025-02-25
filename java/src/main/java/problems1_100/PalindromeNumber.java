package problems1_100;

enum PalindromeNumber {
    REVERSE_STRING {
        @Override
        boolean isPalindrome(int x) {
            String s = String.valueOf(x);
            return s.contentEquals(new StringBuilder(s).reverse());
        }
    },
    COMPARE_HALF_STRING {
        @Override
        boolean isPalindrome(int x) {
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

    abstract boolean isPalindrome(int x);
}
