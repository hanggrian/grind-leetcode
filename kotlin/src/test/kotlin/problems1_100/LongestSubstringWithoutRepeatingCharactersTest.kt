package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import kotlin.test.Test

class LongestSubstringWithoutRepeatingCharactersTest : SampledTest() {
    @Test
    fun test() =
        LongestSubstringWithoutRepeatingCharacters.entries.forEach { solution ->
            getSamples(Array<LongestSubstringWithoutRepeatingCharactersSample>::class.java)
                .forEach { (input, output, message) ->
                    assertWithMessage(message)
                        .that(solution.lengthOfLongestSubstring(input.s))
                        .isEqualTo(output)
                }
        }
}
