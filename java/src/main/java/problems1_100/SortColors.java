package problems1_100;

enum SortColors {
    DEFAULT {
        @Override
        void sortColors(int[] nums) {
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] >= nums[i]) {
                        continue;
                    }
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
    };

    abstract void sortColors(int[] nums);
}
