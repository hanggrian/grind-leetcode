package problems1_100

import java.util.Arrays
import java.util.stream.Collectors

enum class Permutations {
    DEFAULT {
        override fun permute(nums: IntArray): List<List<Int>> {
            val result = arrayListOf<List<Int>>()
            permutation(
                result,
                Arrays.stream(nums).boxed().collect(Collectors.toList()),
                ArrayList(),
            )
            return result
        }

        fun permutation(result: MutableList<List<Int>>, nums: List<Int>, prefix: List<Int>) {
            if (nums.isEmpty()) {
                result += prefix
                return
            }
            for (i in nums.indices) {
                permutation(
                    result,
                    nums.subList(0, i) + nums.subList(i + 1, nums.size),
                    prefix + nums[i],
                )
            }
        }
    },
    ;

    abstract fun permute(nums: IntArray): List<List<Int>>
}
