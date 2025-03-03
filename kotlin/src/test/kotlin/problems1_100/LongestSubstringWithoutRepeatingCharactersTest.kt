package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import kotlin.test.Test

class LongestSubstringWithoutRepeatingCharactersTest : SampledTest() {
    @Test
    fun test() {
        for (solution in LongestSubstringWithoutRepeatingCharacters.entries) {
            for (
            sample in
            getSamples(Array<LongestSubstringWithoutRepeatingCharactersSample>::class.java)
            ) {
                assertWithMessage(sample.message)
                    .that(solution.lengthOfLongestSubstring(sample.input!!.s))
                    .isEqualTo(sample.output)
            }
        }
    }
}
