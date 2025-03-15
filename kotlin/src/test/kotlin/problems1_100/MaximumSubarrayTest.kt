package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class MaximumSubarrayTest : SampledTest() {
    @Test
    fun test() =
        MaximumSubarray.entries.forEach { solution ->
            getSamples<Array<MaximumSubarraySample>>().forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(solution.maxSubArray(input.nums))
                    .isEqualTo(output)
            }
        }
}
