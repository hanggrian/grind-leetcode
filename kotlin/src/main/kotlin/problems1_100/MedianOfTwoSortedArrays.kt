package problems1_100

enum class MedianOfTwoSortedArrays {
    DEFAULT {
        override fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
            val nums = arrayListOf<Int>()
            for (num in nums1) {
                nums += num
            }
            for (num in nums2) {
                nums += num
            }
            nums.sort()
            val center = nums.size / 2
            return if (nums.size % 2 == 1) {
                nums[center].toDouble()
            } else {
                (nums[center - 1] + nums[center]).toDouble() / 2
            }
        }
    },
    ;

    abstract fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double
}
