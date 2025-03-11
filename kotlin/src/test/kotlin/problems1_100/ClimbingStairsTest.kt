package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import kotlin.test.Test

class ClimbingStairsTest : SampledTest() {
    @Test
    fun test() =
        ClimbingStairs.entries.forEach { solution ->
            getSamples(Array<ClimbingStairsSample>::class.java)
                .forEach { (input, output, message) ->
                    assertWithMessage(message)
                        .that(solution.climbStairs(input.n))
                        .isEqualTo(output)
                }
        }
}
