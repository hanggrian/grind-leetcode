package problems101_200

enum class FindPeakElement {
    DEFAULT {
        override fun findPeakElement(nums: IntArray): Int {
            var start = 0
            var end = nums.size - 1
            while (start < end) {
                if (nums[start] > nums[end]) {
                    end--
                } else {
                    start++
                }
            }
            return nums[end]
        }
    },
    ;

    abstract fun findPeakElement(nums: IntArray): Int
}
