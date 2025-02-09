package problems1;

import org.junit.Test;
import testing.Sample;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class ValidParenthesesTest extends SampledTest {
    @Override
    public String getFileName() {
        return "valid_parentheses.json";
    }

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

    public static class TypedSample extends Sample<TypedSample.Input, Boolean> {
        public static class Input {
            public String s;
        }
    }
}
