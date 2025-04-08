package problems101_200

import kotlin.math.max

enum class HouseRobber {
    DEFAULT {
        override fun rob(nums: IntArray): Int {
            if (nums.size == 1) {
                return nums[0]
            }
            val moneys = IntArray(nums.size)
            moneys[0] = nums[0]
            moneys[1] = max(nums[0], nums[1])
            for (i in 2 until nums.size) {
                moneys[i] = max(nums[i] + moneys[i - 2], moneys[i - 1])
            }
            return moneys[moneys.size - 1]
        }
    },
    ;

    abstract fun rob(nums: IntArray): Int
}
