package problems401_500

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class ArithmeticSlicesTest : SampledTest() {
    @Test
    fun test() =
        ArithmeticSlices.entries.forEach { solution ->
            getSamples<Array<ArithmeticSlicesSample>>().forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(solution.numberOfArithmeticSlices(input.nums))
                    .isEqualTo(output)
            }
        }
}
