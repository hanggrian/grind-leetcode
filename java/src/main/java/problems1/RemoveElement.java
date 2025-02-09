package problems1;

public enum RemoveElement {
    DEFAULT {
        @Override
        public int removeElement(int[] nums, int val) {
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

    public abstract int removeElement(int[] nums, int val);
}
