package problems1_100

import kotlin.math.max
import kotlin.math.min

enum class ContainerWithMostWater {
    DEFAULT {
        override fun maxArea(height: IntArray): Int {
            var start = 0
            var end = height.lastIndex
            var maxArea = Int.MIN_VALUE
            while (start < end) {
                val wall = min(height[start], height[end])
                maxArea = max(maxArea, ((end - start) * wall))
                if (height[start] < height[end]) {
                    start++
                } else {
                    end--
                }
            }
            return maxArea
        }
    },
    ;

    abstract fun maxArea(height: IntArray): Int
}
