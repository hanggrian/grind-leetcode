package problems101_200

enum class TwoSum2InputArrayIsSorted {
    DEFAULT {
        override fun twoSum(numbers: IntArray, target: Int): IntArray {
            var start = 0
            var end = numbers.size - 1
            while (start < end) {
                val sum = numbers[start] + numbers[end]
                if (sum > target) {
                    end--
                } else if (sum < target) {
                    start++
                } else {
                    break // found
                }
            }
            return intArrayOf(++start, ++end)
        }
    },
    ;

    abstract fun twoSum(numbers: IntArray, target: Int): IntArray
}
