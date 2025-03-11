package problems101_200

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import kotlin.test.Test

class WordLadderTest : SampledTest() {
    @Test
    fun test() =
        WordLadder.entries.forEach { solution ->
            getSamples(Array<WordLadderSample>::class.java).forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(
                        solution.ladderLength(
                            input.beginWord,
                            input.endWord,
                            input.wordList.toList(),
                        ),
                    ).isEqualTo(output)
            }
        }
}
