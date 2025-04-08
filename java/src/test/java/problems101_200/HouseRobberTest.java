package problems101_200;

import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class HouseRobberTest extends SampledTest {
    @Test
    public void test() {
        for (HouseRobber solution : HouseRobber.values()) {
            for (HouseRobberSample sample : getSamples(HouseRobberSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.rob(sample.input.nums))
                    .isEqualTo(sample.output);
            }
        }
    }
}
