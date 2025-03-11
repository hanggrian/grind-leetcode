package problems101_200;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

enum WordLadder {
    DEFAULT {
        @Override
        int ladderLength(String beginWord, String endWord, List<String> wordList) {
            if (!wordList.contains(endWord)) {
                return 0;
            }

            // `TreeSet.contains` operates at O(log n)
            Set<String> wordSet = new TreeSet<>(wordList);

            Queue<String> queue = new LinkedList<>();
            queue.add(beginWord);
            int steps = 0;
            while (!queue.isEmpty()) {
                for (int i = 0; i < queue.size(); i++) {
                    String s = queue.remove();
                    if (s.equals(endWord)) {
                        return steps + 1;
                    }
                    for (int j = 0; j < s.length(); j++) {
                        char[] word = s.toCharArray();
                        for (char c = 'a'; c <= 'z'; c++) {
                            word[j] = c;
                            String newWord = new String(word);
                            if (s.equals(newWord) || !wordSet.contains(newWord)) {
                                continue;
                            }
                            queue.add(newWord);
                            wordSet.remove(newWord);
                        }
                    }
                }
                steps++;
            }
            return 0;
        }
    };

    abstract int ladderLength(String beginWord, String endWord, List<String> wordList);
}
