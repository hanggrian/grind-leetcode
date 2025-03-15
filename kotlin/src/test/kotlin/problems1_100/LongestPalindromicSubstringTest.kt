package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class LongestPalindromicSubstringTest : SampledTest() {
    @Test
    fun test() =
        LongestPalindromicSubstring.entries.forEach { solution ->
            getSamples<Array<LongestPalindromicSubstringSample>>()
                .forEach { (input, output, message) ->
                    assertWithMessage(message)
                        .that(solution.longestPalindrome(input.s))
                        .isEqualTo(output)
                }
        }
}
