package problems1_100

import org.junit.Test
import testing.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class MedianOfTwoSortedArraysTest extends SampledTest {
    @Test
    void test() {
        for (MedianOfTwoSortedArrays solution : MedianOfTwoSortedArrays.values()) {
            for (MedianOfTwoSortedArraysSample sample : getSamples(MedianOfTwoSortedArraysSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(
                        solution.findMedianSortedArrays(
                            sample.input.nums1,
                            sample.input.nums2
                        )
                    ).isEqualTo(sample.output)
            }
        }
    }
}
