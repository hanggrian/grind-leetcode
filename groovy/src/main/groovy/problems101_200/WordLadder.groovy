package problems101_200

enum WordLadder {
    DEFAULT{
        @Override
        int ladderLength(String beginWord, String endWord, List<String> wordList) {
            if (!wordList.contains(endWord)) {
                return 0
            }

            // `TreeSet.contains` operates at O(log n)
            Set<String> wordSet = new TreeSet<>(wordList)

            LinkedList<String> queue = []
            queue.add(beginWord)
            var steps = 0
            while (!queue.isEmpty()) {
                for (var i = 0; i < queue.size(); i++) {
                    var s = queue.remove()
                    if (s == endWord) {
                        return steps + 1
                    }
                    for (var j = 0; j < s.length(); j++) {
                        var word = s.toCharArray()
                        for (var c = 'a'; c <= 'z'; c++) {
                            word[j] = c
                            var newWord = new String(word)
                            if (s == newWord || !wordSet.contains(newWord)) {
                                continue
                            }
                            queue.add(newWord)
                            wordSet.remove(newWord)
                        }
                    }
                }
                steps++
            }
            return 0
        }
    }

    abstract int ladderLength(String beginWord, String endWord, List<String> wordList)
}
