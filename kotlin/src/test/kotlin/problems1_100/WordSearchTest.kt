package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class WordSearchTest : SampledTest() {
    @Test
    fun test() =
        WordSearch.entries.forEach { solution ->
            getSamples<Array<WordSearchSample>>().forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(solution.exist(input.board, input.word))
                    .isEqualTo(output)
            }
        }
}
