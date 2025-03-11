package problems101_200;

import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class MaximumProductSubarrayTest extends SampledTest {
    @Test
    public void test() {
        for (MaximumProductSubarray solution : MaximumProductSubarray.values()) {
            for (MaximumProductSubarraySample sample
                : getSamples(MaximumProductSubarraySample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.maxProduct(sample.input.nums))
                    .isEqualTo(sample.output);
            }
        }
    }
}
