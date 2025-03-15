package problems101_200

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class WordBreak2Test : SampledTest() {
    override fun getSampleFilename(): String = "word-break-ii.json"

    @Test
    fun test() {
        WordBreak2.entries.forEach { solution ->
            getSamples<Array<WordBreak2Sample>>().forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(solution.wordBreak(input.s, input.wordDict.toList()))
                    .containsAtLeastElementsIn(output)
            }
        }
    }
}
