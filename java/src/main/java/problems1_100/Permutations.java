package problems1_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

enum Permutations {
    DEFAULT {
        @Override
        List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            permutation(
                result,
                Arrays.stream(nums).boxed().collect(Collectors.toList()),
                new ArrayList<>()
            );
            return result;
        }

        void permutation(List<List<Integer>> result, List<Integer> nums, List<Integer> prefix) {
            if (nums.isEmpty()) {
                result.add(prefix);
                return;
            }
            for (int i = 0; i < nums.size(); i++) {
                List<Integer> remove = new ArrayList<>();
                remove.addAll(nums.subList(0, i));
                remove.addAll(nums.subList(i + 1, nums.size()));

                List<Integer> newPrefix = new ArrayList<>(prefix);
                newPrefix.add(nums.get(i));
                permutation(result, remove, newPrefix);
            }
        }
    };

    abstract List<List<Integer>> permute(int[] nums);
}
