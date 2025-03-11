package problems1_100

enum JumpGame2 {
    DEFAULT {
        @Override
        int jump(int[] nums) {
            var steps = 0
            var maxLastJump = 0
            var maxCurrentJump = 0
            for (var i = 0; i < nums.length - 1; i++) {
                maxCurrentJump = Math.max(maxCurrentJump, i + nums[i])
                if (i != maxLastJump) {
                    continue
                }
                steps++
                maxLastJump = maxCurrentJump
            }
            return steps
        }
    }

    abstract int jump(int[] nums)
}
