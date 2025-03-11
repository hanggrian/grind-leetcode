package problems1_100

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class ContainerWithMostWaterTest extends SampledTest {
    @Test
    void test() {
        ContainerWithMostWater.values().each { solution ->
            getSamples(ContainerWithMostWaterSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.maxArea(sample.input.height))
                    .isEqualTo(sample.output)
            }
        }
    }
}
