package problems1_100

import com.google.common.truth.Truth.assertThat
import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import kotlin.test.Test

class RemoveElementTest : SampledTest() {
    @Test
    fun test() =
        RemoveElement.entries.forEach { solution ->
            getSamples(Array<RemoveElementSample>::class.java).forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(solution.removeElement(input.nums, input.`val`))
                    .isEqualTo(output)
                assertThat(input.nums.toList().subList(0, output))
                    .doesNotContain(input.`val`)
            }
        }
}
