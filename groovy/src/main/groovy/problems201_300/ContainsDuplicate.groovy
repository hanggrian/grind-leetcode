package problems201_300

enum ContainsDuplicate {
    DEFAULT{
        @Override
        boolean containsDuplicate(int[] nums) {
            Arrays.sort(nums)
            for (var i = 1; i < nums.length; i++) {
                if (nums[i] == nums[i - 1]) {
                    return true
                }
            }
            return false
        }
    }

    abstract boolean containsDuplicate(int[] nums)
}
