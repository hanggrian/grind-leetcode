package problems1_100

enum class PlusOne {
    DEFAULT {
        override fun plusOne(digits: IntArray): IntArray {
            var carry = 0
            for (i in digits.indices.reversed()) {
                if (i == digits.size - 1) {
                    digits[i] = digits[i] + 1
                }
                digits[i] = digits[i] + carry
                carry = digits[i] / 10
                digits[i] = digits[i] % 10
            }
            if (carry == 1) {
                val digits2 = IntArray(digits.size + 1)
                digits2[0] = 1
                System.arraycopy(digits, 0, digits2, 1, digits2.size - 1)
                return digits2
            }
            return digits
        }
    },
    ;

    abstract fun plusOne(digits: IntArray): IntArray
}
