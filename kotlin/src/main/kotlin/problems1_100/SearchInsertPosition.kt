package problems1_100

enum class SearchInsertPosition {
    SLIDING_WINDOW {
        override fun searchInsert(nums: IntArray, target: Int): Int {
            var start = 0
            var end = nums.lastIndex
            while (start <= end) {
                val center = (start + end) / 2
                if (nums[center] < target) {
                    start = center + 1
                } else if (nums[center] > target) {
                    end = center - 1
                } else {
                    return center
                }
            }
            return end + 1
        }
    },
    BINARY_SEARCH {
        override fun searchInsert(nums: IntArray, target: Int): Int = binarySearch(nums, target)

        fun binarySearch(
            nums: IntArray,
            target: Int,
            start: Int = 0,
            end: Int = nums.lastIndex,
        ): Int {
            if (start > end) {
                return end + 1
            }
            val center = (start + end) / 2
            if (nums[center] < target) {
                return binarySearch(nums, target, center + 1, end)
            }
            if (nums[center] > target) {
                return binarySearch(nums, target, start, center - 1)
            }
            return center
        }
    },
    ;

    abstract fun searchInsert(nums: IntArray, target: Int): Int
}
