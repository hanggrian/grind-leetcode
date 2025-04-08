package problems301_400

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class FirstUniqueCharacterInAStringTest : SampledTest() {
    @Test
    fun test() =
        FirstUniqueCharacterInAString.entries.forEach { solution ->
            getSamples<Array<FirstUniqueCharacterInAStringSample>>()
                .forEach { (input, output, message) ->
                    assertWithMessage(message)
                        .that(solution.firstUniqChar(input.s))
                        .isEqualTo(output)
                }
        }
}
