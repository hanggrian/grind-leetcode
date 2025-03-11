package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import kotlin.test.Test

class ThreeSumTest : SampledTest() {
    @Test
    fun test() =
        ThreeSum.entries.forEach { solution ->
            getSamples(Array<ThreeSumSample>::class.java).forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(solution.threeSum(input.nums))
                    .containsExactlyElementsIn(output.map { it.toList() })
            }
        }
}
