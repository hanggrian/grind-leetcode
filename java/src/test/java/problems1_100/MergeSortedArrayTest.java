package problems1_100;

import java.util.Arrays;
import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class MergeSortedArrayTest extends SampledTest {
    @Test
    public void test() {
        for (MergeSortedArray solution : MergeSortedArray.values()) {
            for (MergeSortedArraySample sample : getSamples(MergeSortedArraySample[].class)) {
                int[] nums1 = sample.input.nums1;
                int[] nums2 = sample.input.nums2;
                solution.merge(nums1, sample.input.m, nums2, sample.input.n);
                assertWithMessage(sample.getMessage())
                    .that(nums1)
                    .asList()
                    .containsExactlyElementsIn(
                        Arrays
                            .stream(sample.output)
                            .boxed()
                            .toList()
                    );
            }
        }
    }
}
