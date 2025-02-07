import org.junit.Test;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class LongestSubstringWithoutRepeatingCharactersTest extends SampledTest {
    @Override
    public String getFileName() {
        return "longest_substring_without_repeating_characters.json";
    }

    @Test
    public void test() {
        for (Sample sample : getSamples(Sample[].class)) {
            for (LongestSubstringWithoutRepeatingCharacters solution
                : LongestSubstringWithoutRepeatingCharacters.values()) {
                assertWithMessage(sample.explanation)
                    .that(solution.lengthOfLongestSubstring(sample.input))
                    .isEqualTo(sample.output);
            }
        }
    }

    public static class Sample {
        public String input;
        public int output;
        public String explanation;
    }
}
