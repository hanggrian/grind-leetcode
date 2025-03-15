package problems101_200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

enum WordBreak2 {
    DEFAULT {
        @Override
        List<String> wordBreak(String s, List<String> wordDict) {
            return recursiveWordBreak(s, wordDict, new HashMap<>());
        }

        List<String> recursiveWordBreak(
            String s,
            List<String> wordDict,
            Map<String, List<String>> map
        ) {
            if (map.containsKey(s)) {
                return map.get(s);
            }
            List<String> result = new ArrayList<>();
            for (String word : wordDict) {
                if (!s.startsWith(word)) {
                    continue;
                }
                String next = s.substring(word.length());
                if (next.isEmpty()) {
                    result.add(word);
                    continue;
                }
                for (String sub : recursiveWordBreak(next, wordDict, map)) {
                    result.add(word + " " + sub);
                }
            }
            map.put(s, result);
            return result;
        }
    };

    abstract List<String> wordBreak(String s, List<String> wordDict);
}
