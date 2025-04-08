package problems201_300

internal enum class UglyNumber {
    DEFAULT {
        override fun isUgly(n: Int): Boolean {
            var n = n

            if (n <= 0) {
                return false
            }
            if (n == 1) {
                return true
            }
            while (n % 2 == 0) {
                n /= 2
            }
            while (n % 3 == 0) {
                n /= 3
            }
            while (n % 5 == 0) {
                n /= 5
            }
            return n == 1
        }
    },
    ;

    abstract fun isUgly(n: Int): Boolean
}
