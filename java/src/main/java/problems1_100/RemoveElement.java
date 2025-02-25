package problems1_100;

enum RemoveElement {
    DEFAULT {
        @Override
        int removeElement(int[] nums, int val) {
            int start = 0;
            int end = 0;
            while (start < nums.length) {
                if (nums[start] != val) {
                    nums[end] = nums[start];
                    end++;
                }
                start++;
            }
            return end;
        }
    };

    abstract int removeElement(int[] nums, int val);
}
