package problems1_100

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class LengthOfLastWordTest extends SampledTest {
    @Test
    void test() {
        LengthOfLastWord.values().each { solution ->
            getSamples(LengthOfLastWordSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.lengthOfLastWord(sample.input.s))
                    .isEqualTo(sample.output)
            }
        }
    }
}
