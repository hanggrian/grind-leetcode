package problems1_100

import java.util.Arrays
import kotlin.math.max

enum class MergeIntervals {
    DEFAULT {
        override fun merge(intervals: Array<IntArray>): Array<IntArray> {
            Arrays.sort(intervals, Comparator.comparingInt { array: IntArray -> array[0] })
            val newIntervals = arrayListOf(intervals[0])
            for (i in 1 until intervals.size) {
                val last = newIntervals[newIntervals.size - 1]
                if (last[1] < intervals[i][0]) {
                    newIntervals += intervals[i]
                    continue
                }
                newIntervals.removeAt(newIntervals.size - 1)
                newIntervals +=
                    intArrayOf(
                        last[0],
                        max(last[1].toDouble(), intervals[i][1].toDouble()).toInt(),
                    )
            }

            val result = Array(newIntervals.size) { IntArray(2) }
            for (i in newIntervals.indices) {
                result[i] = newIntervals[i]
            }
            return result
        }
    },
    ;

    abstract fun merge(intervals: Array<IntArray>): Array<IntArray>
}
