package problems401_500

enum class ArithmeticSlices {
    DEFAULT {
        override fun numberOfArithmeticSlices(nums: IntArray): Int {
            if (nums.size < 3) {
                return 0
            }
            val slices = IntArray(nums.size)
            slices[0] = 0
            var result = 0
            for (i in 2 until nums.size) {
                if (nums[i] - nums[i - 1] != nums[i - 1] - nums[i - 2]) {
                    continue
                }
                slices[i] = slices[i - 1] + 1
                result += slices[i]
            }
            return result
        }
    },
    ;

    abstract fun numberOfArithmeticSlices(nums: IntArray): Int
}
