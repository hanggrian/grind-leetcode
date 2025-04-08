package problems301_400

import java.util.Arrays

enum class IntersectionOfTwoArrays2 {
    DEFAULT {
        override fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
            Arrays.sort(nums1)
            Arrays.sort(nums2)

            var i = 0
            var j = 0
            val result: MutableList<Int> = ArrayList()
            while (i < nums1.size && j < nums2.size) {
                if (nums1[i] < nums2[j]) {
                    i++
                } else if (nums1[i] > nums2[j]) {
                    j++
                } else {
                    result.add(nums1[i])
                    i++
                    j++
                }
            }

            val intersect = IntArray(result.size)
            for (k in intersect.indices) {
                intersect[k] = result[k]
            }
            return intersect
        }
    },
    ;

    abstract fun intersect(nums1: IntArray, nums2: IntArray): IntArray
}
