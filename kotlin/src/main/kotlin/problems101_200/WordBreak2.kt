package problems101_200

enum class WordBreak2 {
    DEFAULT {
        override fun wordBreak(s: String, wordDict: List<String>): List<String> =
            recursiveWordBreak(s, wordDict, hashMapOf())

        fun recursiveWordBreak(
            s: String,
            wordDict: List<String>,
            map: MutableMap<String, List<String>>,
        ): List<String> {
            if (map.containsKey(s)) {
                return map[s]!!
            }
            val result = arrayListOf<String>()
            for (word in wordDict) {
                if (!s.startsWith(word)) {
                    continue
                }
                val next = s.substring(word.length)
                if (next.isEmpty()) {
                    result += word
                    continue
                }
                for (sub in recursiveWordBreak(next, wordDict, map)) {
                    result += "$word $sub"
                }
            }
            map[s] = result
            return result
        }
    },
    ;

    abstract fun wordBreak(s: String, wordDict: List<String>): List<String>
}
