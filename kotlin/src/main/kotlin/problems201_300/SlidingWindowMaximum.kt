package problems201_300

import java.util.ArrayDeque

enum class SlidingWindowMaximum {
    DEFAULT {
        override fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
            val queue = ArrayDeque<Int>()
            val maxes = IntArray(nums.size - k + 1)
            var left = 0
            var right = 0
            while (right < nums.size) {
                while (!queue.isEmpty() && nums[queue.last] < nums[right]) {
                    queue.removeLast()
                }
                queue.addLast(right)
                if (left > queue.first) {
                    queue.removeFirst()
                }
                if (right + 1 >= k) {
                    maxes[left] = nums[queue.first]
                    left++
                }
                right++
            }
            return maxes
        }
    },
    ;

    abstract fun maxSlidingWindow(nums: IntArray, k: Int): IntArray
}
