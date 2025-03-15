package problems101_200

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class FindPeakElementTest : SampledTest() {
    @Test
    fun test() =
        FindPeakElement.entries.forEach { solution ->
            getSamples<Array<FindPeakElementSample>>().forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(solution.findPeakElement(input.nums))
                    .isEqualTo(input.nums[output])
            }
        }
}
