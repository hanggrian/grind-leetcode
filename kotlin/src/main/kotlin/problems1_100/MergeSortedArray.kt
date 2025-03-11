package problems1_100

import java.util.Arrays

enum class MergeSortedArray {
    DEFAULT {
        override fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
            if (n >= 0) {
                System.arraycopy(nums2, 0, nums1, m, n)
            }
            Arrays.sort(nums1)
        }
    },
    ;

    abstract fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int)
}
