package problems1_100

enum MedianOfTwoSortedArrays {
    DEFAULT{
        @Override
        double findMedianSortedArrays(int[] nums1, int[] nums2) {
            ArrayList<Integer> nums = []
            for (var num : nums1) {
                nums.add(num)
            }
            for (var num : nums2) {
                nums.add(num)
            }
            Collections.sort(nums)
            var center = (nums.size() / 2) as int
            return nums.size() % 2 == 1
                ? nums[center]
                : (double) (nums[center - 1] + nums[center]) / 2
        }
    }

    abstract double findMedianSortedArrays(int[] nums1, int[] nums2)
}
