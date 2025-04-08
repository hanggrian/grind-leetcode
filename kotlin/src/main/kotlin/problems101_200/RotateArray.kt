package problems101_200

enum class RotateArray {
    DEFAULT {
        override fun rotate(nums: IntArray, k: Int) {
            var k = k

            if (k == 0 || k % nums.size == 0) {
                return
            }
            if (k > nums.size) {
                k %= nums.size
            }
            reverse(nums, 0, nums.size - 1)
            reverse(nums, 0, k - 1)
            reverse(nums, k, nums.size - 1)
        }

        fun reverse(nums: IntArray, left: Int, right: Int) {
            var left = left
            var right = right
            while (left < right) {
                val temp = nums[left]
                nums[left] = nums[right]
                nums[right] = temp
                left++
                right--
            }
        }
    },
    ;

    abstract fun rotate(nums: IntArray, k: Int)
}
