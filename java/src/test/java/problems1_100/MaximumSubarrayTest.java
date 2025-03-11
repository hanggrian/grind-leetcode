package problems1_100;

import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class MaximumSubarrayTest extends SampledTest {
    @Test
    public void test() {
        for (MaximumSubarray solution : MaximumSubarray.values()) {
            for (MaximumSubarraySample sample : getSamples(MaximumSubarraySample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.maxSubArray(sample.input.nums))
                    .isEqualTo(sample.output);
            }
        }
    }
}
