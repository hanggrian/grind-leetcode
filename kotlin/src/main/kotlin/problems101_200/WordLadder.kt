package problems101_200

import java.util.LinkedList
import java.util.TreeSet

internal enum class WordLadder {
    DEFAULT {
        override fun ladderLength(beginWord: String, endWord: String, wordList: List<String>): Int {
            if (!wordList.contains(endWord)) {
                return 0
            }

            // `TreeSet.contains` operates at O(log n)
            val wordSet = TreeSet<String>(wordList)

            val queue = LinkedList<String>()
            queue.add(beginWord)
            var steps = 0
            while (!queue.isEmpty()) {
                for (i in 0 until queue.size) {
                    val s = queue.remove()
                    if (s == endWord) {
                        return steps + 1
                    }
                    for (j in s.indices) {
                        val word = s.toCharArray()
                        var c = 'a'
                        while (c <= 'z') {
                            word[j] = c
                            val newWord = String(word)
                            if (s == newWord || !wordSet.contains(newWord)) {
                                c++
                                continue
                            }
                            queue.add(newWord)
                            wordSet.remove(newWord)
                            c++
                        }
                    }
                }
                steps++
            }
            return 0
        }
    },
    ;

    abstract fun ladderLength(beginWord: String, endWord: String, wordList: List<String>): Int
}
