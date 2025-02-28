package problems1_100

enum TwoSum {
    BRUTE_FORCE{
        @Override
        int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == target - nums[i]) {
                        return new int[]{i, j}
                    }
                }
            }
            return []
        }
    },
    SINGLE_PASS{
        @Override
        int[] twoSum(int[] nums, int target) {
            // remaining to index mapping
            HashMap<Integer, Integer> indices = []
            for (int i = 0; i < nums.length; i++) {
                final int num = nums[i]
                if (indices.containsKey(num)) {
                    return new int[]{indices.get(num), i}
                }
                indices.put(target - num, i)
            }
            return new int[]{-1, -1}
        }
    }

    abstract int[] twoSum(int[] nums, int target)
}
