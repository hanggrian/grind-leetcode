package problems201_300;

import java.util.ArrayDeque;
import java.util.Deque;

enum SlidingWindowMaximum {
    DEFAULT {
        @Override
        int[] maxSlidingWindow(int[] nums, int k) {
            Deque<Integer> queue = new ArrayDeque<>();
            int[] maxes = new int[nums.length - k + 1];
            int left = 0;
            int right = 0;
            while (right < nums.length) {
                while (!queue.isEmpty() && nums[queue.getLast()] < nums[right]) {
                    queue.removeLast();
                }
                queue.addLast(right);
                if (left > queue.getFirst()) {
                    queue.removeFirst();
                }
                if (right + 1 >= k) {
                    maxes[left] = nums[queue.getFirst()];
                    left++;
                }
                right++;
            }
            return maxes;
        }
    };

    abstract int[] maxSlidingWindow(int[] nums, int k);
}
