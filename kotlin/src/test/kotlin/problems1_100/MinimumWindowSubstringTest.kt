package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class MinimumWindowSubstringTest : SampledTest() {
    @Test
    fun test() =
        MinimumWindowSubstring.entries.forEach { solution ->
            getSamples<Array<MinimumWindowSubstringSample>>().forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(solution.minWindow(input.s, input.t))
                    .isEqualTo(output)
            }
        }
}
