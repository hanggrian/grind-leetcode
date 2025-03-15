package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class PlusOneTest : SampledTest() {
    @Test
    fun test() =
        PlusOne.entries.forEach { solution ->
            getSamples<Array<PlusOneSample>>().forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(solution.plusOne(input.digits))
                    .asList()
                    .containsExactlyElementsIn(output.toList())
                    .inOrder()
            }
        }
}
