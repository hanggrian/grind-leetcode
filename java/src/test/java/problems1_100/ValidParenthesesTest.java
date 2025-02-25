package problems1_100;

import org.junit.Test;
import testing.Sample;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class ValidParenthesesTest extends SampledTest {
    @Test
    public void test() {
        for (ValidParentheses solution : ValidParentheses.values()) {
            for (TypedSample sample : getSamples(TypedSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.isValid(sample.input.s))
                    .isEqualTo(sample.output);
            }
        }
    }

    static class TypedSample extends Sample<TypedSample.Input, Boolean> {
        static class Input {
            String s;
        }
    }
}
