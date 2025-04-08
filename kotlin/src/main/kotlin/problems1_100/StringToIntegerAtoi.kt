package problems1_100

enum class StringToIntegerAtoi {
    DEFAULT {
        override fun myAtoi(s: String): Int {
            var s = s

            if (s.isEmpty()) {
                return 0
            }
            s = s.trim { it <= ' ' }
            var negate = false
            if (s.startsWith("-")) {
                s = s.substring(1)
                negate = true
            } else if (s.startsWith("+")) {
                s = s.substring(1)
            }

            s =
                buildString {
                    for (c in s.toCharArray()) {
                        if (c.isDigit()) {
                            append(c)
                            continue
                        }
                        break
                    }
                    if (negate) {
                        insert(0, '-')
                    }
                    if (isEmpty() ||
                        (length == 1 && (this.first().let { it == '-' || it == '+' }))
                    ) {
                        return 0
                    }
                }

            val result = s.toBigInteger()
            if (result < Int.MIN_VALUE.toBigInteger()) {
                return Int.MIN_VALUE
            } else if (result > Int.MAX_VALUE.toBigInteger()) {
                return Int.MAX_VALUE
            }
            return result.toInt()
        }
    },
    ;

    abstract fun myAtoi(s: String): Int
}
