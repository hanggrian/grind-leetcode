package problems1;

import org.junit.Test;
import testing.Sample;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class LongestSubstringWithoutRepeatingCharactersTest extends SampledTest {
    @Override
    public String getFileName() {
        return "longest_substring_without_repeating_characters.json";
    }

    @Test
    public void test() {
        for (LongestSubstringWithoutRepeatingCharacters solution
            : LongestSubstringWithoutRepeatingCharacters.values()) {
            for (TypedSample sample : getSamples(TypedSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.lengthOfLongestSubstring(sample.input.s))
                    .isEqualTo(sample.output);
            }
        }
    }

    public static class TypedSample extends Sample<TypedSample.Input, Integer> {
        public static class Input {
            public String s;
        }
    }
}
