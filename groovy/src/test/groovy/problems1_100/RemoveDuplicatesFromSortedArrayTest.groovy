package problems1_100

import org.junit.Test
import testing.SampledTest

import static com.google.common.truth.Truth.assertThat
import static com.google.common.truth.Truth.assertWithMessage

class RemoveDuplicatesFromSortedArrayTest extends SampledTest {
    @Test
    void test() {
        for (RemoveDuplicatesFromSortedArray solution : RemoveDuplicatesFromSortedArray.values()) {
            for (RemoveDuplicatesFromSortedArraySample sample : getSamples(RemoveDuplicatesFromSortedArraySample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.removeDuplicates(sample.input.nums))
                    .isEqualTo(sample.output)
                assertThat(
                    Arrays
                        .stream(sample.input.nums)
                        .boxed()
                        .toList()
                        .subList(0, sample.output),
                ).containsNoDuplicates()
            }
        }
    }
}
