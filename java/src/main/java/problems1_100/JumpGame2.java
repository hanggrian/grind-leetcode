package problems1_100;

enum JumpGame2 {
    DEFAULT {
        @Override
        int jump(int[] nums) {
            int steps = 0;
            int maxLastJump = 0;
            int maxCurrentJump = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                maxCurrentJump = Math.max(maxCurrentJump, i + nums[i]);
                if (i != maxLastJump) {
                    continue;
                }
                steps++;
                maxLastJump = maxCurrentJump;
            }
            return steps;
        }
    };

    abstract int jump(int[] nums);
}
