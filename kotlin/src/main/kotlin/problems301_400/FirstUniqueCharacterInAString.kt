package problems301_400

enum class FirstUniqueCharacterInAString {
    DEFAULT {
        override fun firstUniqChar(s: String): Int {
            val map = linkedMapOf<Char, Int>()
            for (c in s.toCharArray()) {
                map[c] = map.getOrDefault(c, 0) + 1
            }
            for (c in map.keys) {
                if (map[c] == 1) {
                    return s.indexOf(c)
                }
            }
            return -1
        }
    },
    ;

    abstract fun firstUniqChar(s: String): Int
}
