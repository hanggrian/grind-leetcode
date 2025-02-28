package problems1_100

enum class ZigzagConversion {
    DEFAULT {
        override fun convert(s: String, numRows: Int): String {
            var s = s

            if (numRows == 1) {
                return s
            }
            val builders = arrayOfNulls<StringBuilder>(numRows)
            for (i in 0 until numRows) {
                builders[i] = StringBuilder()
            }
            var i = 0
            var zigzagIndex = 0
            while (s.isNotEmpty()) {
                if (zigzagIndex == 0 || zigzagIndex == i) {
                    val c = s.substring(0, 1)
                    s = s.substring(1)
                    builders[i]!!.append(c)
                } else {
                    builders[i]!!.append(' ')
                }
                if (i == numRows - 1) {
                    i = 0
                    if (zigzagIndex == 0) {
                        zigzagIndex = numRows - 2
                    } else {
                        zigzagIndex--
                    }
                    continue
                }
                i++
            }
            return builders
                .joinToString("") { it.toString().replace(" ", "") }
        }
    },
    ;

    abstract fun convert(s: String, numRows: Int): String
}
