package problems201_300

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class SlidingWindowMaximumTest : SampledTest() {
    @Test
    fun test() =
        SlidingWindowMaximum.entries.forEach { solution ->
            getSamples<Array<SlidingWindowMaximumSample>>().forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(solution.maxSlidingWindow(input.nums, input.k))
                    .asList()
                    .containsExactlyElementsIn(output.toList())
            }
        }
}
