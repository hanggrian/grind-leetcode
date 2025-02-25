package problems1_100;

import org.junit.Test;
import testing.Sample;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class MedianOfTwoSortedArraysTest extends SampledTest {
    @Test
    public void test() {
        for (MedianOfTwoSortedArrays solution : MedianOfTwoSortedArrays.values()) {
            for (TypedSample sample : getSamples(TypedSample[].class)) {
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

    static class TypedSample extends Sample<TypedSample.Input, Double> {
        static class Input {
            int[] nums1;
            int[] nums2;
        }
    }
}
