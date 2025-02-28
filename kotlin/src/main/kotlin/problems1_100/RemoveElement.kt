package problems1_100

enum class RemoveElement {
    DEFAULT {
        override fun removeElement(nums: IntArray, `val`: Int): Int {
            var start = 0
            var end = 0
            while (start < nums.size) {
                if (nums[start] != `val`) {
                    nums[end] = nums[start]
                    end++
                }
                start++
            }
            return end
        }
    },
    ;

    abstract fun removeElement(nums: IntArray, `val`: Int): Int
}
