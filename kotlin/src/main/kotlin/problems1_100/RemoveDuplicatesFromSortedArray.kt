package problems1_100

enum class RemoveDuplicatesFromSortedArray {
    CREATE_COPY {
        override fun removeDuplicates(nums: IntArray): Int {
            val distinct =
                nums.toHashSet()
            var i = 0
            for (num in distinct) {
                nums[i++] = num
            }
            return distinct.size
        }
    },
    SINGLE_PASS {
        override fun removeDuplicates(nums: IntArray): Int {
            var start = 1
            var end = 1
            while (end < nums.size) {
                if (nums[end] != nums[end - 1]) {
                    nums[start] = nums[end]
                    start++
                }
                end++
            }
            return start
        }
    },
    ;

    abstract fun removeDuplicates(nums: IntArray): Int
}
