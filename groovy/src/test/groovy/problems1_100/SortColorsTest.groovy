package problems1_100

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class SortColorsTest extends SampledTest {
    @Test
    void test() {
        SortColors.values().each { solution ->
            getSamples(SortColorsSample[].class).each { sample ->
                int[] nums = sample.input.nums
                solution.sortColors(nums)
                assertWithMessage(sample.getMessage())
                    .that(nums)
                    .asList()
                    .containsExactlyElementsIn(
                        Arrays
                            .stream(sample.output)
                            .boxed()
                            .toList()
                    )
            }
        }
    }
}
