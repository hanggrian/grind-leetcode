package problems1_100

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class TrappingRainWaterTest extends SampledTest {
    @Test
    void test() {
        TrappingRainWater.values().each { solution ->
            getSamples(TrappingWaterTestSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.trap(sample.input.height))
                    .isEqualTo(sample.output)
            }
        }
    }
}
