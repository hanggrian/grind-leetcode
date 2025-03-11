package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import kotlin.test.Test

class JumpGame2Test : SampledTest() {
    override fun getSampleFilename(): String = "jump-game-ii.json"

    @Test
    fun test() =
        JumpGame2.entries.forEach { solution ->
            getSamples(Array<JumpGame2Sample>::class.java).forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(solution.jump(input.nums))
                    .isEqualTo(output)
            }
        }
}
