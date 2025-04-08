package problems101_200

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class HouseRobberTest : SampledTest() {
    @Test
    fun test() =
        HouseRobber.entries.forEach { solution ->
            getSamples<Array<HouseRobberSample>>().forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(solution.rob(input.nums))
                    .isEqualTo(output)
            }
        }
}
