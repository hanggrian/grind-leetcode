package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class MedianOfTwoSortedArraysTest : SampledTest() {
    @Test
    fun test() =
        MedianOfTwoSortedArrays.entries.forEach { solution ->
            getSamples<Array<MedianOfTwoSortedArraysSample>>().forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(solution.findMedianSortedArrays(input.nums1, input.nums2))
                    .isEqualTo(output)
            }
        }
}
