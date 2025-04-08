package problems101_200

enum HouseRobber {
    DEFAULT{
        @Override
        int rob(int[] nums) {
            if (nums.length == 1) {
                return nums[0]
            }
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
