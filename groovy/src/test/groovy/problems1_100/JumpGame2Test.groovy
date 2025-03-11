package problems1_100

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class JumpGame2Test extends SampledTest {
    @Test
    void test() {
        JumpGame2.values().each { solution ->
            getSamples(JumpGame2Sample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.jump(sample.input.nums))
                    .isEqualTo(sample.output)
            }
        }
    }

    @Override
    protected String getSampleFilename() {
        return 'jump-game-ii.json'
    }
}
