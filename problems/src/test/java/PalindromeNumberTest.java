import org.junit.Test;
import testing.Sample;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class PalindromeNumberTest extends SampledTest {
    @Override
    public String getFileName() {
        return "palindrome_number.json";
    }

    @Test
    public void test() {
        for (TypedSample sample : getSamples(TypedSample[].class)) {
            for (PalindromeNumber solution : PalindromeNumber.values()) {
                assertWithMessage(sample.getMessage())
                    .that(solution.isPalindrome(sample.input.x))
                    .isEqualTo(sample.output);
            }
        }
    }

    public static class TypedSample extends Sample<TypedSample.Input, Boolean> {
        public static class Input {
            public int x;
        }
    }
}
