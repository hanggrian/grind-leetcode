package problems1_100

enum LongestSubstringWithoutRepeatingCharacters {
    DEFAULT{
        @Override
        int lengthOfLongestSubstring(String s) {
            if (s.isEmpty()) {
                return 0
            }
            // unique characters
            HashSet<Character> characters = []

            int start = 0
            int end = 0
            int maxLength = Integer.MIN_VALUE
            while (end < s.length()) {
                if (characters.add(s.charAt(end))) {
                    maxLength = Math.max(maxLength, characters.size())
                    end++
                    continue
                }
                characters.remove(s.charAt(start))
                start++
            }
            return maxLength
        }
    }

    abstract int lengthOfLongestSubstring(String s)
}
