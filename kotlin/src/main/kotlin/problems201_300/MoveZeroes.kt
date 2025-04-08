package problems201_300

enum class MoveZeroes {
    DEFAULT {
        override fun moveZeroes(nums: IntArray) {
            var i = 0
            for (j in i + 1 until nums.size) {
                if (nums[i] == 0 && nums[j] != 0) {
                    val temp = nums[i]
                    nums[i] = nums[j]
                    nums[j] = temp
                    i++
                } else if (nums[i] != 0) {
                    i++
                }
            }
        }
    },
    ;

    abstract fun moveZeroes(nums: IntArray)
}
