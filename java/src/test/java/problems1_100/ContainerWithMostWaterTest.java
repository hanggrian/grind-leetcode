package problems1_100;

import org.junit.Test;
import testing.Sample;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class ContainerWithMostWaterTest extends SampledTest {
    @Test
    public void test() {
        for (ContainerWithMostWater solution : ContainerWithMostWater.values()) {
            for (TypedSample sample : getSamples(TypedSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.maxArea(sample.input.height))
                    .isEqualTo(sample.output);
            }
        }
    }

    static class TypedSample extends Sample<TypedSample.Input, Integer> {
        static class Input {
            int[] height;
        }
    }
}
