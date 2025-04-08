package problems201_300

enum SlidingWindowMaximum {
    DEFAULT{
        @Override
        int[] maxSlidingWindow(int[] nums, int k) {
            ArrayDeque<Integer> queue = []
            var maxes = new int[nums.length - k + 1]
            var left = 0
            var right = 0
            while (right < nums.length) {
                while (!queue.isEmpty() && nums[queue.getLast()] < nums[right]) {
                    queue.removeLast()
                }
                queue.addLast(right)
                if (left > queue.getFirst()) {
                    queue.removeFirst()
                }
                if (right + 1 >= k) {
                    maxes[left] = nums[queue.getFirst()]
                    left++
                }
                right++
            }
            return maxes
        }
    }

    abstract int[] maxSlidingWindow(int[] nums, int k)
}
