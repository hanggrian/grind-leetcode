import org.junit.Test;
import testing.Sample;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class ContainerWithMostWaterTest extends SampledTest {
    @Override
    public String getFileName() {
        return "container_with_most_water.json";
    }

    @Test
    public void test() {
        for (TypedSample sample : getSamples(TypedSample[].class)) {
            for (ContainerWithMostWater solution : ContainerWithMostWater.values()) {
                assertWithMessage(sample.getMessage())
                    .that(solution.maxArea(sample.input.height))
                    .isEqualTo(sample.output);
            }
        }
    }

    public static class TypedSample extends Sample<TypedSample.Input, Integer> {
        public static class Input {
            public int[] height;
        }
    }
}
