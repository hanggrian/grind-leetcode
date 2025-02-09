package problems1;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public enum RemoveDuplicatesFromSortedArray {
    CREATE_COPY {
        @Override
        public int removeDuplicates(int[] nums) {
            Set<Integer> distinct =
                Arrays.stream(nums).boxed().collect(Collectors.toCollection(TreeSet::new));
            int i = 0;
            for (int num : distinct) {
                nums[i++] = num;
            }
            return distinct.size();
        }
    },
    SINGLE_PASS {
        @Override
        public int removeDuplicates(int[] nums) {
            int start = 1;
            int end = 1;
            while (end < nums.length) {
                if (nums[end] != nums[end - 1]) {
                    nums[start] = nums[end];
                    start++;
                }
                end++;
            }
            return start;
        }
    };

    public abstract int removeDuplicates(int[] nums);
}
