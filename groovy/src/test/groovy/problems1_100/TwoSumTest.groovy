package problems1_100

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class TwoSumTest extends SampledTest {
    @Test
    void test() {
        TwoSum.values().each { solution ->
            getSamples(TwoSumSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(
                        solution.twoSum(
                            sample.input.nums,
                            sample.input.target,
                        ),
                    ).asList()
                    .containsExactlyElementsIn(sample.output.toList())
                    .inOrder()
            }
        }
    }
}
