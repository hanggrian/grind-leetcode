package problems1_100

enum class SortColors {
    DEFAULT {
        override fun sortColors(nums: IntArray) {
            for (i in 0 until nums.size - 1) {
                for (j in i + 1 until nums.size) {
                    if (nums[j] >= nums[i]) {
                        continue
                    }
                    val temp = nums[j]
                    nums[j] = nums[i]
                    nums[i] = temp
                }
            }
        }
    },
    ;

    abstract fun sortColors(nums: IntArray)
}
