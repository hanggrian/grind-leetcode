package problems1_100

enum LongestPalindromicSubstring {
    DEFAULT{
        @Override
        String longestPalindrome(String s) {
            if (s.length() == 1) {
                return s
            }
            String longestPalindrome = ''
            for (int i = 0; i < s.length() - 1; i++) {
                String palindrome
                // check odd
                int start = i
                int end = i
                while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
                    palindrome = s.substring(start, end + 1)
                    if (palindrome.length() > longestPalindrome.length()) {
                        longestPalindrome = palindrome
                    }
                    start--
                    end++
                }
                // check even
                start = i
                end = i + 1
                while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
                    palindrome = s.substring(start, end + 1)
                    if (palindrome.length() > longestPalindrome.length()) {
                        longestPalindrome = palindrome
                    }
                    start--
                    end++
                }
            }
            return longestPalindrome
        }
    }

    abstract String longestPalindrome(String s)
}
