package problems101_200

enum TwoSum2InputArrayIsSorted {
    DEFAULT{
        @Override
        int[] twoSum(int[] numbers, int target) {
            var start = 0
            var end = numbers.length - 1
            while (start < end) {
                var sum = numbers[start] + numbers[end]
                if (sum > target) {
                    end--
                } else if (sum < target) {
                    start++
                } else {
                    break // found
                }
            }
            return new int[]{++start, ++end}
        }
    }

    abstract int[] twoSum(int[] numbers, int target)
}
