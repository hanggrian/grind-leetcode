package problems1_100

enum class LengthOfLastWord {
    DEFAULT {
        override fun lengthOfLastWord(s: String): Int {
            val chars = s.toCharArray()
            for (i in 0 until chars.size / 2) {
                val temp = chars[i]
                chars[i] = chars[chars.size - 1 - i]
                chars[chars.size - 1 - i] = temp
            }

            var count = 0
            var startCounting = false
            for (c in chars) {
                if (c == ' ') {
                    if (startCounting) {
                        break
                    }
                } else {
                    startCounting = true
                }
                if (startCounting) {
                    count++
                }
            }
            return count
        }
    },
    ;

    abstract fun lengthOfLastWord(s: String): Int
}
