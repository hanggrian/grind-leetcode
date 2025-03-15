package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class ReverseIntegerTest : SampledTest() {
    @Test
    fun test() =
        ReverseInteger.entries.forEach { solution ->
            getSamples<Array<ReverseIntegerSample>>().forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(solution.reverse(input.x))
                    .isEqualTo(output)
            }
        }
}
