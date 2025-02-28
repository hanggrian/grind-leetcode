package problems1_100

enum class LongestCommonPrefix {
    DEFAULT {
        override fun longestCommonPrefix(strs: Array<String>): String {
            if (strs.isEmpty()) {
                return ""
            }
            if (strs.size == 1) {
                return strs.first()
            }
            val longestStr = strs.maxBy { it.length }
            var end = -1
            loop@ for (i in longestStr.indices) {
                val c = longestStr[i]
                for (j in strs.indices) {
                    val str = strs[j]
                    if (i > str.lastIndex || c != str[i]) {
                        break@loop
                    } else if (j == strs.lastIndex) {
                        end = i
                    }
                }
            }
            return longestStr.substring(0, end + 1)
        }
    },
    ;

    abstract fun longestCommonPrefix(strs: Array<String>): String
}
