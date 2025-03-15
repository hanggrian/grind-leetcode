package problems101_200

import kotlin.math.max
import kotlin.math.min

enum class MaximumProductSubarray {
    DEFAULT {
        override fun maxProduct(nums: IntArray): Int {
            val maxs = IntArray(nums.size)
            val mins = IntArray(nums.size)
            maxs[0] = nums[0]
            mins[0] = nums[0]
            var result = nums[0]
            for (i in 1 until nums.size) {
                if (nums[i] > 0) {
                    maxs[i] = max((maxs[i - 1] * nums[i]), nums[i])
                    mins[i] = min((mins[i - 1] * nums[i]), nums[i])
                } else {
                    maxs[i] = max((mins[i - 1] * nums[i]), nums[i])
                    mins[i] = min((maxs[i - 1] * nums[i]), nums[i])
                }
                result = max(maxs[i], result)
            }
            return result
        }
    },
    ;

    abstract fun maxProduct(nums: IntArray): Int
}
