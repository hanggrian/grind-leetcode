package problems1_100

import com.google.common.truth.Truth.assertThat
import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class RemoveDuplicatesFromSortedArrayTest : SampledTest() {
    @Test
    fun test() =
        RemoveDuplicatesFromSortedArray.entries.forEach { solution ->
            getSamples<Array<RemoveDuplicatesFromSortedArraySample>>()
                .forEach { (input, output, message) ->
                    assertWithMessage(message)
                        .that(solution.removeDuplicates(input.nums))
                        .isEqualTo(output)
                    assertThat(input.nums.toList().subList(0, output))
                        .containsNoDuplicates()
                }
        }
}
