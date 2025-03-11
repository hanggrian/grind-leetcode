package problems1_100

enum LongestSubstringWithoutRepeatingCharacters {
    DEFAULT{
        @Override
        int lengthOfLongestSubstring(String s) {
            if (s.isEmpty()) {
                return 0
            }
            HashSet<Character> characters = []
            var start = 0
            var end = 0
            var maxLength = Integer.MIN_VALUE
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
