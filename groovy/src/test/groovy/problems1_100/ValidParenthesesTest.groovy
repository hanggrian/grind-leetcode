package problems1_100

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class ValidParenthesesTest extends SampledTest {
    @Test
    void test() {
        ValidParentheses.values().each { solution ->
            getSamples(ValidParenthesesSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.isValid(sample.input.s))
                    .isEqualTo(sample.output)
            }
        }
    }
}
