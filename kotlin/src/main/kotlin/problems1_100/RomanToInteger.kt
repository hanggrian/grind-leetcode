package problems1_100

enum class RomanToInteger {
    DEFAULT {
        override fun romanToInt(s: String): Int {
            var result = 0
            for (i in s.indices) {
                val c = s[i]
                result +=
                    if (i > 0 && ROMANS[c]!! > ROMANS[s[i - 1]]!!) {
                        ROMANS[c]!! - 2 * ROMANS[s[i - 1]]!!
                    } else {
                        ROMANS[c]!!
                    }
            }
            return result
        }
    },
    ;

    abstract fun romanToInt(s: String): Int

    companion object {
        private val ROMANS =
            hashMapOf(
                'I' to 1,
                'V' to 5,
                'X' to 10,
                'L' to 50,
                'C' to 100,
                'D' to 500,
                'M' to 1000,
            )
    }
}
