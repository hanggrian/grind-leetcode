package problems1_100

enum MedianOfTwoSortedArrays {
    DEFAULT{
        @Override
        double findMedianSortedArrays(int[] nums1, int[] nums2) {
            ArrayList<Integer> nums = []
            for (int num : nums1) {
                nums.add(num)
            }
            for (int num : nums2) {
                nums.add(num)
            }
            Collections.sort(nums)
            int center = (nums.size() / 2) as int
            return nums.size() % 2 == 1
                ? nums.get(center)
                : (double) (nums.get(center - 1) + nums.get(center)) / 2
        }
    }

    abstract double findMedianSortedArrays(int[] nums1, int[] nums2)
}
