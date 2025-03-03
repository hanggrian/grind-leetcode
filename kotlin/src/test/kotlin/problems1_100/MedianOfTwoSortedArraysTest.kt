package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import kotlin.test.Test

class MedianOfTwoSortedArraysTest : SampledTest() {
    @Test
    fun test() {
        for (solution in MedianOfTwoSortedArrays.entries) {
            for (sample in getSamples(Array<MedianOfTwoSortedArraysSample>::class.java)) {
                assertWithMessage(sample.message)
                    .that(
                        solution.findMedianSortedArrays(
                            sample.input!!.nums1,
                            sample.input!!.nums2,
                        ),
                    ).isEqualTo(sample.output)
            }
        }
    }
}
