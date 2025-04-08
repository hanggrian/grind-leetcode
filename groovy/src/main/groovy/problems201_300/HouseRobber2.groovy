package problems201_300

enum HouseRobber2 {
    DEFAULT{
        @Override
        int rob(int[] nums) {
            switch (nums.length) {
                case 1:
                    return nums[0]
                case 2:
                    return Math.max(nums[0], nums[1])
            }
            return Math.max(
                getMoney(Arrays.copyOfRange(nums, 1, nums.length)),
                getMoney(Arrays.copyOfRange(nums, 0, nums.length - 1))
            )
        }

        int getMoney(int[] nums) {
            var moneys = new int[nums.length]
            moneys[0] = nums[0]
            moneys[1] = Math.max(nums[0], nums[1])
            for (var i = 2; i < nums.length; i++) {
                moneys[i] = Math.max(nums[i] + moneys[i - 2], moneys[i - 1])
            }
            return moneys[-1]
        }
    }

    abstract int rob(int[] nums)
}
