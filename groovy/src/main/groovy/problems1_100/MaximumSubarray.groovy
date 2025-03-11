package problems1_100

enum MaximumSubarray {
    DEFAULT {
        @Override
        int maxSubArray(int[] nums) {
            var current = 0
            var arraySum = nums[0]
            for (var num : nums) {
                current = Math.max(current, 0)
                current += num
                arraySum = Math.max(arraySum, current)
            }
            return arraySum
        }
    }

    abstract int maxSubArray(int[] nums)
}
