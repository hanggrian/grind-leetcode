package problems1_100;

import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class ContainerWithMostWaterTest extends SampledTest {
    @Test
    public void test() {
        for (ContainerWithMostWater solution : ContainerWithMostWater.values()) {
            for (ContainerWithMostWaterSample sample
                : getSamples(ContainerWithMostWaterSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.maxArea(sample.input.height))
                    .isEqualTo(sample.output);
            }
        }
    }
}
