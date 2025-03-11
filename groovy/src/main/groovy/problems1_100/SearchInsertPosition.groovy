package problems1_100

enum SearchInsertPosition {
    SLIDING_WINDOW{
        @Override
        int searchInsert(int[] nums, int target) {
            var start = 0
            var end = nums.length - 1
            while (start <= end) {
                var center = (start + end) / 2 as int
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
    BINARY_SEARCH{
        @Override
        int searchInsert(int[] nums, int target) {
            return binarySearch(nums, target)
        }

        int binarySearch(int[] nums, int target) {
            return binarySearch(nums, target, 0, nums.length - 1)
        }

        int binarySearch(int[] nums, int target, int start, int end) {
            if (start > end) {
                return end + 1
            }
            var center = (start + end) / 2 as int
            if (nums[center] < target) {
                return binarySearch(nums, target, center + 1, end)
            }
            if (nums[center] > target) {
                return binarySearch(nums, target, start, center - 1)
            }
            return center
        }
    }

    abstract int searchInsert(int[] nums, int target)
}
