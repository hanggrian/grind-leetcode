package problems1_100

enum class ThreeSum {
    DEFAULT {
        override fun threeSum(nums: IntArray): List<List<Int>> {
            val result = arrayListOf<List<Int>>()
            if (nums.size < 3) {
                return result
            }
            nums.sort()
            for (i in 0 until nums.size - 2) {
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue // skip same result
                }
                var j = i + 1
                var k = nums.lastIndex
                while (j < k) {
                    val threeSum = nums[i] + nums[j] + nums[k]
                    if (threeSum == 0) {
                        result += listOf(nums[i], nums[j++], nums[k--])
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
    },
    ;

    abstract fun threeSum(nums: IntArray): List<List<Int>>
}
