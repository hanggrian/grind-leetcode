package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import kotlin.test.Test

class RomanToIntegerTest : SampledTest() {
    @Test
    fun test() =
        RomanToInteger.entries.forEach { solution ->
            getSamples(Array<RomanToIntegerSample>::class.java)
                .forEach { (input, output, message) ->
                    assertWithMessage(message)
                        .that(solution.romanToInt(input.s))
                        .isEqualTo(output)
                }
        }
}
