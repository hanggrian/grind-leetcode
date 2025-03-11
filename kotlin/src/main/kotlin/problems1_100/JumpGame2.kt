package problems1_100

import kotlin.math.max

enum class JumpGame2 {
    DEFAULT {
        override fun jump(nums: IntArray): Int {
            var steps = 0
            var maxLastJump = 0
            var maxCurrentJump = 0
            for (i in 0 until nums.lastIndex) {
                maxCurrentJump = max(maxCurrentJump, (i + nums[i]))
                if (i != maxLastJump) {
                    continue
                }
                steps++
                maxLastJump = maxCurrentJump
            }
            return steps
        }
    },
    ;

    abstract fun jump(nums: IntArray): Int
}
