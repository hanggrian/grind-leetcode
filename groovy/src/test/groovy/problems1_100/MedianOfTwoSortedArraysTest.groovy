package problems1_100

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class MedianOfTwoSortedArraysTest extends SampledTest {
    @Test
    void test() {
        MedianOfTwoSortedArrays.values().each { solution ->
            getSamples(MedianOfTwoSortedArraysSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(
                        solution.findMedianSortedArrays(
                            sample.input.nums1,
                            sample.input.nums2,
                        ),
                    ).isEqualTo(sample.output)
            }
        }
    }
}
