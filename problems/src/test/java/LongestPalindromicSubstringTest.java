import org.junit.Test;
import testing.Sample;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class LongestPalindromicSubstringTest extends SampledTest {
    @Override
    public String getFileName() {
        return "longest_palindromic_substring.json";
    }

    @Test
    public void test() {
        for (TypedSample sample : getSamples(TypedSample[].class)) {
            for (LongestPalindromicSubstring solution : LongestPalindromicSubstring.values()) {
                assertWithMessage(sample.getMessage())
                    .that(solution.longestPalindrome(sample.input.s))
                    .isEqualTo(sample.output);
            }
        }
    }

    public static class TypedSample extends Sample<TypedSample.Input, String> {
        public static class Input {
            public String s;
        }
    }
}
