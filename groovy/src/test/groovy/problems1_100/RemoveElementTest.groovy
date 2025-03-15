package problems1_100

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertThat
import static com.google.common.truth.Truth.assertWithMessage

class RemoveElementTest extends SampledTest {
    @Test
    void test() {
        RemoveElement.values().each { solution ->
            getSamples(RemoveElementSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(
                        solution.removeElement(
                            sample.input.nums,
                            sample.input.val,
                        ),
                    ).isEqualTo(sample.output)
                assertThat(
                    sample.input.nums
                        .toList()
                        .subList(0, sample.output),
                ).doesNotContain(sample.input.val)
            }
        }
    }
}
