package problems1_100

import org.junit.Test
import testing.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class ContainerWithMostWaterTest extends SampledTest {
    @Test
    void test() {
        for (ContainerWithMostWater solution : ContainerWithMostWater.values()) {
            for (ContainerWithMostWaterSample sample : getSamples(ContainerWithMostWaterSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.maxArea(sample.input.height))
                    .isEqualTo(sample.output)
            }
        }
    }
}
