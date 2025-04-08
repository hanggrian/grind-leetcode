package problems301_400;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

enum IntersectionOfTwoArrays2 {
    DEFAULT {
        @Override
        int[] intersect(int[] nums1, int[] nums2) {
            Arrays.sort(nums1);
            Arrays.sort(nums2);

            int i = 0;
            int j = 0;
            List<Integer> result = new ArrayList<>();
            while (i < nums1.length && j < nums2.length) {
                if (nums1[i] < nums2[j]) {
                    i++;
                } else if (nums1[i] > nums2[j]) {
                    j++;
                } else {
                    result.add(nums1[i]);
                    i++;
                    j++;
                }
            }

            int[] intersect = new int[result.size()];
            for (int k = 0; k < intersect.length; k++) {
                intersect[k] = result.get(k);
            }
            return intersect;
        }
    };

    abstract int[] intersect(int[] nums1, int[] nums2);
}
