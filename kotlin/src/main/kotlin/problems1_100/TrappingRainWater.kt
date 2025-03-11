package problems1_100

import kotlin.math.max
import kotlin.math.min

enum class TrappingRainWater {
    DEFAULT {
        override fun trap(height: IntArray): Int {
            if (height.size < 3) {
                return 0
            }

            // create two arrays of increasing height for each end
            val ltrHeight = IntArray(height.size)
            val rtlHeight = IntArray(height.size)
            ltrHeight[0] = height[0]
            rtlHeight[height.size - 1] = height[height.size - 1]
            for (i in 1 until height.size) {
                ltrHeight[i] = max(ltrHeight[i - 1], height[i])
            }
            for (i in height.lastIndex - 1 downTo 0) {
                rtlHeight[i] = max(rtlHeight[i + 1], height[i])
            }

            // the overlap between two heights is the water
            var water = 0
            for (i in height.indices) {
                water += min(ltrHeight[i], rtlHeight[i]) - height[i]
            }
            return water
        }
    },
    ;

    abstract fun trap(height: IntArray): Int
}
