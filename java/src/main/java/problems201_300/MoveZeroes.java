package problems201_300;

enum MoveZeroes {
    DEFAULT {
        @Override
        void moveZeroes(int[] nums) {
            int i = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == 0 && nums[j] != 0) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                } else if (nums[i] != 0) {
                    i++;
                }
            }
        }
    };

    abstract void moveZeroes(int[] nums);
}
