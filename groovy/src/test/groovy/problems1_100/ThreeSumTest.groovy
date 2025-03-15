package problems1_100

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class ThreeSumTest extends SampledTest {
    @Test
    void test() {
        ThreeSum.values().each { solution ->
            getSamples(ThreeSumSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.threeSum(sample.input.nums))
                    .containsExactlyElementsIn(
                        sample
                            .output
                            .collect { ints -> ints.toList() }
                            .toList(),
                    ).inOrder()
            }
        }
    }
}
