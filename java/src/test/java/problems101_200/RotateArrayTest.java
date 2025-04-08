package problems101_200;

import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class RotateArrayTest extends SampledTest {
    @Test
    public void test() {
        for (RotateArray solution : RotateArray.values()) {
            for (RotateArraySample sample : getSamples(RotateArraySample[].class)) {
                int[] nums = sample.input.nums;
                solution.rotate(nums, sample.input.k);
                assertWithMessage(sample.getMessage())
                    .that(nums)
                    .isEqualTo(sample.output);
            }
        }
    }
}
