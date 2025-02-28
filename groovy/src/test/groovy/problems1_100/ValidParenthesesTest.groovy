package problems1_100

import org.junit.Test
import testing.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class ValidParenthesesTest extends SampledTest {
    @Test
    void test() {
        for (ValidParentheses solution : ValidParentheses.values()) {
            for (ValidParenthesesSample sample : getSamples(ValidParenthesesSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.isValid(sample.input.s))
                    .isEqualTo(sample.output)
            }
        }
    }
}
