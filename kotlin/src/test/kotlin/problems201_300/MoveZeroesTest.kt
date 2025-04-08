package problems201_300

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class MoveZeroesTest : SampledTest() {
    @Test
    fun test() =
        MoveZeroes.entries.forEach { solution ->
            getSamples<Array<MoveZeroesSample>>().forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(input.nums.also { solution.moveZeroes(it) })
                    .asList()
                    .containsExactlyElementsIn(output.toList())
                    .inOrder()
            }
        }
}
