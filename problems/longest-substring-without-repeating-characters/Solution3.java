import java.util.HashSet;
import java.util.Set;

public class Solution3 {
  public static int lengthOfLongestSubstring(String s) {
    if (s.isEmpty()) {
      return 0;
    }
    // unique characters
    final Set<Character> characters = new HashSet<>();

    int start = 0;
    int end = 0;
    int maxLength = Integer.MIN_VALUE;
    while (end < s.length()) {
      if (characters.add(s.charAt(end))) {
        maxLength = Math.max(maxLength, characters.size());
        end++;
      } else {
        characters.remove(s.charAt(start));
        start++;
      }
    }
    return maxLength;
  }
}
