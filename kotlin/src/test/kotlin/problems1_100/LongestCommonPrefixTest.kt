package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import kotlin.test.Test

class LongestCommonPrefixTest : SampledTest() {
    @Test
    fun test() {
        for (solution in LongestCommonPrefix.entries) {
            for (sample in getSamples(Array<LongestCommonPrefixSample>::class.java)) {
                assertWithMessage(sample.message)
                    .that(solution.longestCommonPrefix(sample.input!!.strs))
                    .isEqualTo(sample.output)
            }
        }
    }
}
