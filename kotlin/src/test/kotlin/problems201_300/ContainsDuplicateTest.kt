package problems201_300

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class ContainsDuplicateTest : SampledTest() {
    @Test
    fun test() =
        ContainsDuplicate.entries.forEach { solution ->
            getSamples<Array<ContainsDuplicateSample>>().forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(solution.containsDuplicate(input.nums))
                    .isEqualTo(output)
            }
        }
}
