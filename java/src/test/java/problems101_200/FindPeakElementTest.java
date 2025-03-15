package problems101_200;

import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class FindPeakElementTest extends SampledTest {
    @Test
    public void test() {
        for (FindPeakElement solution : FindPeakElement.values()) {
            for (FindPeakElementSample sample : getSamples(FindPeakElementSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.findPeakElement(sample.input.nums))
                    .isEqualTo(sample.input.nums[sample.output]);
            }
        }
    }
}
