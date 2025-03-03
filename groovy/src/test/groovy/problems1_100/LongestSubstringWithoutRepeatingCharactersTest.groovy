package problems1_100

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class LongestSubstringWithoutRepeatingCharactersTest extends SampledTest {
    @Test
    void test() {
        for (LongestSubstringWithoutRepeatingCharacters solution : LongestSubstringWithoutRepeatingCharacters.values()) {
            for (LongestSubstringWithoutRepeatingCharactersSample sample : getSamples(LongestSubstringWithoutRepeatingCharactersSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.lengthOfLongestSubstring(sample.input.s))
                    .isEqualTo(sample.output)
            }
        }
    }
}
