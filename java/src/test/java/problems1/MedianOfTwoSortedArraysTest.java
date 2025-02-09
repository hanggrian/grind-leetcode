package problems1;

import org.junit.Test;
import testing.Sample;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class MedianOfTwoSortedArraysTest extends SampledTest {
    @Override
    public String getFileName() {
        return "median_of_two_sorted_arrays.json";
    }

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

    public static class TypedSample extends Sample<TypedSample.Input, Double> {
        public static class Input {
            public int[] nums1;
            public int[] nums2;
        }
    }
}
