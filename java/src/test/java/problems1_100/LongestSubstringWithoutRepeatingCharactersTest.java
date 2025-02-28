package problems1_100;

import org.junit.Test;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class LongestSubstringWithoutRepeatingCharactersTest extends SampledTest {
    @Test
    public void test() {
        for (LongestSubstringWithoutRepeatingCharacters solution
            : LongestSubstringWithoutRepeatingCharacters.values()) {
            for (LongestSubstringWithoutRepeatingCharactersSample sample
                : getSamples(LongestSubstringWithoutRepeatingCharactersSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.lengthOfLongestSubstring(sample.input.s))
                    .isEqualTo(sample.output);
            }
        }
    }
}
