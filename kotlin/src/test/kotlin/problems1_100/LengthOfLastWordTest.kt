package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import kotlin.test.Test

class LengthOfLastWordTest : SampledTest() {
    @Test
    fun test() =
        LengthOfLastWord.entries.forEach { solution ->
            getSamples(Array<LengthOfLastWordSample>::class.java)
                .forEach { (input, output, message) ->
                    assertWithMessage(message)
                        .that(solution.lengthOfLastWord(input.s))
                        .isEqualTo(output)
                }
        }
}
