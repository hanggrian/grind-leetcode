package problems101_200;

enum RotateArray {
    DEFAULT {
        @Override
        void rotate(int[] nums, int k) {
            if (k == 0 || k % nums.length == 0) {
                return;
            }
            if (k > nums.length) {
                k %= nums.length;
            }
            reverse(nums, 0, nums.length - 1);
            reverse(nums, 0, k - 1);
            reverse(nums, k, nums.length - 1);
        }

        void reverse(int[] nums, int left, int right) {
            while (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
    };

    abstract void rotate(int[] nums, int k);
}
