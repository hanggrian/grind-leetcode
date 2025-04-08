package problems101_200

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class NumberOfIslandsTest : SampledTest() {
    @Test
    fun test() =
        NumberOfIslands.entries.forEach { solution ->
            getSamples<Array<NumberOfIslandsSample>>().forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(solution.numIslands(input.grid))
                    .isEqualTo(output)
            }
        }
}
