package problems1_100;

import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class MedianOfTwoSortedArraysTest extends SampledTest {
    @Test
    public void test() {
        for (MedianOfTwoSortedArrays solution : MedianOfTwoSortedArrays.values()) {
            for (MedianOfTwoSortedArraysSample sample
                : getSamples(MedianOfTwoSortedArraysSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(
                        solution.findMedianSortedArrays(
                            sample.input.nums1,
                            sample.input.nums2
                        )
                    ).isEqualTo(sample.output);
            }
        }
    }
}
