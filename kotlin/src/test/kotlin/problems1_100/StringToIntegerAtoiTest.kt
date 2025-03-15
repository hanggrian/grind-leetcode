package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class StringToIntegerAtoiTest : SampledTest() {
    @Test
    fun test() =
        StringToIntegerAtoi.entries.forEach { solution ->
            getSamples<Array<StringToIntegerAtoiSample>>().forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(solution.myAtoi(input.s))
                    .isEqualTo(output)
            }
        }
}
