package problems1_100;

import org.junit.Test;
import testing.Sample;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class LongestPalindromicSubstringTest extends SampledTest {
    @Test
    public void test() {
        for (LongestPalindromicSubstring solution : LongestPalindromicSubstring.values()) {
            for (TypedSample sample : getSamples(TypedSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.longestPalindrome(sample.input.s))
                    .isEqualTo(sample.output);
            }
        }
    }

    static class TypedSample extends Sample<TypedSample.Input, String> {
        static class Input {
            String s;
        }
    }
}
