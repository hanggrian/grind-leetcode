package problems1_100

enum class JumpGame {
    DEFAULT {
        override fun canJump(nums: IntArray): Boolean {
            var goal = nums.size - 1
            for (i in nums.indices.reversed()) {
                if (i + nums[i] >= goal) {
                    goal = i
                }
            }
            return goal == 0
        }
    },
    ;

    abstract fun canJump(nums: IntArray): Boolean
}
