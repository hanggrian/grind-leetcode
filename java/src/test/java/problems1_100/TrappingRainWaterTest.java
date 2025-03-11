package problems1_100;

import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class TrappingRainWaterTest extends SampledTest {
    @Test
    public void test() {
        for (TrappingRainWater solution : TrappingRainWater.values()) {
            for (TrappingWaterTestSample sample : getSamples(TrappingWaterTestSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.trap(sample.input.height))
                    .isEqualTo(sample.output);
            }
        }
    }
}
