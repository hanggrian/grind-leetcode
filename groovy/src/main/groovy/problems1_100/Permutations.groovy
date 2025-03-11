package problems1_100

import java.util.stream.Collectors

enum Permutations {
    DEFAULT{
        @Override
        List<List<Integer>> permute(int[] nums) {
            ArrayList<List<Integer>> result = []
            permutation(
                result,
                Arrays.stream(nums).boxed().collect(Collectors.toList()),
                [],
            )
            return result
        }

        void permutation(List<List<Integer>> result, List<Integer> nums, List<Integer> prefix) {
            if (nums.isEmpty()) {
                result.add(prefix)
                return
            }
            for (var i = 0; i < nums.size(); i++) {
                permutation(
                    result,
                    nums.subList(0, i) + nums.subList(i + 1, nums.size()),
                    prefix + nums[i],
                )
            }
        }
    }

    abstract List<List<Integer>> permute(int[] nums)
}
