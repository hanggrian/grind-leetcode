package problems1_100;

import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class JumpGame2Test extends SampledTest {
    @Override
    protected String getSampleFilename() {
        return "jump-game-ii.json";
    }

    @Test
    public void test() {
        for (JumpGame2 solution : JumpGame2.values()) {
            for (JumpGame2Sample sample : getSamples(JumpGame2Sample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.jump(sample.input.nums))
                    .isEqualTo(sample.output);
            }
        }
    }
}
