package problems301_400

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class ReverseStringTest : SampledTest() {
    @Test
    fun test() =
        ReverseString.entries.forEach { solution ->
            getSamples<Array<ReverseStringSample>>().forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(input.s.also { solution.reverseString(it) })
                    .asList()
                    .containsExactlyElementsIn(output.toList())
            }
        }
}
