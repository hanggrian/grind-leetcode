package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import kotlin.test.Test

class ZigzagConversionTest : SampledTest() {
    @Test
    fun test() =
        ZigzagConversion.entries.forEach { solution ->
            getSamples(Array<ZigzagConversionSample>::class.java)
                .forEach { (input, output, message) ->
                    assertWithMessage(message)
                        .that(solution.convert(input.s, input.numRows))
                        .isEqualTo(output)
                }
        }
}
