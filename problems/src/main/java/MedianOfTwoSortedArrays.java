import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum MedianOfTwoSortedArrays {
    DEFAULT {
        @Override
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            List<Integer> nums = new ArrayList<>();
            for (int num : nums1) {
                nums.add(num);
            }
            for (int num : nums2) {
                nums.add(num);
            }
            Collections.sort(nums);
            int midIndex = nums.size() / 2;
            return nums.size() % 2 == 1
                ? nums.get(midIndex)
                : (double) (nums.get(midIndex - 1) + nums.get(midIndex)) / 2;
        }
    };

    public abstract double findMedianSortedArrays(int[] nums1, int[] nums2);
}
