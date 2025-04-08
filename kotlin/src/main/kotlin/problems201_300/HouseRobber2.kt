package problems201_300

import kotlin.math.max

enum class HouseRobber2 {
    DEFAULT {
        override fun rob(nums: IntArray): Int =
            when (nums.size) {
                1 -> nums[0]
                2 -> max(nums[0], nums[1])
                else ->
                    max(
                        getMoney(nums.copyOfRange(1, nums.size)),
                        getMoney(nums.copyOfRange(0, nums.size - 1)),
                    )
            }

        fun getMoney(nums: IntArray): Int {
            val moneys = IntArray(nums.size)
            moneys[0] = nums[0]
            moneys[1] = max(nums[0], nums[1])
            for (i in 2 until nums.size) {
                moneys[i] =
                    max(nums[i] + moneys[i - 2], moneys[i - 1])
            }
            return moneys[moneys.size - 1]
        }
    },
    ;

    abstract fun rob(nums: IntArray): Int
}
