package problems201_300;

import java.util.Arrays;

enum ContainsDuplicate {
    DEFAULT {
        @Override
        boolean containsDuplicate(int[] nums) {
            Arrays.sort(nums);
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == nums[i - 1]) {
                    return true;
                }
            }
            return false;
        }
    };

    abstract boolean containsDuplicate(int[] nums);
}
