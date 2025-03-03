package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import kotlin.test.Test

class LongestPalindromicSubstringTest : SampledTest() {
    @Test
    fun test() {
        for (solution in LongestPalindromicSubstring.entries) {
            for (sample in getSamples(Array<LongestPalindromicSubstringSample>::class.java)) {
                assertWithMessage(sample.message)
                    .that(solution.longestPalindrome(sample.input!!.s))
                    .isEqualTo(sample.output)
            }
        }
    }
}
