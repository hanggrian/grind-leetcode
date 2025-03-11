package problems1_100;

import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class JumpGameTest extends SampledTest {
    @Test
    public void test() {
        for (JumpGame solution : JumpGame.values()) {
            for (JumpGameSample sample : getSamples(JumpGameSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.canJump(sample.input.nums))
                    .isEqualTo(sample.output);
            }
        }
    }
}
