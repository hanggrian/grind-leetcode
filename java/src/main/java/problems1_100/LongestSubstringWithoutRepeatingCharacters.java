package problems1_100;

import java.util.HashSet;
import java.util.Set;

enum LongestSubstringWithoutRepeatingCharacters {
    DEFAULT {
        @Override
        int lengthOfLongestSubstring(String s) {
            if (s.isEmpty()) {
                return 0;
            }
            Set<Character> characters = new HashSet<>();
            int start = 0;
            int end = 0;
            int maxLength = Integer.MIN_VALUE;
            while (end < s.length()) {
                if (characters.add(s.charAt(end))) {
                    maxLength = Math.max(maxLength, characters.size());
                    end++;
                    continue;
                }
                characters.remove(s.charAt(start));
                start++;
            }
            return maxLength;
        }
    };

    abstract int lengthOfLongestSubstring(String s);
}
