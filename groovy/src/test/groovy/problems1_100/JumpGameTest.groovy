package problems1_100

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class JumpGameTest extends SampledTest {
    @Test
    void test() {
        JumpGame.values().each { solution ->
            getSamples(JumpGameSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.canJump(sample.input.nums))
                    .isEqualTo(sample.output)
            }
        }
    }
}
