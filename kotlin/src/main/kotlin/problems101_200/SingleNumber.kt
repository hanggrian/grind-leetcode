package problems101_200

enum class SingleNumber {
    DEFAULT {
        override fun singleNumber(nums: IntArray): Int {
            val result = arrayListOf<Int>()
            for (num in nums) {
                if (num !in result) {
                    result += num
                } else {
                    result -= num
                }
            }
            return result[0]
        }
    },
    ;

    abstract fun singleNumber(nums: IntArray): Int
}
