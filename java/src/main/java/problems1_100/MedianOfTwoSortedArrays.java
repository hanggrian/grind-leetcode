package problems1_100;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

enum MedianOfTwoSortedArrays {
    DEFAULT {
        @Override
        double findMedianSortedArrays(int[] nums1, int[] nums2) {
            List<Integer> nums = new ArrayList<>();
            for (int num : nums1) {
                nums.add(num);
            }
            for (int num : nums2) {
                nums.add(num);
            }
            Collections.sort(nums);
            int center = nums.size() / 2;
            return nums.size() % 2 == 1
                ? nums.get(center)
                : (double) (nums.get(center - 1) + nums.get(center)) / 2;
        }
    };

    abstract double findMedianSortedArrays(int[] nums1, int[] nums2);
}
