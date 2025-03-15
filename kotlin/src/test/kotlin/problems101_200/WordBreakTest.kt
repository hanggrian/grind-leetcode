package problems101_200

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class WordBreakTest : SampledTest() {
    @Test
    fun test() {
        WordBreak.entries.forEach { solution ->
            getSamples<Array<WordBreakSample>>().forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(solution.wordBreak(input.s, input.wordDict.toList()))
                    .isEqualTo(output)
            }
        }
    }
}
