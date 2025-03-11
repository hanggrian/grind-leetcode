package problems101_200

enum ValidPalindrome {
    REVERSE_STRING {
        @Override
        boolean isPalindrome(String s) {
            var builder = new StringBuilder()
            for (var c : s.toCharArray()) {
                if (Character.isLetterOrDigit(c)) {
                    builder.append(c)
                }
            }

            return builder.toString().toLowerCase()
                .contentEquals(builder.reverse().toString().toLowerCase())
        }
    },
    COMPARE_HALF_STRING {
        @Override
        boolean isPalindrome(String s) {
            var builder = new StringBuilder()
            for (var c : s.toCharArray()) {
                if (Character.isLetterOrDigit(c)) {
                    builder.append(c)
                }
            }

            s = builder.toString()
            var start = 0
            var end = s.length() - 1
            while (start < end) {
                if (Character.toLowerCase(s.charAt(start++))
                    != Character.toLowerCase(s.charAt(end--))) {
                    return false
                }
            }
            return true
        }
    }

    abstract boolean isPalindrome(String s);
}
