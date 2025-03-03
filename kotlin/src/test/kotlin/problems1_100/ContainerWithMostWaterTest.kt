package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import kotlin.test.Test

class ContainerWithMostWaterTest : SampledTest() {
    @Test
    fun test() {
        for (solution in ContainerWithMostWater.entries) {
            for (sample in getSamples(Array<ContainerWithMostWaterSample>::class.java)) {
                assertWithMessage(sample.message)
                    .that(solution.maxArea(sample.input!!.height))
                    .isEqualTo(sample.output)
            }
        }
    }
}
