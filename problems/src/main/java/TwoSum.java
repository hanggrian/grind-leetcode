import java.util.HashMap;
import java.util.Map;

public enum TwoSum {
    BRUTE_FORCE {
        @Override
        public int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == target - nums[i]) {
                        return new int[]{i, j};
                    }
                }
            }
            return null;
        }
    },
    SINGLE_PASS {
        @Override
        public int[] twoSum(int[] nums, int target) {
            // remaining to index mapping
            Map<Integer, Integer> indices = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                final int num = nums[i];
                if (indices.containsKey(num)) {
                    return new int[]{indices.get(num), i};
                }
                indices.put(target - num, i);
            }
            return new int[]{-1, -1};
        }
    };

    public abstract int[] twoSum(int[] nums, int target);
}
