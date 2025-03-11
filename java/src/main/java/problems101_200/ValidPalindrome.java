package problems101_200;

enum ValidPalindrome {
    REVERSE_STRING {
        @Override
        boolean isPalindrome(String s) {
            StringBuilder builder = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (Character.isLetterOrDigit(c)) {
                    builder.append(c);
                }
            }

            return builder.toString().toLowerCase()
                .contentEquals(builder.reverse().toString().toLowerCase());
        }
    },
    COMPARE_HALF_STRING {
        @Override
        boolean isPalindrome(String s) {
            StringBuilder builder = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (Character.isLetterOrDigit(c)) {
                    builder.append(c);
                }
            }

            s = builder.toString();
            int start = 0;
            int end = s.length() - 1;
            while (start < end) {
                if (Character.toLowerCase(s.charAt(start++))
                    != Character.toLowerCase(s.charAt(end--))) {
                    return false;
                }
            }
            return true;
        }
    };

    abstract boolean isPalindrome(String s);
}
