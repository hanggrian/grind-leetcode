package problems301_400

enum class RansomNote {
    DEFAULT {
        override fun canConstruct(ransomNote: String, magazine: String): Boolean {
            val map = IntArray(128)
            for (c in ransomNote.toCharArray()) {
                map[c.code]++
            }
            for (c in magazine.toCharArray()) {
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

    abstract fun canConstruct(ransomNote: String, magazine: String): Boolean
}
