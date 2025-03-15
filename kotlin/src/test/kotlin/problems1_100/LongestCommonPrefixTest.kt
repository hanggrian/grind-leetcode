package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class LongestCommonPrefixTest : SampledTest() {
    @Test
    fun test() =
        LongestCommonPrefix.entries.forEach { solution ->
            getSamples<Array<LongestCommonPrefixSample>>().forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(solution.longestCommonPrefix(input.strs))
                    .isEqualTo(output)
            }
        }
}
