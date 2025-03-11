package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import kotlin.test.Test

class PermutationsTest : SampledTest() {
    @Test
    fun test() =
        Permutations.entries.forEach { solution ->
            getSamples(Array<PermutationsSample>::class.java).forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(solution.permute(input.nums))
                    .containsExactlyElementsIn(output.map { it.toList() })
            }
        }
}
