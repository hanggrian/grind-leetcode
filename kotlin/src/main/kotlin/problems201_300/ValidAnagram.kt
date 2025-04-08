package problems201_300

enum class ValidAnagram {
    DEFAULT {
        override fun isAnagram(s: String, t: String): Boolean {
            if (t.length > s.length) {
                return false
            }
            val map = IntArray(128)
            for (c in s.toCharArray()) {
                map[c.code]++
            }
            for (c in t.toCharArray()) {
                map[c.code]--
            }
            for (i in map) {
                if (i > 0) {
                    return false
                }
            }
            return true
        }
    },
    ;

    abstract fun isAnagram(s: String, t: String): Boolean
}
