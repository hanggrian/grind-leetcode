package problems201_300

import java.util.Arrays

enum class ContainsDuplicate {
    DEFAULT {
        override fun containsDuplicate(nums: IntArray): Boolean {
            Arrays.sort(nums)
            for (i in 1 until nums.size) {
                if (nums[i] == nums[i - 1]) {
                    return true
                }
            }
            return false
        }
    },
    ;

    abstract fun containsDuplicate(nums: IntArray): Boolean
}
