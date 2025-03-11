package problems1_100

import kotlin.math.max

enum class MaximumSubarray {
    DEFAULT {
        override fun maxSubArray(nums: IntArray): Int {
            var current = 0
            var arraySum = nums[0]
            for (num in nums) {
                current = max(current, 0)
                current += num
                arraySum = max(arraySum, current)
            }
            return arraySum
        }
    },
    ;

    abstract fun maxSubArray(nums: IntArray): Int
}
