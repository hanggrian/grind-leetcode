package problems1_100

import kotlin.math.max

enum class LongestSubstringWithoutRepeatingCharacters {
    DEFAULT {
        override fun lengthOfLongestSubstring(s: String): Int {
            if (s.isEmpty()) {
                return 0
            }
            // unique characters
            val characters = hashSetOf<Char>()

            var start = 0
            var end = 0
            var maxLength = Int.MIN_VALUE
            while (end < s.length) {
                if (characters.add(s[end])) {
                    maxLength = max(maxLength, characters.size)
                    end++
                    continue
                }
                characters -= s[start]
                start++
            }
            return maxLength
        }
    },
    ;

    abstract fun lengthOfLongestSubstring(s: String): Int
}
