package problems1_100

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class MergeSortedArrayTest extends SampledTest {
    @Test
    void test() {
        MergeSortedArray.values().each { solution ->
            getSamples(MergeSortedArraySample[].class).each { sample ->
                int[] nums1 = sample.input.nums1
                int[] nums2 = sample.input.nums2
                solution.merge(nums1, sample.input.m, nums2, sample.input.n)
                assertWithMessage(sample.getMessage())
                    .that(nums1)
                    .asList()
                    .containsExactlyElementsIn(sample.output.toList())
                    .inOrder()
            }
        }
    }
}
