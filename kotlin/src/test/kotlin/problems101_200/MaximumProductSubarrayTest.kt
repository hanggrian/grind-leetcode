package problems101_200

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import kotlin.test.Test

class MaximumProductSubarrayTest : SampledTest() {
    @Test
    fun test() =
        MaximumProductSubarray.entries.forEach { solution ->
            getSamples(Array<MaximumProductSubarraySample>::class.java)
                .forEach { (input, output, message) ->
                    assertWithMessage(message)
                        .that(solution.maxProduct(input.nums))
                        .isEqualTo(output)
                }
        }
}
