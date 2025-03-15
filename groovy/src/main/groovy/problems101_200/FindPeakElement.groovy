package problems101_200

enum FindPeakElement {
    DEFAULT{
        @Override
        int findPeakElement(int[] nums) {
            var start = 0
            var end = nums.length - 1
            while (start < end) {
                if (nums[start] > nums[end]) {
                    end--
                } else {
                    start++
                }
            }
            return nums[end]
        }
    }

    abstract int findPeakElement(int[] nums)
}
