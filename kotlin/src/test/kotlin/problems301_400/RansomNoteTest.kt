package problems301_400

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class RansomNoteTest : SampledTest() {
    @Test
    fun test() =
        RansomNote.entries.forEach { solution ->
            getSamples<Array<RansomNoteSample>>().forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(solution.canConstruct(input.ransomNote, input.magazine))
                    .isEqualTo(output)
            }
        }
}
