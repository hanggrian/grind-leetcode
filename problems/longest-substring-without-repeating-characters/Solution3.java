import java.util.HashSet;

public class Solution3 {
  public static int lengthOfLongestSubstring(String s) {
    if (s.isEmpty()) {
      return 0;
    }
    // unique characters
    final var characters = new HashSet<Character>();

    var start = 0;
    var end = 0;
    var maxLength = Integer.MIN_VALUE;
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
