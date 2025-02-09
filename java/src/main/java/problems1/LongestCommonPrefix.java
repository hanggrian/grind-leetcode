package problems1;

import java.util.Arrays;
import java.util.Comparator;

public enum LongestCommonPrefix {
    DEFAULT {
        @Override
        public String longestCommonPrefix(String[] strs) {
            if (strs.length == 0) {
                return "";
            }
            if (strs.length == 1) {
                return strs[0];
            }
            String longestStr =
                Arrays.stream(strs).max(Comparator.comparingInt(String::length)).get();
            int end = -1;
            loop:
            for (int i = 0; i < longestStr.length(); i++) {
                char c = longestStr.charAt(i);
                for (int j = 0; j < strs.length; j++) {
                    String str = strs[j];
                    if (i > str.length() - 1 || c != str.charAt(i)) {
                        break loop;
                    } else if (j == strs.length - 1) {
                        end = i;
                    }
                }
            }
            return longestStr.substring(0, end + 1);
        }
    };

    public abstract String longestCommonPrefix(String[] strs);
}
