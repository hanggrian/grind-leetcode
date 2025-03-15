package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class TwoSumTest : SampledTest() {
    @Test
    fun test() =
        TwoSum.entries.forEach { solution ->
            getSamples<Array<TwoSumSample>>().forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(solution.twoSum(input.nums, input.target))
                    .asList()
                    .containsExactlyElementsIn(output.toList())
                    .inOrder()
            }
        }
}
