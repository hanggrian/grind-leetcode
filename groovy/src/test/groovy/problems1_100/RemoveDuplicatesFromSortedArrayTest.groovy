package problems1_100

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertThat
import static com.google.common.truth.Truth.assertWithMessage

class RemoveDuplicatesFromSortedArrayTest extends SampledTest {
    @Test
    void test() {
        RemoveDuplicatesFromSortedArray.values().each { solution ->
            getSamples(RemoveDuplicatesFromSortedArraySample[].class).each { sample ->
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
