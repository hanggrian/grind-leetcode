package problems1_100;

import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class ClimbingStairsTest extends SampledTest {
    @Test
    public void test() {
        for (ClimbingStairs solution : ClimbingStairs.values()) {
            for (ClimbingStairsSample sample : getSamples(ClimbingStairsSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.climbStairs(sample.input.n))
                    .isEqualTo(sample.output);
            }
        }
    }
}
