package problems1_100

import java.util.stream.Collectors

enum RemoveDuplicatesFromSortedArray {
    CREATE_COPY{
        @Override
        int removeDuplicates(int[] nums) {
            Set<Integer> distinct =
                Arrays.stream(nums).boxed().collect(Collectors.toCollection(TreeSet::new))
            int i = 0
            for (int num : distinct) {
                nums[i++] = num
            }
            return distinct.size()
        }
    },
    SINGLE_PASS{
        @Override
        int removeDuplicates(int[] nums) {
            int start = 1
            int end = 1
            while (end < nums.length) {
                if (nums[end] != nums[end - 1]) {
                    nums[start] = nums[end]
                    start++
                }
                end++
            }
            return start
        }
    }

    abstract int removeDuplicates(int[] nums)
}
