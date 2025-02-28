package problems1_100

import org.junit.Test
import testing.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class LongestPalindromicSubstringTest extends SampledTest {
    @Test
    void test() {
        for (LongestPalindromicSubstring solution : LongestPalindromicSubstring.values()) {
            for (LongestPalindromicSubstringSample sample : getSamples(LongestPalindromicSubstringSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.longestPalindrome(sample.input.s))
                    .isEqualTo(sample.output)
            }
        }
    }
}
