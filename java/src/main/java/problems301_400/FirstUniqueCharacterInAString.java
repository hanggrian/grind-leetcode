package problems301_400;

import java.util.LinkedHashMap;
import java.util.Map;

enum FirstUniqueCharacterInAString {
    DEFAULT {
        @Override
        int firstUniqChar(String s) {
            Map<Character, Integer> map = new LinkedHashMap<>();
            for (char c : s.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            for (char c : map.keySet()) {
                if (map.get(c) == 1) {
                    return s.indexOf(c);
                }
            }
            return -1;
        }
    };

    abstract int firstUniqChar(String s);
}
