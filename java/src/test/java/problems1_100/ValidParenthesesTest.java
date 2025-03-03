package problems1_100;

import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class ValidParenthesesTest extends SampledTest {
    @Test
    public void test() {
        for (ValidParentheses solution : ValidParentheses.values()) {
            for (ValidParenthesesSample sample : getSamples(ValidParenthesesSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.isValid(sample.input.s))
                    .isEqualTo(sample.output);
            }
        }
    }
}
