package problems1_100

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class LongestPalindromicSubstringTest extends SampledTest {
    @Test
    void test() {
        LongestPalindromicSubstring.values().each { solution ->
            getSamples(LongestPalindromicSubstringSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.longestPalindrome(sample.input.s))
                    .isEqualTo(sample.output)
            }
        }
    }
}
