package problems301_400

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class DecodeStringTest : SampledTest() {
    @Test
    fun test() =
        DecodeString.entries.forEach { solution ->
            getSamples<Array<DecodeStringSample>>().forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(solution.decodeString(input.s))
                    .isEqualTo(output)
            }
        }
}
