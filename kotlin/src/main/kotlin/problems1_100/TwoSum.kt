package problems1_100

enum class TwoSum {
    BRUTE_FORCE {
        override fun twoSum(nums: IntArray, target: Int): IntArray {
            for (i in nums.indices) {
                for (j in i + 1 until nums.size) {
                    if (nums[j] == target - nums[i]) {
                        return intArrayOf(i, j)
                    }
                }
            }
            return intArrayOf(-1, -1)
        }
    },
    SINGLE_PASS {
        override fun twoSum(nums: IntArray, target: Int): IntArray {
            // remaining to index mapping
            val indices = hashMapOf<Int, Int>()
            for (i in nums.indices) {
                val num = nums[i]
                if (indices.containsKey(num)) {
                    return intArrayOf(indices[num]!!, i)
                }
                indices[target - num] = i
            }
            return intArrayOf(-1, -1)
        }
    },
    ;

    abstract fun twoSum(nums: IntArray, target: Int): IntArray
}
