package problems101_200;

enum MaximumProductSubarray {
    DEFAULT {
        @Override
        int maxProduct(int[] nums) {
            int[] maxs = new int[nums.length];
            int[] mins = new int[nums.length];
            maxs[0] = nums[0];
            mins[0] = nums[0];
            int result = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > 0) {
                    maxs[i] = Math.max(maxs[i - 1] * nums[i], nums[i]);
                    mins[i] = Math.min(mins[i - 1] * nums[i], nums[i]);
                } else {
                    maxs[i] = Math.max(mins[i - 1] * nums[i], nums[i]);
                    mins[i] = Math.min(maxs[i - 1] * nums[i], nums[i]);
                }
                result = Math.max(maxs[i], result);
            }
            return result;
        }
    };

    abstract int maxProduct(int[] nums);
}
