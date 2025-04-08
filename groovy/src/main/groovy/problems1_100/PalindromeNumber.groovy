package problems1_100

enum PalindromeNumber {
    REVERSE_STRING{
        @Override
        boolean isPalindrome(int x) {
            var s = x.toString()
            return s.contentEquals(new StringBuilder(s).reverse())
        }
    },
    COMPARE_HALF_STRING{
        @Override
        boolean isPalindrome(int x) {
            var s = x.toString()
            var start = 0
            var end = s.length() - 1
            while (start < end) {
                if (s.charAt(start++) != s.charAt(end--)) {
                    return false
                }
            }
            return true
        }
    }

    abstract boolean isPalindrome(int x)
}
