package problems301_400

enum class ReverseString {
    DEFAULT {
        override fun reverseString(s: CharArray) {
            for (left in 0 until s.size / 2) {
                val right = s.size - 1 - left
                val temp = s[left]
                s[left] = s[right]
                s[right] = temp
            }
        }
    },
    ;

    abstract fun reverseString(s: CharArray)
}
