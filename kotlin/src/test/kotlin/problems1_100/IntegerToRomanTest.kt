package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import kotlin.test.Test

class IntegerToRomanTest : SampledTest() {
    @Test
    fun test() =
        IntegerToRoman.entries.forEach { solution ->
            getSamples(Array<IntegerToRomanSample>::class.java)
                .forEach { (input, output, message) ->
                    assertWithMessage(message)
                        .that(solution.intToRoman(input.num))
                        .isEqualTo(output)
                }
        }
}
