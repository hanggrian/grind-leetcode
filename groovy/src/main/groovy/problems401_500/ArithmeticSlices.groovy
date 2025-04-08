package problems401_500

enum ArithmeticSlices {
    DEFAULT{
        @Override
        int numberOfArithmeticSlices(int[] nums) {
            if (nums.length < 3) {
                return 0
            }
            var slices = new int[nums.length]
            slices[0] = 0
            var result = 0
            for (var i = 2; i < nums.length; i++) {
                if (nums[i] - nums[i - 1] != nums[i - 1] - nums[i - 2]) {
                    continue
                }
                slices[i] = slices[i - 1] + 1
                result += slices[i]
            }
            return result
        }
    }

    abstract int numberOfArithmeticSlices(int[] nums)
}
