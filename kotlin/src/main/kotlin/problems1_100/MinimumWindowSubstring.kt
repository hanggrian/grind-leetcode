package problems1_100

enum class MinimumWindowSubstring {
    DEFAULT {
        override fun minWindow(s: String, t: String): String {
            if (t.length > s.length) {
                return ""
            }

            val sMap = IntArray(128)
            val tMap = IntArray(128)
            for (c in t.toCharArray()) {
                tMap[c.code]++
            }

            var left = 0
            var right = 0
            var result = ""
            while (right < s.length) {
                sMap[s[right].code]++
                right++
                while (left <= right && contains(sMap, tMap)) {
                    result = getMinLength(result, s.substring(left, right))
                    sMap[s[left].code]--
                    left++
                }
            }
            return result
        }

        fun getMinLength(s1: String, s2: String): String =
            if (s1.isEmpty() || s1.length > s2.length) {
                s2
            } else {
                s1
            }

        fun contains(sMap: IntArray, tMap: IntArray): Boolean {
            for (i in tMap.indices) {
                if (tMap[i] > sMap[i]) {
                    return false
                }
            }
            return true
        }
    },
    ;

    abstract fun minWindow(s: String, t: String): String
}
