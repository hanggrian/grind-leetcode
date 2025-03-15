package problems101_200

enum class WordBreak {
    DEFAULT {
        override fun wordBreak(s: String, wordDict: List<String>): Boolean {
            val dp = BooleanArray(s.length + 1)
            dp[0] = true
            for (right in 1 until dp.size) {
                for (left in 0 until right) {
                    if (!dp[left] || s.substring(left, right) !in wordDict) {
                        continue
                    }
                    dp[right] = true
                    break
                }
            }
            return dp[dp.size - 1]
        }
    },
    ;

    abstract fun wordBreak(s: String, wordDict: List<String>): Boolean
}
