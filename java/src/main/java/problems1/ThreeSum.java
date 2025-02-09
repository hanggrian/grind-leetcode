package problems1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum ThreeSum {
    DEFAULT {
        @Override
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            if (nums.length < 3) {
                return result;
            }
            Arrays.sort(nums);
            for (int i = 0; i < nums.length - 2; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue; // skip same result
                }
                int j = i + 1;
                int k = nums.length - 1;
                while (j < k) {
                    int threeSum = nums[i] + nums[j] + nums[k];
                    if (threeSum == 0) {
                        result.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                        while (j < k && nums[j] == nums[j - 1]) {
                            j++; // skip same result
                        }
                        while (j < k && nums[k] == nums[k + 1]) {
                            k--; // skip same result
                        }
                    } else if (threeSum < 0) {
                        j++;
                    } else {
                        k--;
                    }
                }
            }
            return result;
        }
    };

    public abstract List<List<Integer>> threeSum(int[] nums);
}
