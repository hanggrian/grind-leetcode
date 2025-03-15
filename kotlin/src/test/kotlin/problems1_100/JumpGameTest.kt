package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class JumpGameTest : SampledTest() {
    @Test
    fun test() =
        JumpGame.entries.forEach { solution ->
            getSamples<Array<JumpGameSample>>().forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(solution.canJump(input.nums))
                    .isEqualTo(output)
            }
        }
}
