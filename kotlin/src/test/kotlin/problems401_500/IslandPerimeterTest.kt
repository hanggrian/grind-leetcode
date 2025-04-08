package problems401_500

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class IslandPerimeterTest : SampledTest() {
    @Test
    fun test() =
        IslandPerimeter.entries.forEach { solution ->
            getSamples<Array<IslandPerimeterSample>>().forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(solution.islandPerimeter(input.grid))
                    .isEqualTo(output)
            }
        }
}
