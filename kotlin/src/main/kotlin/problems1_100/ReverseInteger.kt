package problems1_100

enum class ReverseInteger {
    DEFAULT {
        override fun reverse(x: Int): Int {
            var negate: Boolean
            val s =
                buildString {
                    append(x)
                    negate = false
                    if (first() != '-') {
                        return@buildString
                    }
                    deleteCharAt(0)
                    negate = true
                }

            return try {
                ((if (negate) "-" else "") + s.reversed()).toInt()
            } catch (e: NumberFormatException) {
                0
            }
        }
    },
    ;

    abstract fun reverse(x: Int): Int
}
