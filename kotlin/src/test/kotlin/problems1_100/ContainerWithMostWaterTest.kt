package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class ContainerWithMostWaterTest : SampledTest() {
    @Test
    fun test() =
        ContainerWithMostWater.entries.forEach { solution ->
            getSamples<Array<ContainerWithMostWaterSample>>().forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(solution.maxArea(input.height))
                    .isEqualTo(output)
            }
        }
}
