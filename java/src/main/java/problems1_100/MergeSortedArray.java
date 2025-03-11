package problems1_100;

import java.util.Arrays;

enum MergeSortedArray {
    DEFAULT {
        @Override
        void merge(int[] nums1, int m, int[] nums2, int n) {
            if (n >= 0) {
                System.arraycopy(nums2, 0, nums1, m, n);
            }
            Arrays.sort(nums1);
        }
    };

    abstract void merge(int[] nums1, int m, int[] nums2, int n);
}
