package problems201_300;

import java.util.Arrays;
import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class SlidingWindowMaximumTest extends SampledTest {
    @Test
    public void test() {
        for (SlidingWindowMaximum solution : SlidingWindowMaximum.values()) {
            for (SlidingWindowMaximumSample sample
                : getSamples(SlidingWindowMaximumSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.maxSlidingWindow(sample.input.nums, sample.input.k))
                    .asList()
                    .containsExactlyElementsIn(Arrays.stream(sample.output).boxed().toList());
            }
        }
    }
}
