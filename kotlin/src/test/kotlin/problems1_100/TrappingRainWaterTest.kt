package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class TrappingRainWaterTest : SampledTest() {
    @Test
    fun test() =
        TrappingRainWater.entries.forEach { solution ->
            getSamples<Array<TrappingWaterTestSample>>().forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(solution.trap(input.height))
                    .isEqualTo(output)
            }
        }
}
