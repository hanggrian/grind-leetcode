package problems201_300

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class HouseRobber2Test : SampledTest() {
    override fun getSampleFilename(): String = "house-robber-ii.json"

    @Test
    fun test() =
        HouseRobber2.entries.forEach { solution ->
            getSamples<Array<HouseRobber2Sample>>().forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(solution.rob(input.nums))
                    .isEqualTo(output)
            }
        }
}
