package problems1_100

enum ThreeSum {
    DEFAULT{
        @Override
        List<List<Integer>> threeSum(int[] nums) {
            ArrayList<List<Integer>> result = []
            if (nums.length < 3) {
                return result
            }
            Arrays.sort(nums)
            for (var i = 0; i < nums.length - 2; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue // skip same result
                }
                var j = i + 1
                var k = nums.length - 1
                while (j < k) {
                    var threeSum = nums[i] + nums[j] + nums[k]
                    if (threeSum == 0) {
                        result.add(Arrays.asList(nums[i], nums[j++], nums[k--]))
                        while (j < k && nums[j] == nums[j - 1]) {
                            j++ // skip same result
                        }
                        while (j < k && nums[k] == nums[k + 1]) {
                            k-- // skip same result
                        }
                    } else if (threeSum < 0) {
                        j++
                    } else {
                        k--
                    }
                }
            }
            return result
        }
    }

    abstract List<List<Integer>> threeSum(int[] nums)
}
